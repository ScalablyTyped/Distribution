package typings.grommet.componentsVideoMod

import typings.grommet.Anon_Bottom
import typings.grommet.grommetStrings.`false`
import typings.grommet.grommetStrings.below
import typings.grommet.grommetStrings.center
import typings.grommet.grommetStrings.contain
import typings.grommet.grommetStrings.cover
import typings.grommet.grommetStrings.end
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.none
import typings.grommet.grommetStrings.over
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.start
import typings.grommet.grommetStrings.stretch
import typings.grommet.grommetStrings.xlarge
import typings.grommet.grommetStrings.xsmall
import typings.grommet.grommetStrings.xxsmall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoProps extends js.Object {
  var a11yTitle: js.UndefOr[String] = js.undefined
  var alignSelf: js.UndefOr[start | center | end | stretch] = js.undefined
  var autoPlay: js.UndefOr[Boolean] = js.undefined
  var controls: js.UndefOr[`false` | over | below] = js.undefined
  var fit: js.UndefOr[cover | contain] = js.undefined
  var gridArea: js.UndefOr[String] = js.undefined
  var loop: js.UndefOr[Boolean] = js.undefined
  var margin: js.UndefOr[none | xxsmall | xsmall | small | medium | large | xlarge | Anon_Bottom | String] = js.undefined
  var mute: js.UndefOr[Boolean] = js.undefined
}

object VideoProps {
  @scala.inline
  def apply(
    a11yTitle: String = null,
    alignSelf: start | center | end | stretch = null,
    autoPlay: js.UndefOr[Boolean] = js.undefined,
    controls: `false` | over | below = null,
    fit: cover | contain = null,
    gridArea: String = null,
    loop: js.UndefOr[Boolean] = js.undefined,
    margin: none | xxsmall | xsmall | small | medium | large | xlarge | Anon_Bottom | String = null,
    mute: js.UndefOr[Boolean] = js.undefined
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

