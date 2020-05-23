package typings.imageThumbnail.anon

import typings.imageThumbnail.imageThumbnailStrings.buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  responseType  :'buffer'} & image-thumbnail.image-thumbnail.Options */
trait responseTypebufferOptions extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var percentage: js.UndefOr[Double] = js.undefined
  var responseType: js.UndefOr[buffer with String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object responseTypebufferOptions {
  @scala.inline
  def apply(
    height: js.UndefOr[Double] = js.undefined,
    percentage: js.UndefOr[Double] = js.undefined,
    responseType: buffer with String = null,
    width: js.UndefOr[Double] = js.undefined
  ): responseTypebufferOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(percentage)) __obj.updateDynamic("percentage")(percentage.get.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[responseTypebufferOptions]
  }
}

