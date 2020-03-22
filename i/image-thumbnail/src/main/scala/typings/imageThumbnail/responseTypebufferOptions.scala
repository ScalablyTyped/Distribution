package typings.imageThumbnail

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
    height: Int | Double = null,
    percentage: Int | Double = null,
    responseType: buffer with String = null,
    width: Int | Double = null
  ): responseTypebufferOptions = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (percentage != null) __obj.updateDynamic("percentage")(percentage.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[responseTypebufferOptions]
  }
}

