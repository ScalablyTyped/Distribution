package typings.googleapis.runV2Mod.runV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsJobsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * A system-generated fingerprint for this version of the resource. May be used to detect modification conflict during updates.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * If set to true, the Job and its Executions will be deleted no matter whether any Executions are still running or not. If set to false or unset, the Job and its Executions can only be deleted if there are no running Executions. Any running Execution will fail the deletion.
    */
  var force: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Required. The full name of the Job. Format: projects/{projectnumber\}/locations/{location\}/jobs/{job\}
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates that the request should be validated without actually deleting any resources.
    */
  var validateOnly: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceProjectsLocationsJobsDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsJobsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsJobsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsJobsDelete](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
    
    inline def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
  }
}
