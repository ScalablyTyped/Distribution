package typings.instagramPrivateApi.insightsServicePostResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsightsServicePostResponseData extends StObject {
  
  var media: InsightsServicePostResponseMedia
}
object InsightsServicePostResponseData {
  
  inline def apply(media: InsightsServicePostResponseMedia): InsightsServicePostResponseData = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServicePostResponseData]
  }
  
  extension [Self <: InsightsServicePostResponseData](x: Self) {
    
    inline def setMedia(value: InsightsServicePostResponseMedia): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
  }
}
