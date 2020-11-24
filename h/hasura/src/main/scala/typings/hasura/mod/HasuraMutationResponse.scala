package typings.hasura.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HasuraMutationResponse[T /* <: Record[String, _] */] extends js.Object {
  
  var affected_rows: js.UndefOr[Double] = js.native
  
  var returning: js.Array[HasuraDataItem[T]] = js.native
}
object HasuraMutationResponse {
  
  @scala.inline
  def apply[T /* <: Record[String, _] */](returning: js.Array[HasuraDataItem[T]]): HasuraMutationResponse[T] = {
    val __obj = js.Dynamic.literal(returning = returning.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasuraMutationResponse[T]]
  }
  
  @scala.inline
  implicit class HasuraMutationResponseOps[Self <: HasuraMutationResponse[_], T /* <: Record[String, _] */] (val x: Self with HasuraMutationResponse[T]) extends AnyVal {
    
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
    def setReturningVarargs(value: HasuraDataItem[T]*): Self = this.set("returning", js.Array(value :_*))
    
    @scala.inline
    def setReturning(value: js.Array[HasuraDataItem[T]]): Self = this.set("returning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAffected_rows(value: Double): Self = this.set("affected_rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAffected_rows: Self = this.set("affected_rows", js.undefined)
  }
}
