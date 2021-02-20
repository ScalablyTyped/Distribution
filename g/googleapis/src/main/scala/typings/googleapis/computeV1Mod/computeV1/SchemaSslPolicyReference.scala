package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaSslPolicyReference extends StObject {
  
  /**
    * URL of the SSL policy resource. Set this to empty string to clear any
    * existing SSL policy associated with the target proxy resource.
    */
  var sslPolicy: js.UndefOr[String] = js.native
}
object SchemaSslPolicyReference {
  
  @scala.inline
  def apply(): SchemaSslPolicyReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSslPolicyReference]
  }
  
  @scala.inline
  implicit class SchemaSslPolicyReferenceMutableBuilder[Self <: SchemaSslPolicyReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSslPolicy(value: String): Self = StObject.set(x, "sslPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslPolicyUndefined: Self = StObject.set(x, "sslPolicy", js.undefined)
  }
}
