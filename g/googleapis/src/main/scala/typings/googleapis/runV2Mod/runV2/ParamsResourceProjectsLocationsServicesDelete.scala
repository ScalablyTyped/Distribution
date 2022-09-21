package typings.googleapis.runV2Mod.runV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsServicesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * A system-generated fingerprint for this version of the resource. May be used to detect modification conflict during updates.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The full name of the Service. Format: projects/{projectnumber\}/locations/{location\}/services/{service\}
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates that the request should be validated without actually deleting any resources.
    */
  var validateOnly: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceProjectsLocationsServicesDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsServicesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsServicesDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsServicesDelete](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
    
    inline def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
  }
}
