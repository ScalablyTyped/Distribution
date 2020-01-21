package typings.leafletGeosearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenStreetMapProviderOptionsOutputFormat extends js.Object {
  var json_callback: js.UndefOr[String] = js.undefined
}

object OpenStreetMapProviderOptionsOutputFormat {
  @scala.inline
  def apply(json_callback: String = null): OpenStreetMapProviderOptionsOutputFormat = {
    val __obj = js.Dynamic.literal()
    if (json_callback != null) __obj.updateDynamic("json_callback")(json_callback.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenStreetMapProviderOptionsOutputFormat]
  }
}

