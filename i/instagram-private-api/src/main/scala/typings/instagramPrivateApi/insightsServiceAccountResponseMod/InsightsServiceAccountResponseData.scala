package typings.instagramPrivateApi.insightsServiceAccountResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightsServiceAccountResponseData extends StObject {
  
  var user: InsightsServiceAccountResponseUser = js.native
}
object InsightsServiceAccountResponseData {
  
  @scala.inline
  def apply(user: InsightsServiceAccountResponseUser): InsightsServiceAccountResponseData = {
    val __obj = js.Dynamic.literal(user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseData]
  }
  
  @scala.inline
  implicit class InsightsServiceAccountResponseDataMutableBuilder[Self <: InsightsServiceAccountResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUser(value: InsightsServiceAccountResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
