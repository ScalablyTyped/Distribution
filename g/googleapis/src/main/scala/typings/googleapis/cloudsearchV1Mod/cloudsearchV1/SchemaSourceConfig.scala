package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configurations for a source while processing a Search or Suggest request.
  */
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
  
  @scala.inline
  def apply(): SchemaSourceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceConfig]
  }
  
  @scala.inline
  implicit class SchemaSourceConfigMutableBuilder[Self <: SchemaSourceConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCrowdingConfig(value: SchemaSourceCrowdingConfig): Self = StObject.set(x, "crowdingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrowdingConfigUndefined: Self = StObject.set(x, "crowdingConfig", js.undefined)
    
    @scala.inline
    def setScoringConfig(value: SchemaSourceScoringConfig): Self = StObject.set(x, "scoringConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoringConfigUndefined: Self = StObject.set(x, "scoringConfig", js.undefined)
    
    @scala.inline
    def setSource(value: SchemaSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
