package typings.maximMazurokGapiClientDataproc

import typings.maximMazurokGapiClientDataproc.gapi.client.dataproc.ProjectsResource
import typings.maximMazurokGapiClientDataproc.maximMazurokGapiClientDataprocStrings.dataproc
import typings.maximMazurokGapiClientDataproc.maximMazurokGapiClientDataprocStrings.v1
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object dataproc {
        
        @JSGlobal("gapi.client.dataproc.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Cloud Dataproc API v1 */
      inline def load(name: dataproc, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: dataproc, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
