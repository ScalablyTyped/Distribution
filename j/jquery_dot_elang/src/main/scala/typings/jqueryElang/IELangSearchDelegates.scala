package typings.jqueryElang

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IELangSearchDelegates extends StObject {
  
  var langDirectionClickHandler: js.Function
  
  var langDirectionHandler: js.Function
  
  var searchClickHandler: js.Function
  
  var searchHandler: js.Function
  
  var selectCallback: js.Function
  
  var selectHandler: js.Function
}
object IELangSearchDelegates {
  
  @scala.inline
  def apply(
    langDirectionClickHandler: js.Function,
    langDirectionHandler: js.Function,
    searchClickHandler: js.Function,
    searchHandler: js.Function,
    selectCallback: js.Function,
    selectHandler: js.Function
  ): IELangSearchDelegates = {
    val __obj = js.Dynamic.literal(langDirectionClickHandler = langDirectionClickHandler.asInstanceOf[js.Any], langDirectionHandler = langDirectionHandler.asInstanceOf[js.Any], searchClickHandler = searchClickHandler.asInstanceOf[js.Any], searchHandler = searchHandler.asInstanceOf[js.Any], selectCallback = selectCallback.asInstanceOf[js.Any], selectHandler = selectHandler.asInstanceOf[js.Any])
    __obj.asInstanceOf[IELangSearchDelegates]
  }
  
  @scala.inline
  implicit class IELangSearchDelegatesMutableBuilder[Self <: IELangSearchDelegates] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLangDirectionClickHandler(value: js.Function): Self = StObject.set(x, "langDirectionClickHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLangDirectionHandler(value: js.Function): Self = StObject.set(x, "langDirectionHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchClickHandler(value: js.Function): Self = StObject.set(x, "searchClickHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchHandler(value: js.Function): Self = StObject.set(x, "searchHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectCallback(value: js.Function): Self = StObject.set(x, "selectCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectHandler(value: js.Function): Self = StObject.set(x, "selectHandler", value.asInstanceOf[js.Any])
  }
}
