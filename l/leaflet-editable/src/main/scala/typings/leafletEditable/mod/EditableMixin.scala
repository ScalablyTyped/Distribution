package typings.leafletEditable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * EditableMixin is included to L.Polyline, L.Polygon and L.Marker. It adds the following methods to them.
  *
  * When editing is enabled, the editor is accessible on the instance with the editor property.
  */
trait EditableMixin extends js.Object {
  /**
    * Disable editing, also remove the editor property reference.
    */
  def disableEdit(): Unit
  /**
    * Return true if current instance has an editor attached, and this editor is enabled.
    */
  def editEnabled(): Boolean
  /**
    * Enable editing, by creating an editor if not existing, and then calling enable on it.
    */
  def enableEdit(): js.Any
  /**
    * Enable or disable editing, according to current status.
    */
  def toggleEdit(): Unit
}

object EditableMixin {
  @scala.inline
  def apply(
    disableEdit: () => Unit,
    editEnabled: () => Boolean,
    enableEdit: () => js.Any,
    toggleEdit: () => Unit
  ): EditableMixin = {
    val __obj = js.Dynamic.literal(disableEdit = js.Any.fromFunction0(disableEdit), editEnabled = js.Any.fromFunction0(editEnabled), enableEdit = js.Any.fromFunction0(enableEdit), toggleEdit = js.Any.fromFunction0(toggleEdit))
    __obj.asInstanceOf[EditableMixin]
  }
}

