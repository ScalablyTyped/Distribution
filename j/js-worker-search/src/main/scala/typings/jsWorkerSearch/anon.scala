package typings.jsWorkerSearch

import typings.jsWorkerSearch.mod.INDEX_MODES
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CaseSensitive extends StObject {
    
    var caseSensitive: js.UndefOr[Boolean] = js.undefined
    
    var indexMode: js.UndefOr[INDEX_MODES] = js.undefined
    
    var matchAnyToken: js.UndefOr[Boolean] = js.undefined
    
    var tokenizePattern: js.UndefOr[js.RegExp] = js.undefined
  }
  object CaseSensitive {
    
    inline def apply(): CaseSensitive = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CaseSensitive]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CaseSensitive] (val x: Self) extends AnyVal {
      
      inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      inline def setIndexMode(value: INDEX_MODES): Self = StObject.set(x, "indexMode", value.asInstanceOf[js.Any])
      
      inline def setIndexModeUndefined: Self = StObject.set(x, "indexMode", js.undefined)
      
      inline def setMatchAnyToken(value: Boolean): Self = StObject.set(x, "matchAnyToken", value.asInstanceOf[js.Any])
      
      inline def setMatchAnyTokenUndefined: Self = StObject.set(x, "matchAnyToken", js.undefined)
      
      inline def setTokenizePattern(value: js.RegExp): Self = StObject.set(x, "tokenizePattern", value.asInstanceOf[js.Any])
      
      inline def setTokenizePatternUndefined: Self = StObject.set(x, "tokenizePattern", js.undefined)
    }
  }
}
