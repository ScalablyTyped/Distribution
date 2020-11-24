package typings.isMobile.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpRequestInterfaceMock
  extends /* id */ StringDictionary[js.Any] {
  
  var headers: HttpRequestHeadersInterfaceMock = js.native
}
object HttpRequestInterfaceMock {
  
  @scala.inline
  def apply(headers: HttpRequestHeadersInterfaceMock): HttpRequestInterfaceMock = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpRequestInterfaceMock]
  }
  
  @scala.inline
  implicit class HttpRequestInterfaceMockOps[Self <: HttpRequestInterfaceMock] (val x: Self) extends AnyVal {
    
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
    def setHeaders(value: HttpRequestHeadersInterfaceMock): Self = this.set("headers", value.asInstanceOf[js.Any])
  }
}
