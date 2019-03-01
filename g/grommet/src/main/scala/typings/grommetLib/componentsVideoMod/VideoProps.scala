package typings
package grommetLib.componentsVideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoProps extends js.Object {
  var a11yTitle: js.UndefOr[java.lang.String] = js.undefined
  var alignSelf: js.UndefOr[
    grommetLib.grommetLibStrings.start | grommetLib.grommetLibStrings.center | grommetLib.grommetLibStrings.end | grommetLib.grommetLibStrings.stretch
  ] = js.undefined
  var autoPlay: js.UndefOr[scala.Boolean] = js.undefined
  var controls: js.UndefOr[
    grommetLib.grommetLibStrings.`false` | grommetLib.grommetLibStrings.over | grommetLib.grommetLibStrings.below
  ] = js.undefined
  var fit: js.UndefOr[grommetLib.grommetLibStrings.cover | grommetLib.grommetLibStrings.contain] = js.undefined
  var gridArea: js.UndefOr[java.lang.String] = js.undefined
  var loop: js.UndefOr[scala.Boolean] = js.undefined
  var margin: js.UndefOr[
    grommetLib.grommetLibStrings.none | grommetLib.grommetLibStrings.xxsmall | grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | grommetLib.Anon_Bottom | java.lang.String
  ] = js.undefined
  var mute: js.UndefOr[scala.Boolean] = js.undefined
}

object VideoProps {
  @scala.inline
  def apply(
    a11yTitle: java.lang.String = null,
    alignSelf: grommetLib.grommetLibStrings.start | grommetLib.grommetLibStrings.center | grommetLib.grommetLibStrings.end | grommetLib.grommetLibStrings.stretch = null,
    autoPlay: js.UndefOr[scala.Boolean] = js.undefined,
    controls: grommetLib.grommetLibStrings.`false` | grommetLib.grommetLibStrings.over | grommetLib.grommetLibStrings.below = null,
    fit: grommetLib.grommetLibStrings.cover | grommetLib.grommetLibStrings.contain = null,
    gridArea: java.lang.String = null,
    loop: js.UndefOr[scala.Boolean] = js.undefined,
    margin: grommetLib.grommetLibStrings.none | grommetLib.grommetLibStrings.xxsmall | grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | grommetLib.Anon_Bottom | java.lang.String = null,
    mute: js.UndefOr[scala.Boolean] = js.undefined
  ): VideoProps = {
    val __obj = js.Dynamic.literal()
    if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle)
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPlay)) __obj.updateDynamic("autoPlay")(autoPlay)
    if (controls != null) __obj.updateDynamic("controls")(controls.asInstanceOf[js.Any])
    if (fit != null) __obj.updateDynamic("fit")(fit.asInstanceOf[js.Any])
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea)
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop)
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (!js.isUndefined(mute)) __obj.updateDynamic("mute")(mute)
    __obj.asInstanceOf[VideoProps]
  }
}

