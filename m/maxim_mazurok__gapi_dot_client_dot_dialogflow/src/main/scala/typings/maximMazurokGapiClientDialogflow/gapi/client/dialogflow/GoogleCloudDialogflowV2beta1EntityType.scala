package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2beta1EntityType extends StObject {
  
  /** Optional. Indicates whether the entity type can be automatically expanded. */
  var autoExpansionMode: js.UndefOr[String] = js.undefined
  
  /** Required. The name of the entity type. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Optional. Enables fuzzy entity extraction during classification. */
  var enableFuzzyExtraction: js.UndefOr[Boolean] = js.undefined
  
  /** Optional. The collection of entity entries associated with the entity type. */
  var entities: js.UndefOr[js.Array[GoogleCloudDialogflowV2beta1EntityTypeEntity]] = js.undefined
  
  /** Required. Indicates the kind of entity type. */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The unique identifier of the entity type. Required for EntityTypes.UpdateEntityType and EntityTypes.BatchUpdateEntityTypes methods. Supported formats: -
    * `projects//agent/entityTypes/` - `projects//locations//agent/entityTypes/`
    */
  var name: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2beta1EntityType {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2beta1EntityType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1EntityType]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2beta1EntityTypeMutableBuilder[Self <: GoogleCloudDialogflowV2beta1EntityType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoExpansionMode(value: String): Self = StObject.set(x, "autoExpansionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoExpansionModeUndefined: Self = StObject.set(x, "autoExpansionMode", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setEnableFuzzyExtraction(value: Boolean): Self = StObject.set(x, "enableFuzzyExtraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableFuzzyExtractionUndefined: Self = StObject.set(x, "enableFuzzyExtraction", js.undefined)
    
    @scala.inline
    def setEntities(value: js.Array[GoogleCloudDialogflowV2beta1EntityTypeEntity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    @scala.inline
    def setEntitiesVarargs(value: GoogleCloudDialogflowV2beta1EntityTypeEntity*): Self = StObject.set(x, "entities", js.Array(value :_*))
    
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
