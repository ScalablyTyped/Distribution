package typings.htmlTableify

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T /* <: /* keyof any */ String */](data: js.Array[Datum[T]]): String = ^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply[T /* <: /* keyof any */ String */](data: js.Array[Datum[T]], config: Config[T]): String = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("html-tableify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.htmlTableify.htmlTableifyStrings.center
    - typings.htmlTableify.htmlTableifyStrings.left
    - typings.htmlTableify.htmlTableifyStrings.right
  */
  trait Alignment extends StObject
  object Alignment {
    
    inline def center: typings.htmlTableify.htmlTableifyStrings.center = "center".asInstanceOf[typings.htmlTableify.htmlTableifyStrings.center]
    
    inline def left: typings.htmlTableify.htmlTableifyStrings.left = "left".asInstanceOf[typings.htmlTableify.htmlTableifyStrings.left]
    
    inline def right: typings.htmlTableify.htmlTableifyStrings.right = "right".asInstanceOf[typings.htmlTableify.htmlTableifyStrings.right]
  }
  
  /** Table config object for data with keys `T`. */
  trait Config[T] extends StObject {
    
    var headers: js.UndefOr[js.Array[Header[T]]] = js.undefined
    
    /** Tidy the output HTML. */
    var tidy: js.UndefOr[Boolean] = js.undefined
  }
  object Config {
    
    inline def apply[T](): Config[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config[T]]
    }
    
    extension [Self <: Config[?], T](x: Self & Config[T]) {
      
      inline def setHeaders(value: js.Array[Header[T]]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadersVarargs(value: Header[T]*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setTidy(value: Boolean): Self = StObject.set(x, "tidy", value.asInstanceOf[js.Any])
      
      inline def setTidyUndefined: Self = StObject.set(x, "tidy", js.undefined)
    }
  }
  
  /** Object of optional values for each key `T`. */
  type Datum[T /* <: /* keyof any */ String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in T ]:? unknown}
    */ typings.htmlTableify.htmlTableifyStrings.Datum & TopLevel[Any]
  
  /** Header config object for key `T`. */
  trait Header[T] extends StObject {
    
    /** Text align of the column. */
    var align: js.UndefOr[Alignment] = js.undefined
    
    /** Key in data object. */
    var name: T
    
    /** Title of the column. */
    var title: js.UndefOr[String] = js.undefined
  }
  object Header {
    
    inline def apply[T](name: T): Header[T] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Header[T]]
    }
    
    extension [Self <: Header[?], T](x: Self & Header[T]) {
      
      inline def setAlign(value: Alignment): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setName(value: T): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
