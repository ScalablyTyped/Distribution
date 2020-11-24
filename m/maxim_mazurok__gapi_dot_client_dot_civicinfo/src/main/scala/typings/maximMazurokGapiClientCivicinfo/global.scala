package typings.maximMazurokGapiClientCivicinfo

import typings.maximMazurokGapiClientCivicinfo.gapi.client.civicinfo.DivisionsResource
import typings.maximMazurokGapiClientCivicinfo.gapi.client.civicinfo.ElectionsResource
import typings.maximMazurokGapiClientCivicinfo.gapi.client.civicinfo.RepresentativesResource
import typings.maximMazurokGapiClientCivicinfo.maximMazurokGapiClientCivicinfoStrings.civicinfo
import typings.maximMazurokGapiClientCivicinfo.maximMazurokGapiClientCivicinfoStrings.v2
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
      
      /** Load Google Civic Information API v2 */
      def load(name: civicinfo, version: v2): js.Thenable[Unit] = js.native
      def load(name: civicinfo, version: v2, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object civicinfo extends js.Object {
        
        val divisions: DivisionsResource = js.native
        
        val elections: ElectionsResource = js.native
        
        val representatives: RepresentativesResource = js.native
      }
    }
  }
}
