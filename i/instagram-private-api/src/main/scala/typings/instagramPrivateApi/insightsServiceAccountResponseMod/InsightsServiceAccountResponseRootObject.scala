package typings.instagramPrivateApi.insightsServiceAccountResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsightsServiceAccountResponseRootObject extends StObject {
  
  var data: InsightsServiceAccountResponseData
}
object InsightsServiceAccountResponseRootObject {
  
  inline def apply(data: InsightsServiceAccountResponseData): InsightsServiceAccountResponseRootObject = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseRootObject]
  }
  
  extension [Self <: InsightsServiceAccountResponseRootObject](x: Self) {
    
    inline def setData(value: InsightsServiceAccountResponseData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
