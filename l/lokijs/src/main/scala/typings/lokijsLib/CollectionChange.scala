package typings
package lokijsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionChange extends js.Object {
  var name: java.lang.String
  var obj: js.Any
  var operation: java.lang.String
}

object CollectionChange {
  @scala.inline
  def apply(name: java.lang.String, obj: js.Any, operation: java.lang.String): CollectionChange = {
    val __obj = js.Dynamic.literal(name = name, obj = obj, operation = operation)
  
    __obj.asInstanceOf[CollectionChange]
  }
}

