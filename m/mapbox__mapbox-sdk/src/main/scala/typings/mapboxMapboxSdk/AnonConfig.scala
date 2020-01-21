package typings.mapboxMapboxSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConfig extends js.Object {
  var config: js.Any
  var ownerId: js.UndefOr[String] = js.undefined
  var scrollZoom: js.UndefOr[Boolean] = js.undefined
  var styleId: String
  var title: js.UndefOr[Boolean] = js.undefined
}

object AnonConfig {
  @scala.inline
  def apply(
    config: js.Any,
    styleId: String,
    ownerId: String = null,
    scrollZoom: js.UndefOr[Boolean] = js.undefined,
    title: js.UndefOr[Boolean] = js.undefined
  ): AnonConfig = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], styleId = styleId.asInstanceOf[js.Any])
    if (ownerId != null) __obj.updateDynamic("ownerId")(ownerId.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollZoom)) __obj.updateDynamic("scrollZoom")(scrollZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(title)) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConfig]
  }
}

