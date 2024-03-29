package typings.googleapis.connectorsV2Mod.connectorsV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaField extends StObject {
  
  /**
    * The following map contains fields that are not explicitly mentioned above,this give connectors the flexibility to add new metadata fields.
    */
  var additionalDetails: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * The data type of the Field.
    */
  var dataType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The following field specifies the default value of the Field provided by the external system if a value is not provided.
    */
  var defaultValue: js.UndefOr[Any | Null] = js.undefined
  
  /**
    * A brief description of the Field.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The following boolean field specifies if the current Field acts as a primary key or id if the parent is of type entity.
    */
  var key: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Name of the Field.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies whether a null value is allowed.
    */
  var nullable: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Reference captures the association between two different entity types. Value links to the reference of another entity type.
    */
  var reference: js.UndefOr[SchemaReference] = js.undefined
}
object SchemaField {
  
  inline def apply(): SchemaField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaField]
  }
  
  extension [Self <: SchemaField](x: Self) {
    
    inline def setAdditionalDetails(value: StringDictionary[Any]): Self = StObject.set(x, "additionalDetails", value.asInstanceOf[js.Any])
    
    inline def setAdditionalDetailsNull: Self = StObject.set(x, "additionalDetails", null)
    
    inline def setAdditionalDetailsUndefined: Self = StObject.set(x, "additionalDetails", js.undefined)
    
    inline def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeNull: Self = StObject.set(x, "dataType", null)
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    inline def setDefaultValue(value: Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueNull: Self = StObject.set(x, "defaultValue", null)
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setKey(value: Boolean): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNullable(value: Boolean): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
    
    inline def setNullableNull: Self = StObject.set(x, "nullable", null)
    
    inline def setNullableUndefined: Self = StObject.set(x, "nullable", js.undefined)
    
    inline def setReference(value: SchemaReference): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
  }
}
