package typings.googlemaps.google.maps.places

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacePlusCode extends js.Object {
  var compound_code: js.UndefOr[String] = js.undefined
  var global_code: String
}

object PlacePlusCode {
  @scala.inline
  def apply(global_code: String, compound_code: String = null): PlacePlusCode = {
    val __obj = js.Dynamic.literal(global_code = global_code.asInstanceOf[js.Any])
    if (compound_code != null) __obj.updateDynamic("compound_code")(compound_code.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlacePlusCode]
  }
}

