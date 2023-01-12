package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedRetentionSettings extends StObject {
  
  /** The timestamp after which the message/topic should be removed, in microseconds since the epoch, when state == EPHEMERAL_ONE_DAY. The value should not be set in other cases. */
  var expiryTimestamp: js.UndefOr[String] = js.undefined
  
  /** The retention state. */
  var state: js.UndefOr[String] = js.undefined
}
object AppsDynamiteSharedRetentionSettings {
  
  inline def apply(): AppsDynamiteSharedRetentionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedRetentionSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsDynamiteSharedRetentionSettings] (val x: Self) extends AnyVal {
    
    inline def setExpiryTimestamp(value: String): Self = StObject.set(x, "expiryTimestamp", value.asInstanceOf[js.Any])
    
    inline def setExpiryTimestampUndefined: Self = StObject.set(x, "expiryTimestamp", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
