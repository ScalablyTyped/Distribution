package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWhiteboardInfo extends StObject {
  
  /**
    * The Cosmo Id of the whiteboard document (Jam).
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Title of the whiteboard document.
    */
  var title: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The uri for whiteboard document.
    */
  var uri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This field is deprecated and will be removed. Please use "uri" instead.
    */
  var whiteboardUri: js.UndefOr[String | Null] = js.undefined
}
object SchemaWhiteboardInfo {
  
  inline def apply(): SchemaWhiteboardInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWhiteboardInfo]
  }
  
  extension [Self <: SchemaWhiteboardInfo](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    
    inline def setWhiteboardUri(value: String): Self = StObject.set(x, "whiteboardUri", value.asInstanceOf[js.Any])
    
    inline def setWhiteboardUriNull: Self = StObject.set(x, "whiteboardUri", null)
    
    inline def setWhiteboardUriUndefined: Self = StObject.set(x, "whiteboardUri", js.undefined)
  }
}
