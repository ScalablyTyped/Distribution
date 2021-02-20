package typings.handsontable.mod.Handsontable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object search {
  
  type SearchCallback = js.Function5[
    /* instance */ typings.handsontable.mod.Handsontable, 
    /* row */ Double, 
    /* column */ Double, 
    /* value */ CellValue, 
    /* result */ Boolean, 
    Unit
  ]
  
  type SearchQueryMethod = js.Function3[
    /* queryStr */ String, 
    /* value */ CellValue, 
    /* cellProperties */ CellProperties, 
    Boolean
  ]
  
  @js.native
  trait Settings extends StObject {
    
    var callback: js.UndefOr[SearchCallback] = js.native
    
    var queryMethod: js.UndefOr[SearchQueryMethod] = js.native
    
    var searchResultClass: js.UndefOr[String] = js.native
  }
  object Settings {
    
    @scala.inline
    def apply(): Settings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Settings]
    }
    
    @scala.inline
    implicit class SettingsMutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(
        value: (/* instance */ typings.handsontable.mod.Handsontable, /* row */ Double, /* column */ Double, /* value */ CellValue, /* result */ Boolean) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction5(value))
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setQueryMethod(
        value: (/* queryStr */ String, /* value */ CellValue, /* cellProperties */ CellProperties) => Boolean
      ): Self = StObject.set(x, "queryMethod", js.Any.fromFunction3(value))
      
      @scala.inline
      def setQueryMethodUndefined: Self = StObject.set(x, "queryMethod", js.undefined)
      
      @scala.inline
      def setSearchResultClass(value: String): Self = StObject.set(x, "searchResultClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchResultClassUndefined: Self = StObject.set(x, "searchResultClass", js.undefined)
    }
  }
}
