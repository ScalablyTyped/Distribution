package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaProductShipping extends js.Object {
  
  /**
    * The CLDR territory code of the country to which an item will ship.
    */
  var country: js.UndefOr[String] = js.native
  
  /**
    * The location where the shipping is applicable, represented by a location
    * group name.
    */
  var locationGroupName: js.UndefOr[String] = js.native
  
  /**
    * The numeric ID of a location that the shipping rate applies to as defined
    * in the AdWords API.
    */
  var locationId: js.UndefOr[String] = js.native
  
  /**
    * The postal code range that the shipping rate applies to, represented by a
    * postal code, a postal code prefix followed by a * wildcard, a range
    * between two postal codes or two postal code prefixes of equal length.
    */
  var postalCode: js.UndefOr[String] = js.native
  
  /**
    * Fixed shipping price, represented as a number.
    */
  var price: js.UndefOr[SchemaPrice] = js.native
  
  /**
    * The geographic region to which a shipping rate applies.
    */
  var region: js.UndefOr[String] = js.native
  
  /**
    * A free-form description of the service class or delivery speed.
    */
  var service: js.UndefOr[String] = js.native
}
object SchemaProductShipping {
  
  @scala.inline
  def apply(): SchemaProductShipping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductShipping]
  }
  
  @scala.inline
  implicit class SchemaProductShippingOps[Self <: SchemaProductShipping] (val x: Self) extends AnyVal {
    
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
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    
    @scala.inline
    def setLocationGroupName(value: String): Self = this.set("locationGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationGroupName: Self = this.set("locationGroupName", js.undefined)
    
    @scala.inline
    def setLocationId(value: String): Self = this.set("locationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationId: Self = this.set("locationId", js.undefined)
    
    @scala.inline
    def setPostalCode(value: String): Self = this.set("postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostalCode: Self = this.set("postalCode", js.undefined)
    
    @scala.inline
    def setPrice(value: SchemaPrice): Self = this.set("price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrice: Self = this.set("price", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setService(value: String): Self = this.set("service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
  }
}
