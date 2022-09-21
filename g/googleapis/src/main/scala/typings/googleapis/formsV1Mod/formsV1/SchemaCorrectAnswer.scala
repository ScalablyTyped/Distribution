package typings.googleapis.formsV1Mod.formsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCorrectAnswer extends StObject {
  
  /**
    * Required. The correct answer value. See the documentation for TextAnswer.value for details on how various value types are formatted.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaCorrectAnswer {
  
  inline def apply(): SchemaCorrectAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCorrectAnswer]
  }
  
  extension [Self <: SchemaCorrectAnswer](x: Self) {
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
