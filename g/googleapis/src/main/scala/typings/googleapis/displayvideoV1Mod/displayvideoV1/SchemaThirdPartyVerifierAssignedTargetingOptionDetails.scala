package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaThirdPartyVerifierAssignedTargetingOptionDetails extends StObject {
  
  /**
    * Third party brand verifier -- Adloox.
    */
  var adloox: js.UndefOr[SchemaAdloox] = js.undefined
  
  /**
    * Third party brand verifier -- DoubleVerify.
    */
  var doubleVerify: js.UndefOr[SchemaDoubleVerify] = js.undefined
  
  /**
    * Third party brand verifier -- Integral Ad Science.
    */
  var integralAdScience: js.UndefOr[SchemaIntegralAdScience] = js.undefined
}
object SchemaThirdPartyVerifierAssignedTargetingOptionDetails {
  
  inline def apply(): SchemaThirdPartyVerifierAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaThirdPartyVerifierAssignedTargetingOptionDetails]
  }
  
  extension [Self <: SchemaThirdPartyVerifierAssignedTargetingOptionDetails](x: Self) {
    
    inline def setAdloox(value: SchemaAdloox): Self = StObject.set(x, "adloox", value.asInstanceOf[js.Any])
    
    inline def setAdlooxUndefined: Self = StObject.set(x, "adloox", js.undefined)
    
    inline def setDoubleVerify(value: SchemaDoubleVerify): Self = StObject.set(x, "doubleVerify", value.asInstanceOf[js.Any])
    
    inline def setDoubleVerifyUndefined: Self = StObject.set(x, "doubleVerify", js.undefined)
    
    inline def setIntegralAdScience(value: SchemaIntegralAdScience): Self = StObject.set(x, "integralAdScience", value.asInstanceOf[js.Any])
    
    inline def setIntegralAdScienceUndefined: Self = StObject.set(x, "integralAdScience", js.undefined)
  }
}
