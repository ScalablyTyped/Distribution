package typings
package insightLib.insightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Insight extends js.Object {
  var appVersion: java.lang.String = js.native
  var clientId: java.lang.String = js.native
  var config: insightLib.insightMod.insightNs.IConfigstore = js.native
  var nodeVersion: java.lang.String = js.native
  var optOut: scala.Boolean = js.native
  var os: java.lang.String = js.native
  var packageName: java.lang.String = js.native
  var packageVersion: java.lang.String = js.native
  var trackingCode: java.lang.String = js.native
  var trackingProvider: java.lang.String = js.native
  def askPermission(): scala.Unit = js.native
  def askPermission(msg: java.lang.String): scala.Unit = js.native
  def askPermission(msg: java.lang.String, cb: js.Function): scala.Unit = js.native
  def track(args: java.lang.String*): scala.Unit = js.native
  def trackEvent(event: insightLib.insightMod.insightNs.IEvent): scala.Unit = js.native
}

