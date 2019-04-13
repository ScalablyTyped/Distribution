package typings
package massiveLib.massiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchDefinition extends js.Object {
  var fields: js.Array[java.lang.String]
  var term: java.lang.String
  var where: AnyObject[_]
}

object SearchDefinition {
  @scala.inline
  def apply(fields: js.Array[java.lang.String], term: java.lang.String, where: AnyObject[_]): SearchDefinition = {
    val __obj = js.Dynamic.literal(fields = fields, term = term, where = where)
  
    __obj.asInstanceOf[SearchDefinition]
  }
}

