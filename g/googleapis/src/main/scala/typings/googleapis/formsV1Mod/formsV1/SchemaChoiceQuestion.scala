package typings.googleapis.formsV1Mod.formsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaChoiceQuestion extends StObject {
  
  /**
    * Required. List of options that a respondent must choose from.
    */
  var options: js.UndefOr[js.Array[SchemaOption]] = js.undefined
  
  /**
    * Whether the options should be displayed in random order for different instances of the quiz. This is often used to prevent cheating by respondents who might be looking at another respondent's screen, or to address bias in a survey that might be introduced by always putting the same options first or last.
    */
  var shuffle: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Required. The type of choice question.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaChoiceQuestion {
  
  inline def apply(): SchemaChoiceQuestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChoiceQuestion]
  }
  
  extension [Self <: SchemaChoiceQuestion](x: Self) {
    
    inline def setOptions(value: js.Array[SchemaOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsVarargs(value: SchemaOption*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setShuffle(value: Boolean): Self = StObject.set(x, "shuffle", value.asInstanceOf[js.Any])
    
    inline def setShuffleNull: Self = StObject.set(x, "shuffle", null)
    
    inline def setShuffleUndefined: Self = StObject.set(x, "shuffle", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
