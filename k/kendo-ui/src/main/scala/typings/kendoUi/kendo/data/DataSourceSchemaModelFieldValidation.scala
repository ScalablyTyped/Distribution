package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceSchemaModelFieldValidation
  extends StObject
     with /* index */ StringDictionary[Any] {
  
  var max: js.UndefOr[Any] = js.undefined
  
  var maxLength: js.UndefOr[Any] = js.undefined
  
  var min: js.UndefOr[Any] = js.undefined
  
  var minLength: js.UndefOr[Any] = js.undefined
  
  var required: js.UndefOr[Boolean] = js.undefined
}
object DataSourceSchemaModelFieldValidation {
  
  inline def apply(): DataSourceSchemaModelFieldValidation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSchemaModelFieldValidation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataSourceSchemaModelFieldValidation] (val x: Self) extends AnyVal {
    
    inline def setMax(value: Any): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxLength(value: Any): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Any): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinLength(value: Any): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
  }
}
