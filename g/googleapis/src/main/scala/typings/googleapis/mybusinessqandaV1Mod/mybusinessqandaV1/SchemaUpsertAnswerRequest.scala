package typings.googleapis.mybusinessqandaV1Mod.mybusinessqandaV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpsertAnswerRequest extends StObject {
  
  /**
    * Required. The new answer.
    */
  var answer: js.UndefOr[SchemaAnswer] = js.undefined
}
object SchemaUpsertAnswerRequest {
  
  inline def apply(): SchemaUpsertAnswerRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpsertAnswerRequest]
  }
  
  extension [Self <: SchemaUpsertAnswerRequest](x: Self) {
    
    inline def setAnswer(value: SchemaAnswer): Self = StObject.set(x, "answer", value.asInstanceOf[js.Any])
    
    inline def setAnswerUndefined: Self = StObject.set(x, "answer", js.undefined)
  }
}
