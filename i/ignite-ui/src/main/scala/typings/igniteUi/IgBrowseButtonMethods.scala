package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgBrowseButtonMethods extends StObject {
  
  def attachFilePicker(e: js.Object, isHidden: js.Object): Unit = js.native
  
  /**
    * $(".selector").igUpload("destroy");
    */
  def destroy(): Unit = js.native
  
  def getFilePicker(): Unit = js.native
}
object IgBrowseButtonMethods {
  
  @scala.inline
  def apply(attachFilePicker: (js.Object, js.Object) => Unit, destroy: () => Unit, getFilePicker: () => Unit): IgBrowseButtonMethods = {
    val __obj = js.Dynamic.literal(attachFilePicker = js.Any.fromFunction2(attachFilePicker), destroy = js.Any.fromFunction0(destroy), getFilePicker = js.Any.fromFunction0(getFilePicker))
    __obj.asInstanceOf[IgBrowseButtonMethods]
  }
  
  @scala.inline
  implicit class IgBrowseButtonMethodsMutableBuilder[Self <: IgBrowseButtonMethods] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachFilePicker(value: (js.Object, js.Object) => Unit): Self = StObject.set(x, "attachFilePicker", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFilePicker(value: () => Unit): Self = StObject.set(x, "getFilePicker", js.Any.fromFunction0(value))
  }
}
