package typings
package mailgunDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Displayname extends js.Object {
  var display_name: java.lang.String | scala.Null
  var domain: java.lang.String
  var local_part: java.lang.String
}

object Anon_Displayname {
  @scala.inline
  def apply(domain: java.lang.String, local_part: java.lang.String, display_name: java.lang.String = null): Anon_Displayname = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("domain")(domain)
    __obj.updateDynamic("local_part")(local_part)
    if (display_name != null) __obj.updateDynamic("display_name")(display_name)
    __obj.asInstanceOf[Anon_Displayname]
  }
}

