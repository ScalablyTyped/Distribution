package typings.atMapboxMapboxDashSdk.servicesDirectionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BannerInstruction extends js.Object {
  /**
    * Float indicating in meters, how far from the upcoming maneuver
    * the banner instruction should begin being displayed. Only 1 banner should be displayed at a time.
    */
  var distanceAlongGeometry: Double
  /**
    * Most important content to display to the user. Our SDK displays this text larger and at the top.
    */
  var primary: Instruction
  /**
    * Additional content useful for visual guidance. Our SDK displays this text slightly smaller and below the primary. Can be null.
    */
  var secondary: js.UndefOr[js.Array[Instruction]] = js.undefined
  /**
    * Additional information that is included if we feel the driver needs a heads up about something.
    * Can include information about the next maneuver (the one after the upcoming one) if the step is short -
    * can be null, or can be lane information. If we have lane information, that trumps information about the next maneuver.
    */
  var sub: js.UndefOr[Sub] = js.undefined
  var `then`: js.UndefOr[js.Any] = js.undefined
}

object BannerInstruction {
  @scala.inline
  def apply(
    distanceAlongGeometry: Double,
    primary: Instruction,
    secondary: js.Array[Instruction] = null,
    sub: Sub = null,
    `then`: js.Any = null
  ): BannerInstruction = {
    val __obj = js.Dynamic.literal(distanceAlongGeometry = distanceAlongGeometry, primary = primary)
    if (secondary != null) __obj.updateDynamic("secondary")(secondary)
    if (sub != null) __obj.updateDynamic("sub")(sub)
    if (`then` != null) __obj.updateDynamic("then")(`then`)
    __obj.asInstanceOf[BannerInstruction]
  }
}

