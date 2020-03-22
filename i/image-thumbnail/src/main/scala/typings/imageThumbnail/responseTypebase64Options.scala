package typings.imageThumbnail

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
    height: Int | Double = null,
    percentage: Int | Double = null,
    responseType: base64 with String = null,
    width: Int | Double = null
  ): responseTypebase64Options = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (percentage != null) __obj.updateDynamic("percentage")(percentage.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[responseTypebase64Options]
  }
}

