package typings.ipfsHttpClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadFormat extends StObject {
  
  var formats: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var loadFormat: js.UndefOr[js.Function] = js.undefined
}
object LoadFormat {
  
  @scala.inline
  def apply(): LoadFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadFormat]
  }
  
  @scala.inline
  implicit class LoadFormatMutableBuilder[Self <: LoadFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormats(value: js.Array[js.Any]): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
    
    @scala.inline
    def setFormatsVarargs(value: js.Any*): Self = StObject.set(x, "formats", js.Array(value :_*))
    
    @scala.inline
    def setLoadFormat(value: js.Function): Self = StObject.set(x, "loadFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadFormatUndefined: Self = StObject.set(x, "loadFormat", js.undefined)
  }
}
