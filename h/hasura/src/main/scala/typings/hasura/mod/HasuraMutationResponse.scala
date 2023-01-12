package typings.hasura.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HasuraMutationResponse[T /* <: Record[String, Any] */] extends StObject {
  
  var affected_rows: js.UndefOr[Double] = js.undefined
  
  var returning: /* import warning: importer.ImportType#apply Failed type conversion: T extends never ? never : std.Array<hasura.hasura.HasuraDataItem<T>> */ js.Any
}
object HasuraMutationResponse {
  
  inline def apply[T /* <: Record[String, Any] */](
    returning: /* import warning: importer.ImportType#apply Failed type conversion: T extends never ? never : std.Array<hasura.hasura.HasuraDataItem<T>> */ js.Any
  ): HasuraMutationResponse[T] = {
    val __obj = js.Dynamic.literal(returning = returning.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasuraMutationResponse[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HasuraMutationResponse[?], T /* <: Record[String, Any] */] (val x: Self & HasuraMutationResponse[T]) extends AnyVal {
    
    inline def setAffected_rows(value: Double): Self = StObject.set(x, "affected_rows", value.asInstanceOf[js.Any])
    
    inline def setAffected_rowsUndefined: Self = StObject.set(x, "affected_rows", js.undefined)
    
    inline def setReturning(
      value: /* import warning: importer.ImportType#apply Failed type conversion: T extends never ? never : std.Array<hasura.hasura.HasuraDataItem<T>> */ js.Any
    ): Self = StObject.set(x, "returning", value.asInstanceOf[js.Any])
  }
}
