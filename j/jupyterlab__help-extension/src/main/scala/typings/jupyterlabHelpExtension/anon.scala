package typings.jupyterlabHelpExtension

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@jupyterlab/help-extension.@jupyterlab/help-extension/lib/licenses.Licenses.IPackageLicenseInfo> */
  trait PartialIPackageLicenseInf extends StObject {
    
    var extractedText: js.UndefOr[String] = js.undefined
    
    var licenseId: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var versionInfo: js.UndefOr[String] = js.undefined
  }
  object PartialIPackageLicenseInf {
    
    inline def apply(): PartialIPackageLicenseInf = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialIPackageLicenseInf]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialIPackageLicenseInf] (val x: Self) extends AnyVal {
      
      inline def setExtractedText(value: String): Self = StObject.set(x, "extractedText", value.asInstanceOf[js.Any])
      
      inline def setExtractedTextUndefined: Self = StObject.set(x, "extractedText", js.undefined)
      
      inline def setLicenseId(value: String): Self = StObject.set(x, "licenseId", value.asInstanceOf[js.Any])
      
      inline def setLicenseIdUndefined: Self = StObject.set(x, "licenseId", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setVersionInfo(value: String): Self = StObject.set(x, "versionInfo", value.asInstanceOf[js.Any])
      
      inline def setVersionInfoUndefined: Self = StObject.set(x, "versionInfo", js.undefined)
    }
  }
}
