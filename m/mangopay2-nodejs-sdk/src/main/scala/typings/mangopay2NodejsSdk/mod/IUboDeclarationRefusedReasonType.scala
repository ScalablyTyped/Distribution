package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INVALID_DECLARED_UBO
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INVALID_UBO_DETAILS
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MISSING_UBO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUboDeclarationRefusedReasonType extends StObject {
  
  /**
    * When at least one natural user should not be declared as UBO
    */
  var InvalidDeclaredUbo: INVALID_DECLARED_UBO = js.native
  
  /**
    * When at least one natural user declared as UBO has been created
    * with wrong details (i.e. date of birth, country of residence)
    */
  var InvalidUboDetails: INVALID_UBO_DETAILS = js.native
  
  /**
    * When at least one natural user is missing on the declaration
    */
  var MissingUbo: MISSING_UBO = js.native
}
object IUboDeclarationRefusedReasonType {
  
  @scala.inline
  def apply(
    InvalidDeclaredUbo: INVALID_DECLARED_UBO,
    InvalidUboDetails: INVALID_UBO_DETAILS,
    MissingUbo: MISSING_UBO
  ): IUboDeclarationRefusedReasonType = {
    val __obj = js.Dynamic.literal(InvalidDeclaredUbo = InvalidDeclaredUbo.asInstanceOf[js.Any], InvalidUboDetails = InvalidUboDetails.asInstanceOf[js.Any], MissingUbo = MissingUbo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUboDeclarationRefusedReasonType]
  }
  
  @scala.inline
  implicit class IUboDeclarationRefusedReasonTypeMutableBuilder[Self <: IUboDeclarationRefusedReasonType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvalidDeclaredUbo(value: INVALID_DECLARED_UBO): Self = StObject.set(x, "InvalidDeclaredUbo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidUboDetails(value: INVALID_UBO_DETAILS): Self = StObject.set(x, "InvalidUboDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMissingUbo(value: MISSING_UBO): Self = StObject.set(x, "MissingUbo", value.asInstanceOf[js.Any])
  }
}
