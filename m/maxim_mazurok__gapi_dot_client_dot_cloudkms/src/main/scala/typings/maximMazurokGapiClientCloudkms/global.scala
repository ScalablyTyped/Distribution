package typings.maximMazurokGapiClientCloudkms

import typings.maximMazurokGapiClientCloudkms.gapi.client.cloudkms.ProjectsResource
import typings.maximMazurokGapiClientCloudkms.maximMazurokGapiClientCloudkmsStrings.cloudkms
import typings.maximMazurokGapiClientCloudkms.maximMazurokGapiClientCloudkmsStrings.v1
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object cloudkms {
        
        @JSGlobal("gapi.client.cloudkms.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Cloud Key Management Service (KMS) API v1 */
      inline def load(name: cloudkms, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: cloudkms, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
