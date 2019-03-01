package typings
package grommetLib.componentsDropButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropButtonProps extends js.Object {
  var a11yTitle: js.UndefOr[java.lang.String] = js.undefined
  var alignSelf: js.UndefOr[
    grommetLib.grommetLibStrings.start | grommetLib.grommetLibStrings.center | grommetLib.grommetLibStrings.end | grommetLib.grommetLibStrings.stretch
  ] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var dropAlign: js.UndefOr[grommetLib.Anon_BottomLeft] = js.undefined
  var dropContent: reactLib.reactMod.Global.JSXNs.Element
  var dropTarget: js.UndefOr[js.Object] = js.undefined
  var gridArea: js.UndefOr[java.lang.String] = js.undefined
  var margin: js.UndefOr[
    grommetLib.grommetLibStrings.none | grommetLib.grommetLibStrings.xxsmall | grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | grommetLib.Anon_Bottom | java.lang.String
  ] = js.undefined
  var onClose: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onOpen: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var open: js.UndefOr[scala.Boolean] = js.undefined
}

object DropButtonProps {
  @scala.inline
  def apply(
    dropContent: reactLib.reactMod.Global.JSXNs.Element,
    a11yTitle: java.lang.String = null,
    alignSelf: grommetLib.grommetLibStrings.start | grommetLib.grommetLibStrings.center | grommetLib.grommetLibStrings.end | grommetLib.grommetLibStrings.stretch = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    dropAlign: grommetLib.Anon_BottomLeft = null,
    dropTarget: js.Object = null,
    gridArea: java.lang.String = null,
    margin: grommetLib.grommetLibStrings.none | grommetLib.grommetLibStrings.xxsmall | grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | grommetLib.Anon_Bottom | java.lang.String = null,
    onClose: js.Function1[/* repeated */ js.Any, _] = null,
    onOpen: js.Function1[/* repeated */ js.Any, _] = null,
    open: js.UndefOr[scala.Boolean] = js.undefined
  ): DropButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dropContent")(dropContent)
    if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle)
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (dropAlign != null) __obj.updateDynamic("dropAlign")(dropAlign)
    if (dropTarget != null) __obj.updateDynamic("dropTarget")(dropTarget)
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea)
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(onClose)
    if (onOpen != null) __obj.updateDynamic("onOpen")(onOpen)
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    __obj.asInstanceOf[DropButtonProps]
  }
}

