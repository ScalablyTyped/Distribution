package typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsDriveLabelsV2betaFieldListOptions extends StObject {
  
  /**
    * Maximum number of entries permitted.
    */
  var maxEntries: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleAppsDriveLabelsV2betaFieldListOptions {
  
  inline def apply(): SchemaGoogleAppsDriveLabelsV2betaFieldListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsDriveLabelsV2betaFieldListOptions]
  }
  
  extension [Self <: SchemaGoogleAppsDriveLabelsV2betaFieldListOptions](x: Self) {
    
    inline def setMaxEntries(value: Double): Self = StObject.set(x, "maxEntries", value.asInstanceOf[js.Any])
    
    inline def setMaxEntriesNull: Self = StObject.set(x, "maxEntries", null)
    
    inline def setMaxEntriesUndefined: Self = StObject.set(x, "maxEntries", js.undefined)
  }
}
