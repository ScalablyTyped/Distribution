package typings.maximMazurokGapiClientContaineranalysis

import typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis.ProjectsResource
import typings.maximMazurokGapiClientContaineranalysis.maximMazurokGapiClientContaineranalysisStrings.containeranalysis
import typings.maximMazurokGapiClientContaineranalysis.maximMazurokGapiClientContaineranalysisStrings.v1beta1
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
      
      /** Load Container Analysis API v1beta1 */
      def load(name: containeranalysis, version: v1beta1): js.Thenable[Unit] = js.native
      def load(name: containeranalysis, version: v1beta1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object containeranalysis extends js.Object {
        
        val projects: ProjectsResource = js.native
      }
    }
  }
}
