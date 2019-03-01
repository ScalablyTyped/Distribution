package typings
package iconDashGenLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: java.lang.String
  var sizes: js.Array[scala.Double]
}

object Anon_Name {
  @scala.inline
  def apply(name: java.lang.String, sizes: js.Array[scala.Double]): Anon_Name = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("sizes")(sizes)
    __obj.asInstanceOf[Anon_Name]
  }
}

