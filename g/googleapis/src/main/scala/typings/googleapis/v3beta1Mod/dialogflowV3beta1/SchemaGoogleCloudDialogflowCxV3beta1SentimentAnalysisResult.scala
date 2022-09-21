package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1SentimentAnalysisResult extends StObject {
  
  /**
    * A non-negative number in the [0, +inf) range, which represents the absolute magnitude of sentiment, regardless of score (positive or negative).
    */
  var magnitude: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Sentiment score between -1.0 (negative sentiment) and 1.0 (positive sentiment).
    */
  var score: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1SentimentAnalysisResult {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1SentimentAnalysisResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1SentimentAnalysisResult]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1SentimentAnalysisResult](x: Self) {
    
    inline def setMagnitude(value: Double): Self = StObject.set(x, "magnitude", value.asInstanceOf[js.Any])
    
    inline def setMagnitudeNull: Self = StObject.set(x, "magnitude", null)
    
    inline def setMagnitudeUndefined: Self = StObject.set(x, "magnitude", js.undefined)
    
    inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreNull: Self = StObject.set(x, "score", null)
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
  }
}
