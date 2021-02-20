package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTTPDelivery extends StObject {
  
  /** The URI to which JSON-containing HTTP POST requests should be sent. */
  var uri: js.UndefOr[String] = js.native
}
object HTTPDelivery {
  
  @scala.inline
  def apply(): HTTPDelivery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTTPDelivery]
  }
  
  @scala.inline
  implicit class HTTPDeliveryMutableBuilder[Self <: HTTPDelivery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
