package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetadataDroppingEventUIParam extends js.Object {
  /**
    * A reference to the dragged element.
    */
  var draggedElement: js.UndefOr[String] = js.undefined
  /**
    * Gets a reference to the helper.
    */
  var helper: js.UndefOr[String] = js.undefined
  /**
    * Gets a reference to the data.
    */
  var metadata: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets the index at which the metadata will be inserted.
    */
  var metadataIndex: js.UndefOr[Double] = js.undefined
  /**
    * Gets a reference to the offset.
    */
  var offset: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets a reference to the current position of the draggable element.
    */
  var position: js.UndefOr[js.Any] = js.undefined
  /**
    * A reference to the drop target.
    */
  var targetElement: js.UndefOr[String] = js.undefined
}

object MetadataDroppingEventUIParam {
  @scala.inline
  def apply(
    draggedElement: String = null,
    helper: String = null,
    metadata: js.Any = null,
    metadataIndex: js.UndefOr[Double] = js.undefined,
    offset: js.Any = null,
    position: js.Any = null,
    targetElement: String = null
  ): MetadataDroppingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (draggedElement != null) __obj.updateDynamic("draggedElement")(draggedElement.asInstanceOf[js.Any])
    if (helper != null) __obj.updateDynamic("helper")(helper.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (!js.isUndefined(metadataIndex)) __obj.updateDynamic("metadataIndex")(metadataIndex.get.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (targetElement != null) __obj.updateDynamic("targetElement")(targetElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataDroppingEventUIParam]
  }
}

