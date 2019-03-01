package typings
package grommetLib.componentsRangeSelectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeSelectorProps extends js.Object {
  var color: js.UndefOr[java.lang.String | grommetLib.Anon_Dark] = js.undefined
  var direction: js.UndefOr[grommetLib.grommetLibStrings.horizontal | grommetLib.grommetLibStrings.vertical] = js.undefined
  var invert: js.UndefOr[scala.Boolean] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var messages: js.UndefOr[grommetLib.Anon_Lower] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var opacity: js.UndefOr[
    grommetLib.grommetLibStrings.weak | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.strong
  ] = js.undefined
  var round: js.UndefOr[
    grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.full | java.lang.String
  ] = js.undefined
  var size: js.UndefOr[
    grommetLib.grommetLibStrings.xxsmall | grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | grommetLib.grommetLibStrings.full | java.lang.String
  ] = js.undefined
  var step: js.UndefOr[scala.Double] = js.undefined
  var values: js.Array[scala.Double]
}

object RangeSelectorProps {
  @scala.inline
  def apply(
    values: js.Array[scala.Double],
    color: java.lang.String | grommetLib.Anon_Dark = null,
    direction: grommetLib.grommetLibStrings.horizontal | grommetLib.grommetLibStrings.vertical = null,
    invert: js.UndefOr[scala.Boolean] = js.undefined,
    max: scala.Int | scala.Double = null,
    messages: grommetLib.Anon_Lower = null,
    min: scala.Int | scala.Double = null,
    onChange: js.Function1[/* repeated */ js.Any, _] = null,
    opacity: grommetLib.grommetLibStrings.weak | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.strong = null,
    round: grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.full | java.lang.String = null,
    size: grommetLib.grommetLibStrings.xxsmall | grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | grommetLib.grommetLibStrings.full | java.lang.String = null,
    step: scala.Int | scala.Double = null
  ): RangeSelectorProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("values")(values)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(invert)) __obj.updateDynamic("invert")(invert)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (round != null) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeSelectorProps]
  }
}

