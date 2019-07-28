package typings.grommet.componentsParagraphMod

import typings.grommet.Anon_Bottom
import typings.grommet.Anon_Dark
import typings.grommet.grommetStrings.center
import typings.grommet.grommetStrings.end
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.none
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.start
import typings.grommet.grommetStrings.stretch
import typings.grommet.grommetStrings.xlarge
import typings.grommet.grommetStrings.xsmall
import typings.grommet.grommetStrings.xxlarge
import typings.grommet.grommetStrings.xxsmall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParagraphProps extends js.Object {
  var a11yTitle: js.UndefOr[String] = js.undefined
  var alignSelf: js.UndefOr[start | center | end | stretch] = js.undefined
  var color: js.UndefOr[String | Anon_Dark] = js.undefined
  var gridArea: js.UndefOr[String] = js.undefined
  var margin: js.UndefOr[none | xxsmall | xsmall | small | medium | large | xlarge | Anon_Bottom | String] = js.undefined
  var responsive: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[small | medium | large | xlarge | xxlarge | String] = js.undefined
  var textAlign: js.UndefOr[start | center | end] = js.undefined
}

object ParagraphProps {
  @scala.inline
  def apply(
    a11yTitle: String = null,
    alignSelf: start | center | end | stretch = null,
    color: String | Anon_Dark = null,
    gridArea: String = null,
    margin: none | xxsmall | xsmall | small | medium | large | xlarge | Anon_Bottom | String = null,
    responsive: js.UndefOr[Boolean] = js.undefined,
    size: small | medium | large | xlarge | xxlarge | String = null,
    textAlign: start | center | end = null
  ): ParagraphProps = {
    val __obj = js.Dynamic.literal()
    if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle)
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea)
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParagraphProps]
  }
}

