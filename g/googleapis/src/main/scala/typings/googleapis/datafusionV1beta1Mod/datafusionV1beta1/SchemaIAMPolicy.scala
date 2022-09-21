package typings.googleapis.datafusionV1beta1Mod.datafusionV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIAMPolicy extends StObject {
  
  /**
    * Policy definition if IAM policy fetching is successful, otherwise empty.
    */
  var policy: js.UndefOr[SchemaPolicy] = js.undefined
  
  /**
    * Status of iam policy fetching.
    */
  var status: js.UndefOr[SchemaStatus] = js.undefined
}
object SchemaIAMPolicy {
  
  inline def apply(): SchemaIAMPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIAMPolicy]
  }
  
  extension [Self <: SchemaIAMPolicy](x: Self) {
    
    inline def setPolicy(value: SchemaPolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    inline def setStatus(value: SchemaStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
