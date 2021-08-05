package typings.ionicCliFramework.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkFootnote
  extends StObject
     with Footnote {
  
  var id: String | Double
  
  var shortUrl: js.UndefOr[String] = js.undefined
  
  var url: String
}
object LinkFootnote {
  
  inline def apply(id: String | Double, url: String): LinkFootnote = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkFootnote]
  }
  
  extension [Self <: LinkFootnote](x: Self) {
    
    inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setShortUrl(value: String): Self = StObject.set(x, "shortUrl", value.asInstanceOf[js.Any])
    
    inline def setShortUrlUndefined: Self = StObject.set(x, "shortUrl", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
