package typings.libp2pInterfaceMetrics

import typings.libp2pInterfaceConnection.mod.Connection
import typings.libp2pInterfaceConnection.mod.MultiaddrConnection
import typings.libp2pInterfaceConnection.mod.Stream
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type CalculateMetric[T] = js.Function0[js.Promise[T] | T]
  
  trait CalculatedMetricOptions[T]
    extends StObject
       with MetricOptions {
    
    /**
      * An optional function invoked to calculate the component metric instead of
      * using `.update`, `.increment`, and `.decrement`
      */
    var calculate: CalculateMetric[T]
  }
  object CalculatedMetricOptions {
    
    inline def apply[T](calculate: () => js.Promise[T] | T): CalculatedMetricOptions[T] = {
      val __obj = js.Dynamic.literal(calculate = js.Any.fromFunction0(calculate))
      __obj.asInstanceOf[CalculatedMetricOptions[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CalculatedMetricOptions[?], T] (val x: Self & CalculatedMetricOptions[T]) extends AnyVal {
      
      inline def setCalculate(value: () => js.Promise[T] | T): Self = StObject.set(x, "calculate", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Counter extends StObject {
    
    /**
      * Increment the metric by the passed value or 1
      */
    def increment(): Unit = js.native
    def increment(value: Double): Unit = js.native
    
    /**
      * Reset this metric to its default value
      */
    def reset(): Unit = js.native
  }
  
  trait CounterGroup extends StObject {
    
    /**
      * Increment the metric group keys by the passed number or
      * any non-numeric value to increment by 1
      */
    def increment(values: Record[String, Double | Any]): Unit
    
    /**
      * Reset the passed key in this metric group to its default value
      * or all keys if no key is passed
      */
    def reset(): Unit
  }
  object CounterGroup {
    
    inline def apply(increment: Record[String, Double | Any] => Unit, reset: () => Unit): CounterGroup = {
      val __obj = js.Dynamic.literal(increment = js.Any.fromFunction1(increment), reset = js.Any.fromFunction0(reset))
      __obj.asInstanceOf[CounterGroup]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CounterGroup] (val x: Self) extends AnyVal {
      
      inline def setIncrement(value: Record[String, Double | Any] => Unit): Self = StObject.set(x, "increment", js.Any.fromFunction1(value))
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Metric extends StObject {
    
    /**
      * Decrement the metric by the passed value or 1
      */
    def decrement(): Unit = js.native
    def decrement(value: Double): Unit = js.native
    
    /**
      * Increment the metric by the passed value or 1
      */
    def increment(): Unit = js.native
    def increment(value: Double): Unit = js.native
    
    /**
      * Reset this metric to its default value
      */
    def reset(): Unit = js.native
    
    /**
      * Start a timed metric, call the returned function to
      * stop the timer
      */
    def timer(): StopTimer = js.native
    
    /**
      * Update the stored metric to the passed value
      */
    def update(value: Double): Unit = js.native
  }
  
  trait MetricGroup extends StObject {
    
    /**
      * Decrement the metric group keys by the passed number or
      * any non-numeric value to decrement by 1
      */
    def decrement(values: Record[String, Double | Any]): Unit
    
    /**
      * Increment the metric group keys by the passed number or
      * any non-numeric value to increment by 1
      */
    def increment(values: Record[String, Double | Any]): Unit
    
    /**
      * Reset the passed key in this metric group to its default value
      * or all keys if no key is passed
      */
    def reset(): Unit
    
    /**
      * Start a timed metric for the named key in the group, call
      * the returned function to stop the timer
      */
    def timer(key: String): StopTimer
    
    /**
      * Update the stored metric group to the passed value
      */
    def update(values: Record[String, Double]): Unit
  }
  object MetricGroup {
    
    inline def apply(
      decrement: Record[String, Double | Any] => Unit,
      increment: Record[String, Double | Any] => Unit,
      reset: () => Unit,
      timer: String => StopTimer,
      update: Record[String, Double] => Unit
    ): MetricGroup = {
      val __obj = js.Dynamic.literal(decrement = js.Any.fromFunction1(decrement), increment = js.Any.fromFunction1(increment), reset = js.Any.fromFunction0(reset), timer = js.Any.fromFunction1(timer), update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[MetricGroup]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MetricGroup] (val x: Self) extends AnyVal {
      
      inline def setDecrement(value: Record[String, Double | Any] => Unit): Self = StObject.set(x, "decrement", js.Any.fromFunction1(value))
      
      inline def setIncrement(value: Record[String, Double | Any] => Unit): Self = StObject.set(x, "increment", js.Any.fromFunction1(value))
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def setTimer(value: String => StopTimer): Self = StObject.set(x, "timer", js.Any.fromFunction1(value))
      
      inline def setUpdate(value: Record[String, Double] => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
  
  trait MetricOptions extends StObject {
    
    /**
      * Optional help for the metric
      */
    var help: js.UndefOr[String] = js.undefined
    
    /**
      * Optional label for the metric
      */
    var label: js.UndefOr[String] = js.undefined
  }
  object MetricOptions {
    
    inline def apply(): MetricOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MetricOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MetricOptions] (val x: Self) extends AnyVal {
      
      inline def setHelp(value: String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      inline def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    }
  }
  
  trait Metrics extends StObject {
    
    /**
      * Register an arbitrary counter. Call this to set help/labels for counters
      * and increment them by calling methods on the returned counter object
      */
    def registerCounter(name: String): Counter
    /**
      * Register an arbitrary counter. Call this to set help/labels for counters
      * and increment them by calling methods on the returned counter object
      */
    def registerCounter(name: String, options: CalculatedMetricOptions[Double]): Unit
    def registerCounter(name: String, options: MetricOptions): Counter
    
    /**
      * Register a a group of related counters. Call this to set help/labels for
      * groups of related counters that will be updated with by calling the `.increment`
      * method on the returned counter group object
      */
    def registerCounterGroup(name: String): CounterGroup
    /**
      * Register a a group of related counters. Call this to set help/labels for
      * groups of related counters that will be updated with by calling the `.increment`
      * method on the returned counter group object
      */
    def registerCounterGroup(name: String, options: CalculatedMetricOptions[Record[String, Double]]): Unit
    def registerCounterGroup(name: String, options: MetricOptions): CounterGroup
    /**
      * Register a a group of related counters. Call this to set help/labels for
      * groups of related counters that will be updated with by calling the `.increment`
      * method on the returned counter group object
      */
    @JSName("registerCounterGroup")
    var registerCounterGroup_Original: (js.Function2[/* name */ String, /* options */ js.UndefOr[MetricOptions], CounterGroup]) & (js.Function2[
        /* name */ String, 
        /* options */ CalculatedMetricOptions[Record[String, Double]], 
        Unit
      ])
    
    /**
      * Register an arbitrary counter. Call this to set help/labels for counters
      * and increment them by calling methods on the returned counter object
      */
    @JSName("registerCounter")
    var registerCounter_Original: (js.Function2[/* name */ String, /* options */ js.UndefOr[MetricOptions], Counter]) & (js.Function2[/* name */ String, /* options */ CalculatedMetricOptions[Double], Unit])
    
    /**
      * Register an arbitrary metric. Call this to set help/labels for metrics
      * and update/increment/decrement/etc them by calling methods on the returned
      * metric object
      */
    def registerMetric(name: String): Metric
    /**
      * Register an arbitrary metric. Call this to set help/labels for metrics
      * and update/increment/decrement/etc them by calling methods on the returned
      * metric object
      */
    def registerMetric(name: String, options: CalculatedMetricOptions[Double]): Unit
    def registerMetric(name: String, options: MetricOptions): Metric
    
    /**
      * Register a a group of related metrics. Call this to set help/labels for
      * groups of related metrics that will be updated with by calling `.update`,
      * `.increment` and/or `.decrement` methods on the returned metric group object
      */
    def registerMetricGroup(name: String): MetricGroup
    /**
      * Register a a group of related metrics. Call this to set help/labels for
      * groups of related metrics that will be updated with by calling `.update`,
      * `.increment` and/or `.decrement` methods on the returned metric group object
      */
    def registerMetricGroup(name: String, options: CalculatedMetricOptions[Record[String, Double]]): Unit
    def registerMetricGroup(name: String, options: MetricOptions): MetricGroup
    /**
      * Register a a group of related metrics. Call this to set help/labels for
      * groups of related metrics that will be updated with by calling `.update`,
      * `.increment` and/or `.decrement` methods on the returned metric group object
      */
    @JSName("registerMetricGroup")
    var registerMetricGroup_Original: (js.Function2[/* name */ String, /* options */ js.UndefOr[MetricOptions], MetricGroup]) & (js.Function2[
        /* name */ String, 
        /* options */ CalculatedMetricOptions[Record[String, Double]], 
        Unit
      ])
    
    /**
      * Register an arbitrary metric. Call this to set help/labels for metrics
      * and update/increment/decrement/etc them by calling methods on the returned
      * metric object
      */
    @JSName("registerMetric")
    var registerMetric_Original: (js.Function2[/* name */ String, /* options */ js.UndefOr[MetricOptions], Metric]) & (js.Function2[/* name */ String, /* options */ CalculatedMetricOptions[Double], Unit])
    
    /**
      * Track a newly opened multiaddr connection
      */
    def trackMultiaddrConnection(maConn: MultiaddrConnection): Unit
    
    /**
      * Track a newly opened protocol stream
      */
    def trackProtocolStream(stream: Stream, connection: Connection): Unit
  }
  object Metrics {
    
    inline def apply(
      registerCounter: (js.Function2[/* name */ String, /* options */ js.UndefOr[MetricOptions], Counter]) & (js.Function2[/* name */ String, /* options */ CalculatedMetricOptions[Double], Unit]),
      registerCounterGroup: (js.Function2[/* name */ String, /* options */ js.UndefOr[MetricOptions], CounterGroup]) & (js.Function2[
          /* name */ String, 
          /* options */ CalculatedMetricOptions[Record[String, Double]], 
          Unit
        ]),
      registerMetric: (js.Function2[/* name */ String, /* options */ js.UndefOr[MetricOptions], Metric]) & (js.Function2[/* name */ String, /* options */ CalculatedMetricOptions[Double], Unit]),
      registerMetricGroup: (js.Function2[/* name */ String, /* options */ js.UndefOr[MetricOptions], MetricGroup]) & (js.Function2[
          /* name */ String, 
          /* options */ CalculatedMetricOptions[Record[String, Double]], 
          Unit
        ]),
      trackMultiaddrConnection: MultiaddrConnection => Unit,
      trackProtocolStream: (Stream, Connection) => Unit
    ): Metrics = {
      val __obj = js.Dynamic.literal(registerCounter = registerCounter.asInstanceOf[js.Any], registerCounterGroup = registerCounterGroup.asInstanceOf[js.Any], registerMetric = registerMetric.asInstanceOf[js.Any], registerMetricGroup = registerMetricGroup.asInstanceOf[js.Any], trackMultiaddrConnection = js.Any.fromFunction1(trackMultiaddrConnection), trackProtocolStream = js.Any.fromFunction2(trackProtocolStream))
      __obj.asInstanceOf[Metrics]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Metrics] (val x: Self) extends AnyVal {
      
      inline def setRegisterCounter(
        value: (js.Function2[/* name */ String, /* options */ js.UndefOr[MetricOptions], Counter]) & (js.Function2[/* name */ String, /* options */ CalculatedMetricOptions[Double], Unit])
      ): Self = StObject.set(x, "registerCounter", value.asInstanceOf[js.Any])
      
      inline def setRegisterCounterGroup(
        value: (js.Function2[/* name */ String, /* options */ js.UndefOr[MetricOptions], CounterGroup]) & (js.Function2[
              /* name */ String, 
              /* options */ CalculatedMetricOptions[Record[String, Double]], 
              Unit
            ])
      ): Self = StObject.set(x, "registerCounterGroup", value.asInstanceOf[js.Any])
      
      inline def setRegisterMetric(
        value: (js.Function2[/* name */ String, /* options */ js.UndefOr[MetricOptions], Metric]) & (js.Function2[/* name */ String, /* options */ CalculatedMetricOptions[Double], Unit])
      ): Self = StObject.set(x, "registerMetric", value.asInstanceOf[js.Any])
      
      inline def setRegisterMetricGroup(
        value: (js.Function2[/* name */ String, /* options */ js.UndefOr[MetricOptions], MetricGroup]) & (js.Function2[
              /* name */ String, 
              /* options */ CalculatedMetricOptions[Record[String, Double]], 
              Unit
            ])
      ): Self = StObject.set(x, "registerMetricGroup", value.asInstanceOf[js.Any])
      
      inline def setTrackMultiaddrConnection(value: MultiaddrConnection => Unit): Self = StObject.set(x, "trackMultiaddrConnection", js.Any.fromFunction1(value))
      
      inline def setTrackProtocolStream(value: (Stream, Connection) => Unit): Self = StObject.set(x, "trackProtocolStream", js.Any.fromFunction2(value))
    }
  }
  
  type StopTimer = js.Function0[Unit]
}
