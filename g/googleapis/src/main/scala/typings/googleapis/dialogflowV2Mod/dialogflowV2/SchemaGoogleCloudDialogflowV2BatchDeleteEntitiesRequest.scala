package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request message for EntityTypes.BatchDeleteEntities.
  */
trait SchemaGoogleCloudDialogflowV2BatchDeleteEntitiesRequest extends StObject {
  
  /**
    * Required. The canonical `values` of the entities to delete. Note that
    * these are not fully-qualified names, i.e. they don&#39;t start with
    * `projects/&lt;Project ID&gt;`.
    */
  var entityValues: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Optional. The language of entity synonyms defined in `entities`. If not
    * specified, the agent&#39;s default language is used. [Many
    * languages](https://cloud.google.com/dialogflow-enterprise/docs/reference/language)
    * are supported. Note: languages must be enabled in the agent before they
    * can be used.
    */
  var languageCode: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudDialogflowV2BatchDeleteEntitiesRequest {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2BatchDeleteEntitiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2BatchDeleteEntitiesRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2BatchDeleteEntitiesRequest](x: Self) {
    
    inline def setEntityValues(value: js.Array[String]): Self = StObject.set(x, "entityValues", value.asInstanceOf[js.Any])
    
    inline def setEntityValuesUndefined: Self = StObject.set(x, "entityValues", js.undefined)
    
    inline def setEntityValuesVarargs(value: String*): Self = StObject.set(x, "entityValues", js.Array(value :_*))
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
  }
}
