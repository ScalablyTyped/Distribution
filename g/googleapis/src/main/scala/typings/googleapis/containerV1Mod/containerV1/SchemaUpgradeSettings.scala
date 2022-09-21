package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpgradeSettings extends StObject {
  
  /**
    * Settings for blue-green upgrade strategy.
    */
  var blueGreenSettings: js.UndefOr[SchemaBlueGreenSettings] = js.undefined
  
  /**
    * The maximum number of nodes that can be created beyond the current size of the node pool during the upgrade process.
    */
  var maxSurge: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The maximum number of nodes that can be simultaneously unavailable during the upgrade process. A node is considered available if its status is Ready.
    */
  var maxUnavailable: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Update strategy of the node pool.
    */
  var strategy: js.UndefOr[String | Null] = js.undefined
}
object SchemaUpgradeSettings {
  
  inline def apply(): SchemaUpgradeSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpgradeSettings]
  }
  
  extension [Self <: SchemaUpgradeSettings](x: Self) {
    
    inline def setBlueGreenSettings(value: SchemaBlueGreenSettings): Self = StObject.set(x, "blueGreenSettings", value.asInstanceOf[js.Any])
    
    inline def setBlueGreenSettingsUndefined: Self = StObject.set(x, "blueGreenSettings", js.undefined)
    
    inline def setMaxSurge(value: Double): Self = StObject.set(x, "maxSurge", value.asInstanceOf[js.Any])
    
    inline def setMaxSurgeNull: Self = StObject.set(x, "maxSurge", null)
    
    inline def setMaxSurgeUndefined: Self = StObject.set(x, "maxSurge", js.undefined)
    
    inline def setMaxUnavailable(value: Double): Self = StObject.set(x, "maxUnavailable", value.asInstanceOf[js.Any])
    
    inline def setMaxUnavailableNull: Self = StObject.set(x, "maxUnavailable", null)
    
    inline def setMaxUnavailableUndefined: Self = StObject.set(x, "maxUnavailable", js.undefined)
    
    inline def setStrategy(value: String): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    
    inline def setStrategyNull: Self = StObject.set(x, "strategy", null)
    
    inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
  }
}
