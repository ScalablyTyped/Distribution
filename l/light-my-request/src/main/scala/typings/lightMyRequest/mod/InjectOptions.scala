package typings.lightMyRequest.mod

import org.scalablytyped.runtime.StringDictionary
import typings.lightMyRequest.anon.Close
import typings.lightMyRequest.anon.Hostname
import typings.node.httpMod.IncomingHttpHeaders
import typings.node.httpMod.OutgoingHttpHeaders
import typings.node.httpMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InjectOptions extends js.Object {
  
  var authority: js.UndefOr[String] = js.native
  
  var cookies: js.UndefOr[StringDictionary[String]] = js.native
  
  var headers: js.UndefOr[IncomingHttpHeaders | OutgoingHttpHeaders] = js.native
  
  var method: js.UndefOr[HTTPMethods] = js.native
  
  var path: js.UndefOr[String | Hostname] = js.native
  
  var payload: js.UndefOr[InjectPayload] = js.native
  
  var query: js.UndefOr[String | (StringDictionary[String | js.Array[String]])] = js.native
  
  var remoteAddress: js.UndefOr[String] = js.native
  
  var server: js.UndefOr[Server] = js.native
  
  var simulate: js.UndefOr[Close] = js.native
  
  var url: js.UndefOr[String | Hostname] = js.native
  
  var validate: js.UndefOr[Boolean] = js.native
}
object InjectOptions {
  
  @scala.inline
  def apply(): InjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InjectOptions]
  }
  
  @scala.inline
  implicit class InjectOptionsOps[Self <: InjectOptions] (val x: Self) extends AnyVal {
    
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
    def setAuthority(value: String): Self = this.set("authority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthority: Self = this.set("authority", js.undefined)
    
    @scala.inline
    def setCookies(value: StringDictionary[String]): Self = this.set("cookies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookies: Self = this.set("cookies", js.undefined)
    
    @scala.inline
    def setHeaders(value: IncomingHttpHeaders | OutgoingHttpHeaders): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setMethod(value: HTTPMethods): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setPath(value: String | Hostname): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setPayload(value: InjectPayload): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
    
    @scala.inline
    def setQuery(value: String | (StringDictionary[String | js.Array[String]])): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setRemoteAddress(value: String): Self = this.set("remoteAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoteAddress: Self = this.set("remoteAddress", js.undefined)
    
    @scala.inline
    def setServer(value: Server): Self = this.set("server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServer: Self = this.set("server", js.undefined)
    
    @scala.inline
    def setSimulate(value: Close): Self = this.set("simulate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSimulate: Self = this.set("simulate", js.undefined)
    
    @scala.inline
    def setUrl(value: String | Hostname): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setValidate(value: Boolean): Self = this.set("validate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
  }
}
