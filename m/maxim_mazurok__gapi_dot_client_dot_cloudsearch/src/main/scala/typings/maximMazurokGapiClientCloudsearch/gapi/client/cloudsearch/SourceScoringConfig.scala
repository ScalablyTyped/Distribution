package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceScoringConfig extends StObject {
  
  /** Importance of the source. */
  var sourceImportance: js.UndefOr[String] = js.undefined
}
object SourceScoringConfig {
  
  inline def apply(): SourceScoringConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceScoringConfig]
  }
  
  extension [Self <: SourceScoringConfig](x: Self) {
    
    inline def setSourceImportance(value: String): Self = StObject.set(x, "sourceImportance", value.asInstanceOf[js.Any])
    
    inline def setSourceImportanceUndefined: Self = StObject.set(x, "sourceImportance", js.undefined)
  }
}
