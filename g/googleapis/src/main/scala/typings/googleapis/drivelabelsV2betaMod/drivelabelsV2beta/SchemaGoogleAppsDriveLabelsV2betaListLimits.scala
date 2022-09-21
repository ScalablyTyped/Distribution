package typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsDriveLabelsV2betaListLimits extends StObject {
  
  /**
    * Maximum number of values allowed for the Field type.
    */
  var maxEntries: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleAppsDriveLabelsV2betaListLimits {
  
  inline def apply(): SchemaGoogleAppsDriveLabelsV2betaListLimits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsDriveLabelsV2betaListLimits]
  }
  
  extension [Self <: SchemaGoogleAppsDriveLabelsV2betaListLimits](x: Self) {
    
    inline def setMaxEntries(value: Double): Self = StObject.set(x, "maxEntries", value.asInstanceOf[js.Any])
    
    inline def setMaxEntriesNull: Self = StObject.set(x, "maxEntries", null)
    
    inline def setMaxEntriesUndefined: Self = StObject.set(x, "maxEntries", js.undefined)
  }
}
