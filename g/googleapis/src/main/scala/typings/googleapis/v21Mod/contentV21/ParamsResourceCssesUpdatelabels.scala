package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCssesUpdatelabels
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The ID of the updated CSS domain.
    */
  var cssDomainId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The CSS group ID of the updated CSS domain.
    */
  var cssGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaLabelIds] = js.undefined
}
object ParamsResourceCssesUpdatelabels {
  
  inline def apply(): ParamsResourceCssesUpdatelabels = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCssesUpdatelabels]
  }
  
  extension [Self <: ParamsResourceCssesUpdatelabels](x: Self) {
    
    inline def setCssDomainId(value: String): Self = StObject.set(x, "cssDomainId", value.asInstanceOf[js.Any])
    
    inline def setCssDomainIdUndefined: Self = StObject.set(x, "cssDomainId", js.undefined)
    
    inline def setCssGroupId(value: String): Self = StObject.set(x, "cssGroupId", value.asInstanceOf[js.Any])
    
    inline def setCssGroupIdUndefined: Self = StObject.set(x, "cssGroupId", js.undefined)
    
    inline def setRequestBody(value: SchemaLabelIds): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
