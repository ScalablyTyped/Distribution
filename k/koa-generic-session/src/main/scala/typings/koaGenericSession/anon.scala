package typings.koaGenericSession

import typings.koaGenericSession.koaGenericSessionStrings.lax
import typings.koaGenericSession.koaGenericSessionStrings.none
import typings.koaGenericSession.koaGenericSessionStrings.strict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait HttpOnly extends StObject {
    
    var httpOnly: js.UndefOr[Boolean] = js.native
    
    var maxAge: js.UndefOr[Double | Null] = js.native
    
    var overwrite: js.UndefOr[Boolean] = js.native
    
    var path: js.UndefOr[String] = js.native
    
    var rewrite: js.UndefOr[Boolean] = js.native
    
    var sameSite: js.UndefOr[Boolean | lax | none | strict] = js.native
    
    var secure: js.UndefOr[Boolean] = js.native
    
    var signed: js.UndefOr[Boolean] = js.native
  }
  object HttpOnly {
    
    @scala.inline
    def apply(): HttpOnly = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpOnly]
    }
    
    @scala.inline
    implicit class HttpOnlyMutableBuilder[Self <: HttpOnly] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpOnlyUndefined: Self = StObject.set(x, "httpOnly", js.undefined)
      
      @scala.inline
      def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAgeNull: Self = StObject.set(x, "maxAge", null)
      
      @scala.inline
      def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      @scala.inline
      def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setRewrite(value: Boolean): Self = StObject.set(x, "rewrite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRewriteUndefined: Self = StObject.set(x, "rewrite", js.undefined)
      
      @scala.inline
      def setSameSite(value: Boolean | lax | none | strict): Self = StObject.set(x, "sameSite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSameSiteUndefined: Self = StObject.set(x, "sameSite", js.undefined)
      
      @scala.inline
      def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      @scala.inline
      def setSigned(value: Boolean): Self = StObject.set(x, "signed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignedUndefined: Self = StObject.set(x, "signed", js.undefined)
    }
  }
}
