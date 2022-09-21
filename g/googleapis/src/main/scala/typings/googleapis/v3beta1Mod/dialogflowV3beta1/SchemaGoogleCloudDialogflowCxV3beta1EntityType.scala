package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1EntityType extends StObject {
  
  /**
    * Indicates whether the entity type can be automatically expanded.
    */
  var autoExpansionMode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The human-readable name of the entity type, unique within the agent.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Enables fuzzy entity extraction during classification.
    */
  var enableFuzzyExtraction: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The collection of entity entries associated with the entity type.
    */
  var entities: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowCxV3beta1EntityTypeEntity]] = js.undefined
  
  /**
    * Collection of exceptional words and phrases that shouldn't be matched. For example, if you have a size entity type with entry `giant`(an adjective), you might consider adding `giants`(a noun) as an exclusion. If the kind of entity type is `KIND_MAP`, then the phrases specified by entities and excluded phrases should be mutually exclusive.
    */
  var excludedPhrases: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowCxV3beta1EntityTypeExcludedPhrase]] = js.undefined
  
  /**
    * Required. Indicates the kind of entity type.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unique identifier of the entity type. Required for EntityTypes.UpdateEntityType. Format: `projects//locations//agents//entityTypes/`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates whether parameters of the entity type should be redacted in log. If redaction is enabled, page parameters and intent parameters referring to the entity type will be replaced by parameter name during logging.
    */
  var redact: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1EntityType {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1EntityType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1EntityType]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1EntityType](x: Self) {
    
    inline def setAutoExpansionMode(value: String): Self = StObject.set(x, "autoExpansionMode", value.asInstanceOf[js.Any])
    
    inline def setAutoExpansionModeNull: Self = StObject.set(x, "autoExpansionMode", null)
    
    inline def setAutoExpansionModeUndefined: Self = StObject.set(x, "autoExpansionMode", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEnableFuzzyExtraction(value: Boolean): Self = StObject.set(x, "enableFuzzyExtraction", value.asInstanceOf[js.Any])
    
    inline def setEnableFuzzyExtractionNull: Self = StObject.set(x, "enableFuzzyExtraction", null)
    
    inline def setEnableFuzzyExtractionUndefined: Self = StObject.set(x, "enableFuzzyExtraction", js.undefined)
    
    inline def setEntities(value: js.Array[SchemaGoogleCloudDialogflowCxV3beta1EntityTypeEntity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    inline def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    inline def setEntitiesVarargs(value: SchemaGoogleCloudDialogflowCxV3beta1EntityTypeEntity*): Self = StObject.set(x, "entities", js.Array(value*))
    
    inline def setExcludedPhrases(value: js.Array[SchemaGoogleCloudDialogflowCxV3beta1EntityTypeExcludedPhrase]): Self = StObject.set(x, "excludedPhrases", value.asInstanceOf[js.Any])
    
    inline def setExcludedPhrasesUndefined: Self = StObject.set(x, "excludedPhrases", js.undefined)
    
    inline def setExcludedPhrasesVarargs(value: SchemaGoogleCloudDialogflowCxV3beta1EntityTypeExcludedPhrase*): Self = StObject.set(x, "excludedPhrases", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRedact(value: Boolean): Self = StObject.set(x, "redact", value.asInstanceOf[js.Any])
    
    inline def setRedactNull: Self = StObject.set(x, "redact", null)
    
    inline def setRedactUndefined: Self = StObject.set(x, "redact", js.undefined)
  }
}
