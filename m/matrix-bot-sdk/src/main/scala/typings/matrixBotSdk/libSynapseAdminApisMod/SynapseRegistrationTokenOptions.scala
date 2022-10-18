package typings.matrixBotSdk.libSynapseAdminApisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SynapseRegistrationTokenOptions
  extends StObject
     with SynapseRegistrationTokenUpdateOptions {
  
  /**
    * The length of the token randomly generated if token is not specified. Must be between 1 and 64 inclusive.
    * Default: 16.
    */
  var length: js.UndefOr[Double] = js.undefined
  
  /**
    * The registration token. A string of no more than 64 characters that consists only of characters matched by the regex [A-Za-z0-9._~-].
    * Default: randomly generated.
    */
  var token: js.UndefOr[String] = js.undefined
}
object SynapseRegistrationTokenOptions {
  
  inline def apply(): SynapseRegistrationTokenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SynapseRegistrationTokenOptions]
  }
  
  extension [Self <: SynapseRegistrationTokenOptions](x: Self) {
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
