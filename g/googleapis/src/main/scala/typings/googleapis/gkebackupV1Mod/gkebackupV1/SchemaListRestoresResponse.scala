package typings.googleapis.gkebackupV1Mod.gkebackupV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListRestoresResponse extends StObject {
  
  /**
    * A token which may be sent as page_token in a subsequent `ListRestores` call to retrieve the next page of results. If this field is omitted or empty, then there are no more results to return.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of Restores matching the given criteria.
    */
  var restores: js.UndefOr[js.Array[SchemaRestore]] = js.undefined
  
  /**
    * Locations that could not be reached.
    */
  var unreachable: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaListRestoresResponse {
  
  inline def apply(): SchemaListRestoresResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListRestoresResponse]
  }
  
  extension [Self <: SchemaListRestoresResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setRestores(value: js.Array[SchemaRestore]): Self = StObject.set(x, "restores", value.asInstanceOf[js.Any])
    
    inline def setRestoresUndefined: Self = StObject.set(x, "restores", js.undefined)
    
    inline def setRestoresVarargs(value: SchemaRestore*): Self = StObject.set(x, "restores", js.Array(value*))
    
    inline def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    inline def setUnreachableNull: Self = StObject.set(x, "unreachable", null)
    
    inline def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    inline def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value*))
  }
}
