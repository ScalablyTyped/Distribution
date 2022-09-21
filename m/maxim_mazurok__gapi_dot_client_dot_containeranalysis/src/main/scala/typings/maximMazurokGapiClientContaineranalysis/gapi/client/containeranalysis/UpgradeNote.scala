package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpgradeNote extends StObject {
  
  /** Required for non-Windows OS. The package this Upgrade is for. */
  @JSName("package")
  var _package: js.UndefOr[String] = js.undefined
  
  /** Metadata about the upgrade for each specific operating system. */
  var distributions: js.UndefOr[js.Array[UpgradeDistribution]] = js.undefined
  
  /** Required for non-Windows OS. The version of the package in machine + human readable form. */
  var version: js.UndefOr[Version] = js.undefined
  
  /** Required for Windows OS. Represents the metadata about the Windows update. */
  var windowsUpdate: js.UndefOr[WindowsUpdate] = js.undefined
}
object UpgradeNote {
  
  inline def apply(): UpgradeNote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpgradeNote]
  }
  
  extension [Self <: UpgradeNote](x: Self) {
    
    inline def setDistributions(value: js.Array[UpgradeDistribution]): Self = StObject.set(x, "distributions", value.asInstanceOf[js.Any])
    
    inline def setDistributionsUndefined: Self = StObject.set(x, "distributions", js.undefined)
    
    inline def setDistributionsVarargs(value: UpgradeDistribution*): Self = StObject.set(x, "distributions", js.Array(value*))
    
    inline def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setWindowsUpdate(value: WindowsUpdate): Self = StObject.set(x, "windowsUpdate", value.asInstanceOf[js.Any])
    
    inline def setWindowsUpdateUndefined: Self = StObject.set(x, "windowsUpdate", js.undefined)
    
    inline def set_package(value: String): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    
    inline def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
  }
}
