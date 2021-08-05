package typings.instagramPrivateApi.anon

import typings.instagramPrivateApi.graphqlRequestOptionsMod.InsightsFriendlyName
import typings.instagramPrivateApi.graphqlRequestOptionsMod.InsightsSurface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FriendlyName extends StObject {
  
  var friendlyName: InsightsFriendlyName
  
  var name: js.UndefOr[InsightsSurface] = js.undefined
}
object FriendlyName {
  
  inline def apply(friendlyName: InsightsFriendlyName): FriendlyName = {
    val __obj = js.Dynamic.literal(friendlyName = friendlyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FriendlyName]
  }
  
  extension [Self <: FriendlyName](x: Self) {
    
    inline def setFriendlyName(value: InsightsFriendlyName): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    inline def setName(value: InsightsSurface): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
