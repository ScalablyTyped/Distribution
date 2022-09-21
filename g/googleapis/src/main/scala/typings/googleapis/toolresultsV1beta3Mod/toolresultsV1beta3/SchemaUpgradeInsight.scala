package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpgradeInsight extends StObject {
  
  /**
    * The name of the package to be upgraded.
    */
  var packageName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The suggested version to upgrade to. Optional: In case we are not sure which version solves this problem
    */
  var upgradeToVersion: js.UndefOr[String | Null] = js.undefined
}
object SchemaUpgradeInsight {
  
  inline def apply(): SchemaUpgradeInsight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpgradeInsight]
  }
  
  extension [Self <: SchemaUpgradeInsight](x: Self) {
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameNull: Self = StObject.set(x, "packageName", null)
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    inline def setUpgradeToVersion(value: String): Self = StObject.set(x, "upgradeToVersion", value.asInstanceOf[js.Any])
    
    inline def setUpgradeToVersionNull: Self = StObject.set(x, "upgradeToVersion", null)
    
    inline def setUpgradeToVersionUndefined: Self = StObject.set(x, "upgradeToVersion", js.undefined)
  }
}
