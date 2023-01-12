package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1PersonalDetails extends StObject {
  
  /** Set if the entry is starred; unset otherwise. */
  var starTime: js.UndefOr[String] = js.undefined
  
  /** True if the entry is starred by the user; false otherwise. */
  var starred: js.UndefOr[Boolean] = js.undefined
}
object GoogleCloudDatacatalogV1PersonalDetails {
  
  inline def apply(): GoogleCloudDatacatalogV1PersonalDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1PersonalDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDatacatalogV1PersonalDetails] (val x: Self) extends AnyVal {
    
    inline def setStarTime(value: String): Self = StObject.set(x, "starTime", value.asInstanceOf[js.Any])
    
    inline def setStarTimeUndefined: Self = StObject.set(x, "starTime", js.undefined)
    
    inline def setStarred(value: Boolean): Self = StObject.set(x, "starred", value.asInstanceOf[js.Any])
    
    inline def setStarredUndefined: Self = StObject.set(x, "starred", js.undefined)
  }
}
