package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DestinationUris extends StObject {
  
  var `destination-attributes`: js.UndefOr[js.Array[js.Object]] = js.native
  
  var `destination-uri`: js.UndefOr[String] = js.native
  
  var `feed-orientation`: js.UndefOr[FeedOrientation] = js.native
  
  var `post-dial-string`: js.UndefOr[String] = js.native
  
  var `pre-dial-string`: js.UndefOr[String] = js.native
  
  var `t33-subaddress`: js.UndefOr[Double] = js.native
}
object DestinationUris {
  
  @scala.inline
  def apply(): DestinationUris = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestinationUris]
  }
  
  @scala.inline
  implicit class DestinationUrisMutableBuilder[Self <: DestinationUris] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setDestination-attributes`(value: js.Array[js.Object]): Self = StObject.set(x, "destination-attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDestination-attributesUndefined`: Self = StObject.set(x, "destination-attributes", js.undefined)
    
    @scala.inline
    def `setDestination-attributesVarargs`(value: js.Object*): Self = StObject.set(x, "destination-attributes", js.Array(value :_*))
    
    @scala.inline
    def `setDestination-uri`(value: String): Self = StObject.set(x, "destination-uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDestination-uriUndefined`: Self = StObject.set(x, "destination-uri", js.undefined)
    
    @scala.inline
    def `setFeed-orientation`(value: FeedOrientation): Self = StObject.set(x, "feed-orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFeed-orientationUndefined`: Self = StObject.set(x, "feed-orientation", js.undefined)
    
    @scala.inline
    def `setPost-dial-string`(value: String): Self = StObject.set(x, "post-dial-string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPost-dial-stringUndefined`: Self = StObject.set(x, "post-dial-string", js.undefined)
    
    @scala.inline
    def `setPre-dial-string`(value: String): Self = StObject.set(x, "pre-dial-string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPre-dial-stringUndefined`: Self = StObject.set(x, "pre-dial-string", js.undefined)
    
    @scala.inline
    def `setT33-subaddress`(value: Double): Self = StObject.set(x, "t33-subaddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setT33-subaddressUndefined`: Self = StObject.set(x, "t33-subaddress", js.undefined)
  }
}
