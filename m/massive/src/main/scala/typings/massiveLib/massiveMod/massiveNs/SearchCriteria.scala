package typings
package massiveLib.massiveMod.massiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchCriteria extends js.Object {
  var fields: js.Array[java.lang.String]
  var term: java.lang.String
}

object SearchCriteria {
  @scala.inline
  def apply(fields: js.Array[java.lang.String], term: java.lang.String): SearchCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fields")(fields)
    __obj.updateDynamic("term")(term)
    __obj.asInstanceOf[SearchCriteria]
  }
}

