package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LicenseCodeLicenseAlias extends StObject {
  
  /** [Output Only] Description of this License Code. */
  var description: js.UndefOr[String] = js.undefined
  
  /** [Output Only] URL of license corresponding to this License Code. */
  var selfLink: js.UndefOr[String] = js.undefined
}
object LicenseCodeLicenseAlias {
  
  inline def apply(): LicenseCodeLicenseAlias = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LicenseCodeLicenseAlias]
  }
  
  extension [Self <: LicenseCodeLicenseAlias](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
  }
}
