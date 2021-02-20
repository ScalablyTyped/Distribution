package typings.jsWorkerSearch

import typings.jsWorkerSearch.mod.INDEX_MODES
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait CaseSensitive extends StObject {
    
    var caseSensitive: js.UndefOr[Boolean] = js.native
    
    var indexMode: js.UndefOr[INDEX_MODES] = js.native
    
    var matchAnyToken: js.UndefOr[Boolean] = js.native
    
    var tokenizePattern: js.UndefOr[RegExp] = js.native
  }
  object CaseSensitive {
    
    @scala.inline
    def apply(): CaseSensitive = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CaseSensitive]
    }
    
    @scala.inline
    implicit class CaseSensitiveMutableBuilder[Self <: CaseSensitive] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      @scala.inline
      def setIndexMode(value: INDEX_MODES): Self = StObject.set(x, "indexMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexModeUndefined: Self = StObject.set(x, "indexMode", js.undefined)
      
      @scala.inline
      def setMatchAnyToken(value: Boolean): Self = StObject.set(x, "matchAnyToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchAnyTokenUndefined: Self = StObject.set(x, "matchAnyToken", js.undefined)
      
      @scala.inline
      def setTokenizePattern(value: RegExp): Self = StObject.set(x, "tokenizePattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenizePatternUndefined: Self = StObject.set(x, "tokenizePattern", js.undefined)
    }
  }
}
