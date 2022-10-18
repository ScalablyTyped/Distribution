package typings.jupyterlabHelpExtension

import typings.jupyterlabHelpExtension.libLicensesMod.Licenses.TFilterKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jupyterlabHelpExtensionStrings {
  
  @js.native
  sealed trait desktop extends StObject
  inline def desktop: desktop = "desktop".asInstanceOf[desktop]
  
  @js.native
  sealed trait licenseId
    extends StObject
       with TFilterKey
  inline def licenseId: licenseId = "licenseId".asInstanceOf[licenseId]
  
  @js.native
  sealed trait mobile extends StObject
  inline def mobile: mobile = "mobile".asInstanceOf[mobile]
  
  @js.native
  sealed trait name
    extends StObject
       with TFilterKey
  inline def name: name = "name".asInstanceOf[name]
  
  @js.native
  sealed trait versionInfo
    extends StObject
       with TFilterKey
  inline def versionInfo: versionInfo = "versionInfo".asInstanceOf[versionInfo]
}
