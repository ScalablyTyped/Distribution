package typings.jsonStableStringify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(obj: Any): String = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(obj: Any, opts: Comparator): String = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(obj: Any, opts: Options): String = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("json-stable-stringify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Comparator = js.Function2[/* a */ Element, /* b */ Element, Double]
  
  trait Element extends StObject {
    
    var key: String
    
    var value: Any
  }
  object Element {
    
    inline def apply(key: String, value: Any): Element = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Element]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Element] (val x: Self) extends AnyVal {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    /**
      * Custom comparator for key
      */
    var cmp: js.UndefOr[Comparator] = js.undefined
    
    /**
      * true to allow cycles, by marking the entries as __cycle__.
      */
    var cycles: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Option to replace values to simpler values
      */
    var replacer: js.UndefOr[Replacer] = js.undefined
    
    /**
      * Indent the output for pretty-printing.
      *
      * Supported is either a string or a number of spaces.
      */
    var space: js.UndefOr[String | Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCmp(value: (/* a */ Element, /* b */ Element) => Double): Self = StObject.set(x, "cmp", js.Any.fromFunction2(value))
      
      inline def setCmpUndefined: Self = StObject.set(x, "cmp", js.undefined)
      
      inline def setCycles(value: Boolean): Self = StObject.set(x, "cycles", value.asInstanceOf[js.Any])
      
      inline def setCyclesUndefined: Self = StObject.set(x, "cycles", js.undefined)
      
      inline def setReplacer(value: (/* key */ String, /* value */ Any) => Any): Self = StObject.set(x, "replacer", js.Any.fromFunction2(value))
      
      inline def setReplacerUndefined: Self = StObject.set(x, "replacer", js.undefined)
      
      inline def setSpace(value: String | Double): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
    }
  }
  
  type Replacer = js.Function2[/* key */ String, /* value */ Any, Any]
}
