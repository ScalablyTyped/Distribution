package typings.jsonStableStringify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(obj: js.Any): String = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(obj: js.Any, opts: Comparator): String = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(obj: js.Any, opts: Options): String = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("json-stable-stringify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Comparator = js.Function2[/* a */ Element, /* b */ Element, Double]
  
  trait Element extends StObject {
    
    var key: String
    
    var value: js.Any
  }
  object Element {
    
    inline def apply(key: String, value: js.Any): Element = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Element]
    }
    
    extension [Self <: Element](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var cmp: js.UndefOr[Comparator] = js.undefined
    
    var replacer: js.UndefOr[Replacer] = js.undefined
    
    var space: js.UndefOr[Double | String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCmp(value: (/* a */ Element, /* b */ Element) => Double): Self = StObject.set(x, "cmp", js.Any.fromFunction2(value))
      
      inline def setCmpUndefined: Self = StObject.set(x, "cmp", js.undefined)
      
      inline def setReplacer(value: (/* key */ String, /* value */ js.Any) => js.Any): Self = StObject.set(x, "replacer", js.Any.fromFunction2(value))
      
      inline def setReplacerUndefined: Self = StObject.set(x, "replacer", js.undefined)
      
      inline def setSpace(value: Double | String): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
    }
  }
  
  type Replacer = js.Function2[/* key */ String, /* value */ js.Any, js.Any]
}
