package typings.googleapis.mybusinessbusinessinformationV1Mod.mybusinessbusinessinformationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAttributeMetadata extends StObject {
  
  /**
    * If true, the attribute is deprecated and should no longer be used. If deprecated, updating this attribute will not result in an error, but updates will not be saved. At some point after being deprecated, the attribute will be removed entirely and it will become an error.
    */
  var deprecated: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The localized display name for the attribute, if available; otherwise, the English display name.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The localized display name of the group that contains this attribute, if available; otherwise, the English group name. Related attributes are collected into a group and should be displayed together under the heading given here.
    */
  var groupDisplayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unique identifier for the attribute.
    */
  var parent: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If true, the attribute supports multiple values. If false, only a single value should be provided.
    */
  var repeatable: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * For some types of attributes (for example, enums), a list of supported values and corresponding display names for those values is provided.
    */
  var valueMetadata: js.UndefOr[js.Array[SchemaAttributeValueMetadata]] = js.undefined
  
  /**
    * The value type for the attribute. Values set and retrieved should be expected to be of this type.
    */
  var valueType: js.UndefOr[String | Null] = js.undefined
}
object SchemaAttributeMetadata {
  
  inline def apply(): SchemaAttributeMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAttributeMetadata]
  }
  
  extension [Self <: SchemaAttributeMetadata](x: Self) {
    
    inline def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setDeprecatedNull: Self = StObject.set(x, "deprecated", null)
    
    inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setGroupDisplayName(value: String): Self = StObject.set(x, "groupDisplayName", value.asInstanceOf[js.Any])
    
    inline def setGroupDisplayNameNull: Self = StObject.set(x, "groupDisplayName", null)
    
    inline def setGroupDisplayNameUndefined: Self = StObject.set(x, "groupDisplayName", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRepeatable(value: Boolean): Self = StObject.set(x, "repeatable", value.asInstanceOf[js.Any])
    
    inline def setRepeatableNull: Self = StObject.set(x, "repeatable", null)
    
    inline def setRepeatableUndefined: Self = StObject.set(x, "repeatable", js.undefined)
    
    inline def setValueMetadata(value: js.Array[SchemaAttributeValueMetadata]): Self = StObject.set(x, "valueMetadata", value.asInstanceOf[js.Any])
    
    inline def setValueMetadataUndefined: Self = StObject.set(x, "valueMetadata", js.undefined)
    
    inline def setValueMetadataVarargs(value: SchemaAttributeValueMetadata*): Self = StObject.set(x, "valueMetadata", js.Array(value*))
    
    inline def setValueType(value: String): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
    
    inline def setValueTypeNull: Self = StObject.set(x, "valueType", null)
    
    inline def setValueTypeUndefined: Self = StObject.set(x, "valueType", js.undefined)
  }
}
