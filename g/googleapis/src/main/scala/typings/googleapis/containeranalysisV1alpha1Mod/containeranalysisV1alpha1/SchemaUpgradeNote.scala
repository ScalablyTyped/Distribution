package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpgradeNote extends StObject {
  
  /**
    * Required - The package this Upgrade is for.
    */
  @JSName("package")
  var _package: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Metadata about the upgrade for each specific operating system.
    */
  var distributions: js.UndefOr[js.Array[SchemaUpgradeDistribution]] = js.undefined
  
  /**
    * Required - The version of the package in machine + human readable form.
    */
  var version: js.UndefOr[SchemaVersion] = js.undefined
}
object SchemaUpgradeNote {
  
  inline def apply(): SchemaUpgradeNote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpgradeNote]
  }
  
  extension [Self <: SchemaUpgradeNote](x: Self) {
    
    inline def setDistributions(value: js.Array[SchemaUpgradeDistribution]): Self = StObject.set(x, "distributions", value.asInstanceOf[js.Any])
    
    inline def setDistributionsUndefined: Self = StObject.set(x, "distributions", js.undefined)
    
    inline def setDistributionsVarargs(value: SchemaUpgradeDistribution*): Self = StObject.set(x, "distributions", js.Array(value*))
    
    inline def setVersion(value: SchemaVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def set_package(value: String): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    
    inline def set_packageNull: Self = StObject.set(x, "package", null)
    
    inline def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
  }
}
