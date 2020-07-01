package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The amount of padding around the cell, in pixels. When updating padding,
  * every field must be specified.
  */
@js.native
trait SchemaPadding extends js.Object {
  /**
    * The bottom padding of the cell.
    */
  var bottom: js.UndefOr[Double] = js.native
  /**
    * The left padding of the cell.
    */
  var left: js.UndefOr[Double] = js.native
  /**
    * The right padding of the cell.
    */
  var right: js.UndefOr[Double] = js.native
  /**
    * The top padding of the cell.
    */
  var top: js.UndefOr[Double] = js.native
}

object SchemaPadding {
  @scala.inline
  def apply(
    bottom: js.UndefOr[Double] = js.undefined,
    left: js.UndefOr[Double] = js.undefined,
    right: js.UndefOr[Double] = js.undefined,
    top: js.UndefOr[Double] = js.undefined
  ): SchemaPadding = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bottom)) __obj.updateDynamic("bottom")(bottom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.get.asInstanceOf[js.Any])
    if (!js.isUndefined(right)) __obj.updateDynamic("right")(right.get.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPadding]
  }
}

