package typings.googleapis.notebooksV1Mod.notebooksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIsInstanceUpgradeableResponse extends StObject {
  
  /**
    * The new image self link this instance will be upgraded to if calling the upgrade endpoint. This field will only be populated if field upgradeable is true.
    */
  var upgradeImage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Additional information about upgrade.
    */
  var upgradeInfo: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The version this instance will be upgraded to if calling the upgrade endpoint. This field will only be populated if field upgradeable is true.
    */
  var upgradeVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If an instance is upgradeable.
    */
  var upgradeable: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaIsInstanceUpgradeableResponse {
  
  inline def apply(): SchemaIsInstanceUpgradeableResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIsInstanceUpgradeableResponse]
  }
  
  extension [Self <: SchemaIsInstanceUpgradeableResponse](x: Self) {
    
    inline def setUpgradeImage(value: String): Self = StObject.set(x, "upgradeImage", value.asInstanceOf[js.Any])
    
    inline def setUpgradeImageNull: Self = StObject.set(x, "upgradeImage", null)
    
    inline def setUpgradeImageUndefined: Self = StObject.set(x, "upgradeImage", js.undefined)
    
    inline def setUpgradeInfo(value: String): Self = StObject.set(x, "upgradeInfo", value.asInstanceOf[js.Any])
    
    inline def setUpgradeInfoNull: Self = StObject.set(x, "upgradeInfo", null)
    
    inline def setUpgradeInfoUndefined: Self = StObject.set(x, "upgradeInfo", js.undefined)
    
    inline def setUpgradeVersion(value: String): Self = StObject.set(x, "upgradeVersion", value.asInstanceOf[js.Any])
    
    inline def setUpgradeVersionNull: Self = StObject.set(x, "upgradeVersion", null)
    
    inline def setUpgradeVersionUndefined: Self = StObject.set(x, "upgradeVersion", js.undefined)
    
    inline def setUpgradeable(value: Boolean): Self = StObject.set(x, "upgradeable", value.asInstanceOf[js.Any])
    
    inline def setUpgradeableNull: Self = StObject.set(x, "upgradeable", null)
    
    inline def setUpgradeableUndefined: Self = StObject.set(x, "upgradeable", js.undefined)
  }
}
