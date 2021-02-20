package typings.griddleReact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FilterPlaceholder extends StObject {
    
    var filterPlaceholder: js.UndefOr[String] = js.native
    
    var next: js.UndefOr[String] = js.native
    
    var previous: js.UndefOr[String] = js.native
    
    var settingsToggle: js.UndefOr[String] = js.native
  }
  object FilterPlaceholder {
    
    @scala.inline
    def apply(): FilterPlaceholder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilterPlaceholder]
    }
    
    @scala.inline
    implicit class FilterPlaceholderMutableBuilder[Self <: FilterPlaceholder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilterPlaceholder(value: String): Self = StObject.set(x, "filterPlaceholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterPlaceholderUndefined: Self = StObject.set(x, "filterPlaceholder", js.undefined)
      
      @scala.inline
      def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      @scala.inline
      def setPrevious(value: String): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
      
      @scala.inline
      def setSettingsToggle(value: String): Self = StObject.set(x, "settingsToggle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSettingsToggleUndefined: Self = StObject.set(x, "settingsToggle", js.undefined)
    }
  }
}
