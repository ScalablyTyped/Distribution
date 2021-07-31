package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverSheetInfo extends StObject {
  
  var `from-name`: js.UndefOr[String] = js.undefined
  
  var logo: js.UndefOr[String] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
  
  var `organization-name`: js.UndefOr[String] = js.undefined
  
  var subject: js.UndefOr[String] = js.undefined
  
  var `to-name`: js.UndefOr[String] = js.undefined
}
object CoverSheetInfo {
  
  @scala.inline
  def apply(): CoverSheetInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoverSheetInfo]
  }
  
  @scala.inline
  implicit class CoverSheetInfoMutableBuilder[Self <: CoverSheetInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setFrom-name`(value: String): Self = StObject.set(x, "from-name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFrom-nameUndefined`: Self = StObject.set(x, "from-name", js.undefined)
    
    @scala.inline
    def setLogo(value: String): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def `setOrganization-name`(value: String): Self = StObject.set(x, "organization-name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOrganization-nameUndefined`: Self = StObject.set(x, "organization-name", js.undefined)
    
    @scala.inline
    def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    @scala.inline
    def `setTo-name`(value: String): Self = StObject.set(x, "to-name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTo-nameUndefined`: Self = StObject.set(x, "to-name", js.undefined)
  }
}
