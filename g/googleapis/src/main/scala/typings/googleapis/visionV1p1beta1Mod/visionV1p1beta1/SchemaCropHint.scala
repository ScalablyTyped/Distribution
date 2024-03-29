package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCropHint extends StObject {
  
  /**
    * The bounding polygon for the crop region. The coordinates of the bounding box are in the original image's scale.
    */
  var boundingPoly: js.UndefOr[SchemaBoundingPoly] = js.undefined
  
  /**
    * Confidence of this being a salient region. Range [0, 1].
    */
  var confidence: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Fraction of importance of this salient region with respect to the original image.
    */
  var importanceFraction: js.UndefOr[Double | Null] = js.undefined
}
object SchemaCropHint {
  
  inline def apply(): SchemaCropHint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCropHint]
  }
  
  extension [Self <: SchemaCropHint](x: Self) {
    
    inline def setBoundingPoly(value: SchemaBoundingPoly): Self = StObject.set(x, "boundingPoly", value.asInstanceOf[js.Any])
    
    inline def setBoundingPolyUndefined: Self = StObject.set(x, "boundingPoly", js.undefined)
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceNull: Self = StObject.set(x, "confidence", null)
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    inline def setImportanceFraction(value: Double): Self = StObject.set(x, "importanceFraction", value.asInstanceOf[js.Any])
    
    inline def setImportanceFractionNull: Self = StObject.set(x, "importanceFraction", null)
    
    inline def setImportanceFractionUndefined: Self = StObject.set(x, "importanceFraction", js.undefined)
  }
}
