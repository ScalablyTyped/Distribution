package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3SessionEntityType extends StObject {
  
  /** Required. The collection of entities to override or supplement the custom entity type. */
  var entities: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3EntityTypeEntity]] = js.undefined
  
  /** Required. Indicates whether the additional data should override or supplement the custom entity type definition. */
  var entityOverrideMode: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The unique identifier of the session entity type. Format: `projects//locations//agents//sessions//entityTypes/` or
    * `projects//locations//agents//environments//sessions//entityTypes/`. If `Environment ID` is not specified, we assume default 'draft' environment.
    */
  var name: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3SessionEntityType {
  
  inline def apply(): GoogleCloudDialogflowCxV3SessionEntityType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3SessionEntityType]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3SessionEntityType](x: Self) {
    
    inline def setEntities(value: js.Array[GoogleCloudDialogflowCxV3EntityTypeEntity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    inline def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    inline def setEntitiesVarargs(value: GoogleCloudDialogflowCxV3EntityTypeEntity*): Self = StObject.set(x, "entities", js.Array(value*))
    
    inline def setEntityOverrideMode(value: String): Self = StObject.set(x, "entityOverrideMode", value.asInstanceOf[js.Any])
    
    inline def setEntityOverrideModeUndefined: Self = StObject.set(x, "entityOverrideMode", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
