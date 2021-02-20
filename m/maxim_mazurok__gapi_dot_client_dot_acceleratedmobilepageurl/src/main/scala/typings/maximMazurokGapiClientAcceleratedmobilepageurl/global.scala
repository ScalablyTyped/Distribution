package typings.maximMazurokGapiClientAcceleratedmobilepageurl

import typings.maximMazurokGapiClientAcceleratedmobilepageurl.gapi.client.acceleratedmobilepageurl.AmpUrlsResource
import typings.maximMazurokGapiClientAcceleratedmobilepageurl.maximMazurokGapiClientAcceleratedmobilepageurlStrings.acceleratedmobilepageurl
import typings.maximMazurokGapiClientAcceleratedmobilepageurl.maximMazurokGapiClientAcceleratedmobilepageurlStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object acceleratedmobilepageurl {
        
        @JSGlobal("gapi.client.acceleratedmobilepageurl.ampUrls")
        @js.native
        val ampUrls: AmpUrlsResource = js.native
      }
      
      /** Load Accelerated Mobile Pages (AMP) URL API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: acceleratedmobilepageurl, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: acceleratedmobilepageurl, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
