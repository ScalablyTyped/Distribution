package typings.googleapis.storageV1Mod.storageV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsHmackeysDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the HMAC key to be deleted.
    */
  var accessId: js.UndefOr[String] = js.undefined
  
  /**
    * Project ID owning the requested key
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * The project to be billed for this request.
    */
  var userProject: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsHmackeysDelete {
  
  inline def apply(): ParamsResourceProjectsHmackeysDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsHmackeysDelete]
  }
  
  extension [Self <: ParamsResourceProjectsHmackeysDelete](x: Self) {
    
    inline def setAccessId(value: String): Self = StObject.set(x, "accessId", value.asInstanceOf[js.Any])
    
    inline def setAccessIdUndefined: Self = StObject.set(x, "accessId", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    
    inline def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
  }
}
