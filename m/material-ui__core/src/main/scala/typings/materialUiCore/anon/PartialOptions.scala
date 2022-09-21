package typings.materialUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/useMediaQuery.Options> */
trait PartialOptions extends StObject {
  
  var defaultMatches: js.UndefOr[Boolean] = js.undefined
  
  var noSsr: js.UndefOr[Boolean] = js.undefined
  
  var ssrMatchMedia: js.UndefOr[js.Function1[/* query */ String, Matches]] = js.undefined
}
object PartialOptions {
  
  inline def apply(): PartialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptions]
  }
  
  extension [Self <: PartialOptions](x: Self) {
    
    inline def setDefaultMatches(value: Boolean): Self = StObject.set(x, "defaultMatches", value.asInstanceOf[js.Any])
    
    inline def setDefaultMatchesUndefined: Self = StObject.set(x, "defaultMatches", js.undefined)
    
    inline def setNoSsr(value: Boolean): Self = StObject.set(x, "noSsr", value.asInstanceOf[js.Any])
    
    inline def setNoSsrUndefined: Self = StObject.set(x, "noSsr", js.undefined)
    
    inline def setSsrMatchMedia(value: /* query */ String => Matches): Self = StObject.set(x, "ssrMatchMedia", js.Any.fromFunction1(value))
    
    inline def setSsrMatchMediaUndefined: Self = StObject.set(x, "ssrMatchMedia", js.undefined)
  }
}
