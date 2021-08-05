package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgBrowseButtonMethods extends StObject {
  
  def attachFilePicker(e: js.Object, isHidden: js.Object): Unit
  
  /**
    * $(".selector").igUpload("destroy");
    */
  def destroy(): Unit
  
  def getFilePicker(): Unit
}
object IgBrowseButtonMethods {
  
  inline def apply(attachFilePicker: (js.Object, js.Object) => Unit, destroy: () => Unit, getFilePicker: () => Unit): IgBrowseButtonMethods = {
    val __obj = js.Dynamic.literal(attachFilePicker = js.Any.fromFunction2(attachFilePicker), destroy = js.Any.fromFunction0(destroy), getFilePicker = js.Any.fromFunction0(getFilePicker))
    __obj.asInstanceOf[IgBrowseButtonMethods]
  }
  
  extension [Self <: IgBrowseButtonMethods](x: Self) {
    
    inline def setAttachFilePicker(value: (js.Object, js.Object) => Unit): Self = StObject.set(x, "attachFilePicker", js.Any.fromFunction2(value))
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setGetFilePicker(value: () => Unit): Self = StObject.set(x, "getFilePicker", js.Any.fromFunction0(value))
  }
}
