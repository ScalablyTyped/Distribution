package typings.materializeCss.anon

import typings.materializeCss.M.Modal
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<materialize-css.M.ModalOptions> */
trait PartialModalOptions extends StObject {
  
  var dismissible: js.UndefOr[Boolean] = js.undefined
  
  var endingTop: js.UndefOr[String] = js.undefined
  
  var inDuration: js.UndefOr[Double] = js.undefined
  
  var onCloseEnd: js.UndefOr[js.ThisFunction1[/* this */ Modal, /* el */ Element, Unit]] = js.undefined
  
  var onCloseStart: js.UndefOr[js.ThisFunction1[/* this */ Modal, /* el */ Element, Unit]] = js.undefined
  
  var onOpenEnd: js.UndefOr[js.ThisFunction1[/* this */ Modal, /* el */ Element, Unit]] = js.undefined
  
  var onOpenStart: js.UndefOr[js.ThisFunction1[/* this */ Modal, /* el */ Element, Unit]] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var outDuration: js.UndefOr[Double] = js.undefined
  
  var preventScrolling: js.UndefOr[Boolean] = js.undefined
  
  var startingTop: js.UndefOr[String] = js.undefined
}
object PartialModalOptions {
  
  inline def apply(): PartialModalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialModalOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialModalOptions] (val x: Self) extends AnyVal {
    
    inline def setDismissible(value: Boolean): Self = StObject.set(x, "dismissible", value.asInstanceOf[js.Any])
    
    inline def setDismissibleUndefined: Self = StObject.set(x, "dismissible", js.undefined)
    
    inline def setEndingTop(value: String): Self = StObject.set(x, "endingTop", value.asInstanceOf[js.Any])
    
    inline def setEndingTopUndefined: Self = StObject.set(x, "endingTop", js.undefined)
    
    inline def setInDuration(value: Double): Self = StObject.set(x, "inDuration", value.asInstanceOf[js.Any])
    
    inline def setInDurationUndefined: Self = StObject.set(x, "inDuration", js.undefined)
    
    inline def setOnCloseEnd(value: js.ThisFunction1[/* this */ Modal, /* el */ Element, Unit]): Self = StObject.set(x, "onCloseEnd", value.asInstanceOf[js.Any])
    
    inline def setOnCloseEndUndefined: Self = StObject.set(x, "onCloseEnd", js.undefined)
    
    inline def setOnCloseStart(value: js.ThisFunction1[/* this */ Modal, /* el */ Element, Unit]): Self = StObject.set(x, "onCloseStart", value.asInstanceOf[js.Any])
    
    inline def setOnCloseStartUndefined: Self = StObject.set(x, "onCloseStart", js.undefined)
    
    inline def setOnOpenEnd(value: js.ThisFunction1[/* this */ Modal, /* el */ Element, Unit]): Self = StObject.set(x, "onOpenEnd", value.asInstanceOf[js.Any])
    
    inline def setOnOpenEndUndefined: Self = StObject.set(x, "onOpenEnd", js.undefined)
    
    inline def setOnOpenStart(value: js.ThisFunction1[/* this */ Modal, /* el */ Element, Unit]): Self = StObject.set(x, "onOpenStart", value.asInstanceOf[js.Any])
    
    inline def setOnOpenStartUndefined: Self = StObject.set(x, "onOpenStart", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setOutDuration(value: Double): Self = StObject.set(x, "outDuration", value.asInstanceOf[js.Any])
    
    inline def setOutDurationUndefined: Self = StObject.set(x, "outDuration", js.undefined)
    
    inline def setPreventScrolling(value: Boolean): Self = StObject.set(x, "preventScrolling", value.asInstanceOf[js.Any])
    
    inline def setPreventScrollingUndefined: Self = StObject.set(x, "preventScrolling", js.undefined)
    
    inline def setStartingTop(value: String): Self = StObject.set(x, "startingTop", value.asInstanceOf[js.Any])
    
    inline def setStartingTopUndefined: Self = StObject.set(x, "startingTop", js.undefined)
  }
}
