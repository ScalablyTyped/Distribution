package typings.hasura.mod

import org.scalablytyped.runtime.TopLevel
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HasuraMultipleQueriesResponse[T /* <: Record[String, _] */] extends js.Object {
  
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
  implicit class HasuraMultipleQueriesResponseOps[Self <: HasuraMultipleQueriesResponse[_], T /* <: Record[String, _] */] (val x: Self with HasuraMultipleQueriesResponse[T]) extends AnyVal {
    
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
    def setData(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in keyof T ]: hasura.hasura.Equals<T[key], hasura.hasura.Aggregate<T[key]>> extends true? hasura.hasura.HasuraAggregateResult<T[key]> : std.Array<T[key]>}
      */ typings.hasura.hasuraStrings.HasuraMultipleQueriesResponse with TopLevel[js.Any]
    ): Self = this.set("data", value.asInstanceOf[js.Any])
  }
}
