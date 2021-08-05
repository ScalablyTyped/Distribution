package typings.hasura.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnBoolExp[T] extends StObject {
  
  var _eq: js.UndefOr[T] = js.undefined
  
  var _gt: js.UndefOr[T] = js.undefined
  
  var _gte: js.UndefOr[T] = js.undefined
  
  var _in: js.UndefOr[js.Array[T]] = js.undefined
  
  var _is_null: js.UndefOr[Boolean] = js.undefined
  
  var _lt: js.UndefOr[T] = js.undefined
  
  var _lte: js.UndefOr[T] = js.undefined
  
  var _neq: js.UndefOr[T] = js.undefined
  
  var _nin: js.UndefOr[js.Array[T]] = js.undefined
}
object ColumnBoolExp {
  
  inline def apply[T](): ColumnBoolExp[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnBoolExp[T]]
  }
  
  extension [Self <: ColumnBoolExp[?], T](x: Self & ColumnBoolExp[T]) {
    
    inline def set_eq(value: T): Self = StObject.set(x, "_eq", value.asInstanceOf[js.Any])
    
    inline def set_eqUndefined: Self = StObject.set(x, "_eq", js.undefined)
    
    inline def set_gt(value: T): Self = StObject.set(x, "_gt", value.asInstanceOf[js.Any])
    
    inline def set_gtUndefined: Self = StObject.set(x, "_gt", js.undefined)
    
    inline def set_gte(value: T): Self = StObject.set(x, "_gte", value.asInstanceOf[js.Any])
    
    inline def set_gteUndefined: Self = StObject.set(x, "_gte", js.undefined)
    
    inline def set_in(value: js.Array[T]): Self = StObject.set(x, "_in", value.asInstanceOf[js.Any])
    
    inline def set_inUndefined: Self = StObject.set(x, "_in", js.undefined)
    
    inline def set_inVarargs(value: T*): Self = StObject.set(x, "_in", js.Array(value :_*))
    
    inline def set_is_null(value: Boolean): Self = StObject.set(x, "_is_null", value.asInstanceOf[js.Any])
    
    inline def set_is_nullUndefined: Self = StObject.set(x, "_is_null", js.undefined)
    
    inline def set_lt(value: T): Self = StObject.set(x, "_lt", value.asInstanceOf[js.Any])
    
    inline def set_ltUndefined: Self = StObject.set(x, "_lt", js.undefined)
    
    inline def set_lte(value: T): Self = StObject.set(x, "_lte", value.asInstanceOf[js.Any])
    
    inline def set_lteUndefined: Self = StObject.set(x, "_lte", js.undefined)
    
    inline def set_neq(value: T): Self = StObject.set(x, "_neq", value.asInstanceOf[js.Any])
    
    inline def set_neqUndefined: Self = StObject.set(x, "_neq", js.undefined)
    
    inline def set_nin(value: js.Array[T]): Self = StObject.set(x, "_nin", value.asInstanceOf[js.Any])
    
    inline def set_ninUndefined: Self = StObject.set(x, "_nin", js.undefined)
    
    inline def set_ninVarargs(value: T*): Self = StObject.set(x, "_nin", js.Array(value :_*))
  }
}
