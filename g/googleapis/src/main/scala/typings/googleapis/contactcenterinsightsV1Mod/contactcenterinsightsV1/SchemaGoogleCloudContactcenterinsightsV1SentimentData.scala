package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudContactcenterinsightsV1SentimentData extends StObject {
  
  /**
    * A non-negative number from 0 to infinity which represents the abolute magnitude of sentiment regardless of score.
    */
  var magnitude: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The sentiment score between -1.0 (negative) and 1.0 (positive).
    */
  var score: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudContactcenterinsightsV1SentimentData {
  
  inline def apply(): SchemaGoogleCloudContactcenterinsightsV1SentimentData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudContactcenterinsightsV1SentimentData]
  }
  
  extension [Self <: SchemaGoogleCloudContactcenterinsightsV1SentimentData](x: Self) {
    
    inline def setMagnitude(value: Double): Self = StObject.set(x, "magnitude", value.asInstanceOf[js.Any])
    
    inline def setMagnitudeNull: Self = StObject.set(x, "magnitude", null)
    
    inline def setMagnitudeUndefined: Self = StObject.set(x, "magnitude", js.undefined)
    
    inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreNull: Self = StObject.set(x, "score", null)
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
  }
}
