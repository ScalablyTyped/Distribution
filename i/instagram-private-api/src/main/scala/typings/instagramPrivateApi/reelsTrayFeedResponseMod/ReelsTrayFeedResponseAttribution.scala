package typings.instagramPrivateApi.reelsTrayFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReelsTrayFeedResponseAttribution extends StObject {
  
  var name: String
}
object ReelsTrayFeedResponseAttribution {
  
  inline def apply(name: String): ReelsTrayFeedResponseAttribution = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReelsTrayFeedResponseAttribution]
  }
  
  extension [Self <: ReelsTrayFeedResponseAttribution](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
