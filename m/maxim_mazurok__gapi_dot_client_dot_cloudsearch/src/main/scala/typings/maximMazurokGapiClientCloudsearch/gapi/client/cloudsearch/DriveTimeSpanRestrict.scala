package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DriveTimeSpanRestrict extends StObject {
  
  var `type`: js.UndefOr[String] = js.undefined
}
object DriveTimeSpanRestrict {
  
  @scala.inline
  def apply(): DriveTimeSpanRestrict = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DriveTimeSpanRestrict]
  }
  
  @scala.inline
  implicit class DriveTimeSpanRestrictMutableBuilder[Self <: DriveTimeSpanRestrict] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
