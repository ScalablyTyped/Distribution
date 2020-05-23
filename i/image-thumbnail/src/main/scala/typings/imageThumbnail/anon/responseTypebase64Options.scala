package typings.imageThumbnail.anon

import typings.imageThumbnail.imageThumbnailStrings.base64
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  responseType  :'base64'} & image-thumbnail.image-thumbnail.Options */
trait responseTypebase64Options extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var percentage: js.UndefOr[Double] = js.undefined
  var responseType: js.UndefOr[base64 with String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object responseTypebase64Options {
  @scala.inline
  def apply(
    height: js.UndefOr[Double] = js.undefined,
    percentage: js.UndefOr[Double] = js.undefined,
    responseType: base64 with String = null,
    width: js.UndefOr[Double] = js.undefined
  ): responseTypebase64Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(percentage)) __obj.updateDynamic("percentage")(percentage.get.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[responseTypebase64Options]
  }
}

