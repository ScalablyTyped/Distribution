package typings.googleapis.retailV2betaMod.retailV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2betaInterval extends StObject {
  
  /**
    * Exclusive upper bound.
    */
  var exclusiveMaximum: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Exclusive lower bound.
    */
  var exclusiveMinimum: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Inclusive upper bound.
    */
  var maximum: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Inclusive lower bound.
    */
  var minimum: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2betaInterval {
  
  inline def apply(): SchemaGoogleCloudRetailV2betaInterval = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2betaInterval]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2betaInterval](x: Self) {
    
    inline def setExclusiveMaximum(value: Double): Self = StObject.set(x, "exclusiveMaximum", value.asInstanceOf[js.Any])
    
    inline def setExclusiveMaximumNull: Self = StObject.set(x, "exclusiveMaximum", null)
    
    inline def setExclusiveMaximumUndefined: Self = StObject.set(x, "exclusiveMaximum", js.undefined)
    
    inline def setExclusiveMinimum(value: Double): Self = StObject.set(x, "exclusiveMinimum", value.asInstanceOf[js.Any])
    
    inline def setExclusiveMinimumNull: Self = StObject.set(x, "exclusiveMinimum", null)
    
    inline def setExclusiveMinimumUndefined: Self = StObject.set(x, "exclusiveMinimum", js.undefined)
    
    inline def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
    
    inline def setMaximumNull: Self = StObject.set(x, "maximum", null)
    
    inline def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
    
    inline def setMinimum(value: Double): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
    
    inline def setMinimumNull: Self = StObject.set(x, "minimum", null)
    
    inline def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
  }
}
