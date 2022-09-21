package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1EntityType extends StObject {
  
  /**
    * Optional. Indicates whether the entity type can be automatically expanded.
    */
  var autoExpansionMode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The name of the entity type.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Enables fuzzy entity extraction during classification.
    */
  var enableFuzzyExtraction: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Optional. The collection of entity entries associated with the entity type.
    */
  var entities: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1EntityTypeEntity]] = js.undefined
  
  /**
    * Required. Indicates the kind of entity type.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unique identifier of the entity type. Required for EntityTypes.UpdateEntityType and EntityTypes.BatchUpdateEntityTypes methods. Supported formats: - `projects//agent/entityTypes/` - `projects//locations//agent/entityTypes/`
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1EntityType {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1EntityType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1EntityType]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1EntityType](x: Self) {
    
    inline def setAutoExpansionMode(value: String): Self = StObject.set(x, "autoExpansionMode", value.asInstanceOf[js.Any])
    
    inline def setAutoExpansionModeNull: Self = StObject.set(x, "autoExpansionMode", null)
    
    inline def setAutoExpansionModeUndefined: Self = StObject.set(x, "autoExpansionMode", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEnableFuzzyExtraction(value: Boolean): Self = StObject.set(x, "enableFuzzyExtraction", value.asInstanceOf[js.Any])
    
    inline def setEnableFuzzyExtractionNull: Self = StObject.set(x, "enableFuzzyExtraction", null)
    
    inline def setEnableFuzzyExtractionUndefined: Self = StObject.set(x, "enableFuzzyExtraction", js.undefined)
    
    inline def setEntities(value: js.Array[SchemaGoogleCloudDialogflowV2beta1EntityTypeEntity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    inline def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    inline def setEntitiesVarargs(value: SchemaGoogleCloudDialogflowV2beta1EntityTypeEntity*): Self = StObject.set(x, "entities", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
