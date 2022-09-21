package typings.googleapis.gkehubV1betaMod.gkehubV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAnthosObservabilityFeatureSpec extends StObject {
  
  /**
    * default membership spec for unconfigured memberships
    */
  var defaultMembershipSpec: js.UndefOr[SchemaAnthosObservabilityMembershipSpec] = js.undefined
}
object SchemaAnthosObservabilityFeatureSpec {
  
  inline def apply(): SchemaAnthosObservabilityFeatureSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnthosObservabilityFeatureSpec]
  }
  
  extension [Self <: SchemaAnthosObservabilityFeatureSpec](x: Self) {
    
    inline def setDefaultMembershipSpec(value: SchemaAnthosObservabilityMembershipSpec): Self = StObject.set(x, "defaultMembershipSpec", value.asInstanceOf[js.Any])
    
    inline def setDefaultMembershipSpecUndefined: Self = StObject.set(x, "defaultMembershipSpec", js.undefined)
  }
}
