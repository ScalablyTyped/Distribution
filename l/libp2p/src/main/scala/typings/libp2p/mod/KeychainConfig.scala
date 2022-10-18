package typings.libp2p.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeychainConfig extends StObject {
  
  var dek: js.UndefOr[DEKConfig] = js.undefined
  
  var pass: js.UndefOr[String] = js.undefined
}
object KeychainConfig {
  
  inline def apply(): KeychainConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeychainConfig]
  }
  
  extension [Self <: KeychainConfig](x: Self) {
    
    inline def setDek(value: DEKConfig): Self = StObject.set(x, "dek", value.asInstanceOf[js.Any])
    
    inline def setDekUndefined: Self = StObject.set(x, "dek", js.undefined)
    
    inline def setPass(value: String): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
    
    inline def setPassUndefined: Self = StObject.set(x, "pass", js.undefined)
  }
}
