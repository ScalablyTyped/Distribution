package typings.maximMazurokGapiClientBigquerydatatransfer

import typings.maximMazurokGapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer.ProjectsResource
import typings.maximMazurokGapiClientBigquerydatatransfer.maximMazurokGapiClientBigquerydatatransferStrings.bigquerydatatransfer
import typings.maximMazurokGapiClientBigquerydatatransfer.maximMazurokGapiClientBigquerydatatransferStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object bigquerydatatransfer {
        
        @JSGlobal("gapi.client.bigquerydatatransfer.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load BigQuery Data Transfer API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: bigquerydatatransfer, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: bigquerydatatransfer, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
