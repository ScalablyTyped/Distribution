package typings.maximMazurokGapiClientApigateway.gapi.client.apigateway

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApigatewayApiConfigFile extends StObject {
  
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
  implicit class ApigatewayApiConfigFileMutableBuilder[Self <: ApigatewayApiConfigFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
