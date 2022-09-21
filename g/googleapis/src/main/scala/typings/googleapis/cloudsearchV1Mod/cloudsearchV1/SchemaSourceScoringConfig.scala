package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSourceScoringConfig extends StObject {
  
  /**
    * Importance of the source.
    */
  var sourceImportance: js.UndefOr[String | Null] = js.undefined
}
object SchemaSourceScoringConfig {
  
  inline def apply(): SchemaSourceScoringConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceScoringConfig]
  }
  
  extension [Self <: SchemaSourceScoringConfig](x: Self) {
    
    inline def setSourceImportance(value: String): Self = StObject.set(x, "sourceImportance", value.asInstanceOf[js.Any])
    
    inline def setSourceImportanceNull: Self = StObject.set(x, "sourceImportance", null)
    
    inline def setSourceImportanceUndefined: Self = StObject.set(x, "sourceImportance", js.undefined)
  }
}
