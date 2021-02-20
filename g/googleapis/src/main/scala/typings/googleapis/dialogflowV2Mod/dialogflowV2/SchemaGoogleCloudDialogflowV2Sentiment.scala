package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The sentiment, such as positive/negative feeling or association, for a unit
  * of analysis, such as the query text.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2Sentiment extends StObject {
  
  /**
    * A non-negative number in the [0, +inf) range, which represents the
    * absolute magnitude of sentiment, regardless of score (positive or
    * negative).
    */
  var magnitude: js.UndefOr[Double] = js.native
  
  /**
    * Sentiment score between -1.0 (negative sentiment) and 1.0 (positive
    * sentiment).
    */
  var score: js.UndefOr[Double] = js.native
}
object SchemaGoogleCloudDialogflowV2Sentiment {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2Sentiment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2Sentiment]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2SentimentMutableBuilder[Self <: SchemaGoogleCloudDialogflowV2Sentiment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMagnitude(value: Double): Self = StObject.set(x, "magnitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMagnitudeUndefined: Self = StObject.set(x, "magnitude", js.undefined)
    
    @scala.inline
    def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
  }
}
