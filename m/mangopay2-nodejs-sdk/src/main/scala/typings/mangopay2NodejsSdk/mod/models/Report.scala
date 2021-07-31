package typings.mangopay2NodejsSdk.mod.models

import typings.mangopay2NodejsSdk.anon.PartialReportData
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  var AfterDate: Timestamp = js.native
  
  /**
    * A user's ID
    */
  /* CompleteClass */
  var AuthorId: String = js.native
  
  /**
    * To return only resources that have CreationDate BEFORE this date
    */
  /* CompleteClass */
  var BeforeDate: Timestamp = js.native
  
  /**
    * A URL that we will ping when the report is ready to download(works in a similar way to the hooks)
    */
  /* CompleteClass */
  var CallbackURL: String = js.native
  
  /**
    * A list of columns / infos to show in the report
    */
  /* CompleteClass */
  var Columns: js.Array[Column] = js.native
  
  /* CompleteClass */
  var CreationDate: Double = js.native
  
  /**
    * The format of the report download
    */
  /* CompleteClass */
  var DownloadFormat: CSV = js.native
  
  /**
    * The URL to download the report
    */
  /* CompleteClass */
  var DownloadURL: String = js.native
  
  /**
    * An object of various filters for the report
    */
  /* CompleteClass */
  var Filters: typings.mangopay2NodejsSdk.mod.report.Filters = js.native
  
  /* CompleteClass */
  var Id: String = js.native
  
  /**
    * The maximum amount of DebitedFunds
    */
  /* CompleteClass */
  var MaxDebitedFundsAmount: Double = js.native
  
  /**
    * The currency for the maximum amount of DebitedFunds
    */
  /* CompleteClass */
  var MaxDebitedFundsCurrency: CurrencyISO = js.native
  
  /**
    * The maximum amount of Fees
    */
  /* CompleteClass */
  var MaxFeesAmount: Double = js.native
  
  /**
    * The currency for the maximum amount of Fees
    */
  /* CompleteClass */
  var MaxFeesCurrency: CurrencyISO = js.native
  
  /**
    * The minimum amount of DebitedFunds
    */
  /* CompleteClass */
  var MinDebitedFundsAmount: Double = js.native
  
  /**
    * The currency for the minimum amount of DebitedFunds
    */
  /* CompleteClass */
  var MinDebitedFundsCurrency: CurrencyISO = js.native
  
  /**
    * The minimum amount of Fees
    */
  /* CompleteClass */
  var MinFeesAmount: Double = js.native
  
  /**
    * The currency for the minimum amount of Fees
    */
  /* CompleteClass */
  var MinFeesCurrency: CurrencyISO = js.native
  
  /**
    * The nature of the transaction
    */
  /* CompleteClass */
  var Nature: js.Array[TransactionNature] = js.native
  
  /**
    * Whether the report should be limited to the first 10 lines(and therefore quicker to execute)
    */
  /* CompleteClass */
  var Preview: Boolean = js.native
  
  /**
    * The date when the report was executed
    */
  /* CompleteClass */
  var ReportDate: Timestamp = js.native
  
  /**
    * The type of report
    */
  /* CompleteClass */
  var ReportType: TRANSACTIONS = js.native
  
  /**
    * The result code
    */
  /* CompleteClass */
  var ResultCode: String = js.native
  
  /**
    * A verbal explanation of the ResultCode
    */
  /* CompleteClass */
  var ResultMessage: String = js.native
  
  /**
    * The column to sort against and direction seperate by a `:`
    */
  /* CompleteClass */
  var Sort: String = js.native
  
  /**
    * The status of the transaction
    */
  /* CompleteClass */
  var Status: js.Array[TransactionStatus] = js.native
  
  /* CompleteClass */
  var Tag: String = js.native
  
  /**
    * The type of the transaction
    */
  /* CompleteClass */
  var Type: js.Array[TransactionType] = js.native
  
  /**
    * The ID of a wallet
    */
  /* CompleteClass */
  var WalletId: String = js.native
}
