package typings.graphqlReact.mod

import typings.std.FormData
import typings.std.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphQLFetchOptions extends js.Object {
  
  var body: String | FormData = js.native
  
  var credentials: Null | String = js.native
  
  var headers: Headers = js.native
  
  var url: String = js.native
}
object GraphQLFetchOptions {
  
  @scala.inline
  def apply(body: String | FormData, headers: Headers, url: String): GraphQLFetchOptions = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLFetchOptions]
  }
  
  @scala.inline
  implicit class GraphQLFetchOptionsOps[Self <: GraphQLFetchOptions] (val x: Self) extends AnyVal {
    
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
    def setBody(value: String | FormData): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: Headers): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentials(value: String): Self = this.set("credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialsNull: Self = this.set("credentials", null)
  }
}
