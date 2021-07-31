package typings.lobibox.LobiboxModule

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageBoxesDefault extends StObject {
  
  var baseClass: js.UndefOr[String] = js.undefined
  
  // when messagebox remove method is called but before it is actually hidden
  var beforeClose: js.UndefOr[js.Function1[/* lobibox */ js.Any, Unit]] = js.undefined
  
  var buttonsAlign: js.UndefOr[String] = js.undefined
  
  // Height is automatically given calculated by width
  var closeButton: js.UndefOr[Boolean] = js.undefined
  
  // Position where buttons should be aligned
  var closeOnEsc: js.UndefOr[Boolean] = js.undefined
  
  // after messagebox is hidden
  var closed: js.UndefOr[js.Function1[/* lobibox */ js.Any, Unit]] = js.undefined
  
  // Make messagebox draggable
  var customBtnClass: js.UndefOr[String] = js.undefined
  
  var debug: js.UndefOr[Boolean] = js.undefined
  
  // Close messagebox on Esc press
  var delayToRemove: js.UndefOr[Double] = js.undefined
  
  // Show close button or not
  var draggable: js.UndefOr[Boolean] = js.undefined
  
  var getTitle: js.UndefOr[js.Function0[String]] = js.undefined
  
  var height: js.UndefOr[String] = js.undefined
  
  // methods
  var hide: js.UndefOr[js.Function0[this.type]] = js.undefined
  
  var hideClass: js.UndefOr[String] = js.undefined
  
  var horizontalOffset: js.UndefOr[Double] = js.undefined
  
  // Class for custom buttons
  var modal: js.UndefOr[Boolean] = js.undefined
  
  var msg: js.UndefOr[String] = js.undefined
  
  // events
  // when messagebox show is called but before it is actually shown
  var onShow: js.UndefOr[js.Function1[/* lobibox */ js.Any, Unit]] = js.undefined
  
  var setHeight: js.UndefOr[js.Function1[/* height */ js.UndefOr[Double], this.type]] = js.undefined
  
  var setPosition: js.UndefOr[
    js.Function2[/* left */ js.UndefOr[Double | String], /* top */ js.UndefOr[Double], this.type]
  ] = js.undefined
  
  var setSize: js.UndefOr[
    js.Function2[/* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double], this.type]
  ] = js.undefined
  
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[String], this.type]] = js.undefined
  
  var setWidth: js.UndefOr[js.Function1[/* width */ js.UndefOr[Double], this.type]] = js.undefined
  
  var show: js.UndefOr[js.Function0[this.type]] = js.undefined
  
  var showClass: js.UndefOr[String] = js.undefined
  
  // after messagebox is shown
  var shown: js.UndefOr[js.Function1[/* lobibox */ js.Any, Unit]] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object MessageBoxesDefault {
  
  @scala.inline
  def apply(): MessageBoxesDefault = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageBoxesDefault]
  }
  
  @scala.inline
  implicit class MessageBoxesDefaultMutableBuilder[Self <: MessageBoxesDefault] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseClass(value: String): Self = StObject.set(x, "baseClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseClassUndefined: Self = StObject.set(x, "baseClass", js.undefined)
    
    @scala.inline
    def setBeforeClose(value: /* lobibox */ js.Any => Unit): Self = StObject.set(x, "beforeClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeforeCloseUndefined: Self = StObject.set(x, "beforeClose", js.undefined)
    
    @scala.inline
    def setButtonsAlign(value: String): Self = StObject.set(x, "buttonsAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsAlignUndefined: Self = StObject.set(x, "buttonsAlign", js.undefined)
    
    @scala.inline
    def setCloseButton(value: Boolean): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseButtonUndefined: Self = StObject.set(x, "closeButton", js.undefined)
    
    @scala.inline
    def setCloseOnEsc(value: Boolean): Self = StObject.set(x, "closeOnEsc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseOnEscUndefined: Self = StObject.set(x, "closeOnEsc", js.undefined)
    
    @scala.inline
    def setClosed(value: /* lobibox */ js.Any => Unit): Self = StObject.set(x, "closed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClosedUndefined: Self = StObject.set(x, "closed", js.undefined)
    
    @scala.inline
    def setCustomBtnClass(value: String): Self = StObject.set(x, "customBtnClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomBtnClassUndefined: Self = StObject.set(x, "customBtnClass", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    @scala.inline
    def setDelayToRemove(value: Double): Self = StObject.set(x, "delayToRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayToRemoveUndefined: Self = StObject.set(x, "delayToRemove", js.undefined)
    
    @scala.inline
    def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    @scala.inline
    def setGetTitle(value: () => String): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTitleUndefined: Self = StObject.set(x, "getTitle", js.undefined)
    
    @scala.inline
    def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHide(value: () => MessageBoxesDefault): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHideClass(value: String): Self = StObject.set(x, "hideClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideClassUndefined: Self = StObject.set(x, "hideClass", js.undefined)
    
    @scala.inline
    def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    @scala.inline
    def setHorizontalOffset(value: Double): Self = StObject.set(x, "horizontalOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalOffsetUndefined: Self = StObject.set(x, "horizontalOffset", js.undefined)
    
    @scala.inline
    def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
    
    @scala.inline
    def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsgUndefined: Self = StObject.set(x, "msg", js.undefined)
    
    @scala.inline
    def setOnShow(value: /* lobibox */ js.Any => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    @scala.inline
    def setSetHeight(value: /* height */ js.UndefOr[Double] => MessageBoxesDefault): Self = StObject.set(x, "setHeight", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHeightUndefined: Self = StObject.set(x, "setHeight", js.undefined)
    
    @scala.inline
    def setSetPosition(
      value: (/* left */ js.UndefOr[Double | String], /* top */ js.UndefOr[Double]) => MessageBoxesDefault
    ): Self = StObject.set(x, "setPosition", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetPositionUndefined: Self = StObject.set(x, "setPosition", js.undefined)
    
    @scala.inline
    def setSetSize(value: (/* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => MessageBoxesDefault): Self = StObject.set(x, "setSize", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetSizeUndefined: Self = StObject.set(x, "setSize", js.undefined)
    
    @scala.inline
    def setSetTitle(value: /* title */ js.UndefOr[String] => MessageBoxesDefault): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTitleUndefined: Self = StObject.set(x, "setTitle", js.undefined)
    
    @scala.inline
    def setSetWidth(value: /* width */ js.UndefOr[Double] => MessageBoxesDefault): Self = StObject.set(x, "setWidth", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetWidthUndefined: Self = StObject.set(x, "setWidth", js.undefined)
    
    @scala.inline
    def setShow(value: () => MessageBoxesDefault): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowClass(value: String): Self = StObject.set(x, "showClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowClassUndefined: Self = StObject.set(x, "showClass", js.undefined)
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    @scala.inline
    def setShown(value: /* lobibox */ js.Any => Unit): Self = StObject.set(x, "shown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShownUndefined: Self = StObject.set(x, "shown", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
