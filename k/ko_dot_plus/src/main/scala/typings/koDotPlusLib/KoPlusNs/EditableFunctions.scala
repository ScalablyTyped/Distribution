package typings
package koDotPlusLib.KoPlusNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditableFunctions extends js.Object {
  @JSName("isEditing")
  var isEditing_Original: knockoutLib.KnockoutObservable[scala.Boolean] = js.native
  def beginEdit(): scala.Unit = js.native
  def cancelEdit(): scala.Unit = js.native
  def endEdit(): scala.Unit = js.native
  def isEditing(): scala.Boolean = js.native
  def isEditing(value: scala.Boolean): scala.Unit = js.native
  def rollback(): scala.Unit = js.native
}

