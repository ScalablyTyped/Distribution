package typings.infoboxParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(source: String): ParseResult = ^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any]).asInstanceOf[ParseResult]
  inline def apply(source: String, options: ParseOptions): ParseResult = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParseResult]
  
  @JSImport("infobox-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ParseOptions extends StObject {
    
    var simplifyDataValues: js.UndefOr[Boolean] = js.undefined
  }
  object ParseOptions {
    
    inline def apply(): ParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseOptions]
    }
    
    extension [Self <: ParseOptions](x: Self) {
      
      inline def setSimplifyDataValues(value: Boolean): Self = StObject.set(x, "simplifyDataValues", value.asInstanceOf[js.Any])
      
      inline def setSimplifyDataValuesUndefined: Self = StObject.set(x, "simplifyDataValues", js.undefined)
    }
  }
  
  trait ParseResult extends StObject {
    
    var general: Any
    
    var lists: js.Array[Any]
    
    var tables: js.Array[Any]
  }
  object ParseResult {
    
    inline def apply(general: Any, lists: js.Array[Any], tables: js.Array[Any]): ParseResult = {
      val __obj = js.Dynamic.literal(general = general.asInstanceOf[js.Any], lists = lists.asInstanceOf[js.Any], tables = tables.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseResult]
    }
    
    extension [Self <: ParseResult](x: Self) {
      
      inline def setGeneral(value: Any): Self = StObject.set(x, "general", value.asInstanceOf[js.Any])
      
      inline def setLists(value: js.Array[Any]): Self = StObject.set(x, "lists", value.asInstanceOf[js.Any])
      
      inline def setListsVarargs(value: Any*): Self = StObject.set(x, "lists", js.Array(value*))
      
      inline def setTables(value: js.Array[Any]): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
      
      inline def setTablesVarargs(value: Any*): Self = StObject.set(x, "tables", js.Array(value*))
    }
  }
}
