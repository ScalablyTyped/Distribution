package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAutoUpgradeOptions extends StObject {
  
  /**
    * [Output only] This field is set when upgrades are about to commence with the approximate start time for the upgrades, in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
    */
  var autoUpgradeStartTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output only] This field is set when upgrades are about to commence with the description of the upgrade.
    */
  var description: js.UndefOr[String | Null] = js.undefined
}
object SchemaAutoUpgradeOptions {
  
  inline def apply(): SchemaAutoUpgradeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAutoUpgradeOptions]
  }
  
  extension [Self <: SchemaAutoUpgradeOptions](x: Self) {
    
    inline def setAutoUpgradeStartTime(value: String): Self = StObject.set(x, "autoUpgradeStartTime", value.asInstanceOf[js.Any])
    
    inline def setAutoUpgradeStartTimeNull: Self = StObject.set(x, "autoUpgradeStartTime", null)
    
    inline def setAutoUpgradeStartTimeUndefined: Self = StObject.set(x, "autoUpgradeStartTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
  }
}
