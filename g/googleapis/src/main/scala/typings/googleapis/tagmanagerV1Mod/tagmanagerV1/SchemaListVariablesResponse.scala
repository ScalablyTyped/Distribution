package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListVariablesResponse extends StObject {
  
  /**
    * All GTM Variables of a GTM Container.
    */
  var variables: js.UndefOr[js.Array[SchemaVariable]] = js.undefined
}
object SchemaListVariablesResponse {
  
  inline def apply(): SchemaListVariablesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListVariablesResponse]
  }
  
  extension [Self <: SchemaListVariablesResponse](x: Self) {
    
    inline def setVariables(value: js.Array[SchemaVariable]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    inline def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
    
    inline def setVariablesVarargs(value: SchemaVariable*): Self = StObject.set(x, "variables", js.Array(value*))
  }
}
