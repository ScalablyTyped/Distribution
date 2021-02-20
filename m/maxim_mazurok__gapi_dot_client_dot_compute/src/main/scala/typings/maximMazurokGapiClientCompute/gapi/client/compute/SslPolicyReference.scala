package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SslPolicyReference extends StObject {
  
  /** URL of the SSL policy resource. Set this to empty string to clear any existing SSL policy associated with the target proxy resource. */
  var sslPolicy: js.UndefOr[String] = js.native
}
object SslPolicyReference {
  
  @scala.inline
  def apply(): SslPolicyReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SslPolicyReference]
  }
  
  @scala.inline
  implicit class SslPolicyReferenceMutableBuilder[Self <: SslPolicyReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSslPolicy(value: String): Self = StObject.set(x, "sslPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslPolicyUndefined: Self = StObject.set(x, "sslPolicy", js.undefined)
  }
}
