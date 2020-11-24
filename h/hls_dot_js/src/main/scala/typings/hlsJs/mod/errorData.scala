package typings.hlsJs.mod

import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait errorData extends js.Object {
  
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
  implicit class errorDataOps[Self <: errorData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDetails(value: String): Self = this.set("details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFatal(value: Boolean): Self = this.set("fatal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuffer(value: Double): Self = this.set("buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuffer: Self = this.set("buffer", js.undefined)
    
    @scala.inline
    def setContext(value: LoaderContext): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setFrag(value: Fragment): Self = this.set("frag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrag: Self = this.set("frag", js.undefined)
    
    @scala.inline
    def setLevelRetry(value: Boolean): Self = this.set("levelRetry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevelRetry: Self = this.set("levelRetry", js.undefined)
    
    @scala.inline
    def setLoader(value: Loader): Self = this.set("loader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoader: Self = this.set("loader", js.undefined)
    
    @scala.inline
    def setNetworkDetails(value: XMLHttpRequest): Self = this.set("networkDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkDetails: Self = this.set("networkDetails", js.undefined)
    
    @scala.inline
    def setResponse(value: LoaderError): Self = this.set("response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponse: Self = this.set("response", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
