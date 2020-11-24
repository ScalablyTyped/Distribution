package typings.k6.httpMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Params extends js.Object {
  
  /** Authentication method. */
  var auth: js.UndefOr[AuthMethod] = js.native
  
  /** Request body compression. */
  var compression: js.UndefOr[String] = js.native
  
  /** Request scoped cookies. */
  var cookies: js.UndefOr[StringDictionary[ParamsCookieValue]] = js.native
  
  /** Request headers. */
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  
  /** Cookie jar to override default VU cookie jar with. */
  var jar: js.UndefOr[CookieJar_] = js.native
  
  /** Maximum redirects to follow. */
  var redirects: js.UndefOr[Double] = js.native
  
  /** Response type. */
  var responseType: js.UndefOr[ResponseType] = js.native
  
  /** Response time metric tags. */
  var tags: js.UndefOr[StringDictionary[String]] = js.native
  
  /** Request timeout. */
  var timeout: js.UndefOr[Double] = js.native
}
object Params {
  
  @scala.inline
  def apply(): Params = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Params]
  }
  
  @scala.inline
  implicit class ParamsOps[Self <: Params] (val x: Self) extends AnyVal {
    
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
    def setAuth(value: AuthMethod): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setCompression(value: String): Self = this.set("compression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompression: Self = this.set("compression", js.undefined)
    
    @scala.inline
    def setCookies(value: StringDictionary[ParamsCookieValue]): Self = this.set("cookies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookies: Self = this.set("cookies", js.undefined)
    
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setJar(value: CookieJar_): Self = this.set("jar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJar: Self = this.set("jar", js.undefined)
    
    @scala.inline
    def setRedirects(value: Double): Self = this.set("redirects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirects: Self = this.set("redirects", js.undefined)
    
    @scala.inline
    def setResponseType(value: ResponseType): Self = this.set("responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseType: Self = this.set("responseType", js.undefined)
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
