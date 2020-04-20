package typings.mapboxSpritezero.mod

import typings.mapboxSpritezero.AnonId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateLayoutOptions extends js.Object {
  /** If true, generate DataLayout ; if false, generate ImgLayout */
  var format: Boolean
  var imgs: js.Array[AnonId]
  /** overrides the max_size in mapnik */
  var maxIconSize: js.UndefOr[Double] = js.undefined
  /** Ratio of a 72dpi screen pixel to the destination pixel density */
  var pixelRatio: Double
  /** filters out icons that mapnik says are too big */
  var removeOversizedIcons: js.UndefOr[Boolean] = js.undefined
}

object GenerateLayoutOptions {
  @scala.inline
  def apply(
    format: Boolean,
    imgs: js.Array[AnonId],
    pixelRatio: Double,
    maxIconSize: Int | Double = null,
    removeOversizedIcons: js.UndefOr[Boolean] = js.undefined
  ): GenerateLayoutOptions = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], imgs = imgs.asInstanceOf[js.Any], pixelRatio = pixelRatio.asInstanceOf[js.Any])
    if (maxIconSize != null) __obj.updateDynamic("maxIconSize")(maxIconSize.asInstanceOf[js.Any])
    if (!js.isUndefined(removeOversizedIcons)) __obj.updateDynamic("removeOversizedIcons")(removeOversizedIcons.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateLayoutOptions]
  }
}

