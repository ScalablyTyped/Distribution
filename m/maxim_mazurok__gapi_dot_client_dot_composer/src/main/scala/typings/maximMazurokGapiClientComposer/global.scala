package typings.maximMazurokGapiClientComposer

import typings.maximMazurokGapiClientComposer.gapi.client.composer.ProjectsResource
import typings.maximMazurokGapiClientComposer.maximMazurokGapiClientComposerStrings.composer
import typings.maximMazurokGapiClientComposer.maximMazurokGapiClientComposerStrings.v1
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
      
      /** Load Cloud Composer API v1 */
      def load(name: composer, version: v1): js.Thenable[Unit] = js.native
      def load(name: composer, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object composer extends js.Object {
        
        val projects: ProjectsResource = js.native
      }
    }
  }
}
