package typings.hapi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsCaseSensitive extends StObject {
  
  var isCaseSensitive: js.UndefOr[Boolean] = js.undefined
  
  var stripTrailingSlash: js.UndefOr[Boolean] = js.undefined
}
object IsCaseSensitive {
  
  inline def apply(): IsCaseSensitive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsCaseSensitive]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsCaseSensitive] (val x: Self) extends AnyVal {
    
    inline def setIsCaseSensitive(value: Boolean): Self = StObject.set(x, "isCaseSensitive", value.asInstanceOf[js.Any])
    
    inline def setIsCaseSensitiveUndefined: Self = StObject.set(x, "isCaseSensitive", js.undefined)
    
    inline def setStripTrailingSlash(value: Boolean): Self = StObject.set(x, "stripTrailingSlash", value.asInstanceOf[js.Any])
    
    inline def setStripTrailingSlashUndefined: Self = StObject.set(x, "stripTrailingSlash", js.undefined)
  }
}
