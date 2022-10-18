package typings.mangopay2NodejsSdk.mod.models

import typings.mangopay2NodejsSdk.typingsModelsDisputeDocumentMod.disputeDocument.DisputeDocumentData
import typings.mangopay2NodejsSdk.typingsModelsDisputeDocumentMod.disputeDocument.DisputeDocumentType
import typings.mangopay2NodejsSdk.typingsModelsDisputeDocumentMod.disputeDocument.DocumentStatus
import typings.mangopay2NodejsSdk.typingsTypesMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mangopay2-nodejs-sdk", "models.DisputeDocument")
@js.native
open class DisputeDocument protected ()
  extends Document
     with DisputeDocumentData {
  def this(data: Any) = this()
  
  /* CompleteClass */
  var CreationDate: Double = js.native
  
  /**
    * The Id of a Dispute
    */
  /* CompleteClass */
  var DisputeId: String = js.native
  
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
  var RefusedReasonType: typings.mangopay2NodejsSdk.typingsModelsDisputeDocumentMod.disputeDocument.RefusedReasonType = js.native
  
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
  var Type: DisputeDocumentType = js.native
  
  /**
    * The object owner's UserId
    */
  /* CompleteClass */
  var UserId: String = js.native
}
