package typings.maximMazurokGapiClientCloudfunctions.gapi.client.cloudfunctions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpsTrigger extends StObject {
  
  /** Output only. The deployed url for the function. */
  var url: js.UndefOr[String] = js.native
}
object HttpsTrigger {
  
  @scala.inline
  def apply(): HttpsTrigger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpsTrigger]
  }
  
  @scala.inline
  implicit class HttpsTriggerMutableBuilder[Self <: HttpsTrigger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
