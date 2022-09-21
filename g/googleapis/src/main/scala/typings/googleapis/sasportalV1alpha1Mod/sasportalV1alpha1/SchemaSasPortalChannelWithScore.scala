package typings.googleapis.sasportalV1alpha1Mod.sasportalV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSasPortalChannelWithScore extends StObject {
  
  /**
    * The frequency range of the channel.
    */
  var frequencyRange: js.UndefOr[SchemaSasPortalFrequencyRange] = js.undefined
  
  /**
    * The channel score, normalized to be in [0,100].
    */
  var score: js.UndefOr[Double | Null] = js.undefined
}
object SchemaSasPortalChannelWithScore {
  
  inline def apply(): SchemaSasPortalChannelWithScore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSasPortalChannelWithScore]
  }
  
  extension [Self <: SchemaSasPortalChannelWithScore](x: Self) {
    
    inline def setFrequencyRange(value: SchemaSasPortalFrequencyRange): Self = StObject.set(x, "frequencyRange", value.asInstanceOf[js.Any])
    
    inline def setFrequencyRangeUndefined: Self = StObject.set(x, "frequencyRange", js.undefined)
    
    inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreNull: Self = StObject.set(x, "score", null)
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
  }
}
