package typings.mapboxSpritezero.mod

import typings.mapboxSpritezero.anon.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateLayoutOptions extends js.Object {
  /** If true, generate DataLayout ; if false, generate ImgLayout */
  var format: Boolean
  var imgs: js.Array[Id]
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
    imgs: js.Array[Id],
    pixelRatio: Double,
    maxIconSize: js.UndefOr[Double] = js.undefined,
    removeOversizedIcons: js.UndefOr[Boolean] = js.undefined
  ): GenerateLayoutOptions = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], imgs = imgs.asInstanceOf[js.Any], pixelRatio = pixelRatio.asInstanceOf[js.Any])
    if (!js.isUndefined(maxIconSize)) __obj.updateDynamic("maxIconSize")(maxIconSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(removeOversizedIcons)) __obj.updateDynamic("removeOversizedIcons")(removeOversizedIcons.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateLayoutOptions]
  }
}

