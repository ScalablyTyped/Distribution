package typings.maximMazurokGapiClientBinaryauthorization

import typings.maximMazurokGapiClientBinaryauthorization.gapi.client.binaryauthorization.ProjectsResource
import typings.maximMazurokGapiClientBinaryauthorization.maximMazurokGapiClientBinaryauthorizationStrings.binaryauthorization
import typings.maximMazurokGapiClientBinaryauthorization.maximMazurokGapiClientBinaryauthorizationStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object binaryauthorization {
        
        @JSGlobal("gapi.client.binaryauthorization.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Binary Authorization API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: binaryauthorization, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: binaryauthorization, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
