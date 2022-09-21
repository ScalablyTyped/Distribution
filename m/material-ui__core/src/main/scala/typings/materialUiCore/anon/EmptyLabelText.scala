package typings.materialUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmptyLabelText extends StObject {
  
  var emptyLabelText: js.UndefOr[String] = js.undefined
  
  var getLabelText: js.UndefOr[js.Function1[/* value */ Double, String]] = js.undefined
}
object EmptyLabelText {
  
  inline def apply(): EmptyLabelText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmptyLabelText]
  }
  
  extension [Self <: EmptyLabelText](x: Self) {
    
    inline def setEmptyLabelText(value: String): Self = StObject.set(x, "emptyLabelText", value.asInstanceOf[js.Any])
    
    inline def setEmptyLabelTextUndefined: Self = StObject.set(x, "emptyLabelText", js.undefined)
    
    inline def setGetLabelText(value: /* value */ Double => String): Self = StObject.set(x, "getLabelText", js.Any.fromFunction1(value))
    
    inline def setGetLabelTextUndefined: Self = StObject.set(x, "getLabelText", js.undefined)
  }
}
