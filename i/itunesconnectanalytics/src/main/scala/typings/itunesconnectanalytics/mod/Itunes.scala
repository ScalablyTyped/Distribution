package typings.itunesconnectanalytics.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("itunesconnectanalytics", "Itunes")
@js.native
class Itunes protected () extends js.Object {
  def this(username: String, password: String, options: ItunesOptions) = this()
  def changeProvider(
    providerId: String,
    callback: js.Function2[/* error */ js.UndefOr[js.Any], /* paused */ js.UndefOr[Boolean], Unit]
  ): Unit = js.native
  def executeRequest(task: RequestTask, callback: js.Function0[Unit]): Unit = js.native
  def getAPIURL(url: String, callback: js.Function2[/* error */ js.Any, /* paused */ Boolean, Unit]): Unit = js.native
  def getApps(callback: js.Function2[/* error */ js.Any, /* paused */ Boolean, Unit]): Unit = js.native
  def getCookies(): String = js.native
  def getHeaders(): js.Object = js.native
  def getSettings(callback: js.Function2[/* error */ js.Any, /* paused */ Boolean, Unit]): Unit = js.native
  def login(username: String, password: String): Unit = js.native
  def request(query: AnalyticsQuery, callback: js.Function2[/* error */ js.Any, /* body */ QueryResult, Unit]): Unit = js.native
}

