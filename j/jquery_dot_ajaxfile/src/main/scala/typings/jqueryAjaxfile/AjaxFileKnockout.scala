package typings.jqueryAjaxfile

import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AjaxFileKnockout {
  
  @js.native
  trait IFileInputWrapper extends StObject {
    
    def fileSelected(): Boolean = js.native
    
    def getElement(): HTMLInputElement = js.native
  }
  object IFileInputWrapper {
    
    @scala.inline
    def apply(fileSelected: () => Boolean, getElement: () => HTMLInputElement): IFileInputWrapper = {
      val __obj = js.Dynamic.literal(fileSelected = js.Any.fromFunction0(fileSelected), getElement = js.Any.fromFunction0(getElement))
      __obj.asInstanceOf[IFileInputWrapper]
    }
    
    @scala.inline
    implicit class IFileInputWrapperMutableBuilder[Self <: IFileInputWrapper] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFileSelected(value: () => Boolean): Self = StObject.set(x, "fileSelected", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetElement(value: () => HTMLInputElement): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
    }
  }
}
