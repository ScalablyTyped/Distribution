package typings.jqueryNotify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def notify(method: String): JQueryNotifyInstance = js.native
  def notify(method: String, params: js.Object): JQueryNotifyInstance = js.native
  def notify(method: String, params: js.Object, opts: JQueryNotifyOptions): JQueryNotifyInstance = js.native
  def notify(method: String, template: Double): JQueryNotifyInstance = js.native
  def notify(method: String, template: Double, params: js.Object): JQueryNotifyInstance = js.native
  def notify(method: String, template: Double, params: js.Object, opts: JQueryNotifyOptions): JQueryNotifyInstance = js.native
  def notify(options: JQueryNotifyOptions): JQueryNotifyWidget = js.native
}

