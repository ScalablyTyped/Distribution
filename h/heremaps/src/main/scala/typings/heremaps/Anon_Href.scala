package typings.heremaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Href extends js.Object {
  var href: String
  var location: Anon_Address
  var `type`: String
}

object Anon_Href {
  @scala.inline
  def apply(href: String, location: Anon_Address, `type`: String): Anon_Href = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Href]
  }
}

