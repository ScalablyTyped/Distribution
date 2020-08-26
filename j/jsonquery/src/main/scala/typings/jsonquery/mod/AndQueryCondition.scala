package typings.jsonquery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AndQueryCondition[T] extends BinaryQueryCondition[T] {
  @JSName("$and")
  var $and: js.Array[Query[T]] = js.native
}

object AndQueryCondition {
  @scala.inline
  def apply[T]($and: js.Array[Query[T]]): AndQueryCondition[T] = {
    val __obj = js.Dynamic.literal($and = $and.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndQueryCondition[T]]
  }
  @scala.inline
  implicit class AndQueryConditionOps[Self <: AndQueryCondition[_], T] (val x: Self with AndQueryCondition[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set$andVarargs(value: Query[T]*): Self = this.set("$and", js.Array(value :_*))
    @scala.inline
    def set$and(value: js.Array[Query[T]]): Self = this.set("$and", value.asInstanceOf[js.Any])
  }
  
}

