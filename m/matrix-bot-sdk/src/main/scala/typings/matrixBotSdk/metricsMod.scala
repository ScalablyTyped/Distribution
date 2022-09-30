package typings.matrixBotSdk

import typings.matrixBotSdk.contextsMod.IMetricContext
import typings.matrixBotSdk.imetriclistenerMod.IMetricListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metricsMod {
  
  @JSImport("matrix-bot-sdk/lib/metrics/Metrics", "Metrics")
  @js.native
  /**
    * Creates a new Metrics handler with optional parent handler. When
    * a parent handler is defined, metrics will be automatically published
    * upwards to the parent.
    * @param {Metrics} parent Optional parent for upstream metrics.
    */
  open class Metrics () extends StObject {
    def this(parent: Metrics) = this()
    
    /**
      * Assigns a unique ID to the context object, returning it back.
      * @param {IMetricContext} context The context to modify.
      * @returns {IMetricContext} The provided context.
      */
    def assignUniqueContextId(context: IMetricContext): IMetricContext = js.native
    
    /**
      * Decrements a metric.
      * @param {string} metricName The metric name.
      * @param {IMetricContext} context The metric context. Expected to have a unique ID.
      * @param {number} amount The amount.
      */
    def decrement(metricName: String, context: IMetricContext, amount: Double): Unit = js.native
    
    /**
      * Ends a timer on a metric.
      * @param {string} metricName The metric name.
      * @param {IMetricContext} context The metric context. Expected to have a unique ID.
      */
    def end(metricName: String, context: IMetricContext): Unit = js.native
    
    /**
      * Increments a metric.
      * @param {string} metricName The metric name.
      * @param {IMetricContext} context The metric context. Expected to have a unique ID.
      * @param {number} amount The amount.
      */
    def increment(metricName: String, context: IMetricContext, amount: Double): Unit = js.native
    
    /* private */ var listeners: Any = js.native
    
    /**
      * Registers a metric listener.
      * @param {IMetricListener} listener The listener.
      */
    def registerListener(listener: IMetricListener): Unit = js.native
    
    /* private */ var requestStartTimes: Any = js.native
    
    /**
      * Resets a metric.
      * @param {string} metricName The metric name.
      * @param {IMetricContext} context The metric context. Expected to have a unique ID.
      */
    def reset(metricName: String, context: IMetricContext): Unit = js.native
    
    /**
      * Starts a timer on a metric.
      * @param {string} metricName The metric name.
      * @param {IMetricContext} context The metric context. Expected to have a unique ID.
      */
    def start(metricName: String, context: IMetricContext): Unit = js.native
    
    /* private */ var uid: Any = js.native
    
    /**
      * De-registers a metric listener.
      * @param {IMetricListener} listener The listener.
      */
    def unregisterListener(listener: IMetricListener): Unit = js.native
  }
}
