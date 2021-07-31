package typings.instagramPrivateApi.insightsServiceAccountResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsightsServiceAccountResponseBusinessProfile extends StObject {
  
  var id: String
}
object InsightsServiceAccountResponseBusinessProfile {
  
  @scala.inline
  def apply(id: String): InsightsServiceAccountResponseBusinessProfile = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseBusinessProfile]
  }
  
  @scala.inline
  implicit class InsightsServiceAccountResponseBusinessProfileMutableBuilder[Self <: InsightsServiceAccountResponseBusinessProfile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
