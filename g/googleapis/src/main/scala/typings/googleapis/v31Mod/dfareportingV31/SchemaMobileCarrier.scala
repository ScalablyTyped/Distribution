package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about a mobile carrier that can be targeted by ads.
  */
@js.native
trait SchemaMobileCarrier extends js.Object {
  
  /**
    * Country code of the country to which this mobile carrier belongs.
    */
  var countryCode: js.UndefOr[String] = js.native
  
  /**
    * DART ID of the country to which this mobile carrier belongs.
    */
  var countryDartId: js.UndefOr[String] = js.native
  
  /**
    * ID of this mobile carrier.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#mobileCarrier&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Name of this mobile carrier.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaMobileCarrier {
  
  @scala.inline
  def apply(): SchemaMobileCarrier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMobileCarrier]
  }
  
  @scala.inline
  implicit class SchemaMobileCarrierOps[Self <: SchemaMobileCarrier] (val x: Self) extends AnyVal {
    
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
    def setCountryCode(value: String): Self = this.set("countryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountryCode: Self = this.set("countryCode", js.undefined)
    
    @scala.inline
    def setCountryDartId(value: String): Self = this.set("countryDartId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountryDartId: Self = this.set("countryDartId", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
