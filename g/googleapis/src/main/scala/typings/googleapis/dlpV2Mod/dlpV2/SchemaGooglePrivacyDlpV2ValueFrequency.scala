package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A value of a field, including its frequency.
  */
@js.native
trait SchemaGooglePrivacyDlpV2ValueFrequency extends StObject {
  
  /**
    * How many times the value is contained in the field.
    */
  var count: js.UndefOr[String] = js.native
  
  /**
    * A value contained in the field in question.
    */
  var value: js.UndefOr[SchemaGooglePrivacyDlpV2Value] = js.native
}
object SchemaGooglePrivacyDlpV2ValueFrequency {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2ValueFrequency = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ValueFrequency]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2ValueFrequencyMutableBuilder[Self <: SchemaGooglePrivacyDlpV2ValueFrequency] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setValue(value: SchemaGooglePrivacyDlpV2Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
