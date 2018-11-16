package typings
package keycodeLib.keycodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Keycode extends js.Object {
  var aliases: AliasesMap = js.native
  var codes: CodesMap = js.native
  var names: InverseCodesMap = js.native
  def apply(event: stdLib.Event): java.lang.String = js.native
  def apply(keycode: scala.Double): java.lang.String = js.native
  def apply(name: java.lang.String): scala.Double = js.native
  def isEventKey(event: stdLib.Event, nameOrCode: java.lang.String): scala.Boolean = js.native
  def isEventKey(event: stdLib.Event, nameOrCode: scala.Double): scala.Boolean = js.native
}

