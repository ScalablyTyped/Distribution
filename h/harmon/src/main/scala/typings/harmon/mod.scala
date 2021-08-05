package typings.harmon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): js.Any = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Any]
  inline def apply(reqSelectors: js.Array[Select]): js.Any = ^.asInstanceOf[js.Dynamic].apply(reqSelectors.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def apply(reqSelectors: js.Array[Select], resSelectors: js.Array[Select]): js.Any = (^.asInstanceOf[js.Dynamic].apply(reqSelectors.asInstanceOf[js.Any], resSelectors.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def apply(reqSelectors: js.Array[Select], resSelectors: js.Array[Select], htmlOnly: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].apply(reqSelectors.asInstanceOf[js.Any], resSelectors.asInstanceOf[js.Any], htmlOnly.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def apply(reqSelectors: js.Array[Select], resSelectors: Unit, htmlOnly: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].apply(reqSelectors.asInstanceOf[js.Any], resSelectors.asInstanceOf[js.Any], htmlOnly.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def apply(reqSelectors: Unit, resSelectors: js.Array[Select]): js.Any = (^.asInstanceOf[js.Dynamic].apply(reqSelectors.asInstanceOf[js.Any], resSelectors.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def apply(reqSelectors: Unit, resSelectors: js.Array[Select], htmlOnly: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].apply(reqSelectors.asInstanceOf[js.Any], resSelectors.asInstanceOf[js.Any], htmlOnly.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def apply(reqSelectors: Unit, resSelectors: Unit, htmlOnly: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].apply(reqSelectors.asInstanceOf[js.Any], resSelectors.asInstanceOf[js.Any], htmlOnly.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @JSImport("harmon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Select extends StObject {
    
    def func(node: js.Any): js.Any
    
    var query: String
  }
  object Select {
    
    inline def apply(func: js.Any => js.Any, query: String): Select = {
      val __obj = js.Dynamic.literal(func = js.Any.fromFunction1(func), query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[Select]
    }
    
    extension [Self <: Select](x: Self) {
      
      inline def setFunc(value: js.Any => js.Any): Self = StObject.set(x, "func", js.Any.fromFunction1(value))
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    }
  }
}
