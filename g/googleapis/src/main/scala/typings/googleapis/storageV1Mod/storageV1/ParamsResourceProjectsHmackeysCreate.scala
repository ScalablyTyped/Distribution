package typings.googleapis.storageV1Mod.storageV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsHmackeysCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Project ID owning the service account.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * Email address of the service account.
    */
  var serviceAccountEmail: js.UndefOr[String] = js.undefined
  
  /**
    * The project to be billed for this request.
    */
  var userProject: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsHmackeysCreate {
  
  inline def apply(): ParamsResourceProjectsHmackeysCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsHmackeysCreate]
  }
  
  extension [Self <: ParamsResourceProjectsHmackeysCreate](x: Self) {
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setServiceAccountEmail(value: String): Self = StObject.set(x, "serviceAccountEmail", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountEmailUndefined: Self = StObject.set(x, "serviceAccountEmail", js.undefined)
    
    inline def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    
    inline def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
  }
}
