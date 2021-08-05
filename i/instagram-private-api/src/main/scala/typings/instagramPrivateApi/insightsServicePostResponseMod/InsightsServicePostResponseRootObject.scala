package typings.instagramPrivateApi.insightsServicePostResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsightsServicePostResponseRootObject extends StObject {
  
  var data: InsightsServicePostResponseData
}
object InsightsServicePostResponseRootObject {
  
  inline def apply(data: InsightsServicePostResponseData): InsightsServicePostResponseRootObject = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServicePostResponseRootObject]
  }
  
  extension [Self <: InsightsServicePostResponseRootObject](x: Self) {
    
    inline def setData(value: InsightsServicePostResponseData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
