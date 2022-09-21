package typings.googleapis.gkehubV1Mod.gkehubV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMultiClusterIngressFeatureSpec extends StObject {
  
  /**
    * Fully-qualified Membership name which hosts the MultiClusterIngress CRD. Example: `projects/foo-proj/locations/global/memberships/bar`
    */
  var configMembership: js.UndefOr[String | Null] = js.undefined
}
object SchemaMultiClusterIngressFeatureSpec {
  
  inline def apply(): SchemaMultiClusterIngressFeatureSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMultiClusterIngressFeatureSpec]
  }
  
  extension [Self <: SchemaMultiClusterIngressFeatureSpec](x: Self) {
    
    inline def setConfigMembership(value: String): Self = StObject.set(x, "configMembership", value.asInstanceOf[js.Any])
    
    inline def setConfigMembershipNull: Self = StObject.set(x, "configMembership", null)
    
    inline def setConfigMembershipUndefined: Self = StObject.set(x, "configMembership", js.undefined)
  }
}
