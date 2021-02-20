package typings.googleapis.v2Mod.androidpublisherV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaProrate extends StObject {
  
  /**
    * Default price cannot be zero and must be less than the full subscription
    * price. Default price is always in the developer&#39;s Checkout merchant
    * currency. Targeted countries have their prices set automatically based on
    * the default_price.
    */
  var defaultPrice: js.UndefOr[SchemaPrice] = js.native
  
  /**
    * Defines the first day on which the price takes effect.
    */
  var start: js.UndefOr[SchemaMonthDay] = js.native
}
object SchemaProrate {
  
  @scala.inline
  def apply(): SchemaProrate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProrate]
  }
  
  @scala.inline
  implicit class SchemaProrateMutableBuilder[Self <: SchemaProrate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultPrice(value: SchemaPrice): Self = StObject.set(x, "defaultPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPriceUndefined: Self = StObject.set(x, "defaultPrice", js.undefined)
    
    @scala.inline
    def setStart(value: SchemaMonthDay): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
