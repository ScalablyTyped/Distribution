package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteReadReceiptsSettingsUpdatedMetadata extends StObject {
  
  /** The new read receipts state. */
  var readReceiptsEnabled: js.UndefOr[Boolean] = js.undefined
}
object AppsDynamiteReadReceiptsSettingsUpdatedMetadata {
  
  inline def apply(): AppsDynamiteReadReceiptsSettingsUpdatedMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteReadReceiptsSettingsUpdatedMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsDynamiteReadReceiptsSettingsUpdatedMetadata] (val x: Self) extends AnyVal {
    
    inline def setReadReceiptsEnabled(value: Boolean): Self = StObject.set(x, "readReceiptsEnabled", value.asInstanceOf[js.Any])
    
    inline def setReadReceiptsEnabledUndefined: Self = StObject.set(x, "readReceiptsEnabled", js.undefined)
  }
}
