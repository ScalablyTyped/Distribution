package typings.googleapis.formsV1Mod.formsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaQuizSettings extends StObject {
  
  /**
    * Whether this form is a quiz or not. When true, responses are graded based on question Grading. Upon setting to false, all question Grading is deleted.
    */
  var isQuiz: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaQuizSettings {
  
  inline def apply(): SchemaQuizSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQuizSettings]
  }
  
  extension [Self <: SchemaQuizSettings](x: Self) {
    
    inline def setIsQuiz(value: Boolean): Self = StObject.set(x, "isQuiz", value.asInstanceOf[js.Any])
    
    inline def setIsQuizNull: Self = StObject.set(x, "isQuiz", null)
    
    inline def setIsQuizUndefined: Self = StObject.set(x, "isQuiz", js.undefined)
  }
}
