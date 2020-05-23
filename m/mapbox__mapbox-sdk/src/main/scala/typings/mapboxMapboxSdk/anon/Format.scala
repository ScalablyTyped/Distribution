package typings.mapboxMapboxSdk.anon

import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.json
import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.png
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Format extends js.Object {
  var format: js.UndefOr[json | png] = js.undefined
  var highRes: js.UndefOr[Boolean] = js.undefined
  var ownerId: js.UndefOr[String] = js.undefined
  var styleId: String
}

object Format {
  @scala.inline
  def apply(
    styleId: String,
    format: json | png = null,
    highRes: js.UndefOr[Boolean] = js.undefined,
    ownerId: String = null
  ): Format = {
    val __obj = js.Dynamic.literal(styleId = styleId.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(highRes)) __obj.updateDynamic("highRes")(highRes.get.asInstanceOf[js.Any])
    if (ownerId != null) __obj.updateDynamic("ownerId")(ownerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Format]
  }
}

