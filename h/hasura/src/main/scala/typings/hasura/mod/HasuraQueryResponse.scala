package typings.hasura.mod

import org.scalablytyped.runtime.TopLevel
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HasuraQueryResponse[K /* <: String */, T /* <: Record[String, js.Any] */] extends StObject {
  
  var data: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in K ]: std.Array<hasura.hasura.HasuraDataItem<T>>}
    */ typings.hasura.hasuraStrings.HasuraQueryResponse & TopLevel[js.Any]
}
object HasuraQueryResponse {
  
  @scala.inline
  def apply[K /* <: String */, T /* <: Record[String, js.Any] */](
    data: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in K ]: std.Array<hasura.hasura.HasuraDataItem<T>>}
    */ typings.hasura.hasuraStrings.HasuraQueryResponse & TopLevel[js.Any]
  ): HasuraQueryResponse[K, T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasuraQueryResponse[K, T]]
  }
  
  @scala.inline
  implicit class HasuraQueryResponseMutableBuilder[Self <: HasuraQueryResponse[?, ?], K /* <: String */, T /* <: Record[String, js.Any] */] (val x: Self & (HasuraQueryResponse[K, T])) extends AnyVal {
    
    @scala.inline
    def setData(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in K ]: std.Array<hasura.hasura.HasuraDataItem<T>>}
      */ typings.hasura.hasuraStrings.HasuraQueryResponse & TopLevel[js.Any]
    ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
