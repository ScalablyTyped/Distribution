package typings.griddleReact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait FilterPlaceholder extends StObject {
    
    var filterPlaceholder: js.UndefOr[String] = js.undefined
    
    var next: js.UndefOr[String] = js.undefined
    
    var previous: js.UndefOr[String] = js.undefined
    
    var settingsToggle: js.UndefOr[String] = js.undefined
  }
  object FilterPlaceholder {
    
    inline def apply(): FilterPlaceholder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilterPlaceholder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FilterPlaceholder] (val x: Self) extends AnyVal {
      
      inline def setFilterPlaceholder(value: String): Self = StObject.set(x, "filterPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setFilterPlaceholderUndefined: Self = StObject.set(x, "filterPlaceholder", js.undefined)
      
      inline def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      inline def setPrevious(value: String): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
      
      inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
      
      inline def setSettingsToggle(value: String): Self = StObject.set(x, "settingsToggle", value.asInstanceOf[js.Any])
      
      inline def setSettingsToggleUndefined: Self = StObject.set(x, "settingsToggle", js.undefined)
    }
  }
}
