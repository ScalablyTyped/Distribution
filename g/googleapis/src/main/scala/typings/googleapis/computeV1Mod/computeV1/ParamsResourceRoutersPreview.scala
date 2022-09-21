package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceRoutersPreview
  extends StObject
     with StandardParameters {
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the region for this request.
    */
  var region: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaRouter] = js.undefined
  
  /**
    * Name of the Router resource to query.
    */
  var router: js.UndefOr[String] = js.undefined
}
object ParamsResourceRoutersPreview {
  
  inline def apply(): ParamsResourceRoutersPreview = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRoutersPreview]
  }
  
  extension [Self <: ParamsResourceRoutersPreview](x: Self) {
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setRequestBody(value: SchemaRouter): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setRouter(value: String): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
    
    inline def setRouterUndefined: Self = StObject.set(x, "router", js.undefined)
  }
}
