package typings.googleapis.languageV1beta1Mod.languageV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the feeling associated with the entire text or entities in the
  * text.
  */
@js.native
trait SchemaSentiment extends StObject {
  
  /**
    * A non-negative number in the [0, +inf) range, which represents the
    * absolute magnitude of sentiment regardless of score (positive or
    * negative).
    */
  var magnitude: js.UndefOr[Double] = js.native
  
  /**
    * DEPRECATED FIELD - This field is being deprecated in favor of score.
    * Please refer to our documentation at
    * https://cloud.google.com/natural-language/docs for more information.
    */
  var polarity: js.UndefOr[Double] = js.native
  
  /**
    * Sentiment score between -1.0 (negative sentiment) and 1.0 (positive
    * sentiment).
    */
  var score: js.UndefOr[Double] = js.native
}
object SchemaSentiment {
  
  @scala.inline
  def apply(): SchemaSentiment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSentiment]
  }
  
  @scala.inline
  implicit class SchemaSentimentMutableBuilder[Self <: SchemaSentiment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMagnitude(value: Double): Self = StObject.set(x, "magnitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMagnitudeUndefined: Self = StObject.set(x, "magnitude", js.undefined)
    
    @scala.inline
    def setPolarity(value: Double): Self = StObject.set(x, "polarity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolarityUndefined: Self = StObject.set(x, "polarity", js.undefined)
    
    @scala.inline
    def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
  }
}
