package typings.googleapis.formsV1Mod.formsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFileUploadAnswers extends StObject {
  
  /**
    * Output only. All submitted files for a FileUpload question.
    */
  var answers: js.UndefOr[js.Array[SchemaFileUploadAnswer]] = js.undefined
}
object SchemaFileUploadAnswers {
  
  inline def apply(): SchemaFileUploadAnswers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFileUploadAnswers]
  }
  
  extension [Self <: SchemaFileUploadAnswers](x: Self) {
    
    inline def setAnswers(value: js.Array[SchemaFileUploadAnswer]): Self = StObject.set(x, "answers", value.asInstanceOf[js.Any])
    
    inline def setAnswersUndefined: Self = StObject.set(x, "answers", js.undefined)
    
    inline def setAnswersVarargs(value: SchemaFileUploadAnswer*): Self = StObject.set(x, "answers", js.Array(value*))
  }
}
