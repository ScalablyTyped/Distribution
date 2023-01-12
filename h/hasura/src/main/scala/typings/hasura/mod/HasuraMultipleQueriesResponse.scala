package typings.hasura.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HasuraMultipleQueriesResponse[T /* <: Record[String, Any] */] extends StObject {
  
  var data: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof T ]: hasura.hasura.Equals<T[key], hasura.hasura.Aggregate<T[key]>> extends true? hasura.hasura.HasuraAggregateResult<T[key]> : std.Array<T[key]>} */ js.Any
}
object HasuraMultipleQueriesResponse {
  
  inline def apply[T /* <: Record[String, Any] */](
    data: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof T ]: hasura.hasura.Equals<T[key], hasura.hasura.Aggregate<T[key]>> extends true? hasura.hasura.HasuraAggregateResult<T[key]> : std.Array<T[key]>} */ js.Any
  ): HasuraMultipleQueriesResponse[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasuraMultipleQueriesResponse[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HasuraMultipleQueriesResponse[?], T /* <: Record[String, Any] */] (val x: Self & HasuraMultipleQueriesResponse[T]) extends AnyVal {
    
    inline def setData(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof T ]: hasura.hasura.Equals<T[key], hasura.hasura.Aggregate<T[key]>> extends true? hasura.hasura.HasuraAggregateResult<T[key]> : std.Array<T[key]>} */ js.Any
    ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
