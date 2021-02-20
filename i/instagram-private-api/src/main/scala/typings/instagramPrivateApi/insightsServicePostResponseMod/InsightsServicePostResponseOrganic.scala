package typings.instagramPrivateApi.insightsServicePostResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightsServicePostResponseOrganic extends StObject {
  
  var status: String = js.native
  
  var value: Double = js.native
}
object InsightsServicePostResponseOrganic {
  
  @scala.inline
  def apply(status: String, value: Double): InsightsServicePostResponseOrganic = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServicePostResponseOrganic]
  }
  
  @scala.inline
  implicit class InsightsServicePostResponseOrganicMutableBuilder[Self <: InsightsServicePostResponseOrganic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
