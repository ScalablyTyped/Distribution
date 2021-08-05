package typings.instagramPrivateApi.insightsServicePostResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsightsServicePostResponseProfileActions extends StObject {
  
  var actions: InsightsServicePostResponseActions
}
object InsightsServicePostResponseProfileActions {
  
  inline def apply(actions: InsightsServicePostResponseActions): InsightsServicePostResponseProfileActions = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServicePostResponseProfileActions]
  }
  
  extension [Self <: InsightsServicePostResponseProfileActions](x: Self) {
    
    inline def setActions(value: InsightsServicePostResponseActions): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
  }
}
