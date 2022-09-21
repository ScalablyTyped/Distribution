package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRegionUrlMapsValidateRequest extends StObject {
  
  /**
    * Content of the UrlMap to be validated.
    */
  var resource: js.UndefOr[SchemaUrlMap] = js.undefined
}
object SchemaRegionUrlMapsValidateRequest {
  
  inline def apply(): SchemaRegionUrlMapsValidateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegionUrlMapsValidateRequest]
  }
  
  extension [Self <: SchemaRegionUrlMapsValidateRequest](x: Self) {
    
    inline def setResource(value: SchemaUrlMap): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
