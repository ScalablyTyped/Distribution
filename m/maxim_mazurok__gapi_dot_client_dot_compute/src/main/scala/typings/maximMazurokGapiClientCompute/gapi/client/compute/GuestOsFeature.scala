package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GuestOsFeature extends StObject {
  
  /** The ID of a supported feature. Read Enabling guest operating system features to see a list of available options. */
  var `type`: js.UndefOr[String] = js.undefined
}
object GuestOsFeature {
  
  inline def apply(): GuestOsFeature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GuestOsFeature]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GuestOsFeature] (val x: Self) extends AnyVal {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
