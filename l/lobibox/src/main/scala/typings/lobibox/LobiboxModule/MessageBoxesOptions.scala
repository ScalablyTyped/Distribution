package typings.lobibox.LobiboxModule

import typings.lobibox.anon.Cancel
import typings.lobibox.anon.Confirm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageBoxesOptions
  extends StObject
     with MessageBoxesDefault {
  
  var bodyClass: js.UndefOr[String] = js.undefined
  
  var buttons: js.UndefOr[Cancel | js.Any] = js.undefined
  
  @JSName("buttonsAlign")
  var buttonsAlign_MessageBoxesOptions: js.UndefOr[js.Any] = js.undefined
  
  var callback: js.UndefOr[
    js.Function3[/* lobibox */ js.Any, /* type */ js.UndefOr[String], /* ev */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  
  var modalClasses: js.UndefOr[Confirm] = js.undefined
}
object MessageBoxesOptions {
  
  @scala.inline
  def apply(): MessageBoxesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageBoxesOptions]
  }
  
  @scala.inline
  implicit class MessageBoxesOptionsMutableBuilder[Self <: MessageBoxesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBodyClass(value: String): Self = StObject.set(x, "bodyClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyClassUndefined: Self = StObject.set(x, "bodyClass", js.undefined)
    
    @scala.inline
    def setButtons(value: Cancel | js.Any): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsAlign(value: js.Any): Self = StObject.set(x, "buttonsAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsAlignUndefined: Self = StObject.set(x, "buttonsAlign", js.undefined)
    
    @scala.inline
    def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    @scala.inline
    def setCallback(value: (/* lobibox */ js.Any, /* type */ js.UndefOr[String], /* ev */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    @scala.inline
    def setModalClasses(value: Confirm): Self = StObject.set(x, "modalClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalClassesUndefined: Self = StObject.set(x, "modalClasses", js.undefined)
  }
}
