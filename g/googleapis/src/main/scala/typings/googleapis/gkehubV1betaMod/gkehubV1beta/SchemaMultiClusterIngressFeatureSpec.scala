package typings.googleapis.gkehubV1betaMod.gkehubV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMultiClusterIngressFeatureSpec extends StObject {
  
  /**
    * Deprecated: This field will be ignored and should not be set. Customer's billing structure.
    */
  var billing: js.UndefOr[String | Null] = js.undefined
  
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
    
    inline def setBilling(value: String): Self = StObject.set(x, "billing", value.asInstanceOf[js.Any])
    
    inline def setBillingNull: Self = StObject.set(x, "billing", null)
    
    inline def setBillingUndefined: Self = StObject.set(x, "billing", js.undefined)
    
    inline def setConfigMembership(value: String): Self = StObject.set(x, "configMembership", value.asInstanceOf[js.Any])
    
    inline def setConfigMembershipNull: Self = StObject.set(x, "configMembership", null)
    
    inline def setConfigMembershipUndefined: Self = StObject.set(x, "configMembership", js.undefined)
  }
}
