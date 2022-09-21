package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteBabelPlaceholderMetadataHangoutVideoEventMetadata extends StObject {
  
  var hangoutVideoType: js.UndefOr[String] = js.undefined
}
object AppsDynamiteBabelPlaceholderMetadataHangoutVideoEventMetadata {
  
  inline def apply(): AppsDynamiteBabelPlaceholderMetadataHangoutVideoEventMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteBabelPlaceholderMetadataHangoutVideoEventMetadata]
  }
  
  extension [Self <: AppsDynamiteBabelPlaceholderMetadataHangoutVideoEventMetadata](x: Self) {
    
    inline def setHangoutVideoType(value: String): Self = StObject.set(x, "hangoutVideoType", value.asInstanceOf[js.Any])
    
    inline def setHangoutVideoTypeUndefined: Self = StObject.set(x, "hangoutVideoType", js.undefined)
  }
}
