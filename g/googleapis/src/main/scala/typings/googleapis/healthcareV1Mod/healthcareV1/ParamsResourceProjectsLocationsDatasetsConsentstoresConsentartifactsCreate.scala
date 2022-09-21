package typings.googleapis.healthcareV1Mod.healthcareV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDatasetsConsentstoresConsentartifactsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the consent store this Consent artifact belongs to.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaConsentArtifact] = js.undefined
}
object ParamsResourceProjectsLocationsDatasetsConsentstoresConsentartifactsCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsDatasetsConsentstoresConsentartifactsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsConsentstoresConsentartifactsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentartifactsCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaConsentArtifact): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
