package typings.koDotPlus.KoPlusNs

import typings.knockout.KnockoutObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditableFunctions extends js.Object {
  @JSName("isEditing")
  var isEditing_Original: KnockoutObservable[Boolean] = js.native
  def beginEdit(): Unit = js.native
  def cancelEdit(): Unit = js.native
  def endEdit(): Unit = js.native
  def isEditing(): Boolean = js.native
  def isEditing(value: Boolean): Unit = js.native
  def rollback(): Unit = js.native
}

