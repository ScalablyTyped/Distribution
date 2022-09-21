package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCollectionFeaturedProduct extends StObject {
  
  /**
    * The unique identifier for the product item.
    */
  var offerId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. X-coordinate of the product callout on the Shoppable Image.
    */
  var x: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Required. Y-coordinate of the product callout on the Shoppable Image.
    */
  var y: js.UndefOr[Double | Null] = js.undefined
}
object SchemaCollectionFeaturedProduct {
  
  inline def apply(): SchemaCollectionFeaturedProduct = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCollectionFeaturedProduct]
  }
  
  extension [Self <: SchemaCollectionFeaturedProduct](x: Self) {
    
    inline def setOfferId(value: String): Self = StObject.set(x, "offerId", value.asInstanceOf[js.Any])
    
    inline def setOfferIdNull: Self = StObject.set(x, "offerId", null)
    
    inline def setOfferIdUndefined: Self = StObject.set(x, "offerId", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXNull: Self = StObject.set(x, "x", null)
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYNull: Self = StObject.set(x, "y", null)
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
