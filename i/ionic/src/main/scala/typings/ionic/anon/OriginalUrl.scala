package typings.ionic.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OriginalUrl extends StObject {
  
  var originalUrl: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object OriginalUrl {
  
  inline def apply(): OriginalUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OriginalUrl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OriginalUrl] (val x: Self) extends AnyVal {
    
    inline def setOriginalUrl(value: String): Self = StObject.set(x, "originalUrl", value.asInstanceOf[js.Any])
    
    inline def setOriginalUrlUndefined: Self = StObject.set(x, "originalUrl", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
