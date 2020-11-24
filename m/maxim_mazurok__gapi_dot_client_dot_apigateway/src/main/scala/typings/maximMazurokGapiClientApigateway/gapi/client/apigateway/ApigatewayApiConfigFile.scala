package typings.maximMazurokGapiClientApigateway.gapi.client.apigateway

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApigatewayApiConfigFile extends js.Object {
  
  /** The bytes that constitute the file. */
  var contents: js.UndefOr[String] = js.native
  
  /** The file path (full or relative path). This is typically the path of the file when it is uploaded. */
  var path: js.UndefOr[String] = js.native
}
object ApigatewayApiConfigFile {
  
  @scala.inline
  def apply(): ApigatewayApiConfigFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApigatewayApiConfigFile]
  }
  
  @scala.inline
  implicit class ApigatewayApiConfigFileOps[Self <: ApigatewayApiConfigFile] (val x: Self) extends AnyVal {
    
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
    def setContents(value: String): Self = this.set("contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContents: Self = this.set("contents", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
}
