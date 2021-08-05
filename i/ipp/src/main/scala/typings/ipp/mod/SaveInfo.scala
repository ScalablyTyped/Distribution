package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SaveInfo extends StObject {
  
  var `save-document-format`: js.UndefOr[MimeMediaType] = js.undefined
  
  var `save-location`: js.UndefOr[String] = js.undefined
  
  var `save-name`: js.UndefOr[String] = js.undefined
}
object SaveInfo {
  
  inline def apply(): SaveInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaveInfo]
  }
  
  extension [Self <: SaveInfo](x: Self) {
    
    inline def `setSave-document-format`(value: MimeMediaType): Self = StObject.set(x, "save-document-format", value.asInstanceOf[js.Any])
    
    inline def `setSave-document-formatUndefined`: Self = StObject.set(x, "save-document-format", js.undefined)
    
    inline def `setSave-location`(value: String): Self = StObject.set(x, "save-location", value.asInstanceOf[js.Any])
    
    inline def `setSave-locationUndefined`: Self = StObject.set(x, "save-location", js.undefined)
    
    inline def `setSave-name`(value: String): Self = StObject.set(x, "save-name", value.asInstanceOf[js.Any])
    
    inline def `setSave-nameUndefined`: Self = StObject.set(x, "save-name", js.undefined)
  }
}
