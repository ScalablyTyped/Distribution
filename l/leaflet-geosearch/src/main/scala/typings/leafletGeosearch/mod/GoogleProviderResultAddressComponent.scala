package typings.leafletGeosearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleProviderResultAddressComponent extends js.Object {
  var long_name: String
  var short_name: String
  var types: js.Array[String]
}

object GoogleProviderResultAddressComponent {
  @scala.inline
  def apply(long_name: String, short_name: String, types: js.Array[String]): GoogleProviderResultAddressComponent = {
    val __obj = js.Dynamic.literal(long_name = long_name.asInstanceOf[js.Any], short_name = short_name.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GoogleProviderResultAddressComponent]
  }
}

