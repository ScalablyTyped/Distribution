package typings.mangopay2NodejsSdk.mod.models

import typings.mangopay2NodejsSdk.PartialMandateData
import typings.mangopay2NodejsSdk.mod.mandate.MandateCultureCode
import typings.mangopay2NodejsSdk.mod.mandate.MandateData
import typings.mangopay2NodejsSdk.mod.mandate.MandateExecutionType
import typings.mangopay2NodejsSdk.mod.mandate.MandateScheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mangopay2-nodejs-sdk", "models.Mandate")
@js.native
class Mandate ()
  extends EntityBase[MandateData]
     with MandateData {
  def this(data: PartialMandateData) = this()
  /**
    * An ID of a Bank Account
    */
  /* CompleteClass */
  override var BankAccountId: String = js.native
  /**
    * The banking reference for this mandate
    */
  /* CompleteClass */
  override var BankReference: String = js.native
  /* CompleteClass */
  override var CreationDate: Double = js.native
  /**
    * The language to use for the mandate confirmation page - needs to be the ISO code of the language
    */
  /* CompleteClass */
  override var Culture: MandateCultureCode = js.native
  /**
    * The URL to download the mandate
    */
  /* CompleteClass */
  override var DocumentURL: String = js.native
  /**
    * The execution type for creating the mandate
    */
  /* CompleteClass */
  override var ExecutionType: MandateExecutionType = js.native
  /* CompleteClass */
  override var Id: String = js.native
  /**
    * The type of Mandate
    */
  /* CompleteClass */
  override var MandateType: typings.mangopay2NodejsSdk.mod.mandate.MandateType = js.native
  /**
    * The URL to redirect to user to for them to proceed with the payment
    */
  /* CompleteClass */
  override var RedirectURL: String = js.native
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
    * The URL to redirect to after payment (whether successful or not)
    */
  /* CompleteClass */
  override var ReturnURL: String = js.native
  /**
    * The type of mandate, but will only be completed once the mandate has been submitted
    */
  /* CompleteClass */
  override var Scheme: MandateScheme = js.native
  /**
    * The status of the mandate:
    */
  /* CompleteClass */
  override var Status: typings.mangopay2NodejsSdk.mod.mandate.MandateStatus = js.native
  /* CompleteClass */
  override var Tag: String = js.native
  /**
    * The object owner's UserId
    */
  /* CompleteClass */
  override var UserId: String = js.native
}

