package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an HTTP certificate challenge.
  */
@js.native
trait SchemaCertHttpChallenge extends StObject {
  
  /**
    * The URL path on which to serve the specified token to satisfy the
    * certificate challenge.
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * The token to serve at the specified URL path to satisfy the certificate
    * challenge.
    */
  var token: js.UndefOr[String] = js.native
}
object SchemaCertHttpChallenge {
  
  @scala.inline
  def apply(): SchemaCertHttpChallenge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCertHttpChallenge]
  }
  
  @scala.inline
  implicit class SchemaCertHttpChallengeMutableBuilder[Self <: SchemaCertHttpChallenge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
