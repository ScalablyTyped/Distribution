package typings.hasura.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HasuraMutationResponse[T /* <: Record[String, Any] */] extends StObject {
  
  var affected_rows: js.UndefOr[Double] = js.undefined
  
  var returning: js.Array[HasuraDataItem[T]]
}
object HasuraMutationResponse {
  
  inline def apply[T /* <: Record[String, Any] */](returning: js.Array[HasuraDataItem[T]]): HasuraMutationResponse[T] = {
    val __obj = js.Dynamic.literal(returning = returning.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasuraMutationResponse[T]]
  }
  
  extension [Self <: HasuraMutationResponse[?], T /* <: Record[String, Any] */](x: Self & HasuraMutationResponse[T]) {
    
    inline def setAffected_rows(value: Double): Self = StObject.set(x, "affected_rows", value.asInstanceOf[js.Any])
    
    inline def setAffected_rowsUndefined: Self = StObject.set(x, "affected_rows", js.undefined)
    
    inline def setReturning(value: js.Array[HasuraDataItem[T]]): Self = StObject.set(x, "returning", value.asInstanceOf[js.Any])
    
    inline def setReturningVarargs(value: HasuraDataItem[T]*): Self = StObject.set(x, "returning", js.Array(value*))
  }
}
