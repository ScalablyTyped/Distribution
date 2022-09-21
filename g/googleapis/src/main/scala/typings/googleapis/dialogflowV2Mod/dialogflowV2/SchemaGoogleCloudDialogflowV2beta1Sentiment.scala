package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1Sentiment extends StObject {
  
  /**
    * A non-negative number in the [0, +inf) range, which represents the absolute magnitude of sentiment, regardless of score (positive or negative).
    */
  var magnitude: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Sentiment score between -1.0 (negative sentiment) and 1.0 (positive sentiment).
    */
  var score: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1Sentiment {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1Sentiment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1Sentiment]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1Sentiment](x: Self) {
    
    inline def setMagnitude(value: Double): Self = StObject.set(x, "magnitude", value.asInstanceOf[js.Any])
    
    inline def setMagnitudeNull: Self = StObject.set(x, "magnitude", null)
    
    inline def setMagnitudeUndefined: Self = StObject.set(x, "magnitude", js.undefined)
    
    inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreNull: Self = StObject.set(x, "score", null)
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
  }
}
