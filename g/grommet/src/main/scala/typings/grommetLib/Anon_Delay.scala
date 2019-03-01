package typings
package grommetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Delay extends js.Object {
  var delay: js.UndefOr[scala.Double] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
  var size: js.UndefOr[
    grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge
  ] = js.undefined
  var `type`: js.UndefOr[
    grommetLib.grommetLibStrings.fadeIn | grommetLib.grommetLibStrings.fadeOut | grommetLib.grommetLibStrings.jiggle | grommetLib.grommetLibStrings.pulse | grommetLib.grommetLibStrings.slideUp | grommetLib.grommetLibStrings.slideDown | grommetLib.grommetLibStrings.slideLeft | grommetLib.grommetLibStrings.slideRight | grommetLib.grommetLibStrings.zoomIn | grommetLib.grommetLibStrings.zoomOut
  ] = js.undefined
}

object Anon_Delay {
  @scala.inline
  def apply(
    delay: scala.Int | scala.Double = null,
    duration: scala.Int | scala.Double = null,
    size: grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge = null,
    `type`: grommetLib.grommetLibStrings.fadeIn | grommetLib.grommetLibStrings.fadeOut | grommetLib.grommetLibStrings.jiggle | grommetLib.grommetLibStrings.pulse | grommetLib.grommetLibStrings.slideUp | grommetLib.grommetLibStrings.slideDown | grommetLib.grommetLibStrings.slideLeft | grommetLib.grommetLibStrings.slideRight | grommetLib.grommetLibStrings.zoomIn | grommetLib.grommetLibStrings.zoomOut = null
  ): Anon_Delay = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Delay]
  }
}

