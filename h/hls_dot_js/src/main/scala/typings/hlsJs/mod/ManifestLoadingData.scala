package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManifestLoadingData extends StObject {
  
  var url: String
}
object ManifestLoadingData {
  
  inline def apply(url: String): ManifestLoadingData = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManifestLoadingData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ManifestLoadingData] (val x: Self) extends AnyVal {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
