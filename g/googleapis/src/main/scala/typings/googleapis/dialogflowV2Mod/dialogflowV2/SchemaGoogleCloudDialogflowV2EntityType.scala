package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an entity type. Entity types serve as a tool for extracting
  * parameter values from natural language queries.
  */
trait SchemaGoogleCloudDialogflowV2EntityType extends StObject {
  
  /**
    * Optional. Indicates whether the entity type can be automatically
    * expanded.
    */
  var autoExpansionMode: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The name of the entity type.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The collection of entity entries associated with the entity
    * type.
    */
  var entities: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2EntityTypeEntity]] = js.undefined
  
  /**
    * Required. Indicates the kind of entity type.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The unique identifier of the entity type. Required for
    * EntityTypes.UpdateEntityType and EntityTypes.BatchUpdateEntityTypes
    * methods. Format: `projects/&lt;Project
    * ID&gt;/agent/entityTypes/&lt;Entity Type ID&gt;`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudDialogflowV2EntityType {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2EntityType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2EntityType]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2EntityType](x: Self) {
    
    inline def setAutoExpansionMode(value: String): Self = StObject.set(x, "autoExpansionMode", value.asInstanceOf[js.Any])
    
    inline def setAutoExpansionModeUndefined: Self = StObject.set(x, "autoExpansionMode", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEntities(value: js.Array[SchemaGoogleCloudDialogflowV2EntityTypeEntity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    inline def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    inline def setEntitiesVarargs(value: SchemaGoogleCloudDialogflowV2EntityTypeEntity*): Self = StObject.set(x, "entities", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
