package typings.maximMazurokGapiClientApigateway.gapi.client.apigateway

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApigatewayApiConfigFile extends StObject {
  
  /** The bytes that constitute the file. */
  var contents: js.UndefOr[String] = js.undefined
  
  /** The file path (full or relative path). This is typically the path of the file when it is uploaded. */
  var path: js.UndefOr[String] = js.undefined
}
object ApigatewayApiConfigFile {
  
  inline def apply(): ApigatewayApiConfigFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApigatewayApiConfigFile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApigatewayApiConfigFile] (val x: Self) extends AnyVal {
    
    inline def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
