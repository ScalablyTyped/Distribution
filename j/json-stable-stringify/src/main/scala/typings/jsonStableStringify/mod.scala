package typings.jsonStableStringify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("json-stable-stringify", JSImport.Namespace)
  @js.native
  def apply(obj: js.Any): String = js.native
  @JSImport("json-stable-stringify", JSImport.Namespace)
  @js.native
  def apply(obj: js.Any, opts: Comparator): String = js.native
  @JSImport("json-stable-stringify", JSImport.Namespace)
  @js.native
  def apply(obj: js.Any, opts: Options): String = js.native
  
  type Comparator = js.Function2[/* a */ Element, /* b */ Element, Double]
  
  @js.native
  trait Element extends StObject {
    
    var key: String = js.native
    
    var value: js.Any = js.native
  }
  object Element {
    
    @scala.inline
    def apply(key: String, value: js.Any): Element = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Element]
    }
    
    @scala.inline
    implicit class ElementMutableBuilder[Self <: Element] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var cmp: js.UndefOr[Comparator] = js.native
    
    var replacer: js.UndefOr[Replacer] = js.native
    
    var space: js.UndefOr[Double | String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCmp(value: (/* a */ Element, /* b */ Element) => Double): Self = StObject.set(x, "cmp", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCmpUndefined: Self = StObject.set(x, "cmp", js.undefined)
      
      @scala.inline
      def setReplacer(value: (/* key */ String, /* value */ js.Any) => js.Any): Self = StObject.set(x, "replacer", js.Any.fromFunction2(value))
      
      @scala.inline
      def setReplacerUndefined: Self = StObject.set(x, "replacer", js.undefined)
      
      @scala.inline
      def setSpace(value: Double | String): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
    }
  }
  
  type Replacer = js.Function2[/* key */ String, /* value */ js.Any, js.Any]
}
