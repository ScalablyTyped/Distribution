package typings
package kendoDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Names extends js.Object {
  var names: js.Array[java.lang.String]
  var namesAbbr: js.Array[java.lang.String]
  var namesShort: js.Array[java.lang.String]
}

object Anon_Names {
  @scala.inline
  def apply(
    names: js.Array[java.lang.String],
    namesAbbr: js.Array[java.lang.String],
    namesShort: js.Array[java.lang.String]
  ): Anon_Names = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("names")(names)
    __obj.updateDynamic("namesAbbr")(namesAbbr)
    __obj.updateDynamic("namesShort")(namesShort)
    __obj.asInstanceOf[Anon_Names]
  }
}

