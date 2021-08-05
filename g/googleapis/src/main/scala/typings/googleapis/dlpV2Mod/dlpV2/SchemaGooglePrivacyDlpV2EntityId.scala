package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An entity in a dataset is a field or set of fields that correspond to a
  * single person. For example, in medical records the `EntityId` might be a
  * patient identifier, or for financial records it might be an account
  * identifier. This message is used when generalizations or analysis must take
  * into account that multiple rows correspond to the same entity.
  */
trait SchemaGooglePrivacyDlpV2EntityId extends StObject {
  
  /**
    * Composite key indicating which field contains the entity identifier.
    */
  var field: js.UndefOr[SchemaGooglePrivacyDlpV2FieldId] = js.undefined
}
object SchemaGooglePrivacyDlpV2EntityId {
  
  inline def apply(): SchemaGooglePrivacyDlpV2EntityId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2EntityId]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2EntityId](x: Self) {
    
    inline def setField(value: SchemaGooglePrivacyDlpV2FieldId): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
  }
}
