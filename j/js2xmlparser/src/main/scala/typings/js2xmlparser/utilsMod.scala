package typings.js2xmlparser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js2xmlparser/lib/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  def isArray(`val`: js.Any): /* is std.Array<unknown> */ Boolean = js.native
  def isFunction(`val`: js.Any): /* is std.Function */ Boolean = js.native
  def isMap(`val`: js.Any): /* is std.Map<unknown, unknown> */ Boolean = js.native
  def isNull(`val`: js.Any): /* is null */ Boolean = js.native
  def isObject(`val`: js.Any): /* is std.Record<string, unknown> */ Boolean = js.native
  def isSet(`val`: js.Any): /* is std.Set<unknown> */ Boolean = js.native
  def isUndefined(`val`: js.Any): /* is undefined */ Boolean = js.native
  def stringify(value: js.Any): String = js.native
}

