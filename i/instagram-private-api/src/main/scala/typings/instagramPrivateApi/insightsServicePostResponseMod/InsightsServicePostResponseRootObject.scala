package typings.instagramPrivateApi.insightsServicePostResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightsServicePostResponseRootObject extends StObject {
  
  var data: InsightsServicePostResponseData = js.native
}
object InsightsServicePostResponseRootObject {
  
  @scala.inline
  def apply(data: InsightsServicePostResponseData): InsightsServicePostResponseRootObject = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServicePostResponseRootObject]
  }
  
  @scala.inline
  implicit class InsightsServicePostResponseRootObjectMutableBuilder[Self <: InsightsServicePostResponseRootObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: InsightsServicePostResponseData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
