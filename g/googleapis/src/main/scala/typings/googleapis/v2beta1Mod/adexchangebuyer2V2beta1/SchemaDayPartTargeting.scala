package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies the day part targeting criteria.
  */
@js.native
trait SchemaDayPartTargeting extends js.Object {
  /**
    * A list of day part targeting criterion.
    */
  var dayParts: js.UndefOr[js.Array[SchemaDayPart]] = js.native
  /**
    * The timezone to use for interpreting the day part targeting.
    */
  var timeZoneType: js.UndefOr[String] = js.native
}

object SchemaDayPartTargeting {
  @scala.inline
  def apply(dayParts: js.Array[SchemaDayPart] = null, timeZoneType: String = null): SchemaDayPartTargeting = {
    val __obj = js.Dynamic.literal()
    if (dayParts != null) __obj.updateDynamic("dayParts")(dayParts.asInstanceOf[js.Any])
    if (timeZoneType != null) __obj.updateDynamic("timeZoneType")(timeZoneType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDayPartTargeting]
  }
}

