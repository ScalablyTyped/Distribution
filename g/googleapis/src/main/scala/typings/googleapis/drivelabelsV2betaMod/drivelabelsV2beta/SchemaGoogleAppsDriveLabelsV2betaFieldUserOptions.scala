package typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsDriveLabelsV2betaFieldUserOptions extends StObject {
  
  /**
    * When specified, indicates that this field supports a list of values. Once the field is published, this cannot be changed.
    */
  var listOptions: js.UndefOr[SchemaGoogleAppsDriveLabelsV2betaFieldListOptions] = js.undefined
}
object SchemaGoogleAppsDriveLabelsV2betaFieldUserOptions {
  
  inline def apply(): SchemaGoogleAppsDriveLabelsV2betaFieldUserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsDriveLabelsV2betaFieldUserOptions]
  }
  
  extension [Self <: SchemaGoogleAppsDriveLabelsV2betaFieldUserOptions](x: Self) {
    
    inline def setListOptions(value: SchemaGoogleAppsDriveLabelsV2betaFieldListOptions): Self = StObject.set(x, "listOptions", value.asInstanceOf[js.Any])
    
    inline def setListOptionsUndefined: Self = StObject.set(x, "listOptions", js.undefined)
  }
}
