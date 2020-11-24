package typings.jsData.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("js-data", "Component")
@js.native
class Component () extends js.Object {
  def this(opts: js.Any) = this()
  
  var _listeners: js.Object = js.native
  
  def dbg(args: js.Any*): Unit = js.native
  
  def emit(key: String, args: js.Any*): Unit = js.native
  
  def log(level: String, args: js.Any*): Unit = js.native
  
  def off(): Unit = js.native
  def off(key: js.UndefOr[scala.Nothing], handler: js.Function): Unit = js.native
  def off(key: String): Unit = js.native
  def off(key: String, handler: js.Function): Unit = js.native
  
  def on(key: String, handler: js.Function): Unit = js.native
  def on(key: String, handler: js.Function, ctx: js.Any): Unit = js.native
}
/* static members */
@JSImport("js-data", "Component")
@js.native
object Component extends js.Object {
  
  def extend(): js.Any = js.native
  def extend(instanceProps: js.UndefOr[scala.Nothing], classProps: js.Any): js.Any = js.native
  def extend(instanceProps: js.Any): js.Any = js.native
  def extend(instanceProps: js.Any, classProps: js.Any): js.Any = js.native
}
