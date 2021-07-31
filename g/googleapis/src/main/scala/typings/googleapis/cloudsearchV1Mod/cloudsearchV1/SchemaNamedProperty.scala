package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A typed name-value pair for structured data.  The type of the value should
  * be the same as the registered type for the `name` property in the object
  * definition of `objectType`.
  */
trait SchemaNamedProperty extends StObject {
  
  var booleanValue: js.UndefOr[Boolean] = js.undefined
  
  var dateValues: js.UndefOr[SchemaDateValues] = js.undefined
  
  var doubleValues: js.UndefOr[SchemaDoubleValues] = js.undefined
  
  var enumValues: js.UndefOr[SchemaEnumValues] = js.undefined
  
  var htmlValues: js.UndefOr[SchemaHtmlValues] = js.undefined
  
  var integerValues: js.UndefOr[SchemaIntegerValues] = js.undefined
  
  /**
    * The name of the property.  This name should correspond to the name of the
    * property that was registered for object definition in the schema. The
    * maximum allowable length for this property is 256 characters.
    */
  var name: js.UndefOr[String] = js.undefined
  
  var objectValues: js.UndefOr[SchemaObjectValues] = js.undefined
  
  var textValues: js.UndefOr[SchemaTextValues] = js.undefined
  
  var timestampValues: js.UndefOr[SchemaTimestampValues] = js.undefined
}
object SchemaNamedProperty {
  
  @scala.inline
  def apply(): SchemaNamedProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNamedProperty]
  }
  
  @scala.inline
  implicit class SchemaNamedPropertyMutableBuilder[Self <: SchemaNamedProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBooleanValue(value: Boolean): Self = StObject.set(x, "booleanValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBooleanValueUndefined: Self = StObject.set(x, "booleanValue", js.undefined)
    
    @scala.inline
    def setDateValues(value: SchemaDateValues): Self = StObject.set(x, "dateValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateValuesUndefined: Self = StObject.set(x, "dateValues", js.undefined)
    
    @scala.inline
    def setDoubleValues(value: SchemaDoubleValues): Self = StObject.set(x, "doubleValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubleValuesUndefined: Self = StObject.set(x, "doubleValues", js.undefined)
    
    @scala.inline
    def setEnumValues(value: SchemaEnumValues): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumValuesUndefined: Self = StObject.set(x, "enumValues", js.undefined)
    
    @scala.inline
    def setHtmlValues(value: SchemaHtmlValues): Self = StObject.set(x, "htmlValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlValuesUndefined: Self = StObject.set(x, "htmlValues", js.undefined)
    
    @scala.inline
    def setIntegerValues(value: SchemaIntegerValues): Self = StObject.set(x, "integerValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegerValuesUndefined: Self = StObject.set(x, "integerValues", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setObjectValues(value: SchemaObjectValues): Self = StObject.set(x, "objectValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectValuesUndefined: Self = StObject.set(x, "objectValues", js.undefined)
    
    @scala.inline
    def setTextValues(value: SchemaTextValues): Self = StObject.set(x, "textValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextValuesUndefined: Self = StObject.set(x, "textValues", js.undefined)
    
    @scala.inline
    def setTimestampValues(value: SchemaTimestampValues): Self = StObject.set(x, "timestampValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampValuesUndefined: Self = StObject.set(x, "timestampValues", js.undefined)
  }
}
