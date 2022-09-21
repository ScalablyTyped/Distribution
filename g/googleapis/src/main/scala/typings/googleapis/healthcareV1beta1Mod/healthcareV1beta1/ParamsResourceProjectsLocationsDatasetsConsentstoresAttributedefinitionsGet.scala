package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDatasetsConsentstoresAttributedefinitionsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the Attribute definition to get.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsDatasetsConsentstoresAttributedefinitionsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsDatasetsConsentstoresAttributedefinitionsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsConsentstoresAttributedefinitionsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDatasetsConsentstoresAttributedefinitionsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
