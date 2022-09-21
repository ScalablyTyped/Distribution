package typings.googleapis.drivelabelsV2Mod.drivelabelsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsDriveLabelsV2FieldListOptions extends StObject {
  
  /**
    * Maximum number of entries permitted.
    */
  var maxEntries: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleAppsDriveLabelsV2FieldListOptions {
  
  inline def apply(): SchemaGoogleAppsDriveLabelsV2FieldListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsDriveLabelsV2FieldListOptions]
  }
  
  extension [Self <: SchemaGoogleAppsDriveLabelsV2FieldListOptions](x: Self) {
    
    inline def setMaxEntries(value: Double): Self = StObject.set(x, "maxEntries", value.asInstanceOf[js.Any])
    
    inline def setMaxEntriesNull: Self = StObject.set(x, "maxEntries", null)
    
    inline def setMaxEntriesUndefined: Self = StObject.set(x, "maxEntries", js.undefined)
  }
}
