package typings.jqueryFocusable

import typings.jqueryFocusable.jqueryFocusableBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* Inlined std.Partial<{  findNegativeTabindex :boolean,   findPositiveTabindex :true}> */
  @js.native
  trait Options extends StObject {
    
    var findNegativeTabindex: js.UndefOr[Boolean] = js.native
    
    var findPositiveTabindex: js.UndefOr[`true`] = js.native
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
      def setFindNegativeTabindex(value: Boolean): Self = StObject.set(x, "findNegativeTabindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFindNegativeTabindexUndefined: Self = StObject.set(x, "findNegativeTabindex", js.undefined)
      
      @scala.inline
      def setFindPositiveTabindex(value: `true`): Self = StObject.set(x, "findPositiveTabindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFindPositiveTabindexUndefined: Self = StObject.set(x, "findPositiveTabindex", js.undefined)
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
