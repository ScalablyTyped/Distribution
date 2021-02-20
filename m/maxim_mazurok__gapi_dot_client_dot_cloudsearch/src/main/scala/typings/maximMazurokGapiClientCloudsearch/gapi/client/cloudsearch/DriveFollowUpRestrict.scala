package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DriveFollowUpRestrict extends StObject {
  
  var `type`: js.UndefOr[String] = js.native
}
object DriveFollowUpRestrict {
  
  @scala.inline
  def apply(): DriveFollowUpRestrict = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DriveFollowUpRestrict]
  }
  
  @scala.inline
  implicit class DriveFollowUpRestrictMutableBuilder[Self <: DriveFollowUpRestrict] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
