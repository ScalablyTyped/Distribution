package typings.googleapis.drivelabelsV2Mod.drivelabelsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsDriveLabelsV2LabelAppliedLabelPolicy extends StObject {
  
  /**
    * Indicates how the applied label and field values should be copied when a Drive item is copied.
    */
  var copyMode: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAppsDriveLabelsV2LabelAppliedLabelPolicy {
  
  inline def apply(): SchemaGoogleAppsDriveLabelsV2LabelAppliedLabelPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsDriveLabelsV2LabelAppliedLabelPolicy]
  }
  
  extension [Self <: SchemaGoogleAppsDriveLabelsV2LabelAppliedLabelPolicy](x: Self) {
    
    inline def setCopyMode(value: String): Self = StObject.set(x, "copyMode", value.asInstanceOf[js.Any])
    
    inline def setCopyModeNull: Self = StObject.set(x, "copyMode", null)
    
    inline def setCopyModeUndefined: Self = StObject.set(x, "copyMode", js.undefined)
  }
}
