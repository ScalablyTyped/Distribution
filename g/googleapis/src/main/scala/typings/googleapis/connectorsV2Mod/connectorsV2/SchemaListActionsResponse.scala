package typings.googleapis.connectorsV2Mod.connectorsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListActionsResponse extends StObject {
  
  /**
    * List of action metadata.
    */
  var actions: js.UndefOr[js.Array[SchemaAction]] = js.undefined
  
  /**
    * Next page token if more actions available.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of actions which contain unsupported Datatypes. Check datatype.proto for more information.
    */
  var unsupportedActionNames: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaListActionsResponse {
  
  inline def apply(): SchemaListActionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListActionsResponse]
  }
  
  extension [Self <: SchemaListActionsResponse](x: Self) {
    
    inline def setActions(value: js.Array[SchemaAction]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: SchemaAction*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUnsupportedActionNames(value: js.Array[String]): Self = StObject.set(x, "unsupportedActionNames", value.asInstanceOf[js.Any])
    
    inline def setUnsupportedActionNamesNull: Self = StObject.set(x, "unsupportedActionNames", null)
    
    inline def setUnsupportedActionNamesUndefined: Self = StObject.set(x, "unsupportedActionNames", js.undefined)
    
    inline def setUnsupportedActionNamesVarargs(value: String*): Self = StObject.set(x, "unsupportedActionNames", js.Array(value*))
  }
}
