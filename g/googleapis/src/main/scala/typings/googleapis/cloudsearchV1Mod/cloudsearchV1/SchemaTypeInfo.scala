package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTypeInfo extends StObject {
  
  /**
    * Contains additional video information only if document_type is VIDEO.
    */
  var videoInfo: js.UndefOr[SchemaVideoInfo] = js.undefined
}
object SchemaTypeInfo {
  
  inline def apply(): SchemaTypeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTypeInfo]
  }
  
  extension [Self <: SchemaTypeInfo](x: Self) {
    
    inline def setVideoInfo(value: SchemaVideoInfo): Self = StObject.set(x, "videoInfo", value.asInstanceOf[js.Any])
    
    inline def setVideoInfoUndefined: Self = StObject.set(x, "videoInfo", js.undefined)
  }
}
