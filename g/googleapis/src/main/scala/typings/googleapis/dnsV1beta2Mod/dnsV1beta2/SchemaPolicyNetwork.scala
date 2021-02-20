package typings.googleapis.dnsV1beta2Mod.dnsV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaPolicyNetwork extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#policyNetwork&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  var networkUrl: js.UndefOr[String] = js.native
}
object SchemaPolicyNetwork {
  
  @scala.inline
  def apply(): SchemaPolicyNetwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPolicyNetwork]
  }
  
  @scala.inline
  implicit class SchemaPolicyNetworkMutableBuilder[Self <: SchemaPolicyNetwork] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNetworkUrl(value: String): Self = StObject.set(x, "networkUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkUrlUndefined: Self = StObject.set(x, "networkUrl", js.undefined)
  }
}
