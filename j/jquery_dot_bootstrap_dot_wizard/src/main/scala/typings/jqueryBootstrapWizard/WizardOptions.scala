package typings.jqueryBootstrapWizard

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WizardOptions extends StObject {
  
  var firstSelector: js.UndefOr[String] = js.undefined
  
  var lastSelector: js.UndefOr[String] = js.undefined
  
  var nextSelector: js.UndefOr[String] = js.undefined
  
  var onFirst: js.UndefOr[
    js.Function3[/* activeTab */ js.Any, /* navigation */ js.Any, /* firstIndex */ Double, Boolean]
  ] = js.undefined
  
  var onInit: js.UndefOr[
    js.Function3[/* activeTab */ js.Any, /* navigation */ js.Any, /* currentIndex */ Double, Unit]
  ] = js.undefined
  
  var onLast: js.UndefOr[
    js.Function3[/* activeTab */ js.Any, /* navigation */ js.Any, /* lastIndex */ Double, Boolean]
  ] = js.undefined
  
  var onNext: js.UndefOr[
    js.Function3[/* activeTab */ js.Any, /* navigation */ js.Any, /* nextIndex */ Double, Boolean]
  ] = js.undefined
  
  var onPrevious: js.UndefOr[
    js.Function3[/* activeTab */ js.Any, /* navigation */ js.Any, /* previousIndex */ Double, Boolean]
  ] = js.undefined
  
  var onShow: js.UndefOr[
    js.Function3[/* activeTab */ js.Any, /* navigation */ js.Any, /* nextIndex */ Double, Unit]
  ] = js.undefined
  
  var onTabClick: js.UndefOr[
    js.Function3[/* activeTab */ js.Any, /* navigation */ js.Any, /* currentIndex */ Double, Boolean]
  ] = js.undefined
  
  var onTabShow: js.UndefOr[
    js.Function3[/* activeTab */ js.Any, /* navigation */ js.Any, /* currentIndex */ Double, Boolean]
  ] = js.undefined
  
  var previousSelector: js.UndefOr[String] = js.undefined
  
  var tabClass: js.UndefOr[String] = js.undefined
}
object WizardOptions {
  
  @scala.inline
  def apply(): WizardOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WizardOptions]
  }
  
  @scala.inline
  implicit class WizardOptionsMutableBuilder[Self <: WizardOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirstSelector(value: String): Self = StObject.set(x, "firstSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstSelectorUndefined: Self = StObject.set(x, "firstSelector", js.undefined)
    
    @scala.inline
    def setLastSelector(value: String): Self = StObject.set(x, "lastSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastSelectorUndefined: Self = StObject.set(x, "lastSelector", js.undefined)
    
    @scala.inline
    def setNextSelector(value: String): Self = StObject.set(x, "nextSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextSelectorUndefined: Self = StObject.set(x, "nextSelector", js.undefined)
    
    @scala.inline
    def setOnFirst(value: (/* activeTab */ js.Any, /* navigation */ js.Any, /* firstIndex */ Double) => Boolean): Self = StObject.set(x, "onFirst", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnFirstUndefined: Self = StObject.set(x, "onFirst", js.undefined)
    
    @scala.inline
    def setOnInit(value: (/* activeTab */ js.Any, /* navigation */ js.Any, /* currentIndex */ Double) => Unit): Self = StObject.set(x, "onInit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnInitUndefined: Self = StObject.set(x, "onInit", js.undefined)
    
    @scala.inline
    def setOnLast(value: (/* activeTab */ js.Any, /* navigation */ js.Any, /* lastIndex */ Double) => Boolean): Self = StObject.set(x, "onLast", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnLastUndefined: Self = StObject.set(x, "onLast", js.undefined)
    
    @scala.inline
    def setOnNext(value: (/* activeTab */ js.Any, /* navigation */ js.Any, /* nextIndex */ Double) => Boolean): Self = StObject.set(x, "onNext", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnNextUndefined: Self = StObject.set(x, "onNext", js.undefined)
    
    @scala.inline
    def setOnPrevious(value: (/* activeTab */ js.Any, /* navigation */ js.Any, /* previousIndex */ Double) => Boolean): Self = StObject.set(x, "onPrevious", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnPreviousUndefined: Self = StObject.set(x, "onPrevious", js.undefined)
    
    @scala.inline
    def setOnShow(value: (/* activeTab */ js.Any, /* navigation */ js.Any, /* nextIndex */ Double) => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    @scala.inline
    def setOnTabClick(value: (/* activeTab */ js.Any, /* navigation */ js.Any, /* currentIndex */ Double) => Boolean): Self = StObject.set(x, "onTabClick", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnTabClickUndefined: Self = StObject.set(x, "onTabClick", js.undefined)
    
    @scala.inline
    def setOnTabShow(value: (/* activeTab */ js.Any, /* navigation */ js.Any, /* currentIndex */ Double) => Boolean): Self = StObject.set(x, "onTabShow", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnTabShowUndefined: Self = StObject.set(x, "onTabShow", js.undefined)
    
    @scala.inline
    def setPreviousSelector(value: String): Self = StObject.set(x, "previousSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousSelectorUndefined: Self = StObject.set(x, "previousSelector", js.undefined)
    
    @scala.inline
    def setTabClass(value: String): Self = StObject.set(x, "tabClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabClassUndefined: Self = StObject.set(x, "tabClass", js.undefined)
  }
}
