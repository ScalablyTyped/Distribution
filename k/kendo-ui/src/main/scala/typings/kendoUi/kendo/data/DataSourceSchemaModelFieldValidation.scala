package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceSchemaModelFieldValidation
  extends StObject
     with /* index */ StringDictionary[js.Any] {
  
  var max: js.UndefOr[js.Any] = js.undefined
  
  var maxLength: js.UndefOr[js.Any] = js.undefined
  
  var min: js.UndefOr[js.Any] = js.undefined
  
  var minLength: js.UndefOr[js.Any] = js.undefined
  
  var required: js.UndefOr[Boolean] = js.undefined
}
object DataSourceSchemaModelFieldValidation {
  
  @scala.inline
  def apply(): DataSourceSchemaModelFieldValidation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSchemaModelFieldValidation]
  }
  
  @scala.inline
  implicit class DataSourceSchemaModelFieldValidationMutableBuilder[Self <: DataSourceSchemaModelFieldValidation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(value: js.Any): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLength(value: js.Any): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: js.Any): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinLength(value: js.Any): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
  }
}
