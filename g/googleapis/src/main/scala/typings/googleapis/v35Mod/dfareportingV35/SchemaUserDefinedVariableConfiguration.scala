package typings.googleapis.v35Mod.dfareportingV35

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUserDefinedVariableConfiguration extends StObject {
  
  /**
    * Data type for the variable. This is a required field.
    */
  var dataType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User-friendly name for the variable which will appear in reports. This is a required field, must be less than 64 characters long, and cannot contain the following characters: ""<\>".
    */
  var reportName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Variable name in the tag. This is a required field.
    */
  var variableType: js.UndefOr[String | Null] = js.undefined
}
object SchemaUserDefinedVariableConfiguration {
  
  inline def apply(): SchemaUserDefinedVariableConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserDefinedVariableConfiguration]
  }
  
  extension [Self <: SchemaUserDefinedVariableConfiguration](x: Self) {
    
    inline def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeNull: Self = StObject.set(x, "dataType", null)
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    inline def setReportName(value: String): Self = StObject.set(x, "reportName", value.asInstanceOf[js.Any])
    
    inline def setReportNameNull: Self = StObject.set(x, "reportName", null)
    
    inline def setReportNameUndefined: Self = StObject.set(x, "reportName", js.undefined)
    
    inline def setVariableType(value: String): Self = StObject.set(x, "variableType", value.asInstanceOf[js.Any])
    
    inline def setVariableTypeNull: Self = StObject.set(x, "variableType", null)
    
    inline def setVariableTypeUndefined: Self = StObject.set(x, "variableType", js.undefined)
  }
}
