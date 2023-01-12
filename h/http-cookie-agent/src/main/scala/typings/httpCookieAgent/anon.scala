package typings.httpCookieAgent

import typings.httpCookieAgent.undiciMod.CookieOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cookies extends StObject {
    
    var cookies: js.UndefOr[CookieOptions] = js.undefined
  }
  object Cookies {
    
    inline def apply(): Cookies = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cookies]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cookies] (val x: Self) extends AnyVal {
      
      inline def setCookies(value: CookieOptions): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      
      inline def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
    }
  }
}
