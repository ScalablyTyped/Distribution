package typings.maximMazurokGapiClientAppengine

import typings.maximMazurokGapiClientAppengine.gapi.client.appengine.AppsResource
import typings.maximMazurokGapiClientAppengine.maximMazurokGapiClientAppengineStrings.appengine
import typings.maximMazurokGapiClientAppengine.maximMazurokGapiClientAppengineStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object appengine {
        
        @JSGlobal("gapi.client.appengine.apps")
        @js.native
        val apps: AppsResource = js.native
      }
      
      /** Load App Engine Admin API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: appengine, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: appengine, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
