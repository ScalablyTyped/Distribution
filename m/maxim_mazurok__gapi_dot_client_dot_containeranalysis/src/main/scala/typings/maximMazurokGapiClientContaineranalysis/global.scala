package typings.maximMazurokGapiClientContaineranalysis

import typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis.ProjectsResource
import typings.maximMazurokGapiClientContaineranalysis.maximMazurokGapiClientContaineranalysisStrings.containeranalysis
import typings.maximMazurokGapiClientContaineranalysis.maximMazurokGapiClientContaineranalysisStrings.v1beta1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object containeranalysis {
        
        @JSGlobal("gapi.client.containeranalysis.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Container Analysis API v1beta1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: containeranalysis, version: v1beta1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: containeranalysis, version: v1beta1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
