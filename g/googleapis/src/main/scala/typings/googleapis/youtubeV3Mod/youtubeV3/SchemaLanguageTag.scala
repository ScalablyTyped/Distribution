package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLanguageTag extends js.Object {
  var value: js.UndefOr[String] = js.native
}

object SchemaLanguageTag {
  @scala.inline
  def apply(value: String = null): SchemaLanguageTag = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLanguageTag]
  }
}

