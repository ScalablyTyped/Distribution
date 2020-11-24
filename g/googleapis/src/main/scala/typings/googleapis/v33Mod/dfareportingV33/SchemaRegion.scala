package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about a region that can be targeted by ads.
  */
@js.native
trait SchemaRegion extends js.Object {
  
  /**
    * Country code of the country to which this region belongs.
    */
  var countryCode: js.UndefOr[String] = js.native
  
  /**
    * DART ID of the country to which this region belongs.
    */
  var countryDartId: js.UndefOr[String] = js.native
  
  /**
    * DART ID of this region.
    */
  var dartId: js.UndefOr[String] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#region&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Name of this region.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Region code.
    */
  var regionCode: js.UndefOr[String] = js.native
}
object SchemaRegion {
  
  @scala.inline
  def apply(): SchemaRegion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegion]
  }
  
  @scala.inline
  implicit class SchemaRegionOps[Self <: SchemaRegion] (val x: Self) extends AnyVal {
    
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
    def setDartId(value: String): Self = this.set("dartId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDartId: Self = this.set("dartId", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRegionCode(value: String): Self = this.set("regionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegionCode: Self = this.set("regionCode", js.undefined)
  }
}
