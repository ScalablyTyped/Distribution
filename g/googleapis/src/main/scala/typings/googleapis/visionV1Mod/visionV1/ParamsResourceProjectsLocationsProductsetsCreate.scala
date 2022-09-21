package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsProductsetsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The project in which the ProductSet should be created. Format is `projects/PROJECT_ID/locations/LOC_ID`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * A user-supplied resource id for this ProductSet. If set, the server will attempt to use this value as the resource id. If it is already in use, an error is returned with code ALREADY_EXISTS. Must be at most 128 characters long. It cannot contain the character `/`.
    */
  var productSetId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaProductSet] = js.undefined
}
object ParamsResourceProjectsLocationsProductsetsCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsProductsetsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsProductsetsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsProductsetsCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setProductSetId(value: String): Self = StObject.set(x, "productSetId", value.asInstanceOf[js.Any])
    
    inline def setProductSetIdUndefined: Self = StObject.set(x, "productSetId", js.undefined)
    
    inline def setRequestBody(value: SchemaProductSet): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
