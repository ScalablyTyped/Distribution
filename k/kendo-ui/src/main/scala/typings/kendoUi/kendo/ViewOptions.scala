package typings.kendoUi.kendo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewOptions extends StObject {
  
  var evalTemplate: js.UndefOr[Boolean] = js.undefined
  
  var hide: js.UndefOr[js.Function1[/* e */ ViewEvent, Unit]] = js.undefined
  
  var init: js.UndefOr[js.Function1[/* e */ ViewEvent, Unit]] = js.undefined
  
  var model: js.UndefOr[js.Object] = js.undefined
  
  var show: js.UndefOr[js.Function1[/* e */ ViewEvent, Unit]] = js.undefined
  
  var tagName: js.UndefOr[String] = js.undefined
  
  var useWithBlock: js.UndefOr[Boolean] = js.undefined
  
  var wrap: js.UndefOr[Boolean] = js.undefined
}
object ViewOptions {
  
  inline def apply(): ViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewOptions]
  }
  
  extension [Self <: ViewOptions](x: Self) {
    
    inline def setEvalTemplate(value: Boolean): Self = StObject.set(x, "evalTemplate", value.asInstanceOf[js.Any])
    
    inline def setEvalTemplateUndefined: Self = StObject.set(x, "evalTemplate", js.undefined)
    
    inline def setHide(value: /* e */ ViewEvent => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction1(value))
    
    inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    inline def setInit(value: /* e */ ViewEvent => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
    
    inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    inline def setModel(value: js.Object): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setShow(value: /* e */ ViewEvent => Unit): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    
    inline def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
    
    inline def setUseWithBlock(value: Boolean): Self = StObject.set(x, "useWithBlock", value.asInstanceOf[js.Any])
    
    inline def setUseWithBlockUndefined: Self = StObject.set(x, "useWithBlock", js.undefined)
    
    inline def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
    
    inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
  }
}
