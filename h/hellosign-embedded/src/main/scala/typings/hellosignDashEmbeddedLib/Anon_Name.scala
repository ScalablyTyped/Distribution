package typings
package hellosignDashEmbeddedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: java.lang.String
  var order: scala.Double
}

object Anon_Name {
  @scala.inline
  def apply(name: java.lang.String, order: scala.Double): Anon_Name = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("order")(order)
    __obj.asInstanceOf[Anon_Name]
  }
}

