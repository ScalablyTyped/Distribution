package typings.itunesconnectanalytics.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("itunesconnectanalytics", "AnalyticsQuery")
@js.native
class AnalyticsQuery protected () extends js.Object {
  def this(`type`: String, appId: String, config: QueryConfig) = this()
  def date(start: QueryDateTypes, end: QueryDateTypes): AnalyticsQuery = js.native
  def limit(limit: Double): AnalyticsQuery = js.native
  def time(value: Double, unit: String): AnalyticsQuery = js.native
}

/* static members */
@JSImport("itunesconnectanalytics", "AnalyticsQuery")
@js.native
object AnalyticsQuery extends js.Object {
  def metrics(appId: String, config: QueryConfig): AnalyticsQuery = js.native
  def sources(appId: String, config: QueryConfig): AnalyticsQuery = js.native
}

