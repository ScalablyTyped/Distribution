package typings.jpm.requestMod

import typings.jpm.FFAddonSDK.SDKURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseRequest extends js.Object {
  
  var content: String = js.native
  
  var contentType: String = js.native
  
  def delete(): Unit = js.native
  
  def get(): Unit = js.native
  
  def head(): Unit = js.native
  
  var headers: js.Object = js.native
  
  def post(): Unit = js.native
  
  def put(): Unit = js.native
  
  var url: String | SDKURL = js.native
}
object BaseRequest {
  
  @scala.inline
  def apply(
    content: String,
    contentType: String,
    delete: () => Unit,
    get: () => Unit,
    head: () => Unit,
    headers: js.Object,
    post: () => Unit,
    put: () => Unit,
    url: String | SDKURL
  ): BaseRequest = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], delete = js.Any.fromFunction0(delete), get = js.Any.fromFunction0(get), head = js.Any.fromFunction0(head), headers = headers.asInstanceOf[js.Any], post = js.Any.fromFunction0(post), put = js.Any.fromFunction0(put), url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseRequest]
  }
  
  @scala.inline
  implicit class BaseRequestOps[Self <: BaseRequest] (val x: Self) extends AnyVal {
    
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = this.set("delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet(value: () => Unit): Self = this.set("get", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHead(value: () => Unit): Self = this.set("head", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPost(value: () => Unit): Self = this.set("post", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPut(value: () => Unit): Self = this.set("put", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUrl(value: String | SDKURL): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
