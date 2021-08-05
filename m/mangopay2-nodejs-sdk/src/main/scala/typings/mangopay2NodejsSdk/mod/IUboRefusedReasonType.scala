package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INVALID_DECLARED_UBO
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INVALID_UBO_DETAILS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUboRefusedReasonType extends StObject {
  
  /**
    * When user should not be declared as UBO
    */
  var InvalidDeclaredUbo: INVALID_DECLARED_UBO
  
  /**
    * When user declared as UBO was created with wrong
    * details (i.e. date of birth, country of residence)
    */
  var InvalidUboDetails: INVALID_UBO_DETAILS
}
object IUboRefusedReasonType {
  
  inline def apply(): IUboRefusedReasonType = {
    val __obj = js.Dynamic.literal(InvalidDeclaredUbo = "INVALID_DECLARED_UBO", InvalidUboDetails = "INVALID_UBO_DETAILS")
    __obj.asInstanceOf[IUboRefusedReasonType]
  }
  
  extension [Self <: IUboRefusedReasonType](x: Self) {
    
    inline def setInvalidDeclaredUbo(value: INVALID_DECLARED_UBO): Self = StObject.set(x, "InvalidDeclaredUbo", value.asInstanceOf[js.Any])
    
    inline def setInvalidUboDetails(value: INVALID_UBO_DETAILS): Self = StObject.set(x, "InvalidUboDetails", value.asInstanceOf[js.Any])
  }
}
