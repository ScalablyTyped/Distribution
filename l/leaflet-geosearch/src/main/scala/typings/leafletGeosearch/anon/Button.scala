package typings.leafletGeosearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Button extends StObject {
  
  var button: String
  
  var container: String
  
  var form: String
  
  var input: String
  
  var item: String
  
  var msgbox: String
  
  var notfound: String
  
  var resetButton: String
  
  var resultlist: String
}
object Button {
  
  inline def apply(
    button: String,
    container: String,
    form: String,
    input: String,
    item: String,
    msgbox: String,
    notfound: String,
    resetButton: String,
    resultlist: String
  ): Button = {
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], form = form.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], msgbox = msgbox.asInstanceOf[js.Any], notfound = notfound.asInstanceOf[js.Any], resetButton = resetButton.asInstanceOf[js.Any], resultlist = resultlist.asInstanceOf[js.Any])
    __obj.asInstanceOf[Button]
  }
  
  extension [Self <: Button](x: Self) {
    
    inline def setButton(value: String): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setItem(value: String): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setMsgbox(value: String): Self = StObject.set(x, "msgbox", value.asInstanceOf[js.Any])
    
    inline def setNotfound(value: String): Self = StObject.set(x, "notfound", value.asInstanceOf[js.Any])
    
    inline def setResetButton(value: String): Self = StObject.set(x, "resetButton", value.asInstanceOf[js.Any])
    
    inline def setResultlist(value: String): Self = StObject.set(x, "resultlist", value.asInstanceOf[js.Any])
  }
}
