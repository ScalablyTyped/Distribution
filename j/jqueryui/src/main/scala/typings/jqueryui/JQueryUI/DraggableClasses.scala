package typings.jqueryui.JQueryUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DraggableClasses extends js.Object {
  var `ui-draggable`: js.UndefOr[String] = js.native
  var `ui-draggable-disabled`: js.UndefOr[String] = js.native
  var `ui-draggable-dragging`: js.UndefOr[String] = js.native
  var `ui-draggable-handle`: js.UndefOr[String] = js.native
}

object DraggableClasses {
  @scala.inline
  def apply(): DraggableClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DraggableClasses]
  }
  @scala.inline
  implicit class DraggableClassesOps[Self <: DraggableClasses] (val x: Self) extends AnyVal {
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
    def `setUi-draggable`(value: String): Self = this.set("ui-draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteUi-draggable`: Self = this.set("ui-draggable", js.undefined)
    @scala.inline
    def `setUi-draggable-disabled`(value: String): Self = this.set("ui-draggable-disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteUi-draggable-disabled`: Self = this.set("ui-draggable-disabled", js.undefined)
    @scala.inline
    def `setUi-draggable-dragging`(value: String): Self = this.set("ui-draggable-dragging", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteUi-draggable-dragging`: Self = this.set("ui-draggable-dragging", js.undefined)
    @scala.inline
    def `setUi-draggable-handle`(value: String): Self = this.set("ui-draggable-handle", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteUi-draggable-handle`: Self = this.set("ui-draggable-handle", js.undefined)
  }
  
}

