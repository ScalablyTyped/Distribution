package typings.googleapis.securitycenterV1Mod.securitycenterV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSetMuteRequest extends StObject {
  
  /**
    * Required. The desired state of the Mute.
    */
  var mute: js.UndefOr[String | Null] = js.undefined
}
object SchemaSetMuteRequest {
  
  inline def apply(): SchemaSetMuteRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSetMuteRequest]
  }
  
  extension [Self <: SchemaSetMuteRequest](x: Self) {
    
    inline def setMute(value: String): Self = StObject.set(x, "mute", value.asInstanceOf[js.Any])
    
    inline def setMuteNull: Self = StObject.set(x, "mute", null)
    
    inline def setMuteUndefined: Self = StObject.set(x, "mute", js.undefined)
  }
}
