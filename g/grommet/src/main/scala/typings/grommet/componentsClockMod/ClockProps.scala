package typings.grommet.componentsClockMod

import typings.grommet.Anon_Bottom
import typings.grommet.grommetStrings.`12`
import typings.grommet.grommetStrings.`24`
import typings.grommet.grommetStrings.analog
import typings.grommet.grommetStrings.backward
import typings.grommet.grommetStrings.center
import typings.grommet.grommetStrings.digital
import typings.grommet.grommetStrings.end
import typings.grommet.grommetStrings.forward
import typings.grommet.grommetStrings.hours
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.minutes
import typings.grommet.grommetStrings.none
import typings.grommet.grommetStrings.seconds
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.start
import typings.grommet.grommetStrings.stretch
import typings.grommet.grommetStrings.xlarge
import typings.grommet.grommetStrings.xsmall
import typings.grommet.grommetStrings.xxsmall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClockProps extends js.Object {
  var a11yTitle: js.UndefOr[String] = js.undefined
  var alignSelf: js.UndefOr[start | center | end | stretch] = js.undefined
  var gridArea: js.UndefOr[String] = js.undefined
  var hourLimit: js.UndefOr[`12` | `24`] = js.undefined
  var margin: js.UndefOr[none | xxsmall | xsmall | small | medium | large | xlarge | Anon_Bottom | String] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var precision: js.UndefOr[hours | minutes | seconds] = js.undefined
  var run: js.UndefOr[Boolean | backward | forward] = js.undefined
  var size: js.UndefOr[small | medium | large | xlarge | String] = js.undefined
  var time: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[analog | digital] = js.undefined
}

object ClockProps {
  @scala.inline
  def apply(
    a11yTitle: String = null,
    alignSelf: start | center | end | stretch = null,
    gridArea: String = null,
    hourLimit: `12` | `24` = null,
    margin: none | xxsmall | xsmall | small | medium | large | xlarge | Anon_Bottom | String = null,
    onChange: /* repeated */ js.Any => _ = null,
    precision: hours | minutes | seconds = null,
    run: Boolean | backward | forward = null,
    size: small | medium | large | xlarge | String = null,
    time: String = null,
    `type`: analog | digital = null
  ): ClockProps = {
    val __obj = js.Dynamic.literal()
    if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle)
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea)
    if (hourLimit != null) __obj.updateDynamic("hourLimit")(hourLimit.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (run != null) __obj.updateDynamic("run")(run.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClockProps]
  }
}

