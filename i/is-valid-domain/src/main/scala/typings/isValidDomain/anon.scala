package typings.isValidDomain

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AllowUnicode extends StObject {
    
    var allowUnicode: js.UndefOr[Boolean] = js.undefined
    
    var subdomain: js.UndefOr[Boolean] = js.undefined
    
    var topLevel: js.UndefOr[Boolean] = js.undefined
    
    var wildcard: js.UndefOr[Boolean] = js.undefined
  }
  object AllowUnicode {
    
    inline def apply(): AllowUnicode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AllowUnicode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AllowUnicode] (val x: Self) extends AnyVal {
      
      inline def setAllowUnicode(value: Boolean): Self = StObject.set(x, "allowUnicode", value.asInstanceOf[js.Any])
      
      inline def setAllowUnicodeUndefined: Self = StObject.set(x, "allowUnicode", js.undefined)
      
      inline def setSubdomain(value: Boolean): Self = StObject.set(x, "subdomain", value.asInstanceOf[js.Any])
      
      inline def setSubdomainUndefined: Self = StObject.set(x, "subdomain", js.undefined)
      
      inline def setTopLevel(value: Boolean): Self = StObject.set(x, "topLevel", value.asInstanceOf[js.Any])
      
      inline def setTopLevelUndefined: Self = StObject.set(x, "topLevel", js.undefined)
      
      inline def setWildcard(value: Boolean): Self = StObject.set(x, "wildcard", value.asInstanceOf[js.Any])
      
      inline def setWildcardUndefined: Self = StObject.set(x, "wildcard", js.undefined)
    }
  }
}
