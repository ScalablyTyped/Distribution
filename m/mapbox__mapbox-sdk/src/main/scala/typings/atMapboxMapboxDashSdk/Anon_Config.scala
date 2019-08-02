package typings.atMapboxMapboxDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Config extends js.Object {
  var config: js.Any
  var ownerId: js.UndefOr[String] = js.undefined
  var scrollZoom: js.UndefOr[Boolean] = js.undefined
  var styleId: String
  var title: js.UndefOr[Boolean] = js.undefined
}

object Anon_Config {
  @scala.inline
  def apply(
    config: js.Any,
    styleId: String,
    ownerId: String = null,
    scrollZoom: js.UndefOr[Boolean] = js.undefined,
    title: js.UndefOr[Boolean] = js.undefined
  ): Anon_Config = {
    val __obj = js.Dynamic.literal(config = config, styleId = styleId)
    if (ownerId != null) __obj.updateDynamic("ownerId")(ownerId)
    if (!js.isUndefined(scrollZoom)) __obj.updateDynamic("scrollZoom")(scrollZoom)
    if (!js.isUndefined(title)) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_Config]
  }
}

