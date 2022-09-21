package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePropertiesDisplayvideo360advertiserlinksGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the DisplayVideo360AdvertiserLink to get. Example format: properties/1234/displayVideo360AdvertiserLink/5678
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourcePropertiesDisplayvideo360advertiserlinksGet {
  
  inline def apply(): ParamsResourcePropertiesDisplayvideo360advertiserlinksGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePropertiesDisplayvideo360advertiserlinksGet]
  }
  
  extension [Self <: ParamsResourcePropertiesDisplayvideo360advertiserlinksGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
