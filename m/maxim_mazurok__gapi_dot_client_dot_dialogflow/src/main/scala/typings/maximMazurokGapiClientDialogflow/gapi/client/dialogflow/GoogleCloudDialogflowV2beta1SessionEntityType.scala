package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2beta1SessionEntityType extends StObject {
  
  /** Required. The collection of entities associated with this session entity type. */
  var entities: js.UndefOr[js.Array[GoogleCloudDialogflowV2beta1EntityTypeEntity]] = js.undefined
  
  /** Required. Indicates whether the additional data should override or supplement the custom entity type definition. */
  var entityOverrideMode: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The unique identifier of this session entity type. Supported formats: - `projects//agent/sessions//entityTypes/` - `projects//locations//agent/sessions//entityTypes/` -
    * `projects//agent/environments//users//sessions//entityTypes/` - `projects//locations//agent/environments/ /users//sessions//entityTypes/` If `Location ID` is not specified we assume
    * default 'us' location. If `Environment ID` is not specified, we assume default 'draft' environment. If `User ID` is not specified, we assume default '-' user. `` must be the display
    * name of an existing entity type in the same agent that will be overridden or supplemented.
    */
  var name: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2beta1SessionEntityType {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2beta1SessionEntityType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1SessionEntityType]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2beta1SessionEntityTypeMutableBuilder[Self <: GoogleCloudDialogflowV2beta1SessionEntityType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntities(value: js.Array[GoogleCloudDialogflowV2beta1EntityTypeEntity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    @scala.inline
    def setEntitiesVarargs(value: GoogleCloudDialogflowV2beta1EntityTypeEntity*): Self = StObject.set(x, "entities", js.Array(value :_*))
    
    @scala.inline
    def setEntityOverrideMode(value: String): Self = StObject.set(x, "entityOverrideMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityOverrideModeUndefined: Self = StObject.set(x, "entityOverrideMode", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
