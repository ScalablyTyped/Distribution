package typings.googleapis.drivelabelsV2Mod.drivelabelsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsDriveLabelsV2FieldUserOptions extends StObject {
  
  /**
    * When specified, indicates that this field supports a list of values. Once the field is published, this cannot be changed.
    */
  var listOptions: js.UndefOr[SchemaGoogleAppsDriveLabelsV2FieldListOptions] = js.undefined
}
object SchemaGoogleAppsDriveLabelsV2FieldUserOptions {
  
  inline def apply(): SchemaGoogleAppsDriveLabelsV2FieldUserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsDriveLabelsV2FieldUserOptions]
  }
  
  extension [Self <: SchemaGoogleAppsDriveLabelsV2FieldUserOptions](x: Self) {
    
    inline def setListOptions(value: SchemaGoogleAppsDriveLabelsV2FieldListOptions): Self = StObject.set(x, "listOptions", value.asInstanceOf[js.Any])
    
    inline def setListOptionsUndefined: Self = StObject.set(x, "listOptions", js.undefined)
  }
}
