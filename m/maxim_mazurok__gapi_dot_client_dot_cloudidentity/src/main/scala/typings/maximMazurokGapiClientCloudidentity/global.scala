package typings.maximMazurokGapiClientCloudidentity

import typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity.DevicesResource
import typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity.GroupsResource
import typings.maximMazurokGapiClientCloudidentity.maximMazurokGapiClientCloudidentityStrings.cloudidentity
import typings.maximMazurokGapiClientCloudidentity.maximMazurokGapiClientCloudidentityStrings.v1
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
      
      /** Load Cloud Identity API v1 */
      def load(name: cloudidentity, version: v1): js.Thenable[Unit] = js.native
      def load(name: cloudidentity, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object cloudidentity extends js.Object {
        
        val devices: DevicesResource = js.native
        
        val groups: GroupsResource = js.native
      }
    }
  }
}
