package typings.harmon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Any = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Any]
  inline def apply(reqSelectors: js.Array[Select]): Any = ^.asInstanceOf[js.Dynamic].apply(reqSelectors.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def apply(reqSelectors: js.Array[Select], resSelectors: js.Array[Select]): Any = (^.asInstanceOf[js.Dynamic].apply(reqSelectors.asInstanceOf[js.Any], resSelectors.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(reqSelectors: js.Array[Select], resSelectors: js.Array[Select], htmlOnly: Boolean): Any = (^.asInstanceOf[js.Dynamic].apply(reqSelectors.asInstanceOf[js.Any], resSelectors.asInstanceOf[js.Any], htmlOnly.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(reqSelectors: js.Array[Select], resSelectors: Unit, htmlOnly: Boolean): Any = (^.asInstanceOf[js.Dynamic].apply(reqSelectors.asInstanceOf[js.Any], resSelectors.asInstanceOf[js.Any], htmlOnly.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(reqSelectors: Unit, resSelectors: js.Array[Select]): Any = (^.asInstanceOf[js.Dynamic].apply(reqSelectors.asInstanceOf[js.Any], resSelectors.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(reqSelectors: Unit, resSelectors: js.Array[Select], htmlOnly: Boolean): Any = (^.asInstanceOf[js.Dynamic].apply(reqSelectors.asInstanceOf[js.Any], resSelectors.asInstanceOf[js.Any], htmlOnly.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(reqSelectors: Unit, resSelectors: Unit, htmlOnly: Boolean): Any = (^.asInstanceOf[js.Dynamic].apply(reqSelectors.asInstanceOf[js.Any], resSelectors.asInstanceOf[js.Any], htmlOnly.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("harmon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Select extends StObject {
    
    def func(node: Any): Any
    
    var query: String
  }
  object Select {
    
    inline def apply(func: Any => Any, query: String): Select = {
      val __obj = js.Dynamic.literal(func = js.Any.fromFunction1(func), query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[Select]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Select] (val x: Self) extends AnyVal {
      
      inline def setFunc(value: Any => Any): Self = StObject.set(x, "func", js.Any.fromFunction1(value))
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    }
  }
}
