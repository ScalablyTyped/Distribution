package typings.maximMazurokGapiClientAssuredworkloads

import typings.maximMazurokGapiClientAssuredworkloads.gapi.client.assuredworkloads.OrganizationsResource
import typings.maximMazurokGapiClientAssuredworkloads.maximMazurokGapiClientAssuredworkloadsStrings.assuredworkloads
import typings.maximMazurokGapiClientAssuredworkloads.maximMazurokGapiClientAssuredworkloadsStrings.v1
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
      
      /** Load Assured Workloads API v1 */
      def load(name: assuredworkloads, version: v1): js.Thenable[Unit] = js.native
      def load(name: assuredworkloads, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object assuredworkloads extends js.Object {
        
        val organizations: OrganizationsResource = js.native
      }
    }
  }
}
