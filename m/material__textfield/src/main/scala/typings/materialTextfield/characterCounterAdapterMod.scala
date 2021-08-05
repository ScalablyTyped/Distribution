package typings.materialTextfield

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object characterCounterAdapterMod {
  
  trait MDCTextFieldCharacterCounterAdapter extends StObject {
    
    /**
      * Sets the text content of character counter element.
      */
    def setContent(content: String): Unit
  }
  object MDCTextFieldCharacterCounterAdapter {
    
    inline def apply(setContent: String => Unit): MDCTextFieldCharacterCounterAdapter = {
      val __obj = js.Dynamic.literal(setContent = js.Any.fromFunction1(setContent))
      __obj.asInstanceOf[MDCTextFieldCharacterCounterAdapter]
    }
    
    extension [Self <: MDCTextFieldCharacterCounterAdapter](x: Self) {
      
      inline def setSetContent(value: String => Unit): Self = StObject.set(x, "setContent", js.Any.fromFunction1(value))
    }
  }
}
