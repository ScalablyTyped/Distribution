package typings.maximMazurokGapiClientDatastore

import typings.maximMazurokGapiClientDatastore.gapi.client.datastore.ProjectsResource
import typings.maximMazurokGapiClientDatastore.maximMazurokGapiClientDatastoreStrings.datastore
import typings.maximMazurokGapiClientDatastore.maximMazurokGapiClientDatastoreStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object datastore {
        
        @JSGlobal("gapi.client.datastore.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Cloud Datastore API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: datastore, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: datastore, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
