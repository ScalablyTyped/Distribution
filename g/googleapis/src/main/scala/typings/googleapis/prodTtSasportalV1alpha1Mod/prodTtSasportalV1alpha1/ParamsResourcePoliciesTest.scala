package typings.googleapis.prodTtSasportalV1alpha1Mod.prodTtSasportalV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePoliciesTest
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSasPortalTestPermissionsRequest] = js.undefined
}
object ParamsResourcePoliciesTest {
  
  inline def apply(): ParamsResourcePoliciesTest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePoliciesTest]
  }
  
  extension [Self <: ParamsResourcePoliciesTest](x: Self) {
    
    inline def setRequestBody(value: SchemaSasPortalTestPermissionsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
