package typings.grommet.componentsCarouselMod

import typings.grommet.Anon_Bottom
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
import typings.grommet.grommetStrings.xxsmall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarouselProps extends js.Object {
  var a11yTitle: js.UndefOr[String] = js.undefined
  var alignSelf: js.UndefOr[start | center | end | stretch] = js.undefined
  var fill: js.UndefOr[Boolean] = js.undefined
  var gridArea: js.UndefOr[String] = js.undefined
  var margin: js.UndefOr[none | xxsmall | xsmall | small | medium | large | xlarge | Anon_Bottom | String] = js.undefined
  var play: js.UndefOr[Double] = js.undefined
}

object CarouselProps {
  @scala.inline
  def apply(
    a11yTitle: String = null,
    alignSelf: start | center | end | stretch = null,
    fill: js.UndefOr[Boolean] = js.undefined,
    gridArea: String = null,
    margin: none | xxsmall | xsmall | small | medium | large | xlarge | Anon_Bottom | String = null,
    play: Int | Double = null
  ): CarouselProps = {
    val __obj = js.Dynamic.literal()
    if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle)
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill)
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea)
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (play != null) __obj.updateDynamic("play")(play.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarouselProps]
  }
}

