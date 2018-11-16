package typings
package jsDashDataLib.jsDashDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-data", "Component")
@js.native
class Component () extends js.Object {
  def this(opts: js.Any) = this()
  var _listeners: js.Object = js.native
  def dbg(args: js.Any*): scala.Unit = js.native
  def emit(key: java.lang.String, args: js.Any*): scala.Unit = js.native
  def log(level: java.lang.String, args: js.Any*): scala.Unit = js.native
  def off(): scala.Unit = js.native
  def off(key: java.lang.String): scala.Unit = js.native
  def off(key: java.lang.String, handler: js.Function): scala.Unit = js.native
  def on(key: java.lang.String, handler: js.Function): scala.Unit = js.native
  def on(key: java.lang.String, handler: js.Function, ctx: js.Any): scala.Unit = js.native
}

@JSImport("js-data", "Component")
@js.native
object Component extends js.Object {
  def extend(): js.Any = js.native
  def extend(instanceProps: js.Any): js.Any = js.native
  def extend(instanceProps: js.Any, classProps: js.Any): js.Any = js.native
}

