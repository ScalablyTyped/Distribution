package typings.googleapis.mybusinessverificationsV1Mod.mybusinessverificationsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFetchVerificationOptionsResponse extends StObject {
  
  /**
    * The available verification options.
    */
  var options: js.UndefOr[js.Array[SchemaVerificationOption]] = js.undefined
}
object SchemaFetchVerificationOptionsResponse {
  
  inline def apply(): SchemaFetchVerificationOptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFetchVerificationOptionsResponse]
  }
  
  extension [Self <: SchemaFetchVerificationOptionsResponse](x: Self) {
    
    inline def setOptions(value: js.Array[SchemaVerificationOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsVarargs(value: SchemaVerificationOption*): Self = StObject.set(x, "options", js.Array(value*))
  }
}
