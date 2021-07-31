package typings.jqueryui.JQueryUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutocompleteUIParams extends StObject {
  
  var content: js.UndefOr[js.Any] = js.undefined
  
  /**
    * The item selected from the menu, if any. Otherwise the property is null
    */
  var item: js.UndefOr[js.Any] = js.undefined
}
object AutocompleteUIParams {
  
  @scala.inline
  def apply(): AutocompleteUIParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutocompleteUIParams]
  }
  
  @scala.inline
  implicit class AutocompleteUIParamsMutableBuilder[Self <: AutocompleteUIParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: js.Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setItem(value: js.Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
  }
}
