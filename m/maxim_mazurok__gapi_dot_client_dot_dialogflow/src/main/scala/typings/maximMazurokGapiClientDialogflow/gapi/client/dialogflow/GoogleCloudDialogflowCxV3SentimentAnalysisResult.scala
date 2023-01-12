package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3SentimentAnalysisResult extends StObject {
  
  /** A non-negative number in the [0, +inf) range, which represents the absolute magnitude of sentiment, regardless of score (positive or negative). */
  var magnitude: js.UndefOr[Double] = js.undefined
  
  /** Sentiment score between -1.0 (negative sentiment) and 1.0 (positive sentiment). */
  var score: js.UndefOr[Double] = js.undefined
}
object GoogleCloudDialogflowCxV3SentimentAnalysisResult {
  
  inline def apply(): GoogleCloudDialogflowCxV3SentimentAnalysisResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3SentimentAnalysisResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowCxV3SentimentAnalysisResult] (val x: Self) extends AnyVal {
    
    inline def setMagnitude(value: Double): Self = StObject.set(x, "magnitude", value.asInstanceOf[js.Any])
    
    inline def setMagnitudeUndefined: Self = StObject.set(x, "magnitude", js.undefined)
    
    inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
  }
}
