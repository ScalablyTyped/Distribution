package typings.maximMazurokGapiClientDatafusion

import typings.maximMazurokGapiClientDatafusion.gapi.client.datafusion.ProjectsResource
import typings.maximMazurokGapiClientDatafusion.maximMazurokGapiClientDatafusionStrings.datafusion
import typings.maximMazurokGapiClientDatafusion.maximMazurokGapiClientDatafusionStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object datafusion {
        
        @JSGlobal("gapi.client.datafusion.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Cloud Data Fusion API v1 */
      @scala.inline
      def load(name: datafusion, version: v1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      @scala.inline
      def load(name: datafusion, version: v1, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
