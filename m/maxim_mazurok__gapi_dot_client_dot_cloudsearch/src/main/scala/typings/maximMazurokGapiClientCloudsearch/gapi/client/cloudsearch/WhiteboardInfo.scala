package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WhiteboardInfo extends StObject {
  
  /** The Cosmo Id of the whiteboard document (Jam). */
  var id: js.UndefOr[String] = js.undefined
  
  /** Title of the whiteboard document. */
  var title: js.UndefOr[String] = js.undefined
  
  /** The uri for whiteboard document. */
  var uri: js.UndefOr[String] = js.undefined
  
  /** This field is deprecated and will be removed. Please use "uri" instead. */
  var whiteboardUri: js.UndefOr[String] = js.undefined
}
object WhiteboardInfo {
  
  inline def apply(): WhiteboardInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WhiteboardInfo]
  }
  
  extension [Self <: WhiteboardInfo](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    
    inline def setWhiteboardUri(value: String): Self = StObject.set(x, "whiteboardUri", value.asInstanceOf[js.Any])
    
    inline def setWhiteboardUriUndefined: Self = StObject.set(x, "whiteboardUri", js.undefined)
  }
}
