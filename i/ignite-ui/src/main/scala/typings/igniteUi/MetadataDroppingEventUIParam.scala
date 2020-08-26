package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetadataDroppingEventUIParam extends js.Object {
  /**
    * A reference to the dragged element.
    */
  var draggedElement: js.UndefOr[String] = js.native
  /**
    * Gets a reference to the helper.
    */
  var helper: js.UndefOr[String] = js.native
  /**
    * Gets a reference to the data.
    */
  var metadata: js.UndefOr[js.Any] = js.native
  /**
    * Gets the index at which the metadata will be inserted.
    */
  var metadataIndex: js.UndefOr[Double] = js.native
  /**
    * Gets a reference to the offset.
    */
  var offset: js.UndefOr[js.Any] = js.native
  /**
    * Gets a reference to the current position of the draggable element.
    */
  var position: js.UndefOr[js.Any] = js.native
  /**
    * A reference to the drop target.
    */
  var targetElement: js.UndefOr[String] = js.native
}

object MetadataDroppingEventUIParam {
  @scala.inline
  def apply(): MetadataDroppingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetadataDroppingEventUIParam]
  }
  @scala.inline
  implicit class MetadataDroppingEventUIParamOps[Self <: MetadataDroppingEventUIParam] (val x: Self) extends AnyVal {
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
    def setDraggedElement(value: String): Self = this.set("draggedElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggedElement: Self = this.set("draggedElement", js.undefined)
    @scala.inline
    def setHelper(value: String): Self = this.set("helper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHelper: Self = this.set("helper", js.undefined)
    @scala.inline
    def setMetadata(value: js.Any): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setMetadataIndex(value: Double): Self = this.set("metadataIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadataIndex: Self = this.set("metadataIndex", js.undefined)
    @scala.inline
    def setOffset(value: js.Any): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setPosition(value: js.Any): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setTargetElement(value: String): Self = this.set("targetElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetElement: Self = this.set("targetElement", js.undefined)
  }
  
}

