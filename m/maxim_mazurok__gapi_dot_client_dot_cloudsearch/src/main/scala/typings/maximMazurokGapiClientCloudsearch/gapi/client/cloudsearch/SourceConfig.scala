package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceConfig extends StObject {
  
  /** The crowding configuration for the source. */
  var crowdingConfig: js.UndefOr[SourceCrowdingConfig] = js.undefined
  
  /** The scoring configuration for the source. */
  var scoringConfig: js.UndefOr[SourceScoringConfig] = js.undefined
  
  /** The source for which this configuration is to be used. */
  var source: js.UndefOr[Source] = js.undefined
}
object SourceConfig {
  
  inline def apply(): SourceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceConfig]
  }
  
  extension [Self <: SourceConfig](x: Self) {
    
    inline def setCrowdingConfig(value: SourceCrowdingConfig): Self = StObject.set(x, "crowdingConfig", value.asInstanceOf[js.Any])
    
    inline def setCrowdingConfigUndefined: Self = StObject.set(x, "crowdingConfig", js.undefined)
    
    inline def setScoringConfig(value: SourceScoringConfig): Self = StObject.set(x, "scoringConfig", value.asInstanceOf[js.Any])
    
    inline def setScoringConfigUndefined: Self = StObject.set(x, "scoringConfig", js.undefined)
    
    inline def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
