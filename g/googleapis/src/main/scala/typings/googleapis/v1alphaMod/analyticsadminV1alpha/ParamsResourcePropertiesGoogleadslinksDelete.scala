package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePropertiesGoogleadslinksDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Example format: properties/1234/googleAdsLinks/5678
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourcePropertiesGoogleadslinksDelete {
  
  inline def apply(): ParamsResourcePropertiesGoogleadslinksDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePropertiesGoogleadslinksDelete]
  }
  
  extension [Self <: ParamsResourcePropertiesGoogleadslinksDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
