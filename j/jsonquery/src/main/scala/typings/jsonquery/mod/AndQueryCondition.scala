package typings.jsonquery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AndQueryCondition[T] extends BinaryQueryCondition[T] {
  @JSName("$and")
  var $and: js.Array[Query[T]]
}

object AndQueryCondition {
  @scala.inline
  def apply[T]($and: js.Array[Query[T]]): AndQueryCondition[T] = {
    val __obj = js.Dynamic.literal($and = $and.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AndQueryCondition[T]]
  }
}

