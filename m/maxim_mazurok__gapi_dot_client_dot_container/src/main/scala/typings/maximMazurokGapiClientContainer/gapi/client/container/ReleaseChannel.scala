package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseChannel extends StObject {
  
  /** channel specifies which release channel the cluster is subscribed to. */
  var channel: js.UndefOr[String] = js.undefined
}
object ReleaseChannel {
  
  inline def apply(): ReleaseChannel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReleaseChannel]
  }
  
  extension [Self <: ReleaseChannel](x: Self) {
    
    inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
  }
}
