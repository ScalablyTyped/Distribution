package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFreeInstanceMetadata extends StObject {
  
  /**
    * Specifies the expiration behavior of a free instance. The default of ExpireBehavior is `REMOVE_AFTER_GRACE_PERIOD`. This can be modified during or after creation, and before expiration.
    */
  var expireBehavior: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Timestamp after which the instance will either be upgraded or scheduled for deletion after a grace period. ExpireBehavior is used to choose between upgrading or scheduling the free instance for deletion. This timestamp is set during the creation of a free instance.
    */
  var expireTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. If present, the timestamp at which the free instance was upgraded to a provisioned instance.
    */
  var upgradeTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaFreeInstanceMetadata {
  
  inline def apply(): SchemaFreeInstanceMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFreeInstanceMetadata]
  }
  
  extension [Self <: SchemaFreeInstanceMetadata](x: Self) {
    
    inline def setExpireBehavior(value: String): Self = StObject.set(x, "expireBehavior", value.asInstanceOf[js.Any])
    
    inline def setExpireBehaviorNull: Self = StObject.set(x, "expireBehavior", null)
    
    inline def setExpireBehaviorUndefined: Self = StObject.set(x, "expireBehavior", js.undefined)
    
    inline def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    inline def setExpireTimeNull: Self = StObject.set(x, "expireTime", null)
    
    inline def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
    
    inline def setUpgradeTime(value: String): Self = StObject.set(x, "upgradeTime", value.asInstanceOf[js.Any])
    
    inline def setUpgradeTimeNull: Self = StObject.set(x, "upgradeTime", null)
    
    inline def setUpgradeTimeUndefined: Self = StObject.set(x, "upgradeTime", js.undefined)
  }
}
