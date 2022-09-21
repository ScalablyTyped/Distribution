package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpgradeOccurrence extends StObject {
  
  /**
    * Required - The package this Upgrade is for.
    */
  @JSName("package")
  var _package: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Metadata about the upgrade for available for the specific operating system for the resource_url. This allows efficient filtering, as well as making it easier to use the occurrence.
    */
  var distribution: js.UndefOr[SchemaUpgradeDistribution] = js.undefined
  
  /**
    * Required - The version of the package in a machine + human readable form.
    */
  var parsedVersion: js.UndefOr[SchemaVersion] = js.undefined
}
object SchemaUpgradeOccurrence {
  
  inline def apply(): SchemaUpgradeOccurrence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpgradeOccurrence]
  }
  
  extension [Self <: SchemaUpgradeOccurrence](x: Self) {
    
    inline def setDistribution(value: SchemaUpgradeDistribution): Self = StObject.set(x, "distribution", value.asInstanceOf[js.Any])
    
    inline def setDistributionUndefined: Self = StObject.set(x, "distribution", js.undefined)
    
    inline def setParsedVersion(value: SchemaVersion): Self = StObject.set(x, "parsedVersion", value.asInstanceOf[js.Any])
    
    inline def setParsedVersionUndefined: Self = StObject.set(x, "parsedVersion", js.undefined)
    
    inline def set_package(value: String): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    
    inline def set_packageNull: Self = StObject.set(x, "package", null)
    
    inline def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
  }
}
