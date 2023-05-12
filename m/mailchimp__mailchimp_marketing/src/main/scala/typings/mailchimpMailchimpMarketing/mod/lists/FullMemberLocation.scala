package typings.mailchimpMailchimpMarketing.mod.lists

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FullMemberLocation
  extends StObject
     with MemberLocation {
  
  var country_code: String
  
  var dstoff: Double
  
  var gmtoff: Double
  
  var region: String
  
  var timezone: String
}
object FullMemberLocation {
  
  inline def apply(
    country_code: String,
    dstoff: Double,
    gmtoff: Double,
    latitude: Double,
    logitude: Double,
    region: String,
    timezone: String
  ): FullMemberLocation = {
    val __obj = js.Dynamic.literal(country_code = country_code.asInstanceOf[js.Any], dstoff = dstoff.asInstanceOf[js.Any], gmtoff = gmtoff.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], logitude = logitude.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullMemberLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FullMemberLocation] (val x: Self) extends AnyVal {
    
    inline def setCountry_code(value: String): Self = StObject.set(x, "country_code", value.asInstanceOf[js.Any])
    
    inline def setDstoff(value: Double): Self = StObject.set(x, "dstoff", value.asInstanceOf[js.Any])
    
    inline def setGmtoff(value: Double): Self = StObject.set(x, "gmtoff", value.asInstanceOf[js.Any])
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
  }
}
