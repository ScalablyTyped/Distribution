package typings.maximMazurokGapiClientDatafusion

import typings.maximMazurokGapiClientDatafusion.gapi.client.datafusion.ProjectsResource
import typings.maximMazurokGapiClientDatafusion.maximMazurokGapiClientDatafusionStrings.datafusion
import typings.maximMazurokGapiClientDatafusion.maximMazurokGapiClientDatafusionStrings.v1
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
      
      /** Load Cloud Data Fusion API v1 */
      def load(name: datafusion, version: v1): js.Thenable[Unit] = js.native
      def load(name: datafusion, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object datafusion extends js.Object {
        
        val projects: ProjectsResource = js.native
      }
    }
  }
}
