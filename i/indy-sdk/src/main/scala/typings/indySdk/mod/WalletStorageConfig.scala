package typings.indySdk.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WalletStorageConfig
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var path: js.UndefOr[String] = js.undefined
}
object WalletStorageConfig {
  
  inline def apply(): WalletStorageConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WalletStorageConfig]
  }
  
  extension [Self <: WalletStorageConfig](x: Self) {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
