package typings.hasura.mod

import org.scalablytyped.runtime.TopLevel
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HasuraMultipleQueriesResponse[T /* <: Record[String, _] */] extends StObject {
  
  var data: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof T ]: hasura.hasura.Equals<T[key], hasura.hasura.Aggregate<T[key]>> extends true? hasura.hasura.HasuraAggregateResult<T[key]> : std.Array<T[key]>}
    */ typings.hasura.hasuraStrings.HasuraMultipleQueriesResponse with TopLevel[js.Any] = js.native
}
object HasuraMultipleQueriesResponse {
  
  @scala.inline
  def apply[T /* <: Record[String, _] */](
    data: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof T ]: hasura.hasura.Equals<T[key], hasura.hasura.Aggregate<T[key]>> extends true? hasura.hasura.HasuraAggregateResult<T[key]> : std.Array<T[key]>}
    */ typings.hasura.hasuraStrings.HasuraMultipleQueriesResponse with TopLevel[js.Any]
  ): HasuraMultipleQueriesResponse[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasuraMultipleQueriesResponse[T]]
  }
  
  @scala.inline
  implicit class HasuraMultipleQueriesResponseMutableBuilder[Self <: HasuraMultipleQueriesResponse[_], T /* <: Record[String, _] */] (val x: Self with HasuraMultipleQueriesResponse[T]) extends AnyVal {
    
    @scala.inline
    def setData(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in keyof T ]: hasura.hasura.Equals<T[key], hasura.hasura.Aggregate<T[key]>> extends true? hasura.hasura.HasuraAggregateResult<T[key]> : std.Array<T[key]>}
      */ typings.hasura.hasuraStrings.HasuraMultipleQueriesResponse with TopLevel[js.Any]
    ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
