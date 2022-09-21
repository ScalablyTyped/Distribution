package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DestinationUris extends StObject {
  
  var `destination-attributes`: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var `destination-uri`: js.UndefOr[String] = js.undefined
  
  var `feed-orientation`: js.UndefOr[FeedOrientation] = js.undefined
  
  var `post-dial-string`: js.UndefOr[String] = js.undefined
  
  var `pre-dial-string`: js.UndefOr[String] = js.undefined
  
  var `t33-subaddress`: js.UndefOr[Double] = js.undefined
}
object DestinationUris {
  
  inline def apply(): DestinationUris = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestinationUris]
  }
  
  extension [Self <: DestinationUris](x: Self) {
    
    inline def `setDestination-attributes`(value: js.Array[js.Object]): Self = StObject.set(x, "destination-attributes", value.asInstanceOf[js.Any])
    
    inline def `setDestination-attributesUndefined`: Self = StObject.set(x, "destination-attributes", js.undefined)
    
    inline def `setDestination-attributesVarargs`(value: js.Object*): Self = StObject.set(x, "destination-attributes", js.Array(value*))
    
    inline def `setDestination-uri`(value: String): Self = StObject.set(x, "destination-uri", value.asInstanceOf[js.Any])
    
    inline def `setDestination-uriUndefined`: Self = StObject.set(x, "destination-uri", js.undefined)
    
    inline def `setFeed-orientation`(value: FeedOrientation): Self = StObject.set(x, "feed-orientation", value.asInstanceOf[js.Any])
    
    inline def `setFeed-orientationUndefined`: Self = StObject.set(x, "feed-orientation", js.undefined)
    
    inline def `setPost-dial-string`(value: String): Self = StObject.set(x, "post-dial-string", value.asInstanceOf[js.Any])
    
    inline def `setPost-dial-stringUndefined`: Self = StObject.set(x, "post-dial-string", js.undefined)
    
    inline def `setPre-dial-string`(value: String): Self = StObject.set(x, "pre-dial-string", value.asInstanceOf[js.Any])
    
    inline def `setPre-dial-stringUndefined`: Self = StObject.set(x, "pre-dial-string", js.undefined)
    
    inline def `setT33-subaddress`(value: Double): Self = StObject.set(x, "t33-subaddress", value.asInstanceOf[js.Any])
    
    inline def `setT33-subaddressUndefined`: Self = StObject.set(x, "t33-subaddress", js.undefined)
  }
}
