package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The position of an embedded object such as a chart.
  */
@js.native
trait SchemaEmbeddedObjectPosition extends js.Object {
  /**
    * If true, the embedded object is put on a new sheet whose ID is chosen for
    * you. Used only when writing.
    */
  var newSheet: js.UndefOr[Boolean] = js.native
  /**
    * The position at which the object is overlaid on top of a grid.
    */
  var overlayPosition: js.UndefOr[SchemaOverlayPosition] = js.native
  /**
    * The sheet this is on. Set only if the embedded object is on its own
    * sheet. Must be non-negative.
    */
  var sheetId: js.UndefOr[Double] = js.native
}

object SchemaEmbeddedObjectPosition {
  @scala.inline
  def apply(
    newSheet: js.UndefOr[Boolean] = js.undefined,
    overlayPosition: SchemaOverlayPosition = null,
    sheetId: js.UndefOr[Double] = js.undefined
  ): SchemaEmbeddedObjectPosition = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(newSheet)) __obj.updateDynamic("newSheet")(newSheet.get.asInstanceOf[js.Any])
    if (overlayPosition != null) __obj.updateDynamic("overlayPosition")(overlayPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(sheetId)) __obj.updateDynamic("sheetId")(sheetId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEmbeddedObjectPosition]
  }
}

