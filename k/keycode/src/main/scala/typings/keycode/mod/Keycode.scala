package typings.keycode.mod

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Keycode extends js.Object {
  var aliases: AliasesMap = js.native
  var codes: CodesMap = js.native
  var names: InverseCodesMap = js.native
  def apply(event: Event_): String = js.native
  def apply(keycode: Double): String = js.native
  def apply(name: String): Double = js.native
  def isEventKey(event: Event_, nameOrCode: String): Boolean = js.native
  def isEventKey(event: Event_, nameOrCode: Double): Boolean = js.native
}

