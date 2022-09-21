package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSourceConfig extends StObject {
  
  /**
    * The crowding configuration for the source.
    */
  var crowdingConfig: js.UndefOr[SchemaSourceCrowdingConfig] = js.undefined
  
  /**
    * The scoring configuration for the source.
    */
  var scoringConfig: js.UndefOr[SchemaSourceScoringConfig] = js.undefined
  
  /**
    * The source for which this configuration is to be used.
    */
  var source: js.UndefOr[SchemaSource] = js.undefined
}
object SchemaSourceConfig {
  
  inline def apply(): SchemaSourceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceConfig]
  }
  
  extension [Self <: SchemaSourceConfig](x: Self) {
    
    inline def setCrowdingConfig(value: SchemaSourceCrowdingConfig): Self = StObject.set(x, "crowdingConfig", value.asInstanceOf[js.Any])
    
    inline def setCrowdingConfigUndefined: Self = StObject.set(x, "crowdingConfig", js.undefined)
    
    inline def setScoringConfig(value: SchemaSourceScoringConfig): Self = StObject.set(x, "scoringConfig", value.asInstanceOf[js.Any])
    
    inline def setScoringConfigUndefined: Self = StObject.set(x, "scoringConfig", js.undefined)
    
    inline def setSource(value: SchemaSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
