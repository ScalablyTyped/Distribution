package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyedAppState extends StObject {
  
  /** The creation time of the app state on the device. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * Optionally, a machine-readable value to be read by the EMM. For example, setting values that the admin can choose to query against in the EMM console (e.g. “notify me if the
    * battery_warning data < 10”).
    */
  var data: js.UndefOr[String] = js.undefined
  
  /**
    * The key for the app state. Acts as a point of reference for what the app is providing state for. For example, when providing managed configuration feedback, this key could be the
    * managed configuration key.
    */
  var key: js.UndefOr[String] = js.undefined
  
  /** The time the app state was most recently updated. */
  var lastUpdateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Optionally, a free-form message string to explain the app state. If the state was triggered by a particular value (e.g. a managed configuration value), it should be included in the
    * message.
    */
  var message: js.UndefOr[String] = js.undefined
  
  /** The severity of the app state. */
  var severity: js.UndefOr[String] = js.undefined
}
object KeyedAppState {
  
  inline def apply(): KeyedAppState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyedAppState]
  }
  
  extension [Self <: KeyedAppState](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setLastUpdateTime(value: String): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTimeUndefined: Self = StObject.set(x, "lastUpdateTime", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
  }
}
