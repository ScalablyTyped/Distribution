package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Replace each input value with a given `Value`.
  */
@js.native
trait SchemaGooglePrivacyDlpV2ReplaceValueConfig extends StObject {
  
  /**
    * Value to replace it with.
    */
  var newValue: js.UndefOr[SchemaGooglePrivacyDlpV2Value] = js.native
}
object SchemaGooglePrivacyDlpV2ReplaceValueConfig {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2ReplaceValueConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ReplaceValueConfig]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2ReplaceValueConfigMutableBuilder[Self <: SchemaGooglePrivacyDlpV2ReplaceValueConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewValue(value: SchemaGooglePrivacyDlpV2Value): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewValueUndefined: Self = StObject.set(x, "newValue", js.undefined)
  }
}
