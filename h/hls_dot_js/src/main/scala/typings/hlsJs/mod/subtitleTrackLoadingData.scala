package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait subtitleTrackLoadingData extends StObject {
  
  var id: String
  
  var url: String
}
object subtitleTrackLoadingData {
  
  inline def apply(id: String, url: String): subtitleTrackLoadingData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[subtitleTrackLoadingData]
  }
  
  extension [Self <: subtitleTrackLoadingData](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
