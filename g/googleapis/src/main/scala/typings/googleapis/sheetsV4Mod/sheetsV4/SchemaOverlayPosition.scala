package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The location an object is overlaid on top of a grid.
  */
@js.native
trait SchemaOverlayPosition extends js.Object {
  /**
    * The cell the object is anchored to.
    */
  var anchorCell: js.UndefOr[SchemaGridCoordinate] = js.native
  /**
    * The height of the object, in pixels. Defaults to 371.
    */
  var heightPixels: js.UndefOr[Double] = js.native
  /**
    * The horizontal offset, in pixels, that the object is offset from the
    * anchor cell.
    */
  var offsetXPixels: js.UndefOr[Double] = js.native
  /**
    * The vertical offset, in pixels, that the object is offset from the anchor
    * cell.
    */
  var offsetYPixels: js.UndefOr[Double] = js.native
  /**
    * The width of the object, in pixels. Defaults to 600.
    */
  var widthPixels: js.UndefOr[Double] = js.native
}

object SchemaOverlayPosition {
  @scala.inline
  def apply(
    anchorCell: SchemaGridCoordinate = null,
    heightPixels: js.UndefOr[Double] = js.undefined,
    offsetXPixels: js.UndefOr[Double] = js.undefined,
    offsetYPixels: js.UndefOr[Double] = js.undefined,
    widthPixels: js.UndefOr[Double] = js.undefined
  ): SchemaOverlayPosition = {
    val __obj = js.Dynamic.literal()
    if (anchorCell != null) __obj.updateDynamic("anchorCell")(anchorCell.asInstanceOf[js.Any])
    if (!js.isUndefined(heightPixels)) __obj.updateDynamic("heightPixels")(heightPixels.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetXPixels)) __obj.updateDynamic("offsetXPixels")(offsetXPixels.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetYPixels)) __obj.updateDynamic("offsetYPixels")(offsetYPixels.get.asInstanceOf[js.Any])
    if (!js.isUndefined(widthPixels)) __obj.updateDynamic("widthPixels")(widthPixels.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOverlayPosition]
  }
}

