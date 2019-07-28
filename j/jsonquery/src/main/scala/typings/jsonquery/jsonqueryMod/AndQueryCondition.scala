package typings.jsonquery.jsonqueryMod

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
    val __obj = js.Dynamic.literal($and = $and)
  
    __obj.asInstanceOf[AndQueryCondition[T]]
  }
}

