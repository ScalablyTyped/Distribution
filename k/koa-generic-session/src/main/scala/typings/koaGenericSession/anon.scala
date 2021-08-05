package typings.koaGenericSession

import typings.koaGenericSession.koaGenericSessionStrings.lax
import typings.koaGenericSession.koaGenericSessionStrings.none
import typings.koaGenericSession.koaGenericSessionStrings.strict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait HttpOnly extends StObject {
    
    var httpOnly: js.UndefOr[Boolean] = js.undefined
    
    var maxAge: js.UndefOr[Double | Null] = js.undefined
    
    var overwrite: js.UndefOr[Boolean] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var rewrite: js.UndefOr[Boolean] = js.undefined
    
    var sameSite: js.UndefOr[Boolean | lax | none | strict] = js.undefined
    
    var secure: js.UndefOr[Boolean] = js.undefined
    
    var signed: js.UndefOr[Boolean] = js.undefined
  }
  object HttpOnly {
    
    inline def apply(): HttpOnly = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpOnly]
    }
    
    extension [Self <: HttpOnly](x: Self) {
      
      inline def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
      
      inline def setHttpOnlyUndefined: Self = StObject.set(x, "httpOnly", js.undefined)
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeNull: Self = StObject.set(x, "maxAge", null)
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
      
      inline def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setRewrite(value: Boolean): Self = StObject.set(x, "rewrite", value.asInstanceOf[js.Any])
      
      inline def setRewriteUndefined: Self = StObject.set(x, "rewrite", js.undefined)
      
      inline def setSameSite(value: Boolean | lax | none | strict): Self = StObject.set(x, "sameSite", value.asInstanceOf[js.Any])
      
      inline def setSameSiteUndefined: Self = StObject.set(x, "sameSite", js.undefined)
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      inline def setSigned(value: Boolean): Self = StObject.set(x, "signed", value.asInstanceOf[js.Any])
      
      inline def setSignedUndefined: Self = StObject.set(x, "signed", js.undefined)
    }
  }
}
