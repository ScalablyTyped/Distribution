package typings.maximMazurokGapiClientDigitalassetlinks

import typings.maximMazurokGapiClientDigitalassetlinks.gapi.client.digitalassetlinks.AssetlinksResource
import typings.maximMazurokGapiClientDigitalassetlinks.gapi.client.digitalassetlinks.StatementsResource
import typings.maximMazurokGapiClientDigitalassetlinks.maximMazurokGapiClientDigitalassetlinksStrings.digitalassetlinks
import typings.maximMazurokGapiClientDigitalassetlinks.maximMazurokGapiClientDigitalassetlinksStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object digitalassetlinks {
        
        @JSGlobal("gapi.client.digitalassetlinks.assetlinks")
        @js.native
        val assetlinks: AssetlinksResource = js.native
        
        @JSGlobal("gapi.client.digitalassetlinks.statements")
        @js.native
        val statements: StatementsResource = js.native
      }
      
      /** Load Digital Asset Links API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: digitalassetlinks, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: digitalassetlinks, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
