package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DriveLocationRestrict extends StObject {
  
  var `type`: js.UndefOr[String] = js.native
}
object DriveLocationRestrict {
  
  @scala.inline
  def apply(): DriveLocationRestrict = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DriveLocationRestrict]
  }
  
  @scala.inline
  implicit class DriveLocationRestrictMutableBuilder[Self <: DriveLocationRestrict] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
