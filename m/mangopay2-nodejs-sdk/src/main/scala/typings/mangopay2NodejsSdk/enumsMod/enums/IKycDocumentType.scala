package typings.mangopay2NodejsSdk.enumsMod.enums

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ADDRESS_PROOF
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ARTICLES_OF_ASSOCIATION
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IDENTITY_PROOF
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REGISTRATION_PROOF
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SHAREHOLDER_DECLARATION
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IKycDocumentType extends StObject {
  
  var AddressProof: ADDRESS_PROOF
  
  var ArticlesOfAssociation: ARTICLES_OF_ASSOCIATION
  
  var IdentityProof: IDENTITY_PROOF
  
  var RegistrationProof: REGISTRATION_PROOF
  
  var ShareholderDeclaration: SHAREHOLDER_DECLARATION
}
object IKycDocumentType {
  
  inline def apply(): IKycDocumentType = {
    val __obj = js.Dynamic.literal(AddressProof = "ADDRESS_PROOF", ArticlesOfAssociation = "ARTICLES_OF_ASSOCIATION", IdentityProof = "IDENTITY_PROOF", RegistrationProof = "REGISTRATION_PROOF", ShareholderDeclaration = "SHAREHOLDER_DECLARATION")
    __obj.asInstanceOf[IKycDocumentType]
  }
  
  extension [Self <: IKycDocumentType](x: Self) {
    
    inline def setAddressProof(value: ADDRESS_PROOF): Self = StObject.set(x, "AddressProof", value.asInstanceOf[js.Any])
    
    inline def setArticlesOfAssociation(value: ARTICLES_OF_ASSOCIATION): Self = StObject.set(x, "ArticlesOfAssociation", value.asInstanceOf[js.Any])
    
    inline def setIdentityProof(value: IDENTITY_PROOF): Self = StObject.set(x, "IdentityProof", value.asInstanceOf[js.Any])
    
    inline def setRegistrationProof(value: REGISTRATION_PROOF): Self = StObject.set(x, "RegistrationProof", value.asInstanceOf[js.Any])
    
    inline def setShareholderDeclaration(value: SHAREHOLDER_DECLARATION): Self = StObject.set(x, "ShareholderDeclaration", value.asInstanceOf[js.Any])
  }
}
