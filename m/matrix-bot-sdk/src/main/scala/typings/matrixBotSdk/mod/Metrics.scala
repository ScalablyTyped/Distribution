package typings.matrixBotSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-bot-sdk", "Metrics")
@js.native
/**
  * Creates a new Metrics handler with optional parent handler. When
  * a parent handler is defined, metrics will be automatically published
  * upwards to the parent.
  * @param {Metrics} parent Optional parent for upstream metrics.
  */
open class Metrics ()
  extends typings.matrixBotSdk.libMetricsMetricsMod.Metrics {
  def this(parent: typings.matrixBotSdk.libMetricsMetricsMod.Metrics) = this()
}
