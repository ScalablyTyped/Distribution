package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INVALID_DECLARED_UBO
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INVALID_UBO_DETAILS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUboRefusedReasonType extends StObject {
  
  /**
    * When user should not be declared as UBO
    */
  var InvalidDeclaredUbo: INVALID_DECLARED_UBO = js.native
  
  /**
    * When user declared as UBO was created with wrong
    * details (i.e. date of birth, country of residence)
    */
  var InvalidUboDetails: INVALID_UBO_DETAILS = js.native
}
object IUboRefusedReasonType {
  
  @scala.inline
  def apply(InvalidDeclaredUbo: INVALID_DECLARED_UBO, InvalidUboDetails: INVALID_UBO_DETAILS): IUboRefusedReasonType = {
    val __obj = js.Dynamic.literal(InvalidDeclaredUbo = InvalidDeclaredUbo.asInstanceOf[js.Any], InvalidUboDetails = InvalidUboDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUboRefusedReasonType]
  }
  
  @scala.inline
  implicit class IUboRefusedReasonTypeMutableBuilder[Self <: IUboRefusedReasonType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvalidDeclaredUbo(value: INVALID_DECLARED_UBO): Self = StObject.set(x, "InvalidDeclaredUbo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidUboDetails(value: INVALID_UBO_DETAILS): Self = StObject.set(x, "InvalidUboDetails", value.asInstanceOf[js.Any])
  }
}
