package typings
package heremapsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Href extends js.Object {
  var href: java.lang.String
  var location: Anon_Address
  var `type`: java.lang.String
}

object Anon_Href {
  @scala.inline
  def apply(href: java.lang.String, location: Anon_Address, `type`: java.lang.String): Anon_Href = {
    val __obj = js.Dynamic.literal(href = href, location = location)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Href]
  }
}

