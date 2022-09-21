package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2TableOptions extends StObject {
  
  /**
    * The columns that are the primary keys for table objects included in ContentItem. A copy of this cell's value will stored alongside alongside each finding so that the finding can be traced to the specific row it came from. No more than 3 may be provided.
    */
  var identifyingFields: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2FieldId]] = js.undefined
}
object SchemaGooglePrivacyDlpV2TableOptions {
  
  inline def apply(): SchemaGooglePrivacyDlpV2TableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2TableOptions]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2TableOptions](x: Self) {
    
    inline def setIdentifyingFields(value: js.Array[SchemaGooglePrivacyDlpV2FieldId]): Self = StObject.set(x, "identifyingFields", value.asInstanceOf[js.Any])
    
    inline def setIdentifyingFieldsUndefined: Self = StObject.set(x, "identifyingFields", js.undefined)
    
    inline def setIdentifyingFieldsVarargs(value: SchemaGooglePrivacyDlpV2FieldId*): Self = StObject.set(x, "identifyingFields", js.Array(value*))
  }
}
