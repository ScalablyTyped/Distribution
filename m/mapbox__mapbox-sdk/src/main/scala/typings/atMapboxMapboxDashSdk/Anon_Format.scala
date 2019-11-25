package typings.atMapboxMapboxDashSdk

import typings.atMapboxMapboxDashSdk.atMapboxMapboxDashSdkStrings.json
import typings.atMapboxMapboxDashSdk.atMapboxMapboxDashSdkStrings.png
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Format extends js.Object {
  var format: js.UndefOr[json | png] = js.undefined
  var highRes: js.UndefOr[Boolean] = js.undefined
  var ownerId: js.UndefOr[String] = js.undefined
  var styleId: String
}

object Anon_Format {
  @scala.inline
  def apply(
    styleId: String,
    format: json | png = null,
    highRes: js.UndefOr[Boolean] = js.undefined,
    ownerId: String = null
  ): Anon_Format = {
    val __obj = js.Dynamic.literal(styleId = styleId.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(highRes)) __obj.updateDynamic("highRes")(highRes.asInstanceOf[js.Any])
    if (ownerId != null) __obj.updateDynamic("ownerId")(ownerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Format]
  }
}

