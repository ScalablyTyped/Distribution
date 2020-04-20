package typings.mapboxSpritezero.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageObject extends js.Object {
  /** Ratio of a 72dpi screen pixel to the destination pixel density */
  var pixelRatio: js.UndefOr[Double] = js.undefined
  /** A string of the SVG. */
  var svg: js.UndefOr[Buffer | String] = js.undefined
}

object ImageObject {
  @scala.inline
  def apply(pixelRatio: Int | Double = null, svg: Buffer | String = null): ImageObject = {
    val __obj = js.Dynamic.literal()
    if (pixelRatio != null) __obj.updateDynamic("pixelRatio")(pixelRatio.asInstanceOf[js.Any])
    if (svg != null) __obj.updateDynamic("svg")(svg.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageObject]
  }
}

