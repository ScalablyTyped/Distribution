package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionFeaturedProduct extends StObject {
  
  /** The unique identifier for the product item. */
  var offerId: js.UndefOr[String] = js.undefined
  
  /** Required. X-coordinate of the product callout on the Shoppable Image. */
  var x: js.UndefOr[Double] = js.undefined
  
  /** Required. Y-coordinate of the product callout on the Shoppable Image. */
  var y: js.UndefOr[Double] = js.undefined
}
object CollectionFeaturedProduct {
  
  inline def apply(): CollectionFeaturedProduct = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionFeaturedProduct]
  }
  
  extension [Self <: CollectionFeaturedProduct](x: Self) {
    
    inline def setOfferId(value: String): Self = StObject.set(x, "offerId", value.asInstanceOf[js.Any])
    
    inline def setOfferIdUndefined: Self = StObject.set(x, "offerId", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
