package typings.hasura.mod

import org.scalablytyped.runtime.TopLevel
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HasuraMultipleQueriesResponse[T /* <: Record[String, js.Any] */] extends StObject {
  
  var data: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof T ]: hasura.hasura.Equals<T[key], hasura.hasura.Aggregate<T[key]>> extends true? hasura.hasura.HasuraAggregateResult<T[key]> : std.Array<T[key]>}
    */ typings.hasura.hasuraStrings.HasuraMultipleQueriesResponse & TopLevel[js.Any]
}
object HasuraMultipleQueriesResponse {
  
  @scala.inline
  def apply[T /* <: Record[String, js.Any] */](
    data: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof T ]: hasura.hasura.Equals<T[key], hasura.hasura.Aggregate<T[key]>> extends true? hasura.hasura.HasuraAggregateResult<T[key]> : std.Array<T[key]>}
    */ typings.hasura.hasuraStrings.HasuraMultipleQueriesResponse & TopLevel[js.Any]
  ): HasuraMultipleQueriesResponse[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasuraMultipleQueriesResponse[T]]
  }
  
  @scala.inline
  implicit class HasuraMultipleQueriesResponseMutableBuilder[Self <: HasuraMultipleQueriesResponse[?], T /* <: Record[String, js.Any] */] (val x: Self & HasuraMultipleQueriesResponse[T]) extends AnyVal {
    
    @scala.inline
    def setData(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in keyof T ]: hasura.hasura.Equals<T[key], hasura.hasura.Aggregate<T[key]>> extends true? hasura.hasura.HasuraAggregateResult<T[key]> : std.Array<T[key]>}
      */ typings.hasura.hasuraStrings.HasuraMultipleQueriesResponse & TopLevel[js.Any]
    ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
