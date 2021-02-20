package typings.maximMazurokGapiClientAdexperiencereport

import typings.maximMazurokGapiClientAdexperiencereport.gapi.client.adexperiencereport.SitesResource
import typings.maximMazurokGapiClientAdexperiencereport.gapi.client.adexperiencereport.ViolatingSitesResource
import typings.maximMazurokGapiClientAdexperiencereport.maximMazurokGapiClientAdexperiencereportStrings.adexperiencereport
import typings.maximMazurokGapiClientAdexperiencereport.maximMazurokGapiClientAdexperiencereportStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object adexperiencereport {
        
        @JSGlobal("gapi.client.adexperiencereport.sites")
        @js.native
        val sites: SitesResource = js.native
        
        @JSGlobal("gapi.client.adexperiencereport.violatingSites")
        @js.native
        val violatingSites: ViolatingSitesResource = js.native
      }
      
      /** Load Ad Experience Report API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: adexperiencereport, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: adexperiencereport, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
