package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOsUpdateStatus extends StObject {
  
  /**
    * Date and time of the last reboot.
    */
  var rebootTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The update state of an OS update.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * New required platform version from the pending updated kiosk app.
    */
  var targetKioskAppVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * New platform version of the OS image being downloaded and applied. It is only set when update status is UPDATE_STATUS_DOWNLOAD_IN_PROGRESS or UPDATE_STATUS_NEED_REBOOT. Note this could be a dummy "0.0.0.0" for UPDATE_STATUS_NEED_REBOOT for some edge cases, e.g. update engine is restarted without a reboot.
    */
  var targetOsVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Date and time of the last update check.
    */
  var updateCheckTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Date and time of the last successful OS update.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaOsUpdateStatus {
  
  inline def apply(): SchemaOsUpdateStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOsUpdateStatus]
  }
  
  extension [Self <: SchemaOsUpdateStatus](x: Self) {
    
    inline def setRebootTime(value: String): Self = StObject.set(x, "rebootTime", value.asInstanceOf[js.Any])
    
    inline def setRebootTimeNull: Self = StObject.set(x, "rebootTime", null)
    
    inline def setRebootTimeUndefined: Self = StObject.set(x, "rebootTime", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTargetKioskAppVersion(value: String): Self = StObject.set(x, "targetKioskAppVersion", value.asInstanceOf[js.Any])
    
    inline def setTargetKioskAppVersionNull: Self = StObject.set(x, "targetKioskAppVersion", null)
    
    inline def setTargetKioskAppVersionUndefined: Self = StObject.set(x, "targetKioskAppVersion", js.undefined)
    
    inline def setTargetOsVersion(value: String): Self = StObject.set(x, "targetOsVersion", value.asInstanceOf[js.Any])
    
    inline def setTargetOsVersionNull: Self = StObject.set(x, "targetOsVersion", null)
    
    inline def setTargetOsVersionUndefined: Self = StObject.set(x, "targetOsVersion", js.undefined)
    
    inline def setUpdateCheckTime(value: String): Self = StObject.set(x, "updateCheckTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateCheckTimeNull: Self = StObject.set(x, "updateCheckTime", null)
    
    inline def setUpdateCheckTimeUndefined: Self = StObject.set(x, "updateCheckTime", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
