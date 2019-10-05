package typings.grommet.componentsTabsMod

import typings.grommet.Anon_TabContents
import typings.grommet.grommetStrings.center
import typings.grommet.grommetStrings.end
import typings.grommet.grommetStrings.grow
import typings.grommet.grommetStrings.shrink
import typings.grommet.grommetStrings.start
import typings.grommet.utilsMod.A11yTitleType
import typings.grommet.utilsMod.AlignSelfType
import typings.grommet.utilsMod.GridAreaType
import typings.grommet.utilsMod.MarginType
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsProps extends js.Object {
  var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
  var activeIndex: js.UndefOr[Double] = js.undefined
  var alignSelf: js.UndefOr[AlignSelfType] = js.undefined
  var children: ReactNode
  var flex: js.UndefOr[grow | shrink | Boolean] = js.undefined
  var gridArea: js.UndefOr[GridAreaType] = js.undefined
  var justify: js.UndefOr[start | center | end] = js.undefined
  var margin: js.UndefOr[MarginType] = js.undefined
  var messages: js.UndefOr[Anon_TabContents] = js.undefined
  var onActive: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
}

object TabsProps {
  @scala.inline
  def apply(
    a11yTitle: A11yTitleType = null,
    activeIndex: Int | Double = null,
    alignSelf: AlignSelfType = null,
    children: ReactNode = null,
    flex: grow | shrink | Boolean = null,
    gridArea: GridAreaType = null,
    justify: start | center | end = null,
    margin: MarginType = null,
    messages: Anon_TabContents = null,
    onActive: /* repeated */ js.Any => _ = null
  ): TabsProps = {
    val __obj = js.Dynamic.literal()
    if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle)
    if (activeIndex != null) __obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (flex != null) __obj.updateDynamic("flex")(flex.asInstanceOf[js.Any])
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea)
    if (justify != null) __obj.updateDynamic("justify")(justify.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (onActive != null) __obj.updateDynamic("onActive")(js.Any.fromFunction1(onActive))
    __obj.asInstanceOf[TabsProps]
  }
}

