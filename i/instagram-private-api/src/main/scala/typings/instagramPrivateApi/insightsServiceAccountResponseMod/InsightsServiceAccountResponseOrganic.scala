package typings.instagramPrivateApi.insightsServiceAccountResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightsServiceAccountResponseOrganic extends StObject {
  
  var status: String = js.native
  
  var value: Double = js.native
}
object InsightsServiceAccountResponseOrganic {
  
  @scala.inline
  def apply(status: String, value: Double): InsightsServiceAccountResponseOrganic = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseOrganic]
  }
  
  @scala.inline
  implicit class InsightsServiceAccountResponseOrganicMutableBuilder[Self <: InsightsServiceAccountResponseOrganic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
