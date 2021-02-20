package typings.maximMazurokGapiClientCloudsearch

import typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch.DebugResource
import typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch.IndexingResource
import typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch.MediaResource
import typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch.OperationsResource
import typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch.QueryResource
import typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch.SettingsResource
import typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch.StatsResource
import typings.maximMazurokGapiClientCloudsearch.maximMazurokGapiClientCloudsearchStrings.cloudsearch
import typings.maximMazurokGapiClientCloudsearch.maximMazurokGapiClientCloudsearchStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object cloudsearch {
        
        @JSGlobal("gapi.client.cloudsearch.debug")
        @js.native
        val debug: DebugResource = js.native
        
        @JSGlobal("gapi.client.cloudsearch.indexing")
        @js.native
        val indexing: IndexingResource = js.native
        
        @JSGlobal("gapi.client.cloudsearch.media")
        @js.native
        val media: MediaResource = js.native
        
        @JSGlobal("gapi.client.cloudsearch.operations")
        @js.native
        val operations: OperationsResource = js.native
        
        @JSGlobal("gapi.client.cloudsearch.query")
        @js.native
        val query: QueryResource = js.native
        
        @JSGlobal("gapi.client.cloudsearch.settings")
        @js.native
        val settings: SettingsResource = js.native
        
        @JSGlobal("gapi.client.cloudsearch.stats")
        @js.native
        val stats: StatsResource = js.native
      }
      
      /** Load Cloud Search API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: cloudsearch, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: cloudsearch, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
