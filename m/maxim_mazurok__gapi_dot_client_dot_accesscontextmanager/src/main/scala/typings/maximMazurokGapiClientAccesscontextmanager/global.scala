package typings.maximMazurokGapiClientAccesscontextmanager

import typings.maximMazurokGapiClientAccesscontextmanager.gapi.client.accesscontextmanager.AccessPoliciesResource
import typings.maximMazurokGapiClientAccesscontextmanager.gapi.client.accesscontextmanager.OperationsResource
import typings.maximMazurokGapiClientAccesscontextmanager.gapi.client.accesscontextmanager.OrganizationsResource
import typings.maximMazurokGapiClientAccesscontextmanager.maximMazurokGapiClientAccesscontextmanagerStrings.accesscontextmanager
import typings.maximMazurokGapiClientAccesscontextmanager.maximMazurokGapiClientAccesscontextmanagerStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object accesscontextmanager {
        
        @JSGlobal("gapi.client.accesscontextmanager.accessPolicies")
        @js.native
        val accessPolicies: AccessPoliciesResource = js.native
        
        @JSGlobal("gapi.client.accesscontextmanager.operations")
        @js.native
        val operations: OperationsResource = js.native
        
        @JSGlobal("gapi.client.accesscontextmanager.organizations")
        @js.native
        val organizations: OrganizationsResource = js.native
      }
      
      /** Load Access Context Manager API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: accesscontextmanager, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: accesscontextmanager, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
