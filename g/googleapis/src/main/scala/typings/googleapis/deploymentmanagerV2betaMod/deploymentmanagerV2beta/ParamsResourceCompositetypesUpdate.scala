package typings.googleapis.deploymentmanagerV2betaMod.deploymentmanagerV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCompositetypesUpdate
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the composite type for this request.
    */
  var compositeType: js.UndefOr[String] = js.undefined
  
  /**
    * The project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCompositeType] = js.undefined
}
object ParamsResourceCompositetypesUpdate {
  
  inline def apply(): ParamsResourceCompositetypesUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCompositetypesUpdate]
  }
  
  extension [Self <: ParamsResourceCompositetypesUpdate](x: Self) {
    
    inline def setCompositeType(value: String): Self = StObject.set(x, "compositeType", value.asInstanceOf[js.Any])
    
    inline def setCompositeTypeUndefined: Self = StObject.set(x, "compositeType", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setRequestBody(value: SchemaCompositeType): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
