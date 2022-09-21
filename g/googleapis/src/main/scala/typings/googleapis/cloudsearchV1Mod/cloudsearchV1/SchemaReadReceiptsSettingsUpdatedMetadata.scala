package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReadReceiptsSettingsUpdatedMetadata extends StObject {
  
  /**
    * The new read receipts state.
    */
  var readReceiptsEnabled: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaReadReceiptsSettingsUpdatedMetadata {
  
  inline def apply(): SchemaReadReceiptsSettingsUpdatedMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReadReceiptsSettingsUpdatedMetadata]
  }
  
  extension [Self <: SchemaReadReceiptsSettingsUpdatedMetadata](x: Self) {
    
    inline def setReadReceiptsEnabled(value: Boolean): Self = StObject.set(x, "readReceiptsEnabled", value.asInstanceOf[js.Any])
    
    inline def setReadReceiptsEnabledNull: Self = StObject.set(x, "readReceiptsEnabled", null)
    
    inline def setReadReceiptsEnabledUndefined: Self = StObject.set(x, "readReceiptsEnabled", js.undefined)
  }
}
