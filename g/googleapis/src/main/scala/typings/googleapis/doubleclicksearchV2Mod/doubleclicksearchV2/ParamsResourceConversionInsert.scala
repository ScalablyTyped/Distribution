package typings.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceConversionInsert
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaConversionList] = js.undefined
}
object ParamsResourceConversionInsert {
  
  inline def apply(): ParamsResourceConversionInsert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceConversionInsert]
  }
  
  extension [Self <: ParamsResourceConversionInsert](x: Self) {
    
    inline def setRequestBody(value: SchemaConversionList): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
