package typings.maximMazurokGapiClientCivicinfo.gapi.client.civicinfo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdministrationRegion extends StObject {
  
  /** The election administration body for this area. */
  var electionAdministrationBody: js.UndefOr[AdministrativeBody] = js.native
  
  /** The city or county that provides election information for this voter. This object can have the same elements as state. */
  var local_jurisdiction: js.UndefOr[AdministrationRegion] = js.native
  
  /** The name of the jurisdiction. */
  var name: js.UndefOr[String] = js.native
  
  /** A list of sources for this area. If multiple sources are listed the data has been aggregated from those sources. */
  var sources: js.UndefOr[js.Array[Source]] = js.native
}
object AdministrationRegion {
  
  @scala.inline
  def apply(): AdministrationRegion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdministrationRegion]
  }
  
  @scala.inline
  implicit class AdministrationRegionMutableBuilder[Self <: AdministrationRegion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElectionAdministrationBody(value: AdministrativeBody): Self = StObject.set(x, "electionAdministrationBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElectionAdministrationBodyUndefined: Self = StObject.set(x, "electionAdministrationBody", js.undefined)
    
    @scala.inline
    def setLocal_jurisdiction(value: AdministrationRegion): Self = StObject.set(x, "local_jurisdiction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocal_jurisdictionUndefined: Self = StObject.set(x, "local_jurisdiction", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSources(value: js.Array[Source]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    @scala.inline
    def setSourcesVarargs(value: Source*): Self = StObject.set(x, "sources", js.Array(value :_*))
  }
}
