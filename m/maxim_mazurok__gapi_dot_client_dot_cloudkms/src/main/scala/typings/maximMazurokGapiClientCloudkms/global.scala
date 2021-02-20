package typings.maximMazurokGapiClientCloudkms

import typings.maximMazurokGapiClientCloudkms.gapi.client.cloudkms.ProjectsResource
import typings.maximMazurokGapiClientCloudkms.maximMazurokGapiClientCloudkmsStrings.cloudkms
import typings.maximMazurokGapiClientCloudkms.maximMazurokGapiClientCloudkmsStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object cloudkms {
        
        @JSGlobal("gapi.client.cloudkms.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Cloud Key Management Service (KMS) API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: cloudkms, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: cloudkms, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
