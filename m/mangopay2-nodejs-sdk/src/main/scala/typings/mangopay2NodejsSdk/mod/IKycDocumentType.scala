package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ADDRESS_PROOF
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ARTICLES_OF_ASSOCIATION
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IDENTITY_PROOF
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REGISTRATION_PROOF
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SHAREHOLDER_DECLARATION
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKycDocumentType extends js.Object {
  var AddressProof: ADDRESS_PROOF
  var ArticlesOfAssociation: ARTICLES_OF_ASSOCIATION
  var IdentityProof: IDENTITY_PROOF
  var RegistrationProof: REGISTRATION_PROOF
  var ShareholderDeclaration: SHAREHOLDER_DECLARATION
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
}

