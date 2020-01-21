package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Updates the borders of a range. If a field is not set in the request, that
  * means the border remains as-is. For example, with two subsequent
  * UpdateBordersRequest:   1. range: A1:A5 `{ top: RED, bottom: WHITE }`  2.
  * range: A1:A5 `{ left: BLUE }`  That would result in A1:A5 having a borders
  * of `{ top: RED, bottom: WHITE, left: BLUE }`. If you want to clear a
  * border, explicitly set the style to NONE.
  */
@js.native
trait SchemaUpdateBordersRequest extends js.Object {
  /**
    * The border to put at the bottom of the range.
    */
  var bottom: js.UndefOr[SchemaBorder] = js.native
  /**
    * The horizontal border to put within the range.
    */
  var innerHorizontal: js.UndefOr[SchemaBorder] = js.native
  /**
    * The vertical border to put within the range.
    */
  var innerVertical: js.UndefOr[SchemaBorder] = js.native
  /**
    * The border to put at the left of the range.
    */
  var left: js.UndefOr[SchemaBorder] = js.native
  /**
    * The range whose borders should be updated.
    */
  var range: js.UndefOr[SchemaGridRange] = js.native
  /**
    * The border to put at the right of the range.
    */
  var right: js.UndefOr[SchemaBorder] = js.native
  /**
    * The border to put at the top of the range.
    */
  var top: js.UndefOr[SchemaBorder] = js.native
}

object SchemaUpdateBordersRequest {
  @scala.inline
  def apply(
    bottom: SchemaBorder = null,
    innerHorizontal: SchemaBorder = null,
    innerVertical: SchemaBorder = null,
    left: SchemaBorder = null,
    range: SchemaGridRange = null,
    right: SchemaBorder = null,
    top: SchemaBorder = null
  ): SchemaUpdateBordersRequest = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (innerHorizontal != null) __obj.updateDynamic("innerHorizontal")(innerHorizontal.asInstanceOf[js.Any])
    if (innerVertical != null) __obj.updateDynamic("innerVertical")(innerVertical.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUpdateBordersRequest]
  }
}

