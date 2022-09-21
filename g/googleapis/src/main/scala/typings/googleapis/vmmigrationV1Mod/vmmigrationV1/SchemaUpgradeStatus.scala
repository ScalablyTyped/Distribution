package typings.googleapis.vmmigrationV1Mod.vmmigrationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpgradeStatus extends StObject {
  
  /**
    * Provides details on the state of the upgrade operation in case of an error.
    */
  var error: js.UndefOr[SchemaStatus] = js.undefined
  
  /**
    * The version from which we upgraded.
    */
  var previousVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time the operation was started.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The state of the upgradeAppliance operation.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The version to upgrade to.
    */
  var version: js.UndefOr[String | Null] = js.undefined
}
object SchemaUpgradeStatus {
  
  inline def apply(): SchemaUpgradeStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpgradeStatus]
  }
  
  extension [Self <: SchemaUpgradeStatus](x: Self) {
    
    inline def setError(value: SchemaStatus): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setPreviousVersion(value: String): Self = StObject.set(x, "previousVersion", value.asInstanceOf[js.Any])
    
    inline def setPreviousVersionNull: Self = StObject.set(x, "previousVersion", null)
    
    inline def setPreviousVersionUndefined: Self = StObject.set(x, "previousVersion", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
