package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTTPDelivery extends StObject {
  
  /** The URI to which JSON-containing HTTP POST requests should be sent. */
  var uri: js.UndefOr[String] = js.undefined
}
object HTTPDelivery {
  
  inline def apply(): HTTPDelivery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTTPDelivery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HTTPDelivery] (val x: Self) extends AnyVal {
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
