package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsPatch
  extends StObject
     with StandardParameters {
  
  /**
    * Confirmation for erasing bidder and cookie matching urls.
    */
  var confirmUnsafeAccountChange: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The account id
    */
  var id: js.UndefOr[Double] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAccount] = js.undefined
}
object ParamsResourceAccountsPatch {
  
  inline def apply(): ParamsResourceAccountsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsPatch]
  }
  
  extension [Self <: ParamsResourceAccountsPatch](x: Self) {
    
    inline def setConfirmUnsafeAccountChange(value: Boolean): Self = StObject.set(x, "confirmUnsafeAccountChange", value.asInstanceOf[js.Any])
    
    inline def setConfirmUnsafeAccountChangeUndefined: Self = StObject.set(x, "confirmUnsafeAccountChange", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setRequestBody(value: SchemaAccount): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
