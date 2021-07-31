package typings.mangopay2NodejsSdk.mod.models

import typings.mangopay2NodejsSdk.anon.PartialKycDocumentData
import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.kycDocument.DocumentStatus
import typings.mangopay2NodejsSdk.mod.kycDocument.KYCDocumentRefusedReasonType
import typings.mangopay2NodejsSdk.mod.kycDocument.KycDocumentData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mangopay2-nodejs-sdk", "models.KycDocument")
@js.native
class KycDocument protected ()
  extends EntityBase[KycDocumentData]
     with KycDocumentData {
  def this(data: PartialKycDocumentData) = this()
  
  /* CompleteClass */
  var CreationDate: Double = js.native
  
  /* CompleteClass */
  var Id: String = js.native
  
  /**
    * The date when the document was processed by MANGOPAY
    */
  /* CompleteClass */
  var ProcessedDate: Timestamp = js.native
  
  /**
    * The message accompanying a refusal
    */
  /* CompleteClass */
  var RefusedReasonMessage: String = js.native
  
  /**
    * The type of reason for refusal
    */
  /* CompleteClass */
  var RefusedReasonType: KYCDocumentRefusedReasonType = js.native
  
  /**
    * The status of this KYC/Dispute document
    */
  /* CompleteClass */
  var Status: DocumentStatus = js.native
  
  /* CompleteClass */
  var Tag: String = js.native
  
  /**
    * Gives the type of the KYC document
    */
  /* CompleteClass */
  var Type: typings.mangopay2NodejsSdk.mod.kycDocument.KycDocumentType = js.native
  
  /**
    * The object owner's UserId
    */
  /* CompleteClass */
  var UserId: String = js.native
}
