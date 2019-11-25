package typings.grommet

import typings.grommet.themesBaseMod.ExtendType
import typings.grommet.utilsMod.BackgroundType
import typings.grommet.utilsMod.GapType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackgroundExtendGap extends js.Object {
  var background: js.UndefOr[BackgroundType] = js.undefined
  var extend: js.UndefOr[ExtendType] = js.undefined
  var gap: js.UndefOr[GapType] = js.undefined
  var header: js.UndefOr[Anon_BackgroundExtendBackgroundType] = js.undefined
  var panel: js.UndefOr[Anon_ExtendExtendType] = js.undefined
}

object Anon_BackgroundExtendGap {
  @scala.inline
  def apply(
    background: BackgroundType = null,
    extend: ExtendType = null,
    gap: GapType = null,
    header: Anon_BackgroundExtendBackgroundType = null,
    panel: Anon_ExtendExtendType = null
  ): Anon_BackgroundExtendGap = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (gap != null) __obj.updateDynamic("gap")(gap.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (panel != null) __obj.updateDynamic("panel")(panel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BackgroundExtendGap]
  }
}

