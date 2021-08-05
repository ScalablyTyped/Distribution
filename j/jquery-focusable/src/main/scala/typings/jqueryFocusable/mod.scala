package typings.jqueryFocusable

import typings.jqueryFocusable.jqueryFocusableBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* Inlined std.Partial<{  findNegativeTabindex :boolean,   findPositiveTabindex :true}> */
  trait Options extends StObject {
    
    var findNegativeTabindex: js.UndefOr[Boolean] = js.undefined
    
    var findPositiveTabindex: js.UndefOr[`true`] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setFindNegativeTabindex(value: Boolean): Self = StObject.set(x, "findNegativeTabindex", value.asInstanceOf[js.Any])
      
      inline def setFindNegativeTabindexUndefined: Self = StObject.set(x, "findNegativeTabindex", js.undefined)
      
      inline def setFindPositiveTabindex(value: `true`): Self = StObject.set(x, "findPositiveTabindex", value.asInstanceOf[js.Any])
      
      inline def setFindPositiveTabindexUndefined: Self = StObject.set(x, "findPositiveTabindex", js.undefined)
    }
  }
  
  object global {
    
    @js.native
    trait JQuery extends StObject {
      
      def focusable(): JQuery = js.native
      def focusable(options: Options): JQuery = js.native
    }
  }
}
