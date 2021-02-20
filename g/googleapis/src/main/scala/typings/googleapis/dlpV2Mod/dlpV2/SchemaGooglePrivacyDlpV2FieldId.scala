package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * General identifier of a data field in a storage service.
  */
@js.native
trait SchemaGooglePrivacyDlpV2FieldId extends StObject {
  
  /**
    * Name describing the field.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaGooglePrivacyDlpV2FieldId {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2FieldId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2FieldId]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2FieldIdMutableBuilder[Self <: SchemaGooglePrivacyDlpV2FieldId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
