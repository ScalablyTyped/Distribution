package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrinterIccProfiles extends StObject {
  
  var `profile-name`: js.UndefOr[String] = js.undefined
  
  var `profile-url`: js.UndefOr[String] = js.undefined
}
object PrinterIccProfiles {
  
  inline def apply(): PrinterIccProfiles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrinterIccProfiles]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrinterIccProfiles] (val x: Self) extends AnyVal {
    
    inline def `setProfile-name`(value: String): Self = StObject.set(x, "profile-name", value.asInstanceOf[js.Any])
    
    inline def `setProfile-nameUndefined`: Self = StObject.set(x, "profile-name", js.undefined)
    
    inline def `setProfile-url`(value: String): Self = StObject.set(x, "profile-url", value.asInstanceOf[js.Any])
    
    inline def `setProfile-urlUndefined`: Self = StObject.set(x, "profile-url", js.undefined)
  }
}
