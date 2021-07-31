package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrinterIccProfiles extends StObject {
  
  var `profile-name`: js.UndefOr[String] = js.undefined
  
  var `profile-url`: js.UndefOr[String] = js.undefined
}
object PrinterIccProfiles {
  
  @scala.inline
  def apply(): PrinterIccProfiles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrinterIccProfiles]
  }
  
  @scala.inline
  implicit class PrinterIccProfilesMutableBuilder[Self <: PrinterIccProfiles] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setProfile-name`(value: String): Self = StObject.set(x, "profile-name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setProfile-nameUndefined`: Self = StObject.set(x, "profile-name", js.undefined)
    
    @scala.inline
    def `setProfile-url`(value: String): Self = StObject.set(x, "profile-url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setProfile-urlUndefined`: Self = StObject.set(x, "profile-url", js.undefined)
  }
}
