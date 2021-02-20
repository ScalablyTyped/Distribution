package typings.maximMazurokGapiClientAssuredworkloads

import typings.maximMazurokGapiClientAssuredworkloads.gapi.client.assuredworkloads.OrganizationsResource
import typings.maximMazurokGapiClientAssuredworkloads.maximMazurokGapiClientAssuredworkloadsStrings.assuredworkloads
import typings.maximMazurokGapiClientAssuredworkloads.maximMazurokGapiClientAssuredworkloadsStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object assuredworkloads {
        
        @JSGlobal("gapi.client.assuredworkloads.organizations")
        @js.native
        val organizations: OrganizationsResource = js.native
      }
      
      /** Load Assured Workloads API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: assuredworkloads, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: assuredworkloads, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
