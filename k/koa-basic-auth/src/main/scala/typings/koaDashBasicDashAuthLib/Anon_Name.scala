package typings
package koaDashBasicDashAuthLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: java.lang.String
  var pass: java.lang.String
}

object Anon_Name {
  @scala.inline
  def apply(name: java.lang.String, pass: java.lang.String): Anon_Name = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("pass")(pass)
    __obj.asInstanceOf[Anon_Name]
  }
}

