package typings.maximMazurokGapiClientAcceleratedmobilepageurl

import typings.maximMazurokGapiClientAcceleratedmobilepageurl.gapi.client.acceleratedmobilepageurl.AmpUrlsResource
import typings.maximMazurokGapiClientAcceleratedmobilepageurl.maximMazurokGapiClientAcceleratedmobilepageurlStrings.acceleratedmobilepageurl
import typings.maximMazurokGapiClientAcceleratedmobilepageurl.maximMazurokGapiClientAcceleratedmobilepageurlStrings.v1
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
      
      /** Load Accelerated Mobile Pages (AMP) URL API v1 */
      def load(name: acceleratedmobilepageurl, version: v1): js.Thenable[Unit] = js.native
      def load(name: acceleratedmobilepageurl, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object acceleratedmobilepageurl extends js.Object {
        
        val ampUrls: AmpUrlsResource = js.native
      }
    }
  }
}
