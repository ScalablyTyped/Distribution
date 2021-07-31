package typings.jsoneditoronline

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSONEditorOptions extends StObject {
  
  var change: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var history: js.UndefOr[Boolean] = js.undefined
  
  var mode: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var search: js.UndefOr[Boolean] = js.undefined
}
object JSONEditorOptions {
  
  @scala.inline
  def apply(): JSONEditorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSONEditorOptions]
  }
  
  @scala.inline
  implicit class JSONEditorOptionsMutableBuilder[Self <: JSONEditorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChange(value: () => Unit): Self = StObject.set(x, "change", js.Any.fromFunction0(value))
    
    @scala.inline
    def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    @scala.inline
    def setHistory(value: Boolean): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSearch(value: Boolean): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
  }
}
