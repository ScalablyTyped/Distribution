package typings
package grommetLib.componentsClockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClockProps extends js.Object {
  var a11yTitle: js.UndefOr[java.lang.String] = js.undefined
  var alignSelf: js.UndefOr[
    grommetLib.grommetLibStrings.start | grommetLib.grommetLibStrings.center | grommetLib.grommetLibStrings.end | grommetLib.grommetLibStrings.stretch
  ] = js.undefined
  var gridArea: js.UndefOr[java.lang.String] = js.undefined
  var hourLimit: js.UndefOr[grommetLib.grommetLibStrings.`12` | grommetLib.grommetLibStrings.`24`] = js.undefined
  var margin: js.UndefOr[
    grommetLib.grommetLibStrings.none | grommetLib.grommetLibStrings.xxsmall | grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | grommetLib.Anon_Bottom | java.lang.String
  ] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var precision: js.UndefOr[
    grommetLib.grommetLibStrings.hours | grommetLib.grommetLibStrings.minutes | grommetLib.grommetLibStrings.seconds
  ] = js.undefined
  var run: js.UndefOr[
    scala.Boolean | grommetLib.grommetLibStrings.backward | grommetLib.grommetLibStrings.forward
  ] = js.undefined
  var size: js.UndefOr[
    grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | java.lang.String
  ] = js.undefined
  var time: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[grommetLib.grommetLibStrings.analog | grommetLib.grommetLibStrings.digital] = js.undefined
}

object ClockProps {
  @scala.inline
  def apply(
    a11yTitle: java.lang.String = null,
    alignSelf: grommetLib.grommetLibStrings.start | grommetLib.grommetLibStrings.center | grommetLib.grommetLibStrings.end | grommetLib.grommetLibStrings.stretch = null,
    gridArea: java.lang.String = null,
    hourLimit: grommetLib.grommetLibStrings.`12` | grommetLib.grommetLibStrings.`24` = null,
    margin: grommetLib.grommetLibStrings.none | grommetLib.grommetLibStrings.xxsmall | grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | grommetLib.Anon_Bottom | java.lang.String = null,
    onChange: /* repeated */ js.Any => _ = null,
    precision: grommetLib.grommetLibStrings.hours | grommetLib.grommetLibStrings.minutes | grommetLib.grommetLibStrings.seconds = null,
    run: scala.Boolean | grommetLib.grommetLibStrings.backward | grommetLib.grommetLibStrings.forward = null,
    size: grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | java.lang.String = null,
    time: java.lang.String = null,
    `type`: grommetLib.grommetLibStrings.analog | grommetLib.grommetLibStrings.digital = null
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

