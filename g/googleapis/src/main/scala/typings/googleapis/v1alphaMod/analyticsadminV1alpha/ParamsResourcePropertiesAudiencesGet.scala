package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePropertiesAudiencesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the Audience to get. Example format: properties/1234/audiences/5678
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourcePropertiesAudiencesGet {
  
  inline def apply(): ParamsResourcePropertiesAudiencesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePropertiesAudiencesGet]
  }
  
  extension [Self <: ParamsResourcePropertiesAudiencesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
