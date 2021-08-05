package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2SessionEntityType extends StObject {
  
  /** Required. The collection of entities associated with this session entity type. */
  var entities: js.UndefOr[js.Array[GoogleCloudDialogflowV2EntityTypeEntity]] = js.undefined
  
  /** Required. Indicates whether the additional data should override or supplement the custom entity type definition. */
  var entityOverrideMode: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The unique identifier of this session entity type. Format: `projects//agent/sessions//entityTypes/`, or `projects//agent/environments//users//sessions//entityTypes/`. If
    * `Environment ID` is not specified, we assume default 'draft' environment. If `User ID` is not specified, we assume default '-' user. `` must be the display name of an existing
    * entity type in the same agent that will be overridden or supplemented.
    */
  var name: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2SessionEntityType {
  
  inline def apply(): GoogleCloudDialogflowV2SessionEntityType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2SessionEntityType]
  }
  
  extension [Self <: GoogleCloudDialogflowV2SessionEntityType](x: Self) {
    
    inline def setEntities(value: js.Array[GoogleCloudDialogflowV2EntityTypeEntity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    inline def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    inline def setEntitiesVarargs(value: GoogleCloudDialogflowV2EntityTypeEntity*): Self = StObject.set(x, "entities", js.Array(value :_*))
    
    inline def setEntityOverrideMode(value: String): Self = StObject.set(x, "entityOverrideMode", value.asInstanceOf[js.Any])
    
    inline def setEntityOverrideModeUndefined: Self = StObject.set(x, "entityOverrideMode", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
