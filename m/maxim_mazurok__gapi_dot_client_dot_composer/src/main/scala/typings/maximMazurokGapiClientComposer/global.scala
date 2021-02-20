package typings.maximMazurokGapiClientComposer

import typings.maximMazurokGapiClientComposer.gapi.client.composer.ProjectsResource
import typings.maximMazurokGapiClientComposer.maximMazurokGapiClientComposerStrings.composer
import typings.maximMazurokGapiClientComposer.maximMazurokGapiClientComposerStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object composer {
        
        @JSGlobal("gapi.client.composer.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Cloud Composer API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: composer, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: composer, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
