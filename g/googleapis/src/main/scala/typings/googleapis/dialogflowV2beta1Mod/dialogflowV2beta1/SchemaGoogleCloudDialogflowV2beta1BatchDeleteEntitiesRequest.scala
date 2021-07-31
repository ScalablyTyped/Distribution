package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request message for EntityTypes.BatchDeleteEntities.
  */
trait SchemaGoogleCloudDialogflowV2beta1BatchDeleteEntitiesRequest extends StObject {
  
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
object SchemaGoogleCloudDialogflowV2beta1BatchDeleteEntitiesRequest {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1BatchDeleteEntitiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1BatchDeleteEntitiesRequest]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1BatchDeleteEntitiesRequestMutableBuilder[Self <: SchemaGoogleCloudDialogflowV2beta1BatchDeleteEntitiesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntityValues(value: js.Array[String]): Self = StObject.set(x, "entityValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityValuesUndefined: Self = StObject.set(x, "entityValues", js.undefined)
    
    @scala.inline
    def setEntityValuesVarargs(value: String*): Self = StObject.set(x, "entityValues", js.Array(value :_*))
    
    @scala.inline
    def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
  }
}
