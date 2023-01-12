package typings.ipfsCoreTypes.distSrcConfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeychainConfig extends StObject {
  
  var DEK: js.UndefOr[typings.ipfsCoreTypes.distSrcConfigMod.DEK] = js.undefined
}
object KeychainConfig {
  
  inline def apply(): KeychainConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeychainConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeychainConfig] (val x: Self) extends AnyVal {
    
    inline def setDEK(value: DEK): Self = StObject.set(x, "DEK", value.asInstanceOf[js.Any])
    
    inline def setDEKUndefined: Self = StObject.set(x, "DEK", js.undefined)
  }
}
