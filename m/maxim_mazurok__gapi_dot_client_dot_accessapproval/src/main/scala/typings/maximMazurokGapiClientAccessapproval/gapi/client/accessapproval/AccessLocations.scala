package typings.maximMazurokGapiClientAccessapproval.gapi.client.accessapproval

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessLocations extends js.Object {
  
  /**
    * The "home office" location of the principal. A two-letter country code (ISO 3166-1 alpha-2), such as "US", "DE" or "GB" or a region code. In some limited situations Google systems
    * may refer refer to a region code instead of a country code. Possible Region Codes: * ASI: Asia * EUR: Europe * OCE: Oceania * AFR: Africa * NAM: North America * SAM: South America *
    * ANT: Antarctica * ANY: Any location
    */
  var principalOfficeCountry: js.UndefOr[String] = js.native
  
  /**
    * Physical location of the principal at the time of the access. A two-letter country code (ISO 3166-1 alpha-2), such as "US", "DE" or "GB" or a region code. In some limited situations
    * Google systems may refer refer to a region code instead of a country code. Possible Region Codes: * ASI: Asia * EUR: Europe * OCE: Oceania * AFR: Africa * NAM: North America * SAM:
    * South America * ANT: Antarctica * ANY: Any location
    */
  var principalPhysicalLocationCountry: js.UndefOr[String] = js.native
}
object AccessLocations {
  
  @scala.inline
  def apply(): AccessLocations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessLocations]
  }
  
  @scala.inline
  implicit class AccessLocationsOps[Self <: AccessLocations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPrincipalOfficeCountry(value: String): Self = this.set("principalOfficeCountry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrincipalOfficeCountry: Self = this.set("principalOfficeCountry", js.undefined)
    
    @scala.inline
    def setPrincipalPhysicalLocationCountry(value: String): Self = this.set("principalPhysicalLocationCountry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrincipalPhysicalLocationCountry: Self = this.set("principalPhysicalLocationCountry", js.undefined)
  }
}
