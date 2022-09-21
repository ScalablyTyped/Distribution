package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpgradeOccurrence extends StObject {
  
  /** Required for non-Windows OS. The package this Upgrade is for. */
  @JSName("package")
  var _package: js.UndefOr[String] = js.undefined
  
  /** Metadata about the upgrade for available for the specific operating system for the resource_url. This allows efficient filtering, as well as making it easier to use the occurrence. */
  var distribution: js.UndefOr[UpgradeDistribution] = js.undefined
  
  /** Required for non-Windows OS. The version of the package in a machine + human readable form. */
  var parsedVersion: js.UndefOr[Version] = js.undefined
  
  /** Required for Windows OS. Represents the metadata about the Windows update. */
  var windowsUpdate: js.UndefOr[WindowsUpdate] = js.undefined
}
object UpgradeOccurrence {
  
  inline def apply(): UpgradeOccurrence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpgradeOccurrence]
  }
  
  extension [Self <: UpgradeOccurrence](x: Self) {
    
    inline def setDistribution(value: UpgradeDistribution): Self = StObject.set(x, "distribution", value.asInstanceOf[js.Any])
    
    inline def setDistributionUndefined: Self = StObject.set(x, "distribution", js.undefined)
    
    inline def setParsedVersion(value: Version): Self = StObject.set(x, "parsedVersion", value.asInstanceOf[js.Any])
    
    inline def setParsedVersionUndefined: Self = StObject.set(x, "parsedVersion", js.undefined)
    
    inline def setWindowsUpdate(value: WindowsUpdate): Self = StObject.set(x, "windowsUpdate", value.asInstanceOf[js.Any])
    
    inline def setWindowsUpdateUndefined: Self = StObject.set(x, "windowsUpdate", js.undefined)
    
    inline def set_package(value: String): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    
    inline def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
  }
}
