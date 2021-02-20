package typings.googleapis.cloudtraceV2Mod.cloudtraceV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The allowed types for [VALUE] in a `[KEY]:[VALUE]` attribute.
  */
@js.native
trait SchemaAttributeValue extends StObject {
  
  /**
    * A Boolean value represented by `true` or `false`.
    */
  var boolValue: js.UndefOr[Boolean] = js.native
  
  /**
    * A 64-bit signed integer.
    */
  var intValue: js.UndefOr[String] = js.native
  
  /**
    * A string up to 256 bytes long.
    */
  var stringValue: js.UndefOr[SchemaTruncatableString] = js.native
}
object SchemaAttributeValue {
  
  @scala.inline
  def apply(): SchemaAttributeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAttributeValue]
  }
  
  @scala.inline
  implicit class SchemaAttributeValueMutableBuilder[Self <: SchemaAttributeValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoolValue(value: Boolean): Self = StObject.set(x, "boolValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoolValueUndefined: Self = StObject.set(x, "boolValue", js.undefined)
    
    @scala.inline
    def setIntValue(value: String): Self = StObject.set(x, "intValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntValueUndefined: Self = StObject.set(x, "intValue", js.undefined)
    
    @scala.inline
    def setStringValue(value: SchemaTruncatableString): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
  }
}
