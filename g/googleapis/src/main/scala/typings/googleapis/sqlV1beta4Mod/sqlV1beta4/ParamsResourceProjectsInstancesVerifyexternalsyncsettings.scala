package typings.googleapis.sqlV1beta4Mod.sqlV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsInstancesVerifyexternalsyncsettings
  extends StObject
     with StandardParameters {
  
  /**
    * Cloud SQL instance ID. This does not include the project ID.
    */
  var instance: js.UndefOr[String] = js.undefined
  
  /**
    * Project ID of the project that contains the instance.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * External sync mode
    */
  var syncMode: js.UndefOr[String] = js.undefined
  
  /**
    * Flag to enable verifying connection only
    */
  var verifyConnectionOnly: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceProjectsInstancesVerifyexternalsyncsettings {
  
  inline def apply(): ParamsResourceProjectsInstancesVerifyexternalsyncsettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsInstancesVerifyexternalsyncsettings]
  }
  
  extension [Self <: ParamsResourceProjectsInstancesVerifyexternalsyncsettings](x: Self) {
    
    inline def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setSyncMode(value: String): Self = StObject.set(x, "syncMode", value.asInstanceOf[js.Any])
    
    inline def setSyncModeUndefined: Self = StObject.set(x, "syncMode", js.undefined)
    
    inline def setVerifyConnectionOnly(value: Boolean): Self = StObject.set(x, "verifyConnectionOnly", value.asInstanceOf[js.Any])
    
    inline def setVerifyConnectionOnlyUndefined: Self = StObject.set(x, "verifyConnectionOnly", js.undefined)
  }
}
