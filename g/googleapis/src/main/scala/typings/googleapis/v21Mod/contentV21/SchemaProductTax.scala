package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaProductTax extends js.Object {
  
  /**
    * The country within which the item is taxed, specified as a CLDR territory
    * code.
    */
  var country: js.UndefOr[String] = js.native
  
  /**
    * The numeric ID of a location that the tax rate applies to as defined in
    * the AdWords API.
    */
  var locationId: js.UndefOr[String] = js.native
  
  /**
    * The postal code range that the tax rate applies to, represented by a ZIP
    * code, a ZIP code prefix using * wildcard, a range between two ZIP codes
    * or two ZIP code prefixes of equal length. Examples: 94114, 94*,
    * 94002-95460, 94*-95*.
    */
  var postalCode: js.UndefOr[String] = js.native
  
  /**
    * The percentage of tax rate that applies to the item price.
    */
  var rate: js.UndefOr[Double] = js.native
  
  /**
    * The geographic region to which the tax rate applies.
    */
  var region: js.UndefOr[String] = js.native
  
  /**
    * Set to true if tax is charged on shipping.
    */
  var taxShip: js.UndefOr[Boolean] = js.native
}
object SchemaProductTax {
  
  @scala.inline
  def apply(): SchemaProductTax = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductTax]
  }
  
  @scala.inline
  implicit class SchemaProductTaxOps[Self <: SchemaProductTax] (val x: Self) extends AnyVal {
    
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
    def setLocationId(value: String): Self = this.set("locationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationId: Self = this.set("locationId", js.undefined)
    
    @scala.inline
    def setPostalCode(value: String): Self = this.set("postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostalCode: Self = this.set("postalCode", js.undefined)
    
    @scala.inline
    def setRate(value: Double): Self = this.set("rate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRate: Self = this.set("rate", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setTaxShip(value: Boolean): Self = this.set("taxShip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaxShip: Self = this.set("taxShip", js.undefined)
  }
}
