package typings.jqueryBootstrapWizard

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WizardOptions extends StObject {
  
  var firstSelector: js.UndefOr[String] = js.undefined
  
  var lastSelector: js.UndefOr[String] = js.undefined
  
  var nextSelector: js.UndefOr[String] = js.undefined
  
  var onFirst: js.UndefOr[
    js.Function3[/* activeTab */ Any, /* navigation */ Any, /* firstIndex */ Double, Boolean]
  ] = js.undefined
  
  var onInit: js.UndefOr[
    js.Function3[/* activeTab */ Any, /* navigation */ Any, /* currentIndex */ Double, Unit]
  ] = js.undefined
  
  var onLast: js.UndefOr[
    js.Function3[/* activeTab */ Any, /* navigation */ Any, /* lastIndex */ Double, Boolean]
  ] = js.undefined
  
  var onNext: js.UndefOr[
    js.Function3[/* activeTab */ Any, /* navigation */ Any, /* nextIndex */ Double, Boolean]
  ] = js.undefined
  
  var onPrevious: js.UndefOr[
    js.Function3[/* activeTab */ Any, /* navigation */ Any, /* previousIndex */ Double, Boolean]
  ] = js.undefined
  
  var onShow: js.UndefOr[
    js.Function3[/* activeTab */ Any, /* navigation */ Any, /* nextIndex */ Double, Unit]
  ] = js.undefined
  
  var onTabClick: js.UndefOr[
    js.Function3[/* activeTab */ Any, /* navigation */ Any, /* currentIndex */ Double, Boolean]
  ] = js.undefined
  
  var onTabShow: js.UndefOr[
    js.Function3[/* activeTab */ Any, /* navigation */ Any, /* currentIndex */ Double, Boolean]
  ] = js.undefined
  
  var previousSelector: js.UndefOr[String] = js.undefined
  
  var tabClass: js.UndefOr[String] = js.undefined
}
object WizardOptions {
  
  inline def apply(): WizardOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WizardOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WizardOptions] (val x: Self) extends AnyVal {
    
    inline def setFirstSelector(value: String): Self = StObject.set(x, "firstSelector", value.asInstanceOf[js.Any])
    
    inline def setFirstSelectorUndefined: Self = StObject.set(x, "firstSelector", js.undefined)
    
    inline def setLastSelector(value: String): Self = StObject.set(x, "lastSelector", value.asInstanceOf[js.Any])
    
    inline def setLastSelectorUndefined: Self = StObject.set(x, "lastSelector", js.undefined)
    
    inline def setNextSelector(value: String): Self = StObject.set(x, "nextSelector", value.asInstanceOf[js.Any])
    
    inline def setNextSelectorUndefined: Self = StObject.set(x, "nextSelector", js.undefined)
    
    inline def setOnFirst(value: (/* activeTab */ Any, /* navigation */ Any, /* firstIndex */ Double) => Boolean): Self = StObject.set(x, "onFirst", js.Any.fromFunction3(value))
    
    inline def setOnFirstUndefined: Self = StObject.set(x, "onFirst", js.undefined)
    
    inline def setOnInit(value: (/* activeTab */ Any, /* navigation */ Any, /* currentIndex */ Double) => Unit): Self = StObject.set(x, "onInit", js.Any.fromFunction3(value))
    
    inline def setOnInitUndefined: Self = StObject.set(x, "onInit", js.undefined)
    
    inline def setOnLast(value: (/* activeTab */ Any, /* navigation */ Any, /* lastIndex */ Double) => Boolean): Self = StObject.set(x, "onLast", js.Any.fromFunction3(value))
    
    inline def setOnLastUndefined: Self = StObject.set(x, "onLast", js.undefined)
    
    inline def setOnNext(value: (/* activeTab */ Any, /* navigation */ Any, /* nextIndex */ Double) => Boolean): Self = StObject.set(x, "onNext", js.Any.fromFunction3(value))
    
    inline def setOnNextUndefined: Self = StObject.set(x, "onNext", js.undefined)
    
    inline def setOnPrevious(value: (/* activeTab */ Any, /* navigation */ Any, /* previousIndex */ Double) => Boolean): Self = StObject.set(x, "onPrevious", js.Any.fromFunction3(value))
    
    inline def setOnPreviousUndefined: Self = StObject.set(x, "onPrevious", js.undefined)
    
    inline def setOnShow(value: (/* activeTab */ Any, /* navigation */ Any, /* nextIndex */ Double) => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction3(value))
    
    inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    inline def setOnTabClick(value: (/* activeTab */ Any, /* navigation */ Any, /* currentIndex */ Double) => Boolean): Self = StObject.set(x, "onTabClick", js.Any.fromFunction3(value))
    
    inline def setOnTabClickUndefined: Self = StObject.set(x, "onTabClick", js.undefined)
    
    inline def setOnTabShow(value: (/* activeTab */ Any, /* navigation */ Any, /* currentIndex */ Double) => Boolean): Self = StObject.set(x, "onTabShow", js.Any.fromFunction3(value))
    
    inline def setOnTabShowUndefined: Self = StObject.set(x, "onTabShow", js.undefined)
    
    inline def setPreviousSelector(value: String): Self = StObject.set(x, "previousSelector", value.asInstanceOf[js.Any])
    
    inline def setPreviousSelectorUndefined: Self = StObject.set(x, "previousSelector", js.undefined)
    
    inline def setTabClass(value: String): Self = StObject.set(x, "tabClass", value.asInstanceOf[js.Any])
    
    inline def setTabClassUndefined: Self = StObject.set(x, "tabClass", js.undefined)
  }
}
