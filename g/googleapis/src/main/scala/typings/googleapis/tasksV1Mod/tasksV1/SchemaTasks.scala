package typings.googleapis.tasksV1Mod.tasksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTasks extends StObject {
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * Collection of tasks.
    */
  var items: js.UndefOr[js.Array[SchemaTask]] = js.undefined
  
  /**
    * Type of the resource. This is always &quot;tasks#tasks&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Token used to access the next page of this result.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaTasks {
  
  inline def apply(): SchemaTasks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTasks]
  }
  
  extension [Self <: SchemaTasks](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setItems(value: js.Array[SchemaTask]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaTask*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
