package typings.hasura.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HasuraQueryResponse[K /* <: String */, T /* <: Record[String, Any] */] extends StObject {
  
  var data: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in K ]: std.Array<hasura.hasura.HasuraDataItem<T>>} */ js.Any
}
object HasuraQueryResponse {
  
  inline def apply[K /* <: String */, T /* <: Record[String, Any] */](
    data: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in K ]: std.Array<hasura.hasura.HasuraDataItem<T>>} */ js.Any
  ): HasuraQueryResponse[K, T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasuraQueryResponse[K, T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HasuraQueryResponse[?, ?], K /* <: String */, T /* <: Record[String, Any] */] (val x: Self & (HasuraQueryResponse[K, T])) extends AnyVal {
    
    inline def setData(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in K ]: std.Array<hasura.hasura.HasuraDataItem<T>>} */ js.Any
    ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
