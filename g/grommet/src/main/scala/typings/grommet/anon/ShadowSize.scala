package typings.grommet.anon

import typings.grommet.utilsMod.BackgroundType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShadowSize extends js.Object {
  var background: js.UndefOr[BackgroundType] = js.undefined
  var border: js.UndefOr[Width] = js.undefined
  var shadowSize: js.UndefOr[String] = js.undefined
  var zIndex: js.UndefOr[String] = js.undefined
}

object ShadowSize {
  @scala.inline
  def apply(
    background: BackgroundType = null,
    border: Width = null,
    shadowSize: String = null,
    zIndex: String = null
  ): ShadowSize = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (shadowSize != null) __obj.updateDynamic("shadowSize")(shadowSize.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowSize]
  }
}

