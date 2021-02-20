package typings.maximMazurokGapiClientDatafusion

import typings.maximMazurokGapiClientDatafusion.gapi.client.datafusion.ProjectsResource
import typings.maximMazurokGapiClientDatafusion.maximMazurokGapiClientDatafusionStrings.datafusion
import typings.maximMazurokGapiClientDatafusion.maximMazurokGapiClientDatafusionStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object datafusion {
        
        @JSGlobal("gapi.client.datafusion.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Cloud Data Fusion API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: datafusion, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: datafusion, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
