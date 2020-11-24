package typings.maximMazurokGapiClientBinaryauthorization

import typings.maximMazurokGapiClientBinaryauthorization.gapi.client.binaryauthorization.ProjectsResource
import typings.maximMazurokGapiClientBinaryauthorization.maximMazurokGapiClientBinaryauthorizationStrings.binaryauthorization
import typings.maximMazurokGapiClientBinaryauthorization.maximMazurokGapiClientBinaryauthorizationStrings.v1
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
      
      /** Load Binary Authorization API v1 */
      def load(name: binaryauthorization, version: v1): js.Thenable[Unit] = js.native
      def load(name: binaryauthorization, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object binaryauthorization extends js.Object {
        
        val projects: ProjectsResource = js.native
      }
    }
  }
}
