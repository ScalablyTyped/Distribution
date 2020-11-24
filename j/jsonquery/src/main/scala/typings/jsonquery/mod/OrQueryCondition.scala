package typings.jsonquery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrQueryCondition[T] extends BinaryQueryCondition[T] {
  
  @JSName("$or")
  var $or: js.Array[Query[T]] = js.native
}
object OrQueryCondition {
  
  @scala.inline
  def apply[T]($or: js.Array[Query[T]]): OrQueryCondition[T] = {
    val __obj = js.Dynamic.literal($or = $or.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrQueryCondition[T]]
  }
  
  @scala.inline
  implicit class OrQueryConditionOps[Self <: OrQueryCondition[_], T] (val x: Self with OrQueryCondition[T]) extends AnyVal {
    
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
    def set$orVarargs(value: Query[T]*): Self = this.set("$or", js.Array(value :_*))
    
    @scala.inline
    def set$or(value: js.Array[Query[T]]): Self = this.set("$or", value.asInstanceOf[js.Any])
  }
}
