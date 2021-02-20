package typings.maximMazurokGapiClientCivicinfo.gapi.client.civicinfo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Election extends StObject {
  
  /** Day of the election in YYYY-MM-DD format. */
  var electionDay: js.UndefOr[String] = js.native
  
  /** The unique ID of this election. */
  var id: js.UndefOr[String] = js.native
  
  /** A displayable name for the election. */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The political division of the election. Represented as an OCD Division ID. Voters within these political jurisdictions are covered by this election. This is typically a state such
    * as ocd-division/country:us/state:ca or for the midterms or general election the entire US (i.e. ocd-division/country:us).
    */
  var ocdDivisionId: js.UndefOr[String] = js.native
}
object Election {
  
  @scala.inline
  def apply(): Election = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Election]
  }
  
  @scala.inline
  implicit class ElectionMutableBuilder[Self <: Election] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElectionDay(value: String): Self = StObject.set(x, "electionDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElectionDayUndefined: Self = StObject.set(x, "electionDay", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOcdDivisionId(value: String): Self = StObject.set(x, "ocdDivisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOcdDivisionIdUndefined: Self = StObject.set(x, "ocdDivisionId", js.undefined)
  }
}
