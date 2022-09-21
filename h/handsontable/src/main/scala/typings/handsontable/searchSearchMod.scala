package typings.handsontable

import typings.handsontable.commonMod.CellValue
import typings.handsontable.coreMod.default
import typings.handsontable.pluginsBaseMod.BasePlugin
import typings.handsontable.settingsMod.CellProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchSearchMod {
  
  @JSImport("handsontable/plugins/search/search", "Search")
  @js.native
  open class Search protected () extends BasePlugin {
    def this(hotInstance: default) = this()
    
    def getCallback(): SearchCallback = js.native
    
    def getQueryMethod(): SearchQueryMethod = js.native
    
    def getSearchResultClass(): String = js.native
    
    def isEnabled(): Boolean = js.native
    
    def query(queryStr: String): js.Array[Any] = js.native
    def query(queryStr: String, callback: Unit, queryMethod: SearchQueryMethod): js.Array[Any] = js.native
    def query(queryStr: String, callback: SearchCallback): js.Array[Any] = js.native
    def query(queryStr: String, callback: SearchCallback, queryMethod: SearchQueryMethod): js.Array[Any] = js.native
    
    def setCallback(newCallback: SearchCallback): Unit = js.native
    
    def setQueryMethod(newQueryMethod: SearchQueryMethod): Unit = js.native
    
    def setSearchResultClass(newElementClass: String): Unit = js.native
  }
  
  trait DetailedSettings extends StObject {
    
    var callback: js.UndefOr[SearchCallback] = js.undefined
    
    var queryMethod: js.UndefOr[SearchQueryMethod] = js.undefined
    
    var searchResultClass: js.UndefOr[String] = js.undefined
  }
  object DetailedSettings {
    
    inline def apply(): DetailedSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DetailedSettings]
    }
    
    extension [Self <: DetailedSettings](x: Self) {
      
      inline def setCallback(
        value: (/* instance */ default, /* row */ Double, /* column */ Double, /* value */ CellValue, /* result */ Boolean) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction5(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setQueryMethod(
        value: (/* queryStr */ String, /* value */ CellValue, /* cellProperties */ CellProperties) => Boolean
      ): Self = StObject.set(x, "queryMethod", js.Any.fromFunction3(value))
      
      inline def setQueryMethodUndefined: Self = StObject.set(x, "queryMethod", js.undefined)
      
      inline def setSearchResultClass(value: String): Self = StObject.set(x, "searchResultClass", value.asInstanceOf[js.Any])
      
      inline def setSearchResultClassUndefined: Self = StObject.set(x, "searchResultClass", js.undefined)
    }
  }
  
  type SearchCallback = js.Function5[
    /* instance */ default, 
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
  
  type Settings = Boolean | DetailedSettings
}
