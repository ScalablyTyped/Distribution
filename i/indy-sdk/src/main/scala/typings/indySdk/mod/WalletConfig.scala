package typings.indySdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WalletConfig extends StObject {
  
  var id: String
  
  var storage_config: js.UndefOr[WalletStorageConfig] = js.undefined
  
  var storage_type: js.UndefOr[String] = js.undefined
}
object WalletConfig {
  
  inline def apply(id: String): WalletConfig = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[WalletConfig]
  }
  
  extension [Self <: WalletConfig](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setStorage_config(value: WalletStorageConfig): Self = StObject.set(x, "storage_config", value.asInstanceOf[js.Any])
    
    inline def setStorage_configUndefined: Self = StObject.set(x, "storage_config", js.undefined)
    
    inline def setStorage_type(value: String): Self = StObject.set(x, "storage_type", value.asInstanceOf[js.Any])
    
    inline def setStorage_typeUndefined: Self = StObject.set(x, "storage_type", js.undefined)
  }
}
