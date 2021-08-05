package typings.maximMazurokGapiClientCloudfunctions.gapi.client.cloudfunctions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpsTrigger extends StObject {
  
  /** Output only. The deployed url for the function. */
  var url: js.UndefOr[String] = js.undefined
}
object HttpsTrigger {
  
  inline def apply(): HttpsTrigger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpsTrigger]
  }
  
  extension [Self <: HttpsTrigger](x: Self) {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
