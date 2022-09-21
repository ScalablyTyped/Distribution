package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1PersonalDetails extends StObject {
  
  /**
    * Set if the entry is starred; unset otherwise.
    */
  var starTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * True if the entry is starred by the user; false otherwise.
    */
  var starred: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1PersonalDetails {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1PersonalDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1PersonalDetails]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1PersonalDetails](x: Self) {
    
    inline def setStarTime(value: String): Self = StObject.set(x, "starTime", value.asInstanceOf[js.Any])
    
    inline def setStarTimeNull: Self = StObject.set(x, "starTime", null)
    
    inline def setStarTimeUndefined: Self = StObject.set(x, "starTime", js.undefined)
    
    inline def setStarred(value: Boolean): Self = StObject.set(x, "starred", value.asInstanceOf[js.Any])
    
    inline def setStarredNull: Self = StObject.set(x, "starred", null)
    
    inline def setStarredUndefined: Self = StObject.set(x, "starred", js.undefined)
  }
}
