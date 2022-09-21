package typings.hasura.mod

import org.scalablytyped.runtime.TopLevel
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HasuraAggregateQueryResponse[K /* <: String */, T /* <: Record[String, Any] */] extends StObject {
  
  var data: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in K ]: hasura.hasura.HasuraAggregateResult<T>}
    */ typings.hasura.hasuraStrings.HasuraAggregateQueryResponse & TopLevel[Any]
}
object HasuraAggregateQueryResponse {
  
  inline def apply[K /* <: String */, T /* <: Record[String, Any] */](
    data: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in K ]: hasura.hasura.HasuraAggregateResult<T>}
    */ typings.hasura.hasuraStrings.HasuraAggregateQueryResponse & TopLevel[Any]
  ): HasuraAggregateQueryResponse[K, T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasuraAggregateQueryResponse[K, T]]
  }
  
  extension [Self <: HasuraAggregateQueryResponse[?, ?], K /* <: String */, T /* <: Record[String, Any] */](x: Self & (HasuraAggregateQueryResponse[K, T])) {
    
    inline def setData(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in K ]: hasura.hasura.HasuraAggregateResult<T>}
      */ typings.hasura.hasuraStrings.HasuraAggregateQueryResponse & TopLevel[Any]
    ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
