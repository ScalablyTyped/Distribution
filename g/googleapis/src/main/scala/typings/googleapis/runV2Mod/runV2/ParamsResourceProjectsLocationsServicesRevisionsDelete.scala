package typings.googleapis.runV2Mod.runV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsServicesRevisionsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * A system-generated fingerprint for this version of the resource. This may be used to detect modification conflict during updates.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The name of the Revision to delete. Format: projects/{project\}/locations/{location\}/services/{service\}/revisions/{revision\}
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates that the request should be validated without actually deleting any resources.
    */
  var validateOnly: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceProjectsLocationsServicesRevisionsDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsServicesRevisionsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsServicesRevisionsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsServicesRevisionsDelete](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
    
    inline def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
  }
}
