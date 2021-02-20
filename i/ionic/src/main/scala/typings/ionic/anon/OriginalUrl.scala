package typings.ionic.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OriginalUrl extends StObject {
  
  var originalUrl: js.UndefOr[String] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object OriginalUrl {
  
  @scala.inline
  def apply(): OriginalUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OriginalUrl]
  }
  
  @scala.inline
  implicit class OriginalUrlMutableBuilder[Self <: OriginalUrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOriginalUrl(value: String): Self = StObject.set(x, "originalUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalUrlUndefined: Self = StObject.set(x, "originalUrl", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
