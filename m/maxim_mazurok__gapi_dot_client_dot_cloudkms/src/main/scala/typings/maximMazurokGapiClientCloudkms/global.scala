package typings.maximMazurokGapiClientCloudkms

import typings.maximMazurokGapiClientCloudkms.gapi.client.cloudkms.ProjectsResource
import typings.maximMazurokGapiClientCloudkms.maximMazurokGapiClientCloudkmsStrings.cloudkms
import typings.maximMazurokGapiClientCloudkms.maximMazurokGapiClientCloudkmsStrings.v1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object gapi extends js.Object {
    
    @js.native
    object client extends js.Object {
      
      /** Load Cloud Key Management Service (KMS) API v1 */
      def load(name: cloudkms, version: v1): js.Thenable[Unit] = js.native
      def load(name: cloudkms, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object cloudkms extends js.Object {
        
        val projects: ProjectsResource = js.native
      }
    }
  }
}
