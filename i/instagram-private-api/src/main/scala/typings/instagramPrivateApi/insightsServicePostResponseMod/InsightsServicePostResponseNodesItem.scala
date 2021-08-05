package typings.instagramPrivateApi.insightsServicePostResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsightsServicePostResponseNodesItem extends StObject {
  
  var __typename: String
  
  var name: js.UndefOr[String] = js.undefined
  
  var value: Double
}
object InsightsServicePostResponseNodesItem {
  
  inline def apply(__typename: String, value: Double): InsightsServicePostResponseNodesItem = {
    val __obj = js.Dynamic.literal(__typename = __typename.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServicePostResponseNodesItem]
  }
  
  extension [Self <: InsightsServicePostResponseNodesItem](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def set__typename(value: String): Self = StObject.set(x, "__typename", value.asInstanceOf[js.Any])
  }
}
