package typings
package keymasterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Keymaster extends js.Object {
  var alt: scala.Boolean = js.native
  var command: scala.Boolean = js.native
  var control: scala.Boolean = js.native
  var ctrl: scala.Boolean = js.native
  var option: scala.Boolean = js.native
  var shift: scala.Boolean = js.native
  def apply(key: java.lang.String, callback: KeyHandler): scala.Unit = js.native
  def apply(key: java.lang.String, scope: java.lang.String, callback: KeyHandler): scala.Unit = js.native
  def deleteScope(scopeName: java.lang.String): scala.Unit = js.native
  def filter(event: FilterEvent): scala.Unit = js.native
  def getPressedKeyCodes(): js.Array[scala.Double] = js.native
  def getScope(): java.lang.String = js.native
  def isPressed(keyCode: scala.Double): scala.Boolean = js.native
  def noConflict(): scala.Unit = js.native
  def setScope(scopeName: java.lang.String): scala.Unit = js.native
  def unbind(key: java.lang.String): scala.Unit = js.native
  def unbind(key: java.lang.String, scopeName: java.lang.String): scala.Unit = js.native
}

