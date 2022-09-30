package typings.matrixBotSdk

import typings.matrixBotSdk.contextsMod.IMetricContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imetriclistenerMod {
  
  trait IMetricListener extends StObject {
    
    /**
      * Called when a linear metric (increasing/decreasing number) should
      * be decremented.
      * @param {string} metricName The metric being called.
      * @param {IMetricContext} context Context for the metric. Never null.
      * @param {number} amount The amount to subtract. Never negative or zero.
      */
    def onDecrement(metricName: String, context: IMetricContext, amount: Double): Any
    
    /**
      * Called when the given metric should stop being tracked. Will have
      * started with a matching onStartMetric() call.
      * @param {string} metricName The metric being called.
      * @param {any} context Context for the metric. Never null.
      * @param {number} timeMs The measured time in milliseconds between
      * the start and end.
      */
    def onEndMetric(metricName: String, context: IMetricContext, timeMs: Double): Unit
    
    /**
      * Called when a linear metric (increasing/decreasing number) should
      * be incremented.
      * @param {string} metricName The metric being called.
      * @param {IMetricContext} context Context for the metric. Never null.
      * @param {number} amount The amount to add. Never negative or zero.
      */
    def onIncrement(metricName: String, context: IMetricContext, amount: Double): Any
    
    /**
      * Called when a linear metric (increasing/decreasing number) should
      * be reset to zero.
      * @param {string} metricName The metric being called.
      * @param {IMetricContext} context Context for the metric. Never null.
      */
    def onReset(metricName: String, context: IMetricContext): Any
    
    /**
      * Called when the given metric should start being tracked. Will be
      * paired with a matching onEndMetric() call.
      * @param {string} metricName The metric being called.
      * @param {IMetricContext} context Context for the metric. Never null.
      */
    def onStartMetric(metricName: String, context: IMetricContext): Unit
  }
  object IMetricListener {
    
    inline def apply(
      onDecrement: (String, IMetricContext, Double) => Any,
      onEndMetric: (String, IMetricContext, Double) => Unit,
      onIncrement: (String, IMetricContext, Double) => Any,
      onReset: (String, IMetricContext) => Any,
      onStartMetric: (String, IMetricContext) => Unit
    ): IMetricListener = {
      val __obj = js.Dynamic.literal(onDecrement = js.Any.fromFunction3(onDecrement), onEndMetric = js.Any.fromFunction3(onEndMetric), onIncrement = js.Any.fromFunction3(onIncrement), onReset = js.Any.fromFunction2(onReset), onStartMetric = js.Any.fromFunction2(onStartMetric))
      __obj.asInstanceOf[IMetricListener]
    }
    
    extension [Self <: IMetricListener](x: Self) {
      
      inline def setOnDecrement(value: (String, IMetricContext, Double) => Any): Self = StObject.set(x, "onDecrement", js.Any.fromFunction3(value))
      
      inline def setOnEndMetric(value: (String, IMetricContext, Double) => Unit): Self = StObject.set(x, "onEndMetric", js.Any.fromFunction3(value))
      
      inline def setOnIncrement(value: (String, IMetricContext, Double) => Any): Self = StObject.set(x, "onIncrement", js.Any.fromFunction3(value))
      
      inline def setOnReset(value: (String, IMetricContext) => Any): Self = StObject.set(x, "onReset", js.Any.fromFunction2(value))
      
      inline def setOnStartMetric(value: (String, IMetricContext) => Unit): Self = StObject.set(x, "onStartMetric", js.Any.fromFunction2(value))
    }
  }
}
