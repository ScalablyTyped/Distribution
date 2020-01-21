package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Basic details about an i18n region, such as region code and human-readable
  * name.
  */
@js.native
trait SchemaI18nRegionSnippet extends js.Object {
  /**
    * The region code as a 2-letter ISO country code.
    */
  var gl: js.UndefOr[String] = js.native
  /**
    * The human-readable name of the region.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaI18nRegionSnippet {
  @scala.inline
  def apply(gl: String = null, name: String = null): SchemaI18nRegionSnippet = {
    val __obj = js.Dynamic.literal()
    if (gl != null) __obj.updateDynamic("gl")(gl.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaI18nRegionSnippet]
  }
}

