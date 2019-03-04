package typings
package grommetLib.componentsMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuProps extends js.Object {
  var a11yTitle: js.UndefOr[java.lang.String] = js.undefined
  var alignSelf: js.UndefOr[
    grommetLib.grommetLibStrings.start | grommetLib.grommetLibStrings.center | grommetLib.grommetLibStrings.end | grommetLib.grommetLibStrings.stretch
  ] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var dropAlign: js.UndefOr[grommetLib.Anon_BottomLeftRight] = js.undefined
  var dropBackground: js.UndefOr[java.lang.String | grommetLib.Anon_ColorMedium] = js.undefined
  var dropTarget: js.UndefOr[js.Object] = js.undefined
  var gridArea: js.UndefOr[java.lang.String] = js.undefined
  var icon: js.UndefOr[scala.Boolean | reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var items: js.Array[js.Object]
  var justifyContent: js.UndefOr[
    grommetLib.grommetLibStrings.start | grommetLib.grommetLibStrings.center | grommetLib.grommetLibStrings.end | grommetLib.grommetLibStrings.between | grommetLib.grommetLibStrings.around | grommetLib.grommetLibStrings.stretch
  ] = js.undefined
  var label: js.UndefOr[java.lang.String | reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var margin: js.UndefOr[
    grommetLib.grommetLibStrings.none | grommetLib.grommetLibStrings.xxsmall | grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | grommetLib.Anon_Bottom | java.lang.String
  ] = js.undefined
  var messages: js.UndefOr[grommetLib.Anon_CloseMenu] = js.undefined
  var size: js.UndefOr[
    grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | java.lang.String
  ] = js.undefined
}

object MenuProps {
  @scala.inline
  def apply(
    items: js.Array[js.Object],
    a11yTitle: java.lang.String = null,
    alignSelf: grommetLib.grommetLibStrings.start | grommetLib.grommetLibStrings.center | grommetLib.grommetLibStrings.end | grommetLib.grommetLibStrings.stretch = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    dropAlign: grommetLib.Anon_BottomLeftRight = null,
    dropBackground: java.lang.String | grommetLib.Anon_ColorMedium = null,
    dropTarget: js.Object = null,
    gridArea: java.lang.String = null,
    icon: scala.Boolean | reactLib.reactMod.ReactNs.ReactNode = null,
    justifyContent: grommetLib.grommetLibStrings.start | grommetLib.grommetLibStrings.center | grommetLib.grommetLibStrings.end | grommetLib.grommetLibStrings.between | grommetLib.grommetLibStrings.around | grommetLib.grommetLibStrings.stretch = null,
    label: java.lang.String | reactLib.reactMod.ReactNs.ReactNode = null,
    margin: grommetLib.grommetLibStrings.none | grommetLib.grommetLibStrings.xxsmall | grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | grommetLib.Anon_Bottom | java.lang.String = null,
    messages: grommetLib.Anon_CloseMenu = null,
    size: grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | java.lang.String = null
  ): MenuProps = {
    val __obj = js.Dynamic.literal(items = items)
    if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle)
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (dropAlign != null) __obj.updateDynamic("dropAlign")(dropAlign)
    if (dropBackground != null) __obj.updateDynamic("dropBackground")(dropBackground.asInstanceOf[js.Any])
    if (dropTarget != null) __obj.updateDynamic("dropTarget")(dropTarget)
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (justifyContent != null) __obj.updateDynamic("justifyContent")(justifyContent.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuProps]
  }
}

