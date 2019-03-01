package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetadataDroppedEventUIParam extends js.Object {
  /**
  	 * A reference to the dragged element.
  	 */
  var draggedElement: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets a reference to the helper.
  	 */
  var helper: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets a reference to the data.
  	 */
  var metadata: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets the index at which the metadata is inserted.
  	 */
  var metadataIndex: js.UndefOr[scala.Double] = js.undefined
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
  var targetElement: js.UndefOr[java.lang.String] = js.undefined
}

object MetadataDroppedEventUIParam {
  @scala.inline
  def apply(
    draggedElement: java.lang.String = null,
    helper: java.lang.String = null,
    metadata: js.Any = null,
    metadataIndex: scala.Int | scala.Double = null,
    offset: js.Any = null,
    position: js.Any = null,
    targetElement: java.lang.String = null
  ): MetadataDroppedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (draggedElement != null) __obj.updateDynamic("draggedElement")(draggedElement)
    if (helper != null) __obj.updateDynamic("helper")(helper)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (metadataIndex != null) __obj.updateDynamic("metadataIndex")(metadataIndex.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (position != null) __obj.updateDynamic("position")(position)
    if (targetElement != null) __obj.updateDynamic("targetElement")(targetElement)
    __obj.asInstanceOf[MetadataDroppedEventUIParam]
  }
}

