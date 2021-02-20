package typings.jsonStringifyPrettyCompact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Indent extends StObject {
    
    var indent: js.UndefOr[Double | String] = js.native
    
    var maxLength: js.UndefOr[Double] = js.native
    
    var replacer: js.UndefOr[
        (js.Function2[/* key */ String, /* value */ js.Any, _]) | (js.Array[Double | String]) | Null
      ] = js.native
  }
  object Indent {
    
    @scala.inline
    def apply(): Indent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Indent]
    }
    
    @scala.inline
    implicit class IndentMutableBuilder[Self <: Indent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndent(value: Double | String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      @scala.inline
      def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      @scala.inline
      def setReplacer(value: (js.Function2[/* key */ String, /* value */ js.Any, _]) | (js.Array[Double | String])): Self = StObject.set(x, "replacer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplacerFunction2(value: (/* key */ String, /* value */ js.Any) => _): Self = StObject.set(x, "replacer", js.Any.fromFunction2(value))
      
      @scala.inline
      def setReplacerNull: Self = StObject.set(x, "replacer", null)
      
      @scala.inline
      def setReplacerUndefined: Self = StObject.set(x, "replacer", js.undefined)
      
      @scala.inline
      def setReplacerVarargs(value: (Double | String)*): Self = StObject.set(x, "replacer", js.Array(value :_*))
    }
  }
}
