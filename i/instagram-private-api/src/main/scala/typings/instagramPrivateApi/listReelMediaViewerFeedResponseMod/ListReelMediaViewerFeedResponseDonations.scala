package typings.instagramPrivateApi.listReelMediaViewerFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReelMediaViewerFeedResponseDonations extends StObject {
  
  var donations: js.Array[js.Any]
  
  var max_id: Null
  
  var more_available: Boolean
}
object ListReelMediaViewerFeedResponseDonations {
  
  inline def apply(donations: js.Array[js.Any], max_id: Null, more_available: Boolean): ListReelMediaViewerFeedResponseDonations = {
    val __obj = js.Dynamic.literal(donations = donations.asInstanceOf[js.Any], max_id = max_id.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListReelMediaViewerFeedResponseDonations]
  }
  
  extension [Self <: ListReelMediaViewerFeedResponseDonations](x: Self) {
    
    inline def setDonations(value: js.Array[js.Any]): Self = StObject.set(x, "donations", value.asInstanceOf[js.Any])
    
    inline def setDonationsVarargs(value: js.Any*): Self = StObject.set(x, "donations", js.Array(value :_*))
    
    inline def setMax_id(value: Null): Self = StObject.set(x, "max_id", value.asInstanceOf[js.Any])
    
    inline def setMore_available(value: Boolean): Self = StObject.set(x, "more_available", value.asInstanceOf[js.Any])
  }
}
