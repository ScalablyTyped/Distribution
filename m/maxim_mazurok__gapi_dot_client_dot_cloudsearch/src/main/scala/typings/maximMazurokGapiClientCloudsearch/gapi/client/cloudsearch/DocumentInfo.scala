package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentInfo extends StObject {
  
  /** A whiteboard document. */
  var whiteboardInfo: js.UndefOr[WhiteboardInfo] = js.undefined
}
object DocumentInfo {
  
  inline def apply(): DocumentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentInfo] (val x: Self) extends AnyVal {
    
    inline def setWhiteboardInfo(value: WhiteboardInfo): Self = StObject.set(x, "whiteboardInfo", value.asInstanceOf[js.Any])
    
    inline def setWhiteboardInfoUndefined: Self = StObject.set(x, "whiteboardInfo", js.undefined)
  }
}
