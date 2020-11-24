package typings.maximMazurokGapiClientDatalabeling

import typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling.ProjectsResource
import typings.maximMazurokGapiClientDatalabeling.maximMazurokGapiClientDatalabelingStrings.datalabeling
import typings.maximMazurokGapiClientDatalabeling.maximMazurokGapiClientDatalabelingStrings.v1beta1
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
      
      /** Load Data Labeling API v1beta1 */
      def load(name: datalabeling, version: v1beta1): js.Thenable[Unit] = js.native
      def load(name: datalabeling, version: v1beta1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object datalabeling extends js.Object {
        
        val projects: ProjectsResource = js.native
      }
    }
  }
}
