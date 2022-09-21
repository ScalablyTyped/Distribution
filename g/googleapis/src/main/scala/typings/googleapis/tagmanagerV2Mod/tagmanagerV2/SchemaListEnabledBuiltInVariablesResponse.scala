package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListEnabledBuiltInVariablesResponse extends StObject {
  
  /**
    * All GTM BuiltInVariables of a GTM container.
    */
  var builtInVariable: js.UndefOr[js.Array[SchemaBuiltInVariable]] = js.undefined
  
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListEnabledBuiltInVariablesResponse {
  
  inline def apply(): SchemaListEnabledBuiltInVariablesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListEnabledBuiltInVariablesResponse]
  }
  
  extension [Self <: SchemaListEnabledBuiltInVariablesResponse](x: Self) {
    
    inline def setBuiltInVariable(value: js.Array[SchemaBuiltInVariable]): Self = StObject.set(x, "builtInVariable", value.asInstanceOf[js.Any])
    
    inline def setBuiltInVariableUndefined: Self = StObject.set(x, "builtInVariable", js.undefined)
    
    inline def setBuiltInVariableVarargs(value: SchemaBuiltInVariable*): Self = StObject.set(x, "builtInVariable", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
