package typings.hlsJs.mod

import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait errorData extends StObject {
  
  var buffer: js.UndefOr[Double] = js.native
  
  var context: js.UndefOr[LoaderContext] = js.native
  
  var details: String = js.native
  
  var fatal: Boolean = js.native
  
  var frag: js.UndefOr[Fragment] = js.native
  
  var levelRetry: js.UndefOr[Boolean] = js.native
  
  var loader: js.UndefOr[Loader] = js.native
  
  var networkDetails: js.UndefOr[XMLHttpRequest] = js.native
  
  var response: js.UndefOr[LoaderError] = js.native
  
  var `type`: String = js.native
  
  var url: js.UndefOr[String] = js.native
}
object errorData {
  
  @scala.inline
  def apply(details: String, fatal: Boolean, `type`: String): errorData = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], fatal = fatal.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[errorData]
  }
  
  @scala.inline
  implicit class errorDataMutableBuilder[Self <: errorData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuffer(value: Double): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
    
    @scala.inline
    def setContext(value: LoaderContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFatal(value: Boolean): Self = StObject.set(x, "fatal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrag(value: Fragment): Self = StObject.set(x, "frag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragUndefined: Self = StObject.set(x, "frag", js.undefined)
    
    @scala.inline
    def setLevelRetry(value: Boolean): Self = StObject.set(x, "levelRetry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelRetryUndefined: Self = StObject.set(x, "levelRetry", js.undefined)
    
    @scala.inline
    def setLoader(value: Loader): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
    
    @scala.inline
    def setNetworkDetails(value: XMLHttpRequest): Self = StObject.set(x, "networkDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkDetailsUndefined: Self = StObject.set(x, "networkDetails", js.undefined)
    
    @scala.inline
    def setResponse(value: LoaderError): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
