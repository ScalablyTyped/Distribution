package typings.mapboxGl.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mapboxGl.mapboxGlStrings.GET
import typings.mapboxGl.mapboxGlStrings.POST
import typings.mapboxGl.mapboxGlStrings.PUT
import typings.mapboxGl.mapboxGlStrings.`same-origin`
import typings.mapboxGl.mapboxGlStrings.include
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestParameters extends js.Object {
  
  var collectResourceTiming: js.UndefOr[Boolean] = js.native
  
  /**
    * Use `'include'` to send cookies with cross-origin requests.
    */
  var credentials: js.UndefOr[`same-origin` | include] = js.native
  
  /**
    * The headers to be sent with the request.
    */
  var headers: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var method: js.UndefOr[GET | POST | PUT] = js.native
  
  /**
    * The URL to be requested.
    */
  var url: String = js.native
}
object RequestParameters {
  
  @scala.inline
  def apply(url: String): RequestParameters = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestParameters]
  }
  
  @scala.inline
  implicit class RequestParametersOps[Self <: RequestParameters] (val x: Self) extends AnyVal {
    
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectResourceTiming(value: Boolean): Self = this.set("collectResourceTiming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollectResourceTiming: Self = this.set("collectResourceTiming", js.undefined)
    
    @scala.inline
    def setCredentials(value: `same-origin` | include): Self = this.set("credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCredentials: Self = this.set("credentials", js.undefined)
    
    @scala.inline
    def setHeaders(value: StringDictionary[js.Any]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setMethod(value: GET | POST | PUT): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
  }
}
