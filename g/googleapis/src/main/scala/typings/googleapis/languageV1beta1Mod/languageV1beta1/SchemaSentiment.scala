package typings.googleapis.languageV1beta1Mod.languageV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSentiment extends StObject {
  
  /**
    * A non-negative number in the [0, +inf) range, which represents the absolute magnitude of sentiment regardless of score (positive or negative).
    */
  var magnitude: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * DEPRECATED FIELD - This field is being deprecated in favor of score. Please refer to our documentation at https://cloud.google.com/natural-language/docs for more information.
    */
  var polarity: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Sentiment score between -1.0 (negative sentiment) and 1.0 (positive sentiment).
    */
  var score: js.UndefOr[Double | Null] = js.undefined
}
object SchemaSentiment {
  
  inline def apply(): SchemaSentiment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSentiment]
  }
  
  extension [Self <: SchemaSentiment](x: Self) {
    
    inline def setMagnitude(value: Double): Self = StObject.set(x, "magnitude", value.asInstanceOf[js.Any])
    
    inline def setMagnitudeNull: Self = StObject.set(x, "magnitude", null)
    
    inline def setMagnitudeUndefined: Self = StObject.set(x, "magnitude", js.undefined)
    
    inline def setPolarity(value: Double): Self = StObject.set(x, "polarity", value.asInstanceOf[js.Any])
    
    inline def setPolarityNull: Self = StObject.set(x, "polarity", null)
    
    inline def setPolarityUndefined: Self = StObject.set(x, "polarity", js.undefined)
    
    inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreNull: Self = StObject.set(x, "score", null)
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
  }
}
