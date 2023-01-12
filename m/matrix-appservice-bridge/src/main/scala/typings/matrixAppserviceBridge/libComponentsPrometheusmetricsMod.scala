package typings.matrixAppserviceBridge

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.matrixAppserviceBridge.libComponentsAgecountersMod.AgeCounters
import typings.matrixAppserviceBridge.mod.Bridge
import typings.matrixBotSdk.mod.Appservice
import typings.promClient.mod.Counter
import typings.promClient.mod.Gauge
import typings.promClient.mod.Histogram
import typings.promClient.mod.Registry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsPrometheusmetricsMod {
  
  @JSImport("matrix-appservice-bridge/lib/components/prometheusmetrics", "PrometheusMetrics")
  @js.native
  /**
    * Constructs a new Prometheus Metrics instance.
    * The metric `app_version` will be set here, so ensure that `getBridgeVersion`
    * will return the correct bridge version.
    * @param register A custom registry to provide, if not using the global default.
    */
  open class PrometheusMetrics () extends StObject {
    def this(register: Registry) = this()
    
    /**
      * Registers the <code>/metrics</code> page generating function with the
      * containing Express app.
      * @param {Bridge} bridge The containing Bridge instance.
      */
    def addAppServicePath(bridge: Bridge): Unit = js.native
    
    /**
      * Adds a new collector function. These collector functions are run whenever
      * the /metrics page is about to be generated, allowing code to update values
      * of gauges.
      * @param {Function} func A new collector function.
      * This function is passed no arguments and is not expected to return anything.
      * It runs purely to have a side-effect on previously registered gauges.
      */
    def addCollector(func: CollectorFunction): Unit = js.native
    
    /**
      * Adds a new counter metric
      * @param {Object} opts Options
      * @param {string} opts.namespace An optional toplevel namespace name for the
      * new metric. Default: <code>"bridge"</code>.
      * @param {string} opts.name The variable name for the new metric.
      * @param {string} opts.help Descriptive help text for the new metric.
      * Once created, the value of this metric can be incremented with the
      * <code>incCounter</code> method.
      * @param {Array<string>=} opts.labels An optional list of string label names
      * @return {Counter} A counter metric.
      */
    def addCounter(opts: CounterOpts): Counter[String] = js.native
    
    /**
      * Adds a new gauge metric.
      * @param {Object} opts Options
      * @param {string=} opts.namespace An optional toplevel namespace name for the
      * new metric. Default: <code>"bridge"</code>.
      * @param {string} opts.name The variable name for the new metric.
      * @param {string} opts.help Descriptive help text for the new metric.
      * @param {Array<string>=} opts.labels An optional list of string label names
      * @param {Function=} opts.refresh An optional function to invoke to generate a
      * new value for the gauge.
      * If a refresh function is provided, it is invoked with the gauge as its only
      * parameter. The function should call the <code>set()</code> method on this
      * gauge in order to provide a new value for it.
      * @return {Gauge} A gauge metric.
      */
    def addGauge(opts: GaugeOpts): Gauge[String] = js.native
    
    /**
      * Adds a new timer metric, represented by a prometheus Histogram.
      * @param {Object} opts Options
      * @param {string} opts.namespace An optional toplevel namespace name for the
      * new metric. Default: <code>"bridge"</code>.
      * @param {string} opts.name The variable name for the new metric.
      * @param {string} opts.help Descriptive help text for the new metric.
      * @param {string} opts.buckets The buckets that should be used for the histogram.
      * @param {Array<string>=} opts.labels An optional list of string label names
      * @return {Histogram} A histogram metric.
      * Once created, the value of this metric can be incremented with the
      * <code>startTimer</code> method.
      */
    def addTimer(opts: HistogramOpts): Histogram[String] = js.native
    
    /* private */ var collectors: Any = js.native
    
    /* private */ var counters: Any = js.native
    
    /**
      * Increments the value of a counter metric
      * @param{string} name The name the metric was previously registered as.
      * @param{Object} labels Optional object containing additional label values.
      */
    def incCounter(name: String, labels: StringDictionary[String]): Unit = js.native
    
    /**
      * Fetch metrics from all configured collectors
      */
    def refresh(): js.Promise[Unit] = js.native
    
    /* private */ var register: Any = js.native
    
    /**
      * Registers some exported metrics that expose counts of various kinds of
      * objects within the bridge.
      * @param {BridgeGaugesCallback} counterFunc A function that when invoked
      * returns the current counts of various items in the bridge.
      */
    def registerBridgeGauges(counterFunc: js.Function0[js.Promise[BridgeGaugesCounts] | BridgeGaugesCounts]): js.Promise[Unit] = js.native
    
    /**
      * Registers some exported metrics that relate to operations of the embedded
      * matrix-bot-sdk. In particular, a metric is added that counts the number of
      * calls to client API endpoints made by the client library.
      */
    def registerMatrixSdkMetrics(appservice: Appservice): Unit = js.native
    
    /**
      * Begins a new timer observation for a timer metric.
      * @param{string} name The name the metric was previously registered as.
      * @param{Object} labels Optional object containing additional label values.
      * @return {function} A function to be called to end the timer and report the
      * observation.
      */
    def startTimer(name: String, labels: StringDictionary[String]): js.Function0[Unit] = js.native
    
    /* private */ var timers: Any = js.native
  }
  /* static members */
  object PrometheusMetrics {
    
    @JSImport("matrix-appservice-bridge/lib/components/prometheusmetrics", "PrometheusMetrics")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("matrix-appservice-bridge/lib/components/prometheusmetrics", "PrometheusMetrics.AgeCounters")
    @js.native
    def AgeCounters: Instantiable1[
        /* counterPeriods */ js.UndefOr[js.Array[String]], 
        typings.matrixAppserviceBridge.libComponentsAgecountersMod.AgeCounters
      ] = js.native
    inline def AgeCounters_=(x: Instantiable1[/* counterPeriods */ js.UndefOr[js.Array[String]], AgeCounters]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AgeCounters")(x.asInstanceOf[js.Any])
  }
  
  trait BridgeGaugesCounts extends StObject {
    
    var matrixGhosts: js.UndefOr[Double] = js.undefined
    
    var matrixRoomConfigs: js.UndefOr[Double] = js.undefined
    
    var matrixRoomsByAge: js.UndefOr[AgeCounters] = js.undefined
    
    var matrixUsersByAge: js.UndefOr[AgeCounters] = js.undefined
    
    var remoteGhosts: js.UndefOr[Double] = js.undefined
    
    var remoteRoomConfigs: js.UndefOr[Double] = js.undefined
    
    var remoteRoomsByAge: js.UndefOr[AgeCounters] = js.undefined
    
    var remoteUsersByAge: js.UndefOr[AgeCounters] = js.undefined
    
    var rmau: js.UndefOr[Double] = js.undefined
  }
  object BridgeGaugesCounts {
    
    inline def apply(): BridgeGaugesCounts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BridgeGaugesCounts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BridgeGaugesCounts] (val x: Self) extends AnyVal {
      
      inline def setMatrixGhosts(value: Double): Self = StObject.set(x, "matrixGhosts", value.asInstanceOf[js.Any])
      
      inline def setMatrixGhostsUndefined: Self = StObject.set(x, "matrixGhosts", js.undefined)
      
      inline def setMatrixRoomConfigs(value: Double): Self = StObject.set(x, "matrixRoomConfigs", value.asInstanceOf[js.Any])
      
      inline def setMatrixRoomConfigsUndefined: Self = StObject.set(x, "matrixRoomConfigs", js.undefined)
      
      inline def setMatrixRoomsByAge(value: AgeCounters): Self = StObject.set(x, "matrixRoomsByAge", value.asInstanceOf[js.Any])
      
      inline def setMatrixRoomsByAgeUndefined: Self = StObject.set(x, "matrixRoomsByAge", js.undefined)
      
      inline def setMatrixUsersByAge(value: AgeCounters): Self = StObject.set(x, "matrixUsersByAge", value.asInstanceOf[js.Any])
      
      inline def setMatrixUsersByAgeUndefined: Self = StObject.set(x, "matrixUsersByAge", js.undefined)
      
      inline def setRemoteGhosts(value: Double): Self = StObject.set(x, "remoteGhosts", value.asInstanceOf[js.Any])
      
      inline def setRemoteGhostsUndefined: Self = StObject.set(x, "remoteGhosts", js.undefined)
      
      inline def setRemoteRoomConfigs(value: Double): Self = StObject.set(x, "remoteRoomConfigs", value.asInstanceOf[js.Any])
      
      inline def setRemoteRoomConfigsUndefined: Self = StObject.set(x, "remoteRoomConfigs", js.undefined)
      
      inline def setRemoteRoomsByAge(value: AgeCounters): Self = StObject.set(x, "remoteRoomsByAge", value.asInstanceOf[js.Any])
      
      inline def setRemoteRoomsByAgeUndefined: Self = StObject.set(x, "remoteRoomsByAge", js.undefined)
      
      inline def setRemoteUsersByAge(value: AgeCounters): Self = StObject.set(x, "remoteUsersByAge", value.asInstanceOf[js.Any])
      
      inline def setRemoteUsersByAgeUndefined: Self = StObject.set(x, "remoteUsersByAge", js.undefined)
      
      inline def setRmau(value: Double): Self = StObject.set(x, "rmau", value.asInstanceOf[js.Any])
      
      inline def setRmauUndefined: Self = StObject.set(x, "rmau", js.undefined)
    }
  }
  
  type CollectorFunction = js.Function0[js.Promise[Unit] | Unit]
  
  trait CounterOpts extends StObject {
    
    var help: String
    
    var labels: js.UndefOr[js.Array[String]] = js.undefined
    
    var name: String
    
    var namespace: js.UndefOr[String] = js.undefined
  }
  object CounterOpts {
    
    inline def apply(help: String, name: String): CounterOpts = {
      val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CounterOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CounterOpts] (val x: Self) extends AnyVal {
      
      inline def setHelp(value: String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      inline def setLabels(value: js.Array[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      inline def setLabelsVarargs(value: String*): Self = StObject.set(x, "labels", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    }
  }
  
  trait GaugeOpts
    extends StObject
       with CounterOpts {
    
    var refresh: js.UndefOr[js.Function1[/* gauge */ Gauge[String], Unit]] = js.undefined
  }
  object GaugeOpts {
    
    inline def apply(help: String, name: String): GaugeOpts = {
      val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GaugeOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GaugeOpts] (val x: Self) extends AnyVal {
      
      inline def setRefresh(value: /* gauge */ Gauge[String] => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction1(value))
      
      inline def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
    }
  }
  
  trait HistogramOpts
    extends StObject
       with CounterOpts {
    
    var buckets: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object HistogramOpts {
    
    inline def apply(help: String, name: String): HistogramOpts = {
      val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[HistogramOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HistogramOpts] (val x: Self) extends AnyVal {
      
      inline def setBuckets(value: js.Array[Double]): Self = StObject.set(x, "buckets", value.asInstanceOf[js.Any])
      
      inline def setBucketsUndefined: Self = StObject.set(x, "buckets", js.undefined)
      
      inline def setBucketsVarargs(value: Double*): Self = StObject.set(x, "buckets", js.Array(value*))
    }
  }
}
