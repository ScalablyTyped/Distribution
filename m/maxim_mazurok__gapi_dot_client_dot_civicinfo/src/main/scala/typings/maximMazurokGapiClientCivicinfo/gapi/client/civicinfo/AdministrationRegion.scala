package typings.maximMazurokGapiClientCivicinfo.gapi.client.civicinfo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdministrationRegion extends StObject {
  
  /** The election administration body for this area. */
  var electionAdministrationBody: js.UndefOr[AdministrativeBody] = js.undefined
  
  /** The city or county that provides election information for this voter. This object can have the same elements as state. */
  var local_jurisdiction: js.UndefOr[AdministrationRegion] = js.undefined
  
  /** The name of the jurisdiction. */
  var name: js.UndefOr[String] = js.undefined
  
  /** A list of sources for this area. If multiple sources are listed the data has been aggregated from those sources. */
  var sources: js.UndefOr[js.Array[Source]] = js.undefined
}
object AdministrationRegion {
  
  inline def apply(): AdministrationRegion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdministrationRegion]
  }
  
  extension [Self <: AdministrationRegion](x: Self) {
    
    inline def setElectionAdministrationBody(value: AdministrativeBody): Self = StObject.set(x, "electionAdministrationBody", value.asInstanceOf[js.Any])
    
    inline def setElectionAdministrationBodyUndefined: Self = StObject.set(x, "electionAdministrationBody", js.undefined)
    
    inline def setLocal_jurisdiction(value: AdministrationRegion): Self = StObject.set(x, "local_jurisdiction", value.asInstanceOf[js.Any])
    
    inline def setLocal_jurisdictionUndefined: Self = StObject.set(x, "local_jurisdiction", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSources(value: js.Array[Source]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    inline def setSourcesVarargs(value: Source*): Self = StObject.set(x, "sources", js.Array(value*))
  }
}
