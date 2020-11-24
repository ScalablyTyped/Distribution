package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ADDRESS_PROOF
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ARTICLES_OF_ASSOCIATION
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IDENTITY_PROOF
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REGISTRATION_PROOF
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SHAREHOLDER_DECLARATION
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IKycDocumentType extends js.Object {
  
  var AddressProof: ADDRESS_PROOF = js.native
  
  var ArticlesOfAssociation: ARTICLES_OF_ASSOCIATION = js.native
  
  var IdentityProof: IDENTITY_PROOF = js.native
  
  var RegistrationProof: REGISTRATION_PROOF = js.native
  
  var ShareholderDeclaration: SHAREHOLDER_DECLARATION = js.native
}
object IKycDocumentType {
  
  @scala.inline
  def apply(
    AddressProof: ADDRESS_PROOF,
    ArticlesOfAssociation: ARTICLES_OF_ASSOCIATION,
    IdentityProof: IDENTITY_PROOF,
    RegistrationProof: REGISTRATION_PROOF,
    ShareholderDeclaration: SHAREHOLDER_DECLARATION
  ): IKycDocumentType = {
    val __obj = js.Dynamic.literal(AddressProof = AddressProof.asInstanceOf[js.Any], ArticlesOfAssociation = ArticlesOfAssociation.asInstanceOf[js.Any], IdentityProof = IdentityProof.asInstanceOf[js.Any], RegistrationProof = RegistrationProof.asInstanceOf[js.Any], ShareholderDeclaration = ShareholderDeclaration.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKycDocumentType]
  }
  
  @scala.inline
  implicit class IKycDocumentTypeOps[Self <: IKycDocumentType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddressProof(value: ADDRESS_PROOF): Self = this.set("AddressProof", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArticlesOfAssociation(value: ARTICLES_OF_ASSOCIATION): Self = this.set("ArticlesOfAssociation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityProof(value: IDENTITY_PROOF): Self = this.set("IdentityProof", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistrationProof(value: REGISTRATION_PROOF): Self = this.set("RegistrationProof", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShareholderDeclaration(value: SHAREHOLDER_DECLARATION): Self = this.set("ShareholderDeclaration", value.asInstanceOf[js.Any])
  }
}
