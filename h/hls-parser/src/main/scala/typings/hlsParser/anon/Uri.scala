package typings.hlsParser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Uri extends StObject {
  
  var byterange: js.UndefOr[typings.hlsParser.mod.Byterange] = js.native
  
  var uri: String = js.native
}
object Uri {
  
  @scala.inline
  def apply(uri: String): Uri = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Uri]
  }
  
  @scala.inline
  implicit class UriMutableBuilder[Self <: Uri] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setByterange(value: typings.hlsParser.mod.Byterange): Self = StObject.set(x, "byterange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByterangeUndefined: Self = StObject.set(x, "byterange", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
