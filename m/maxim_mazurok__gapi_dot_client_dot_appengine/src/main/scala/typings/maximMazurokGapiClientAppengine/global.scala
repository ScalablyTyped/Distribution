package typings.maximMazurokGapiClientAppengine

import typings.maximMazurokGapiClientAppengine.gapi.client.appengine.AppsResource
import typings.maximMazurokGapiClientAppengine.maximMazurokGapiClientAppengineStrings.appengine
import typings.maximMazurokGapiClientAppengine.maximMazurokGapiClientAppengineStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object appengine {
        
        @JSGlobal("gapi.client.appengine.apps")
        @js.native
        val apps: AppsResource = js.native
      }
      
      /** Load App Engine Admin API v1 */
      inline def load(name: appengine, version: v1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      inline def load(name: appengine, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
