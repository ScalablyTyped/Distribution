package typings.googleapis.documentaiV1Mod.documentaiV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1DocumentSchemaEntityType extends StObject {
  
  /**
    * The entity type that this type is derived from. For now, one and only one should be set.
    */
  var baseTypes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * User defined name for the type.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If specified, lists all the possible values for this entity. This should not be more than a handful of values. If the number of values is \>10 or could change frequently use the `EntityType.value_ontology` field and specify a list of all possible values in a value ontology file.
    */
  var enumValues: js.UndefOr[SchemaGoogleCloudDocumentaiV1DocumentSchemaEntityTypeEnumValues] = js.undefined
  
  /**
    * Name of the type. It must be unique within the schema file and cannot be a 'Common Type'. Besides that we use the following naming conventions: - *use snake_casing* - name matching is case-insensitive - Maximum 64 characters. - Must start with a letter. - Allowed characters: ASCII letters `[a-z0-9_-]`. (For backward compatibility internal infrastructure and tooling can handle any ascii character) - The '/' is sometimes used to denote a property of a type. For example line_item/amount. This convention is deprecated, but will still be honored for backward compatibility.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Describing the nested structure, or composition of an entity.
    */
  var properties: js.UndefOr[js.Array[SchemaGoogleCloudDocumentaiV1DocumentSchemaEntityTypeProperty]] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1DocumentSchemaEntityType {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1DocumentSchemaEntityType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1DocumentSchemaEntityType]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1DocumentSchemaEntityType](x: Self) {
    
    inline def setBaseTypes(value: js.Array[String]): Self = StObject.set(x, "baseTypes", value.asInstanceOf[js.Any])
    
    inline def setBaseTypesNull: Self = StObject.set(x, "baseTypes", null)
    
    inline def setBaseTypesUndefined: Self = StObject.set(x, "baseTypes", js.undefined)
    
    inline def setBaseTypesVarargs(value: String*): Self = StObject.set(x, "baseTypes", js.Array(value*))
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEnumValues(value: SchemaGoogleCloudDocumentaiV1DocumentSchemaEntityTypeEnumValues): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
    
    inline def setEnumValuesUndefined: Self = StObject.set(x, "enumValues", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProperties(value: js.Array[SchemaGoogleCloudDocumentaiV1DocumentSchemaEntityTypeProperty]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setPropertiesVarargs(value: SchemaGoogleCloudDocumentaiV1DocumentSchemaEntityTypeProperty*): Self = StObject.set(x, "properties", js.Array(value*))
  }
}
