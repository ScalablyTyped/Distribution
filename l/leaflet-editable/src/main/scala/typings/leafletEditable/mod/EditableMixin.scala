package typings.leafletEditable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * EditableMixin is included to L.Polyline, L.Polygon and L.Marker. It adds the following methods to them.
  *
  * When editing is enabled, the editor is accessible on the instance with the editor property.
  */
@js.native
trait EditableMixin extends js.Object {
  /**
    * Disable editing, also remove the editor property reference.
    */
  def disableEdit(): Unit = js.native
  /**
    * Return true if current instance has an editor attached, and this editor is enabled.
    */
  def editEnabled(): Boolean = js.native
  /**
    * Enable editing, by creating an editor if not existing, and then calling enable on it.
    */
  def enableEdit(): js.Any = js.native
  /**
    * Enable or disable editing, according to current status.
    */
  def toggleEdit(): Unit = js.native
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
  @scala.inline
  implicit class EditableMixinOps[Self <: EditableMixin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDisableEdit(value: () => Unit): Self = this.set("disableEdit", js.Any.fromFunction0(value))
    @scala.inline
    def setEditEnabled(value: () => Boolean): Self = this.set("editEnabled", js.Any.fromFunction0(value))
    @scala.inline
    def setEnableEdit(value: () => js.Any): Self = this.set("enableEdit", js.Any.fromFunction0(value))
    @scala.inline
    def setToggleEdit(value: () => Unit): Self = this.set("toggleEdit", js.Any.fromFunction0(value))
  }
  
}

