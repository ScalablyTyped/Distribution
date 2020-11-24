package typings.maximMazurokGapiClientAppengine

import typings.maximMazurokGapiClientAppengine.gapi.client.appengine.AppsResource
import typings.maximMazurokGapiClientAppengine.maximMazurokGapiClientAppengineStrings.appengine
import typings.maximMazurokGapiClientAppengine.maximMazurokGapiClientAppengineStrings.v1
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
      
      /** Load App Engine Admin API v1 */
      def load(name: appengine, version: v1): js.Thenable[Unit] = js.native
      def load(name: appengine, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object appengine extends js.Object {
        
        val apps: AppsResource = js.native
      }
    }
  }
}
