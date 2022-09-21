package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListContainersResponse extends StObject {
  
  /**
    * All Containers of a GTM Account.
    */
  var container: js.UndefOr[js.Array[SchemaContainer]] = js.undefined
  
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListContainersResponse {
  
  inline def apply(): SchemaListContainersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListContainersResponse]
  }
  
  extension [Self <: SchemaListContainersResponse](x: Self) {
    
    inline def setContainer(value: js.Array[SchemaContainer]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setContainerVarargs(value: SchemaContainer*): Self = StObject.set(x, "container", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
