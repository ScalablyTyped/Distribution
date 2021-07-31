package typings.jqueryNotify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  def notify(method: String): JQueryNotifyInstance = js.native
  def notify(method: String, params: js.Object): JQueryNotifyInstance = js.native
  def notify(method: String, params: js.Object, opts: JQueryNotifyOptions): JQueryNotifyInstance = js.native
  def notify(method: String, params: Unit, opts: JQueryNotifyOptions): JQueryNotifyInstance = js.native
  def notify(method: String, template: Double): JQueryNotifyInstance = js.native
  def notify(method: String, template: Double, params: js.Object): JQueryNotifyInstance = js.native
  def notify(method: String, template: Double, params: js.Object, opts: JQueryNotifyOptions): JQueryNotifyInstance = js.native
  def notify(method: String, template: Double, params: Unit, opts: JQueryNotifyOptions): JQueryNotifyInstance = js.native
  def notify(options: JQueryNotifyOptions): JQueryNotifyWidget = js.native
}
