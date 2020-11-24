package typings.jqueryBootstrapWizard

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WizardOptions extends js.Object {
  
  var firstSelector: js.UndefOr[String] = js.native
  
  var lastSelector: js.UndefOr[String] = js.native
  
  var nextSelector: js.UndefOr[String] = js.native
  
  var onFirst: js.UndefOr[
    js.Function3[/* activeTab */ js.Any, /* navigation */ js.Any, /* firstIndex */ Double, Boolean]
  ] = js.native
  
  var onInit: js.UndefOr[
    js.Function3[/* activeTab */ js.Any, /* navigation */ js.Any, /* currentIndex */ Double, Unit]
  ] = js.native
  
  var onLast: js.UndefOr[
    js.Function3[/* activeTab */ js.Any, /* navigation */ js.Any, /* lastIndex */ Double, Boolean]
  ] = js.native
  
  var onNext: js.UndefOr[
    js.Function3[/* activeTab */ js.Any, /* navigation */ js.Any, /* nextIndex */ Double, Boolean]
  ] = js.native
  
  var onPrevious: js.UndefOr[
    js.Function3[/* activeTab */ js.Any, /* navigation */ js.Any, /* previousIndex */ Double, Boolean]
  ] = js.native
  
  var onShow: js.UndefOr[
    js.Function3[/* activeTab */ js.Any, /* navigation */ js.Any, /* nextIndex */ Double, Unit]
  ] = js.native
  
  var onTabClick: js.UndefOr[
    js.Function3[/* activeTab */ js.Any, /* navigation */ js.Any, /* currentIndex */ Double, Boolean]
  ] = js.native
  
  var onTabShow: js.UndefOr[
    js.Function3[/* activeTab */ js.Any, /* navigation */ js.Any, /* currentIndex */ Double, Boolean]
  ] = js.native
  
  var previousSelector: js.UndefOr[String] = js.native
  
  var tabClass: js.UndefOr[String] = js.native
}
object WizardOptions {
  
  @scala.inline
  def apply(): WizardOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WizardOptions]
  }
  
  @scala.inline
  implicit class WizardOptionsOps[Self <: WizardOptions] (val x: Self) extends AnyVal {
    
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
    def setFirstSelector(value: String): Self = this.set("firstSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstSelector: Self = this.set("firstSelector", js.undefined)
    
    @scala.inline
    def setLastSelector(value: String): Self = this.set("lastSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastSelector: Self = this.set("lastSelector", js.undefined)
    
    @scala.inline
    def setNextSelector(value: String): Self = this.set("nextSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextSelector: Self = this.set("nextSelector", js.undefined)
    
    @scala.inline
    def setOnFirst(value: (/* activeTab */ js.Any, /* navigation */ js.Any, /* firstIndex */ Double) => Boolean): Self = this.set("onFirst", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnFirst: Self = this.set("onFirst", js.undefined)
    
    @scala.inline
    def setOnInit(value: (/* activeTab */ js.Any, /* navigation */ js.Any, /* currentIndex */ Double) => Unit): Self = this.set("onInit", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnInit: Self = this.set("onInit", js.undefined)
    
    @scala.inline
    def setOnLast(value: (/* activeTab */ js.Any, /* navigation */ js.Any, /* lastIndex */ Double) => Boolean): Self = this.set("onLast", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnLast: Self = this.set("onLast", js.undefined)
    
    @scala.inline
    def setOnNext(value: (/* activeTab */ js.Any, /* navigation */ js.Any, /* nextIndex */ Double) => Boolean): Self = this.set("onNext", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnNext: Self = this.set("onNext", js.undefined)
    
    @scala.inline
    def setOnPrevious(value: (/* activeTab */ js.Any, /* navigation */ js.Any, /* previousIndex */ Double) => Boolean): Self = this.set("onPrevious", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnPrevious: Self = this.set("onPrevious", js.undefined)
    
    @scala.inline
    def setOnShow(value: (/* activeTab */ js.Any, /* navigation */ js.Any, /* nextIndex */ Double) => Unit): Self = this.set("onShow", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    
    @scala.inline
    def setOnTabClick(value: (/* activeTab */ js.Any, /* navigation */ js.Any, /* currentIndex */ Double) => Boolean): Self = this.set("onTabClick", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnTabClick: Self = this.set("onTabClick", js.undefined)
    
    @scala.inline
    def setOnTabShow(value: (/* activeTab */ js.Any, /* navigation */ js.Any, /* currentIndex */ Double) => Boolean): Self = this.set("onTabShow", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnTabShow: Self = this.set("onTabShow", js.undefined)
    
    @scala.inline
    def setPreviousSelector(value: String): Self = this.set("previousSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousSelector: Self = this.set("previousSelector", js.undefined)
    
    @scala.inline
    def setTabClass(value: String): Self = this.set("tabClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabClass: Self = this.set("tabClass", js.undefined)
  }
}
