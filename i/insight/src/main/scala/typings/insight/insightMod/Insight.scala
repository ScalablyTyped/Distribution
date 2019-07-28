package typings.insight.insightMod

import typings.insight.insightMod.insightNs.IConfigstore
import typings.insight.insightMod.insightNs.IEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Insight extends js.Object {
  var appVersion: String = js.native
  var clientId: String = js.native
  var config: IConfigstore = js.native
  var nodeVersion: String = js.native
  var optOut: Boolean = js.native
  var os: String = js.native
  var packageName: String = js.native
  var packageVersion: String = js.native
  var trackingCode: String = js.native
  var trackingProvider: String = js.native
  def askPermission(): Unit = js.native
  def askPermission(msg: String): Unit = js.native
  def askPermission(msg: String, cb: js.Function): Unit = js.native
  def track(args: String*): Unit = js.native
  def trackEvent(event: IEvent): Unit = js.native
}

