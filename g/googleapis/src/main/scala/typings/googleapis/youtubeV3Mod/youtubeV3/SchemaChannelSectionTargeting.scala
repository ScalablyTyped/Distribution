package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ChannelSection targeting setting.
  */
@js.native
trait SchemaChannelSectionTargeting extends js.Object {
  /**
    * The country the channel section is targeting.
    */
  var countries: js.UndefOr[js.Array[String]] = js.native
  /**
    * The language the channel section is targeting.
    */
  var languages: js.UndefOr[js.Array[String]] = js.native
  /**
    * The region the channel section is targeting.
    */
  var regions: js.UndefOr[js.Array[String]] = js.native
}

object SchemaChannelSectionTargeting {
  @scala.inline
  def apply(
    countries: js.Array[String] = null,
    languages: js.Array[String] = null,
    regions: js.Array[String] = null
  ): SchemaChannelSectionTargeting = {
    val __obj = js.Dynamic.literal()
    if (countries != null) __obj.updateDynamic("countries")(countries.asInstanceOf[js.Any])
    if (languages != null) __obj.updateDynamic("languages")(languages.asInstanceOf[js.Any])
    if (regions != null) __obj.updateDynamic("regions")(regions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaChannelSectionTargeting]
  }
}

