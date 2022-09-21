package typings.googleapis.datacatalogV1beta1Mod.datacatalogV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsTaxonomiesPolicytagsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Resource name of the taxonomy that the policy tag will belong to.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDatacatalogV1beta1PolicyTag] = js.undefined
}
object ParamsResourceProjectsLocationsTaxonomiesPolicytagsCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsTaxonomiesPolicytagsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsTaxonomiesPolicytagsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsTaxonomiesPolicytagsCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudDatacatalogV1beta1PolicyTag): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
