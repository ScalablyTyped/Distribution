package typings.instagramPrivateApi.insightsServiceAccountResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsightsServiceAccountResponseProfilePicture extends StObject {
  
  var uri: String
}
object InsightsServiceAccountResponseProfilePicture {
  
  inline def apply(uri: String): InsightsServiceAccountResponseProfilePicture = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseProfilePicture]
  }
  
  extension [Self <: InsightsServiceAccountResponseProfilePicture](x: Self) {
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
