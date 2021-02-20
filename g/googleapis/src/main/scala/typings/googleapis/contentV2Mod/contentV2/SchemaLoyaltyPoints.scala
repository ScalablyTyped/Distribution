package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaLoyaltyPoints extends StObject {
  
  /**
    * Name of loyalty points program. It is recommended to limit the name to 12
    * full-width characters or 24 Roman characters.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The retailer&#39;s loyalty points in absolute value.
    */
  var pointsValue: js.UndefOr[String] = js.native
  
  /**
    * The ratio of a point when converted to currency. Google assumes currency
    * based on Merchant Center settings. If ratio is left out, it defaults
    * to 1.0.
    */
  var ratio: js.UndefOr[Double] = js.native
}
object SchemaLoyaltyPoints {
  
  @scala.inline
  def apply(): SchemaLoyaltyPoints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLoyaltyPoints]
  }
  
  @scala.inline
  implicit class SchemaLoyaltyPointsMutableBuilder[Self <: SchemaLoyaltyPoints] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPointsValue(value: String): Self = StObject.set(x, "pointsValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsValueUndefined: Self = StObject.set(x, "pointsValue", js.undefined)
    
    @scala.inline
    def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
  }
}
