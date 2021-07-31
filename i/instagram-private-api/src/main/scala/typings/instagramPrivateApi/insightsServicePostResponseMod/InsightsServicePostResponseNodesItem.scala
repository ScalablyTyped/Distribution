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
  
  @scala.inline
  def apply(__typename: String, value: Double): InsightsServicePostResponseNodesItem = {
    val __obj = js.Dynamic.literal(__typename = __typename.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServicePostResponseNodesItem]
  }
  
  @scala.inline
  implicit class InsightsServicePostResponseNodesItemMutableBuilder[Self <: InsightsServicePostResponseNodesItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__typename(value: String): Self = StObject.set(x, "__typename", value.asInstanceOf[js.Any])
  }
}
