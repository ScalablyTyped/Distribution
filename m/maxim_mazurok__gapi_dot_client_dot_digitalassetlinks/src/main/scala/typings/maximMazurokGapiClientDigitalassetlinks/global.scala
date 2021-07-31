package typings.maximMazurokGapiClientDigitalassetlinks

import typings.maximMazurokGapiClientDigitalassetlinks.gapi.client.digitalassetlinks.AssetlinksResource
import typings.maximMazurokGapiClientDigitalassetlinks.gapi.client.digitalassetlinks.StatementsResource
import typings.maximMazurokGapiClientDigitalassetlinks.maximMazurokGapiClientDigitalassetlinksStrings.digitalassetlinks
import typings.maximMazurokGapiClientDigitalassetlinks.maximMazurokGapiClientDigitalassetlinksStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object digitalassetlinks {
        
        @JSGlobal("gapi.client.digitalassetlinks.assetlinks")
        @js.native
        val assetlinks: AssetlinksResource = js.native
        
        @JSGlobal("gapi.client.digitalassetlinks.statements")
        @js.native
        val statements: StatementsResource = js.native
      }
      
      /** Load Digital Asset Links API v1 */
      @scala.inline
      def load(name: digitalassetlinks, version: v1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      @scala.inline
      def load(name: digitalassetlinks, version: v1, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
