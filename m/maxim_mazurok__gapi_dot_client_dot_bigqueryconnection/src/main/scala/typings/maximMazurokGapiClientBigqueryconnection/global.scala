package typings.maximMazurokGapiClientBigqueryconnection

import typings.maximMazurokGapiClientBigqueryconnection.gapi.client.bigqueryconnection.ProjectsResource
import typings.maximMazurokGapiClientBigqueryconnection.maximMazurokGapiClientBigqueryconnectionStrings.bigqueryconnection
import typings.maximMazurokGapiClientBigqueryconnection.maximMazurokGapiClientBigqueryconnectionStrings.v1beta1
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
      
      /** Load BigQuery Connection API v1beta1 */
      def load(name: bigqueryconnection, version: v1beta1): js.Thenable[Unit] = js.native
      def load(name: bigqueryconnection, version: v1beta1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object bigqueryconnection extends js.Object {
        
        val projects: ProjectsResource = js.native
      }
    }
  }
}
