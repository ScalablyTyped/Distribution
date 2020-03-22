package typings.mangopay2NodejsSdk.mod.models

import typings.mangopay2NodejsSdk.PartialDisputeData
import typings.mangopay2NodejsSdk.mod.MoneyData
import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.dispute.DisputeData
import typings.mangopay2NodejsSdk.mod.dispute.DisputeStatus
import typings.mangopay2NodejsSdk.mod.transaction.TransactionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mangopay2-nodejs-sdk", "models.Dispute")
@js.native
class Dispute protected ()
  extends EntityBase[DisputeData]
     with DisputeData {
  def this(data: PartialDisputeData) = this()
  /**
    * The deadline by which you must contest the dispute (if you wish to contest it)
    */
  /* CompleteClass */
  override var ContestDeadlineDate: Timestamp = js.native
  /**
    * The amount you wish to contest
    */
  /* CompleteClass */
  override var ContestedFunds: MoneyData = js.native
  /* CompleteClass */
  override var CreationDate: Double = js.native
  /**
    * Info about the reason for the dispute
    */
  /* CompleteClass */
  override var DisputeReason: typings.mangopay2NodejsSdk.mod.dispute.DisputeReason = js.native
  /**
    * The type of dispute
    */
  /* CompleteClass */
  override var DisputeType: typings.mangopay2NodejsSdk.mod.dispute.DisputeType = js.native
  /**
    * The amount of funds that were disputed
    */
  /* CompleteClass */
  override var DisputedFunds: MoneyData = js.native
  /* CompleteClass */
  override var Id: String = js.native
  /**
    * The initial transaction ID
    */
  /* CompleteClass */
  override var InitialTransactionId: String = js.native
  /**
    * The initial transaction type
    */
  /* CompleteClass */
  override var InitialTransactionType: TransactionType = js.native
  /**
    * The ID of the associated repudiation transaction
    */
  /* CompleteClass */
  override var RepudiationId: String = js.native
  /**
    * The result code
    */
  /* CompleteClass */
  override var ResultCode: String = js.native
  /**
    * A verbal explanation of the ResultCode
    */
  /* CompleteClass */
  override var ResultMessage: String = js.native
  /**
    * The status of the dispute
    */
  /* CompleteClass */
  override var Status: DisputeStatus = js.native
  /**
    * Used to communicate information about the dispute status to you
    */
  /* CompleteClass */
  override var StatusMessage: String = js.native
  /* CompleteClass */
  override var Tag: String = js.native
}

