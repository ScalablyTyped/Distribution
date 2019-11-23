package typings.grommet.componentsListMod

import org.scalablytyped.runtime.StringDictionary
import typings.grommet.Anon_BackgroundBorder
import typings.grommet.Anon_DarkLight
import typings.grommet.utilsMod.A11yTitleType
import typings.grommet.utilsMod.AlignSelfType
import typings.grommet.utilsMod.GridAreaType
import typings.grommet.utilsMod.MarginType
import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListProps extends js.Object {
  var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
  var alignSelf: js.UndefOr[AlignSelfType] = js.undefined
  var as: js.UndefOr[String] = js.undefined
  var background: js.UndefOr[String | js.Array[String] | Anon_DarkLight] = js.undefined
  var border: js.UndefOr[BorderType] = js.undefined
  var data: js.UndefOr[js.Array[js.Object | String]] = js.undefined
  var gridArea: js.UndefOr[GridAreaType] = js.undefined
  var itemProps: js.UndefOr[StringDictionary[Anon_BackgroundBorder]] = js.undefined
  var margin: js.UndefOr[MarginType] = js.undefined
  var onClickItem: js.UndefOr[js.Function1[/* event */ MouseEvent[Element, NativeMouseEvent], Unit]] = js.undefined
  var onMore: js.UndefOr[js.Function0[Unit]] = js.undefined
  var pad: js.UndefOr[PadType] = js.undefined
  var primaryKey: js.UndefOr[String | (js.Function1[/* repeated */ js.Any, _])] = js.undefined
  var secondaryKey: js.UndefOr[String | (js.Function1[/* repeated */ js.Any, _])] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
}

object ListProps {
  @scala.inline
  def apply(
    a11yTitle: A11yTitleType = null,
    alignSelf: AlignSelfType = null,
    as: String = null,
    background: String | js.Array[String] | Anon_DarkLight = null,
    border: BorderType = null,
    data: js.Array[js.Object | String] = null,
    gridArea: GridAreaType = null,
    itemProps: StringDictionary[Anon_BackgroundBorder] = null,
    margin: MarginType = null,
    onClickItem: /* event */ MouseEvent[Element, NativeMouseEvent] => Unit = null,
    onMore: () => Unit = null,
    pad: PadType = null,
    primaryKey: String | (js.Function1[/* repeated */ js.Any, _]) = null,
    secondaryKey: String | (js.Function1[/* repeated */ js.Any, _]) = null,
    step: Int | Double = null
  ): ListProps = {
    val __obj = js.Dynamic.literal()
    if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle)
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf)
    if (as != null) __obj.updateDynamic("as")(as)
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea)
    if (itemProps != null) __obj.updateDynamic("itemProps")(itemProps)
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (onClickItem != null) __obj.updateDynamic("onClickItem")(js.Any.fromFunction1(onClickItem))
    if (onMore != null) __obj.updateDynamic("onMore")(js.Any.fromFunction0(onMore))
    if (pad != null) __obj.updateDynamic("pad")(pad.asInstanceOf[js.Any])
    if (primaryKey != null) __obj.updateDynamic("primaryKey")(primaryKey.asInstanceOf[js.Any])
    if (secondaryKey != null) __obj.updateDynamic("secondaryKey")(secondaryKey.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProps]
  }
}

