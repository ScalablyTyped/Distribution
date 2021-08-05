package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2BatchDeleteEntitiesRequest extends StObject {
  
  /** Required. The reference `values` of the entities to delete. Note that these are not fully-qualified names, i.e. they don't start with `projects/`. */
  var entityValues: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Optional. The language used to access language-specific data. If not specified, the agent's default language is used. For more information, see [Multilingual intent and entity
    * data](https://cloud.google.com/dialogflow/docs/agents-multilingual#intent-entity).
    */
  var languageCode: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2BatchDeleteEntitiesRequest {
  
  inline def apply(): GoogleCloudDialogflowV2BatchDeleteEntitiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2BatchDeleteEntitiesRequest]
  }
  
  extension [Self <: GoogleCloudDialogflowV2BatchDeleteEntitiesRequest](x: Self) {
    
    inline def setEntityValues(value: js.Array[String]): Self = StObject.set(x, "entityValues", value.asInstanceOf[js.Any])
    
    inline def setEntityValuesUndefined: Self = StObject.set(x, "entityValues", js.undefined)
    
    inline def setEntityValuesVarargs(value: String*): Self = StObject.set(x, "entityValues", js.Array(value :_*))
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
  }
}
