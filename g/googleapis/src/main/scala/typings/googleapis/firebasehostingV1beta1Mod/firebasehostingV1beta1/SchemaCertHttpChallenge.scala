package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an HTTP certificate challenge.
  */
trait SchemaCertHttpChallenge extends StObject {
  
  /**
    * The URL path on which to serve the specified token to satisfy the
    * certificate challenge.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * The token to serve at the specified URL path to satisfy the certificate
    * challenge.
    */
  var token: js.UndefOr[String] = js.undefined
}
object SchemaCertHttpChallenge {
  
  inline def apply(): SchemaCertHttpChallenge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCertHttpChallenge]
  }
  
  extension [Self <: SchemaCertHttpChallenge](x: Self) {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
