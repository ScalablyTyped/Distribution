package typings.maximMazurokGapiClientAcceleratedmobilepageurl

import typings.maximMazurokGapiClientAcceleratedmobilepageurl.gapi.client.acceleratedmobilepageurl.AmpUrlsResource
import typings.maximMazurokGapiClientAcceleratedmobilepageurl.maximMazurokGapiClientAcceleratedmobilepageurlStrings.acceleratedmobilepageurl
import typings.maximMazurokGapiClientAcceleratedmobilepageurl.maximMazurokGapiClientAcceleratedmobilepageurlStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object acceleratedmobilepageurl {
        
        @JSGlobal("gapi.client.acceleratedmobilepageurl.ampUrls")
        @js.native
        val ampUrls: AmpUrlsResource = js.native
      }
      
      /** Load Accelerated Mobile Pages (AMP) URL API v1 */
      @scala.inline
      def load(name: acceleratedmobilepageurl, version: v1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      @scala.inline
      def load(name: acceleratedmobilepageurl, version: v1, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
