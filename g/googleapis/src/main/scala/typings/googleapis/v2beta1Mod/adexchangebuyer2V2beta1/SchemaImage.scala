package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An image resource. You may provide a larger image than was requested, so
  * long as the aspect ratio is preserved.
  */
@js.native
trait SchemaImage extends js.Object {
  /**
    * Image height in pixels.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * The URL of the image.
    */
  var url: js.UndefOr[String] = js.native
  /**
    * Image width in pixels.
    */
  var width: js.UndefOr[Double] = js.native
}

object SchemaImage {
  @scala.inline
  def apply(
    height: js.UndefOr[Double] = js.undefined,
    url: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): SchemaImage = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaImage]
  }
}

