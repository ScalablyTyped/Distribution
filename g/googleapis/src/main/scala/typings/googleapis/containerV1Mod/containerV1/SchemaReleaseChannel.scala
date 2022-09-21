package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReleaseChannel extends StObject {
  
  /**
    * channel specifies which release channel the cluster is subscribed to.
    */
  var channel: js.UndefOr[String | Null] = js.undefined
}
object SchemaReleaseChannel {
  
  inline def apply(): SchemaReleaseChannel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReleaseChannel]
  }
  
  extension [Self <: SchemaReleaseChannel](x: Self) {
    
    inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setChannelNull: Self = StObject.set(x, "channel", null)
    
    inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
  }
}
