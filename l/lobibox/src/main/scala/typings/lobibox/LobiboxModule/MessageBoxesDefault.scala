package typings.lobibox.LobiboxModule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageBoxesDefault extends js.Object {
  
  var baseClass: js.UndefOr[String] = js.native
  
  // when messagebox remove method is called but before it is actually hidden
  var beforeClose: js.UndefOr[js.Function1[/* lobibox */ js.Any, Unit]] = js.native
  
  var buttonsAlign: js.UndefOr[String] = js.native
  
    // Height is automatically given calculated by width
  var closeButton: js.UndefOr[Boolean] = js.native
  
   // Position where buttons should be aligned
  var closeOnEsc: js.UndefOr[Boolean] = js.native
  
  // after messagebox is hidden
  var closed: js.UndefOr[js.Function1[/* lobibox */ js.Any, Unit]] = js.native
  
    // Make messagebox draggable
  var customBtnClass: js.UndefOr[String] = js.native
  
  var debug: js.UndefOr[Boolean] = js.native
  
    // Close messagebox on Esc press
  var delayToRemove: js.UndefOr[Double] = js.native
  
    // Show close button or not
  var draggable: js.UndefOr[Boolean] = js.native
  
  var getTitle: js.UndefOr[js.Function0[String]] = js.native
  
  var height: js.UndefOr[String] = js.native
  
  // methods
  var hide: js.UndefOr[js.Function0[this.type]] = js.native
  
  var hideClass: js.UndefOr[String] = js.native
  
  var horizontalOffset: js.UndefOr[Double] = js.native
  
   // Class for custom buttons
  var modal: js.UndefOr[Boolean] = js.native
  
  var msg: js.UndefOr[String] = js.native
  
  // events
  // when messagebox show is called but before it is actually shown
  var onShow: js.UndefOr[js.Function1[/* lobibox */ js.Any, Unit]] = js.native
  
  var setHeight: js.UndefOr[js.Function1[/* height */ js.UndefOr[Double], this.type]] = js.native
  
  var setPosition: js.UndefOr[
    js.Function2[/* left */ js.UndefOr[Double | String], /* top */ js.UndefOr[Double], this.type]
  ] = js.native
  
  var setSize: js.UndefOr[
    js.Function2[/* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double], this.type]
  ] = js.native
  
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[String], this.type]] = js.native
  
  var setWidth: js.UndefOr[js.Function1[/* width */ js.UndefOr[Double], this.type]] = js.native
  
  var show: js.UndefOr[js.Function0[this.type]] = js.native
  
  var showClass: js.UndefOr[String] = js.native
  
  // after messagebox is shown
  var shown: js.UndefOr[js.Function1[/* lobibox */ js.Any, Unit]] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object MessageBoxesDefault {
  
  @scala.inline
  def apply(): MessageBoxesDefault = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageBoxesDefault]
  }
  
  @scala.inline
  implicit class MessageBoxesDefaultOps[Self <: MessageBoxesDefault] (val x: Self) extends AnyVal {
    
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
    def setBaseClass(value: String): Self = this.set("baseClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseClass: Self = this.set("baseClass", js.undefined)
    
    @scala.inline
    def setBeforeClose(value: /* lobibox */ js.Any => Unit): Self = this.set("beforeClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeClose: Self = this.set("beforeClose", js.undefined)
    
    @scala.inline
    def setButtonsAlign(value: String): Self = this.set("buttonsAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonsAlign: Self = this.set("buttonsAlign", js.undefined)
    
    @scala.inline
    def setCloseButton(value: Boolean): Self = this.set("closeButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseButton: Self = this.set("closeButton", js.undefined)
    
    @scala.inline
    def setCloseOnEsc(value: Boolean): Self = this.set("closeOnEsc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseOnEsc: Self = this.set("closeOnEsc", js.undefined)
    
    @scala.inline
    def setClosed(value: /* lobibox */ js.Any => Unit): Self = this.set("closed", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteClosed: Self = this.set("closed", js.undefined)
    
    @scala.inline
    def setCustomBtnClass(value: String): Self = this.set("customBtnClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomBtnClass: Self = this.set("customBtnClass", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setDelayToRemove(value: Double): Self = this.set("delayToRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelayToRemove: Self = this.set("delayToRemove", js.undefined)
    
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    
    @scala.inline
    def setGetTitle(value: () => String): Self = this.set("getTitle", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetTitle: Self = this.set("getTitle", js.undefined)
    
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHide(value: () => MessageBoxesDefault): Self = this.set("hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    
    @scala.inline
    def setHideClass(value: String): Self = this.set("hideClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideClass: Self = this.set("hideClass", js.undefined)
    
    @scala.inline
    def setHorizontalOffset(value: Double): Self = this.set("horizontalOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontalOffset: Self = this.set("horizontalOffset", js.undefined)
    
    @scala.inline
    def setModal(value: Boolean): Self = this.set("modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModal: Self = this.set("modal", js.undefined)
    
    @scala.inline
    def setMsg(value: String): Self = this.set("msg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsg: Self = this.set("msg", js.undefined)
    
    @scala.inline
    def setOnShow(value: /* lobibox */ js.Any => Unit): Self = this.set("onShow", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    
    @scala.inline
    def setSetHeight(value: /* height */ js.UndefOr[Double] => MessageBoxesDefault): Self = this.set("setHeight", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetHeight: Self = this.set("setHeight", js.undefined)
    
    @scala.inline
    def setSetPosition(
      value: (/* left */ js.UndefOr[Double | String], /* top */ js.UndefOr[Double]) => MessageBoxesDefault
    ): Self = this.set("setPosition", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetPosition: Self = this.set("setPosition", js.undefined)
    
    @scala.inline
    def setSetSize(value: (/* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => MessageBoxesDefault): Self = this.set("setSize", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetSize: Self = this.set("setSize", js.undefined)
    
    @scala.inline
    def setSetTitle(value: /* title */ js.UndefOr[String] => MessageBoxesDefault): Self = this.set("setTitle", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetTitle: Self = this.set("setTitle", js.undefined)
    
    @scala.inline
    def setSetWidth(value: /* width */ js.UndefOr[Double] => MessageBoxesDefault): Self = this.set("setWidth", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetWidth: Self = this.set("setWidth", js.undefined)
    
    @scala.inline
    def setShow(value: () => MessageBoxesDefault): Self = this.set("show", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    
    @scala.inline
    def setShowClass(value: String): Self = this.set("showClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowClass: Self = this.set("showClass", js.undefined)
    
    @scala.inline
    def setShown(value: /* lobibox */ js.Any => Unit): Self = this.set("shown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteShown: Self = this.set("shown", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
