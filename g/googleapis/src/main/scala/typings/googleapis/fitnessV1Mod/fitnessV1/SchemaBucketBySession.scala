package typings.googleapis.fitnessV1Mod.fitnessV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBucketBySession extends StObject {
  
  /**
    * Specifies that only sessions of duration longer than minDurationMillis are considered and used as a container for aggregated data.
    */
  var minDurationMillis: js.UndefOr[String | Null] = js.undefined
}
object SchemaBucketBySession {
  
  inline def apply(): SchemaBucketBySession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBucketBySession]
  }
  
  extension [Self <: SchemaBucketBySession](x: Self) {
    
    inline def setMinDurationMillis(value: String): Self = StObject.set(x, "minDurationMillis", value.asInstanceOf[js.Any])
    
    inline def setMinDurationMillisNull: Self = StObject.set(x, "minDurationMillis", null)
    
    inline def setMinDurationMillisUndefined: Self = StObject.set(x, "minDurationMillis", js.undefined)
  }
}
