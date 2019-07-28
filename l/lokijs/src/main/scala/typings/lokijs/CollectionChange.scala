package typings.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionChange extends js.Object {
  var name: String
  var obj: js.Any
  var operation: String
}

object CollectionChange {
  @scala.inline
  def apply(name: String, obj: js.Any, operation: String): CollectionChange = {
    val __obj = js.Dynamic.literal(name = name, obj = obj, operation = operation)
  
    __obj.asInstanceOf[CollectionChange]
  }
}

