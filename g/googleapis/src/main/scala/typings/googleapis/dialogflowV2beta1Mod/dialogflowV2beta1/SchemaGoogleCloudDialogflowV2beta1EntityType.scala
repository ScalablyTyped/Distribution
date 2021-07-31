package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an entity type. Entity types serve as a tool for extracting
  * parameter values from natural language queries.
  */
trait SchemaGoogleCloudDialogflowV2beta1EntityType extends StObject {
  
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
  var entities: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1EntityTypeEntity]] = js.undefined
  
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
object SchemaGoogleCloudDialogflowV2beta1EntityType {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1EntityType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1EntityType]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1EntityTypeMutableBuilder[Self <: SchemaGoogleCloudDialogflowV2beta1EntityType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoExpansionMode(value: String): Self = StObject.set(x, "autoExpansionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoExpansionModeUndefined: Self = StObject.set(x, "autoExpansionMode", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setEntities(value: js.Array[SchemaGoogleCloudDialogflowV2beta1EntityTypeEntity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    @scala.inline
    def setEntitiesVarargs(value: SchemaGoogleCloudDialogflowV2beta1EntityTypeEntity*): Self = StObject.set(x, "entities", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
