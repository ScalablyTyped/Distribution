package typings.materialTextfield.adapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MDCTextFieldOutlineAdapter extends js.Object {
  
  /**
    * Only implement if outline element exists.
    * Closes notch in outline element.
    */
  def closeOutline(): Unit = js.native
  
  /**
    * @return true if outline element exists, false if it doesn't.
    */
  def hasOutline(): Boolean = js.native
  
  /**
    * Only implement if outline element exists.
    */
  def notchOutline(labelWidth: Double): Unit = js.native
}
object MDCTextFieldOutlineAdapter {
  
  @scala.inline
  def apply(closeOutline: () => Unit, hasOutline: () => Boolean, notchOutline: Double => Unit): MDCTextFieldOutlineAdapter = {
    val __obj = js.Dynamic.literal(closeOutline = js.Any.fromFunction0(closeOutline), hasOutline = js.Any.fromFunction0(hasOutline), notchOutline = js.Any.fromFunction1(notchOutline))
    __obj.asInstanceOf[MDCTextFieldOutlineAdapter]
  }
  
  @scala.inline
  implicit class MDCTextFieldOutlineAdapterOps[Self <: MDCTextFieldOutlineAdapter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCloseOutline(value: () => Unit): Self = this.set("closeOutline", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasOutline(value: () => Boolean): Self = this.set("hasOutline", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNotchOutline(value: Double => Unit): Self = this.set("notchOutline", js.Any.fromFunction1(value))
  }
}
