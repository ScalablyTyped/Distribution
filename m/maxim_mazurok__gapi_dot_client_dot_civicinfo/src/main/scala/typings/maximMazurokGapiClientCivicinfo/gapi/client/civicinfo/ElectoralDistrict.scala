package typings.maximMazurokGapiClientCivicinfo.gapi.client.civicinfo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElectoralDistrict extends StObject {
  
  /** An identifier for this district, relative to its scope. For example, the 34th State Senate district would have id "34" and a scope of stateUpper. */
  var id: js.UndefOr[String] = js.undefined
  
  /** The name of the district. */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The geographic scope of this district. If unspecified the district's geography is not known. One of: national, statewide, congressional, stateUpper, stateLower, countywide,
    * judicial, schoolBoard, cityWide, township, countyCouncil, cityCouncil, ward, special
    */
  var scope: js.UndefOr[String] = js.undefined
}
object ElectoralDistrict {
  
  @scala.inline
  def apply(): ElectoralDistrict = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElectoralDistrict]
  }
  
  @scala.inline
  implicit class ElectoralDistrictMutableBuilder[Self <: ElectoralDistrict] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
