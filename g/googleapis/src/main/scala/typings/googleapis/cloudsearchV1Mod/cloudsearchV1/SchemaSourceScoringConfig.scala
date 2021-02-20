package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Set the scoring configuration. This allows modifying the ranking of results
  * for a source.
  */
@js.native
trait SchemaSourceScoringConfig extends StObject {
  
  /**
    * Importance of the source.
    */
  var sourceImportance: js.UndefOr[String] = js.native
}
object SchemaSourceScoringConfig {
  
  @scala.inline
  def apply(): SchemaSourceScoringConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceScoringConfig]
  }
  
  @scala.inline
  implicit class SchemaSourceScoringConfigMutableBuilder[Self <: SchemaSourceScoringConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSourceImportance(value: String): Self = StObject.set(x, "sourceImportance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceImportanceUndefined: Self = StObject.set(x, "sourceImportance", js.undefined)
  }
}
