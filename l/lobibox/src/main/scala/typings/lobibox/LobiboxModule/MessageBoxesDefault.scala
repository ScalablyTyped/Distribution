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
  
  inline def apply(): MessageBoxesDefault = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageBoxesDefault]
  }
  
  extension [Self <: MessageBoxesDefault](x: Self) {
    
    inline def setBaseClass(value: String): Self = StObject.set(x, "baseClass", value.asInstanceOf[js.Any])
    
    inline def setBaseClassUndefined: Self = StObject.set(x, "baseClass", js.undefined)
    
    inline def setBeforeClose(value: /* lobibox */ js.Any => Unit): Self = StObject.set(x, "beforeClose", js.Any.fromFunction1(value))
    
    inline def setBeforeCloseUndefined: Self = StObject.set(x, "beforeClose", js.undefined)
    
    inline def setButtonsAlign(value: String): Self = StObject.set(x, "buttonsAlign", value.asInstanceOf[js.Any])
    
    inline def setButtonsAlignUndefined: Self = StObject.set(x, "buttonsAlign", js.undefined)
    
    inline def setCloseButton(value: Boolean): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
    
    inline def setCloseButtonUndefined: Self = StObject.set(x, "closeButton", js.undefined)
    
    inline def setCloseOnEsc(value: Boolean): Self = StObject.set(x, "closeOnEsc", value.asInstanceOf[js.Any])
    
    inline def setCloseOnEscUndefined: Self = StObject.set(x, "closeOnEsc", js.undefined)
    
    inline def setClosed(value: /* lobibox */ js.Any => Unit): Self = StObject.set(x, "closed", js.Any.fromFunction1(value))
    
    inline def setClosedUndefined: Self = StObject.set(x, "closed", js.undefined)
    
    inline def setCustomBtnClass(value: String): Self = StObject.set(x, "customBtnClass", value.asInstanceOf[js.Any])
    
    inline def setCustomBtnClassUndefined: Self = StObject.set(x, "customBtnClass", js.undefined)
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setDelayToRemove(value: Double): Self = StObject.set(x, "delayToRemove", value.asInstanceOf[js.Any])
    
    inline def setDelayToRemoveUndefined: Self = StObject.set(x, "delayToRemove", js.undefined)
    
    inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    inline def setGetTitle(value: () => String): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
    
    inline def setGetTitleUndefined: Self = StObject.set(x, "getTitle", js.undefined)
    
    inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHide(value: () => MessageBoxesDefault): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    inline def setHideClass(value: String): Self = StObject.set(x, "hideClass", value.asInstanceOf[js.Any])
    
    inline def setHideClassUndefined: Self = StObject.set(x, "hideClass", js.undefined)
    
    inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    inline def setHorizontalOffset(value: Double): Self = StObject.set(x, "horizontalOffset", value.asInstanceOf[js.Any])
    
    inline def setHorizontalOffsetUndefined: Self = StObject.set(x, "horizontalOffset", js.undefined)
    
    inline def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
    
    inline def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
    
    inline def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
    
    inline def setMsgUndefined: Self = StObject.set(x, "msg", js.undefined)
    
    inline def setOnShow(value: /* lobibox */ js.Any => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction1(value))
    
    inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    inline def setSetHeight(value: /* height */ js.UndefOr[Double] => MessageBoxesDefault): Self = StObject.set(x, "setHeight", js.Any.fromFunction1(value))
    
    inline def setSetHeightUndefined: Self = StObject.set(x, "setHeight", js.undefined)
    
    inline def setSetPosition(
      value: (/* left */ js.UndefOr[Double | String], /* top */ js.UndefOr[Double]) => MessageBoxesDefault
    ): Self = StObject.set(x, "setPosition", js.Any.fromFunction2(value))
    
    inline def setSetPositionUndefined: Self = StObject.set(x, "setPosition", js.undefined)
    
    inline def setSetSize(value: (/* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => MessageBoxesDefault): Self = StObject.set(x, "setSize", js.Any.fromFunction2(value))
    
    inline def setSetSizeUndefined: Self = StObject.set(x, "setSize", js.undefined)
    
    inline def setSetTitle(value: /* title */ js.UndefOr[String] => MessageBoxesDefault): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
    
    inline def setSetTitleUndefined: Self = StObject.set(x, "setTitle", js.undefined)
    
    inline def setSetWidth(value: /* width */ js.UndefOr[Double] => MessageBoxesDefault): Self = StObject.set(x, "setWidth", js.Any.fromFunction1(value))
    
    inline def setSetWidthUndefined: Self = StObject.set(x, "setWidth", js.undefined)
    
    inline def setShow(value: () => MessageBoxesDefault): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    
    inline def setShowClass(value: String): Self = StObject.set(x, "showClass", value.asInstanceOf[js.Any])
    
    inline def setShowClassUndefined: Self = StObject.set(x, "showClass", js.undefined)
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setShown(value: /* lobibox */ js.Any => Unit): Self = StObject.set(x, "shown", js.Any.fromFunction1(value))
    
    inline def setShownUndefined: Self = StObject.set(x, "shown", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
