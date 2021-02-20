package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * User Defined Variable configuration.
  */
@js.native
trait SchemaUserDefinedVariableConfiguration extends StObject {
  
  /**
    * Data type for the variable. This is a required field.
    */
  var dataType: js.UndefOr[String] = js.native
  
  /**
    * User-friendly name for the variable which will appear in reports. This is
    * a required field, must be less than 64 characters long, and cannot
    * contain the following characters: &quot;&quot;&lt;&gt;&quot;.
    */
  var reportName: js.UndefOr[String] = js.native
  
  /**
    * Variable name in the tag. This is a required field.
    */
  var variableType: js.UndefOr[String] = js.native
}
object SchemaUserDefinedVariableConfiguration {
  
  @scala.inline
  def apply(): SchemaUserDefinedVariableConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserDefinedVariableConfiguration]
  }
  
  @scala.inline
  implicit class SchemaUserDefinedVariableConfigurationMutableBuilder[Self <: SchemaUserDefinedVariableConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    @scala.inline
    def setReportName(value: String): Self = StObject.set(x, "reportName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportNameUndefined: Self = StObject.set(x, "reportName", js.undefined)
    
    @scala.inline
    def setVariableType(value: String): Self = StObject.set(x, "variableType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariableTypeUndefined: Self = StObject.set(x, "variableType", js.undefined)
  }
}
