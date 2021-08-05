package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DriveLocationRestrict extends StObject {
  
  var `type`: js.UndefOr[String] = js.undefined
}
object DriveLocationRestrict {
  
  inline def apply(): DriveLocationRestrict = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DriveLocationRestrict]
  }
  
  extension [Self <: DriveLocationRestrict](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
