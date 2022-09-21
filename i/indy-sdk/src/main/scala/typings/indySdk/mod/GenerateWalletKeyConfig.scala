package typings.indySdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateWalletKeyConfig extends StObject {
  
  var seed: js.UndefOr[String] = js.undefined
}
object GenerateWalletKeyConfig {
  
  inline def apply(): GenerateWalletKeyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateWalletKeyConfig]
  }
  
  extension [Self <: GenerateWalletKeyConfig](x: Self) {
    
    inline def setSeed(value: String): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
    
    inline def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
  }
}
