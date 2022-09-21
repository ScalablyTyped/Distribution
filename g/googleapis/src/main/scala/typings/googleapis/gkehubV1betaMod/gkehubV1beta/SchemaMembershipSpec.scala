package typings.googleapis.gkehubV1betaMod.gkehubV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMembershipSpec extends StObject {
  
  /**
    * Whether it is allowed to run the privileged builds on the cluster or not.
    */
  var securityPolicy: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Version of the cloud build software on the cluster.
    */
  var version: js.UndefOr[String | Null] = js.undefined
}
object SchemaMembershipSpec {
  
  inline def apply(): SchemaMembershipSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMembershipSpec]
  }
  
  extension [Self <: SchemaMembershipSpec](x: Self) {
    
    inline def setSecurityPolicy(value: String): Self = StObject.set(x, "securityPolicy", value.asInstanceOf[js.Any])
    
    inline def setSecurityPolicyNull: Self = StObject.set(x, "securityPolicy", null)
    
    inline def setSecurityPolicyUndefined: Self = StObject.set(x, "securityPolicy", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
