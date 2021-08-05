package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The kinds of value that a cell in a spreadsheet can have.
  */
trait SchemaExtendedValue extends StObject {
  
  /**
    * Represents a boolean value.
    */
  var boolValue: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents an error. This field is read-only.
    */
  var errorValue: js.UndefOr[SchemaErrorValue] = js.undefined
  
  /**
    * Represents a formula.
    */
  var formulaValue: js.UndefOr[String] = js.undefined
  
  /**
    * Represents a double value. Note: Dates, Times and DateTimes are
    * represented as doubles in &quot;serial number&quot; format.
    */
  var numberValue: js.UndefOr[Double] = js.undefined
  
  /**
    * Represents a string value. Leading single quotes are not included. For
    * example, if the user typed `&#39;123` into the UI, this would be
    * represented as a `stringValue` of `&quot;123&quot;`.
    */
  var stringValue: js.UndefOr[String] = js.undefined
}
object SchemaExtendedValue {
  
  inline def apply(): SchemaExtendedValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExtendedValue]
  }
  
  extension [Self <: SchemaExtendedValue](x: Self) {
    
    inline def setBoolValue(value: Boolean): Self = StObject.set(x, "boolValue", value.asInstanceOf[js.Any])
    
    inline def setBoolValueUndefined: Self = StObject.set(x, "boolValue", js.undefined)
    
    inline def setErrorValue(value: SchemaErrorValue): Self = StObject.set(x, "errorValue", value.asInstanceOf[js.Any])
    
    inline def setErrorValueUndefined: Self = StObject.set(x, "errorValue", js.undefined)
    
    inline def setFormulaValue(value: String): Self = StObject.set(x, "formulaValue", value.asInstanceOf[js.Any])
    
    inline def setFormulaValueUndefined: Self = StObject.set(x, "formulaValue", js.undefined)
    
    inline def setNumberValue(value: Double): Self = StObject.set(x, "numberValue", value.asInstanceOf[js.Any])
    
    inline def setNumberValueUndefined: Self = StObject.set(x, "numberValue", js.undefined)
    
    inline def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    inline def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
  }
}
