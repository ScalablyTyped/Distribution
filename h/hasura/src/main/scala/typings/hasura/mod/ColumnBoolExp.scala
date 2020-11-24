package typings.hasura.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnBoolExp[T] extends js.Object {
  
  var _eq: js.UndefOr[T] = js.native
  
  var _gt: js.UndefOr[T] = js.native
  
  var _gte: js.UndefOr[T] = js.native
  
  var _in: js.UndefOr[js.Array[T]] = js.native
  
  var _is_null: js.UndefOr[Boolean] = js.native
  
  var _lt: js.UndefOr[T] = js.native
  
  var _lte: js.UndefOr[T] = js.native
  
  var _neq: js.UndefOr[T] = js.native
  
  var _nin: js.UndefOr[js.Array[T]] = js.native
}
object ColumnBoolExp {
  
  @scala.inline
  def apply[T](): ColumnBoolExp[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnBoolExp[T]]
  }
  
  @scala.inline
  implicit class ColumnBoolExpOps[Self <: ColumnBoolExp[_], T] (val x: Self with ColumnBoolExp[T]) extends AnyVal {
    
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
    def set_eq(value: T): Self = this.set("_eq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_eq: Self = this.set("_eq", js.undefined)
    
    @scala.inline
    def set_gt(value: T): Self = this.set("_gt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_gt: Self = this.set("_gt", js.undefined)
    
    @scala.inline
    def set_gte(value: T): Self = this.set("_gte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_gte: Self = this.set("_gte", js.undefined)
    
    @scala.inline
    def set_inVarargs(value: T*): Self = this.set("_in", js.Array(value :_*))
    
    @scala.inline
    def set_in(value: js.Array[T]): Self = this.set("_in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_in: Self = this.set("_in", js.undefined)
    
    @scala.inline
    def set_is_null(value: Boolean): Self = this.set("_is_null", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_is_null: Self = this.set("_is_null", js.undefined)
    
    @scala.inline
    def set_lt(value: T): Self = this.set("_lt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_lt: Self = this.set("_lt", js.undefined)
    
    @scala.inline
    def set_lte(value: T): Self = this.set("_lte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_lte: Self = this.set("_lte", js.undefined)
    
    @scala.inline
    def set_neq(value: T): Self = this.set("_neq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_neq: Self = this.set("_neq", js.undefined)
    
    @scala.inline
    def set_ninVarargs(value: T*): Self = this.set("_nin", js.Array(value :_*))
    
    @scala.inline
    def set_nin(value: js.Array[T]): Self = this.set("_nin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_nin: Self = this.set("_nin", js.undefined)
  }
}
