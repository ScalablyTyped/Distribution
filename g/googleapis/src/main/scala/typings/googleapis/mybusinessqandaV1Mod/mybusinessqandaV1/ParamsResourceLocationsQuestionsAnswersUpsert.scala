package typings.googleapis.mybusinessqandaV1Mod.mybusinessqandaV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceLocationsQuestionsAnswersUpsert
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the question to write an answer for.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaUpsertAnswerRequest] = js.undefined
}
object ParamsResourceLocationsQuestionsAnswersUpsert {
  
  inline def apply(): ParamsResourceLocationsQuestionsAnswersUpsert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLocationsQuestionsAnswersUpsert]
  }
  
  extension [Self <: ParamsResourceLocationsQuestionsAnswersUpsert](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaUpsertAnswerRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
