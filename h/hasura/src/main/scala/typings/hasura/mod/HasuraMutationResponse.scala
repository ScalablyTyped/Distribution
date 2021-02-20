package typings.hasura.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HasuraMutationResponse[T /* <: Record[String, _] */] extends StObject {
  
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
  implicit class HasuraMutationResponseMutableBuilder[Self <: HasuraMutationResponse[_], T /* <: Record[String, _] */] (val x: Self with HasuraMutationResponse[T]) extends AnyVal {
    
    @scala.inline
    def setAffected_rows(value: Double): Self = StObject.set(x, "affected_rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAffected_rowsUndefined: Self = StObject.set(x, "affected_rows", js.undefined)
    
    @scala.inline
    def setReturning(value: js.Array[HasuraDataItem[T]]): Self = StObject.set(x, "returning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturningVarargs(value: HasuraDataItem[T]*): Self = StObject.set(x, "returning", js.Array(value :_*))
  }
}
