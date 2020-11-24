package typings.maximMazurokGapiClientBigquerydatatransfer

import typings.maximMazurokGapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer.ProjectsResource
import typings.maximMazurokGapiClientBigquerydatatransfer.maximMazurokGapiClientBigquerydatatransferStrings.bigquerydatatransfer
import typings.maximMazurokGapiClientBigquerydatatransfer.maximMazurokGapiClientBigquerydatatransferStrings.v1
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
      
      /** Load BigQuery Data Transfer API v1 */
      def load(name: bigquerydatatransfer, version: v1): js.Thenable[Unit] = js.native
      def load(name: bigquerydatatransfer, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object bigquerydatatransfer extends js.Object {
        
        val projects: ProjectsResource = js.native
      }
    }
  }
}
