package typings.mangopay2NodejsSdk.mod.models

import typings.mangopay2NodejsSdk.PartialReportData
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CSV
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSACTIONS
import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.report.Column
import typings.mangopay2NodejsSdk.mod.report.Filters
import typings.mangopay2NodejsSdk.mod.report.ReportData
import typings.mangopay2NodejsSdk.mod.transaction.TransactionNature
import typings.mangopay2NodejsSdk.mod.transaction.TransactionStatus
import typings.mangopay2NodejsSdk.mod.transaction.TransactionType
import typings.mangopay2NodejsSdk.typesMod.CurrencyISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mangopay2-nodejs-sdk", "models.Report")
@js.native
class Report ()
  extends EntityBase[ReportData]
     with Filters
     with ReportData {
  def this(data: PartialReportData) = this()
  /**
    * To return only resources that have CreationDate AFTER this date
    */
  /* CompleteClass */
  override var AfterDate: Timestamp = js.native
  /**
    * A user's ID
    */
  /* CompleteClass */
  override var AuthorId: String = js.native
  /**
    * To return only resources that have CreationDate BEFORE this date
    */
  /* CompleteClass */
  override var BeforeDate: Timestamp = js.native
  /**
    * A URL that we will ping when the report is ready to download(works in a similar way to the hooks)
    */
  /* CompleteClass */
  override var CallbackURL: String = js.native
  /**
    * A list of columns / infos to show in the report
    */
  /* CompleteClass */
  override var Columns: js.Array[Column] = js.native
  /* CompleteClass */
  override var CreationDate: Double = js.native
  /**
    * The format of the report download
    */
  /* CompleteClass */
  override var DownloadFormat: CSV = js.native
  /**
    * The URL to download the report
    */
  /* CompleteClass */
  override var DownloadURL: String = js.native
  /**
    * An object of various filters for the report
    */
  /* CompleteClass */
  override var Filters: typings.mangopay2NodejsSdk.mod.report.Filters = js.native
  /* CompleteClass */
  override var Id: String = js.native
  /**
    * The maximum amount of DebitedFunds
    */
  /* CompleteClass */
  override var MaxDebitedFundsAmount: Double = js.native
  /**
    * The currency for the maximum amount of DebitedFunds
    */
  /* CompleteClass */
  override var MaxDebitedFundsCurrency: CurrencyISO = js.native
  /**
    * The maximum amount of Fees
    */
  /* CompleteClass */
  override var MaxFeesAmount: Double = js.native
  /**
    * The currency for the maximum amount of Fees
    */
  /* CompleteClass */
  override var MaxFeesCurrency: CurrencyISO = js.native
  /**
    * The minimum amount of DebitedFunds
    */
  /* CompleteClass */
  override var MinDebitedFundsAmount: Double = js.native
  /**
    * The currency for the minimum amount of DebitedFunds
    */
  /* CompleteClass */
  override var MinDebitedFundsCurrency: CurrencyISO = js.native
  /**
    * The minimum amount of Fees
    */
  /* CompleteClass */
  override var MinFeesAmount: Double = js.native
  /**
    * The currency for the minimum amount of Fees
    */
  /* CompleteClass */
  override var MinFeesCurrency: CurrencyISO = js.native
  /**
    * The nature of the transaction
    */
  /* CompleteClass */
  override var Nature: js.Array[TransactionNature] = js.native
  /**
    * Whether the report should be limited to the first 10 lines(and therefore quicker to execute)
    */
  /* CompleteClass */
  override var Preview: Boolean = js.native
  /**
    * The date when the report was executed
    */
  /* CompleteClass */
  override var ReportDate: Timestamp = js.native
  /**
    * The type of report
    */
  /* CompleteClass */
  override var ReportType: TRANSACTIONS = js.native
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
    * The column to sort against and direction seperate by a `:`
    */
  /* CompleteClass */
  override var Sort: String = js.native
  /**
    * The status of the transaction
    */
  /* CompleteClass */
  override var Status: js.Array[TransactionStatus] = js.native
  /* CompleteClass */
  override var Tag: String = js.native
  /**
    * The type of the transaction
    */
  /* CompleteClass */
  override var Type: js.Array[TransactionType] = js.native
  /**
    * The ID of a wallet
    */
  /* CompleteClass */
  override var WalletId: String = js.native
}

