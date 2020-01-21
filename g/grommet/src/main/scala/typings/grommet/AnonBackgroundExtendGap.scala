package typings.grommet

import typings.grommet.baseMod.ExtendType
import typings.grommet.utilsMod.BackgroundType
import typings.grommet.utilsMod.GapType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBackgroundExtendGap extends js.Object {
  var background: js.UndefOr[BackgroundType] = js.undefined
  var extend: js.UndefOr[ExtendType] = js.undefined
  var gap: js.UndefOr[GapType] = js.undefined
  var header: js.UndefOr[AnonBackgroundExtendBackgroundType] = js.undefined
  var panel: js.UndefOr[AnonExtendExtendType] = js.undefined
}

object AnonBackgroundExtendGap {
  @scala.inline
  def apply(
    background: BackgroundType = null,
    extend: ExtendType = null,
    gap: GapType = null,
    header: AnonBackgroundExtendBackgroundType = null,
    panel: AnonExtendExtendType = null
  ): AnonBackgroundExtendGap = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (gap != null) __obj.updateDynamic("gap")(gap.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (panel != null) __obj.updateDynamic("panel")(panel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBackgroundExtendGap]
  }
}

