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
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], obj = obj.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionChange]
  }
}

