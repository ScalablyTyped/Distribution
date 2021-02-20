package typings.hasura.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnBoolExp[T] extends StObject {
  
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
  implicit class ColumnBoolExpMutableBuilder[Self <: ColumnBoolExp[_], T] (val x: Self with ColumnBoolExp[T]) extends AnyVal {
    
    @scala.inline
    def set_eq(value: T): Self = StObject.set(x, "_eq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_eqUndefined: Self = StObject.set(x, "_eq", js.undefined)
    
    @scala.inline
    def set_gt(value: T): Self = StObject.set(x, "_gt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_gtUndefined: Self = StObject.set(x, "_gt", js.undefined)
    
    @scala.inline
    def set_gte(value: T): Self = StObject.set(x, "_gte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_gteUndefined: Self = StObject.set(x, "_gte", js.undefined)
    
    @scala.inline
    def set_in(value: js.Array[T]): Self = StObject.set(x, "_in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_inUndefined: Self = StObject.set(x, "_in", js.undefined)
    
    @scala.inline
    def set_inVarargs(value: T*): Self = StObject.set(x, "_in", js.Array(value :_*))
    
    @scala.inline
    def set_is_null(value: Boolean): Self = StObject.set(x, "_is_null", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_is_nullUndefined: Self = StObject.set(x, "_is_null", js.undefined)
    
    @scala.inline
    def set_lt(value: T): Self = StObject.set(x, "_lt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_ltUndefined: Self = StObject.set(x, "_lt", js.undefined)
    
    @scala.inline
    def set_lte(value: T): Self = StObject.set(x, "_lte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_lteUndefined: Self = StObject.set(x, "_lte", js.undefined)
    
    @scala.inline
    def set_neq(value: T): Self = StObject.set(x, "_neq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_neqUndefined: Self = StObject.set(x, "_neq", js.undefined)
    
    @scala.inline
    def set_nin(value: js.Array[T]): Self = StObject.set(x, "_nin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_ninUndefined: Self = StObject.set(x, "_nin", js.undefined)
    
    @scala.inline
    def set_ninVarargs(value: T*): Self = StObject.set(x, "_nin", js.Array(value :_*))
  }
}
