package typings.jqueryAjaxfile

import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AjaxFileKnockout {
  
  trait IFileInputWrapper extends StObject {
    
    def fileSelected(): Boolean
    
    def getElement(): HTMLInputElement
  }
  object IFileInputWrapper {
    
    inline def apply(fileSelected: () => Boolean, getElement: () => HTMLInputElement): IFileInputWrapper = {
      val __obj = js.Dynamic.literal(fileSelected = js.Any.fromFunction0(fileSelected), getElement = js.Any.fromFunction0(getElement))
      __obj.asInstanceOf[IFileInputWrapper]
    }
    
    extension [Self <: IFileInputWrapper](x: Self) {
      
      inline def setFileSelected(value: () => Boolean): Self = StObject.set(x, "fileSelected", js.Any.fromFunction0(value))
      
      inline def setGetElement(value: () => HTMLInputElement): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
    }
  }
}
