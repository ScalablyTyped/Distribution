package typings.maximMazurokGapiClientComposer

import typings.maximMazurokGapiClientComposer.gapi.client.composer.ProjectsResource
import typings.maximMazurokGapiClientComposer.maximMazurokGapiClientComposerStrings.composer
import typings.maximMazurokGapiClientComposer.maximMazurokGapiClientComposerStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object composer {
        
        @JSGlobal("gapi.client.composer.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Cloud Composer API v1 */
      inline def load(name: composer, version: v1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      inline def load(name: composer, version: v1, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
