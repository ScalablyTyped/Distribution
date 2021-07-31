package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CSV
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Id_
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSACTIONS
import typings.mangopay2NodejsSdk.mod.entityBase.EntityBaseData
import typings.mangopay2NodejsSdk.mod.transaction.TransactionNature
import typings.mangopay2NodejsSdk.mod.transaction.TransactionStatus
import typings.mangopay2NodejsSdk.mod.transaction.TransactionType
import typings.mangopay2NodejsSdk.typesMod.CurrencyISO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object report {
  
  /* Rewritten from type alias, can be one of: 
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Alias
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AuthorId
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BankAccountId
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BankWireRef
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CardId
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CardType
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Country
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CreationDate
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CreditedFundsAmount
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CreditedFundsCurrency
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CreditedUserId
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CreditedWalletId
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Culture
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DebitedFundsAmount
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DebitedFundsCurrency
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DebitedWalletId
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DeclaredDebitedFundsAmount
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DeclaredDebitedFundsCurrency
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DeclaredFeesAmount
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DeclaredFeesCurrency
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ExecutionDate
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ExecutionType
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ExpirationDate
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FeesAmount
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FeesCurrency
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Id_
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Nature
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PaymentType
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PreauthorizationId
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ResultCode
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ResultMessage
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Status
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Tag
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Type
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WireReference
  */
  trait Column extends StObject
  object Column {
    
    @scala.inline
    def Alias: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Alias = "Alias".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Alias]
    
    @scala.inline
    def AuthorId: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AuthorId = "AuthorId".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AuthorId]
    
    @scala.inline
    def BankAccountId: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BankAccountId = "BankAccountId".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BankAccountId]
    
    @scala.inline
    def BankWireRef: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BankWireRef = "BankWireRef".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BankWireRef]
    
    @scala.inline
    def CardId: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CardId = "CardId".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CardId]
    
    @scala.inline
    def CardType: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CardType = "CardType".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CardType]
    
    @scala.inline
    def Country: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Country = "Country".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Country]
    
    @scala.inline
    def CreationDate: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CreationDate = "CreationDate".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CreationDate]
    
    @scala.inline
    def CreditedFundsAmount: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CreditedFundsAmount = "CreditedFundsAmount".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CreditedFundsAmount]
    
    @scala.inline
    def CreditedFundsCurrency: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CreditedFundsCurrency = "CreditedFundsCurrency".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CreditedFundsCurrency]
    
    @scala.inline
    def CreditedUserId: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CreditedUserId = "CreditedUserId".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CreditedUserId]
    
    @scala.inline
    def CreditedWalletId: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CreditedWalletId = "CreditedWalletId".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CreditedWalletId]
    
    @scala.inline
    def Culture: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Culture = "Culture".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Culture]
    
    @scala.inline
    def DebitedFundsAmount: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DebitedFundsAmount = "DebitedFundsAmount".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DebitedFundsAmount]
    
    @scala.inline
    def DebitedFundsCurrency: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DebitedFundsCurrency = "DebitedFundsCurrency".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DebitedFundsCurrency]
    
    @scala.inline
    def DebitedWalletId: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DebitedWalletId = "DebitedWalletId".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DebitedWalletId]
    
    @scala.inline
    def DeclaredDebitedFundsAmount: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DeclaredDebitedFundsAmount = "DeclaredDebitedFundsAmount".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DeclaredDebitedFundsAmount]
    
    @scala.inline
    def DeclaredDebitedFundsCurrency: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DeclaredDebitedFundsCurrency = "DeclaredDebitedFundsCurrency".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DeclaredDebitedFundsCurrency]
    
    @scala.inline
    def DeclaredFeesAmount: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DeclaredFeesAmount = "DeclaredFeesAmount".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DeclaredFeesAmount]
    
    @scala.inline
    def DeclaredFeesCurrency: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DeclaredFeesCurrency = "DeclaredFeesCurrency".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DeclaredFeesCurrency]
    
    @scala.inline
    def ExecutionDate: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ExecutionDate = "ExecutionDate".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ExecutionDate]
    
    @scala.inline
    def ExecutionType: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ExecutionType = "ExecutionType".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ExecutionType]
    
    @scala.inline
    def ExpirationDate: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ExpirationDate = "ExpirationDate".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ExpirationDate]
    
    @scala.inline
    def FeesAmount: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FeesAmount = "FeesAmount".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FeesAmount]
    
    @scala.inline
    def FeesCurrency: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FeesCurrency = "FeesCurrency".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FeesCurrency]
    
    @scala.inline
    def Id: Id_ = "Id".asInstanceOf[Id_]
    
    @scala.inline
    def Nature: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Nature = "Nature".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Nature]
    
    @scala.inline
    def PaymentType: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PaymentType = "PaymentType".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PaymentType]
    
    @scala.inline
    def PreauthorizationId: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PreauthorizationId = "PreauthorizationId".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PreauthorizationId]
    
    @scala.inline
    def ResultCode: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ResultCode = "ResultCode".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ResultCode]
    
    @scala.inline
    def ResultMessage: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ResultMessage = "ResultMessage".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ResultMessage]
    
    @scala.inline
    def Status: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Status = "Status".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Status]
    
    @scala.inline
    def Tag: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Tag = "Tag".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Tag]
    
    @scala.inline
    def Type: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Type = "Type".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Type]
    
    @scala.inline
    def WireReference: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WireReference = "WireReference".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WireReference]
  }
  
  /* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.PickPartial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.report.ReportData, 'Tag' | 'CallbackURL' | 'DownloadFormat' | 'Sort' | 'Preview' | 'Filters' | 'Columns'> */
  trait CreateReport extends StObject {
    
    var CallbackURL: js.UndefOr[String] = js.undefined
    
    var Columns: js.UndefOr[js.Array[Column]] = js.undefined
    
    var DownloadFormat: js.UndefOr[CSV] = js.undefined
    
    var Filters: js.UndefOr[typings.mangopay2NodejsSdk.mod.report.Filters] = js.undefined
    
    var Preview: js.UndefOr[Boolean] = js.undefined
    
    var Sort: js.UndefOr[String] = js.undefined
    
    var Tag: js.UndefOr[String] = js.undefined
  }
  object CreateReport {
    
    @scala.inline
    def apply(): CreateReport = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateReport]
    }
    
    @scala.inline
    implicit class CreateReportMutableBuilder[Self <: CreateReport] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallbackURL(value: String): Self = StObject.set(x, "CallbackURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackURLUndefined: Self = StObject.set(x, "CallbackURL", js.undefined)
      
      @scala.inline
      def setColumns(value: js.Array[Column]): Self = StObject.set(x, "Columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "Columns", js.undefined)
      
      @scala.inline
      def setColumnsVarargs(value: Column*): Self = StObject.set(x, "Columns", js.Array(value :_*))
      
      @scala.inline
      def setDownloadFormat(value: CSV): Self = StObject.set(x, "DownloadFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadFormatUndefined: Self = StObject.set(x, "DownloadFormat", js.undefined)
      
      @scala.inline
      def setFilters(value: Filters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
      
      @scala.inline
      def setPreview(value: Boolean): Self = StObject.set(x, "Preview", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewUndefined: Self = StObject.set(x, "Preview", js.undefined)
      
      @scala.inline
      def setSort(value: String): Self = StObject.set(x, "Sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortUndefined: Self = StObject.set(x, "Sort", js.undefined)
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
    }
  }
  
  trait Filters extends StObject {
    
    /**
      * To return only resources that have CreationDate AFTER this date
      */
    var AfterDate: Timestamp
    
    /**
      * A user's ID
      */
    var AuthorId: String
    
    /**
      * To return only resources that have CreationDate BEFORE this date
      */
    var BeforeDate: Timestamp
    
    /**
      * The maximum amount of DebitedFunds
      */
    var MaxDebitedFundsAmount: Double
    
    /**
      * The currency for the maximum amount of DebitedFunds
      */
    var MaxDebitedFundsCurrency: CurrencyISO
    
    /**
      * The maximum amount of Fees
      */
    var MaxFeesAmount: Double
    
    /**
      * The currency for the maximum amount of Fees
      */
    var MaxFeesCurrency: CurrencyISO
    
    /**
      * The minimum amount of DebitedFunds
      */
    var MinDebitedFundsAmount: Double
    
    /**
      * The currency for the minimum amount of DebitedFunds
      */
    var MinDebitedFundsCurrency: CurrencyISO
    
    /**
      * The minimum amount of Fees
      */
    var MinFeesAmount: Double
    
    /**
      * The currency for the minimum amount of Fees
      */
    var MinFeesCurrency: CurrencyISO
    
    /**
      * The nature of the transaction
      */
    var Nature: js.Array[TransactionNature]
    
    /**
      * The status of the transaction
      */
    var Status: js.Array[TransactionStatus]
    
    /**
      * The type of the transaction
      */
    var Type: js.Array[TransactionType]
    
    /**
      * The ID of a wallet
      */
    var WalletId: String
  }
  object Filters {
    
    @scala.inline
    implicit class FiltersMutableBuilder[Self <: Filters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterDate(value: Timestamp): Self = StObject.set(x, "AfterDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorId(value: String): Self = StObject.set(x, "AuthorId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeDate(value: Timestamp): Self = StObject.set(x, "BeforeDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDebitedFundsAmount(value: Double): Self = StObject.set(x, "MaxDebitedFundsAmount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDebitedFundsCurrency(value: CurrencyISO): Self = StObject.set(x, "MaxDebitedFundsCurrency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxFeesAmount(value: Double): Self = StObject.set(x, "MaxFeesAmount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxFeesCurrency(value: CurrencyISO): Self = StObject.set(x, "MaxFeesCurrency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDebitedFundsAmount(value: Double): Self = StObject.set(x, "MinDebitedFundsAmount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDebitedFundsCurrency(value: CurrencyISO): Self = StObject.set(x, "MinDebitedFundsCurrency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinFeesAmount(value: Double): Self = StObject.set(x, "MinFeesAmount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinFeesCurrency(value: CurrencyISO): Self = StObject.set(x, "MinFeesCurrency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNature(value: js.Array[TransactionNature]): Self = StObject.set(x, "Nature", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNatureVarargs(value: TransactionNature*): Self = StObject.set(x, "Nature", js.Array(value :_*))
      
      @scala.inline
      def setStatus(value: js.Array[TransactionStatus]): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusVarargs(value: TransactionStatus*): Self = StObject.set(x, "Status", js.Array(value :_*))
      
      @scala.inline
      def setType(value: js.Array[TransactionType]): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeVarargs(value: TransactionType*): Self = StObject.set(x, "Type", js.Array(value :_*))
      
      @scala.inline
      def setWalletId(value: String): Self = StObject.set(x, "WalletId", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReportData
    extends StObject
       with EntityBaseData {
    
    /**
      * A URL that we will ping when the report is ready to download(works in a similar way to the hooks)
      */
    var CallbackURL: String
    
    /**
      * A list of columns / infos to show in the report
      */
    var Columns: js.Array[Column]
    
    /**
      * The format of the report download
      */
    var DownloadFormat: CSV
    
    /**
      * The URL to download the report
      */
    var DownloadURL: String
    
    /**
      * An object of various filters for the report
      */
    var Filters: typings.mangopay2NodejsSdk.mod.report.Filters
    
    /**
      * Whether the report should be limited to the first 10 lines(and therefore quicker to execute)
      */
    var Preview: Boolean
    
    /**
      * The date when the report was executed
      */
    var ReportDate: Timestamp
    
    /**
      * The type of report
      */
    var ReportType: TRANSACTIONS
    
    /**
      * The result code
      */
    var ResultCode: String
    
    /**
      * A verbal explanation of the ResultCode
      */
    var ResultMessage: String
    
    /**
      * The column to sort against and direction seperate by a `:`
      */
    var Sort: String
  }
  object ReportData {
    
    @scala.inline
    def apply(
      CallbackURL: String,
      Columns: js.Array[Column],
      CreationDate: Double,
      DownloadURL: String,
      Filters: Filters,
      Id: String,
      Preview: Boolean,
      ReportDate: Timestamp,
      ResultCode: String,
      ResultMessage: String,
      Sort: String,
      Tag: String
    ): ReportData = {
      val __obj = js.Dynamic.literal(CallbackURL = CallbackURL.asInstanceOf[js.Any], Columns = Columns.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], DownloadFormat = "CSV", DownloadURL = DownloadURL.asInstanceOf[js.Any], Filters = Filters.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Preview = Preview.asInstanceOf[js.Any], ReportDate = ReportDate.asInstanceOf[js.Any], ReportType = "TRANSACTIONS", ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], Sort = Sort.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReportData]
    }
    
    @scala.inline
    implicit class ReportDataMutableBuilder[Self <: ReportData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallbackURL(value: String): Self = StObject.set(x, "CallbackURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumns(value: js.Array[Column]): Self = StObject.set(x, "Columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsVarargs(value: Column*): Self = StObject.set(x, "Columns", js.Array(value :_*))
      
      @scala.inline
      def setDownloadFormat(value: CSV): Self = StObject.set(x, "DownloadFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadURL(value: String): Self = StObject.set(x, "DownloadURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilters(value: Filters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreview(value: Boolean): Self = StObject.set(x, "Preview", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReportDate(value: Timestamp): Self = StObject.set(x, "ReportDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReportType(value: TRANSACTIONS): Self = StObject.set(x, "ReportType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultCode(value: String): Self = StObject.set(x, "ResultCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultMessage(value: String): Self = StObject.set(x, "ResultMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSort(value: String): Self = StObject.set(x, "Sort", value.asInstanceOf[js.Any])
    }
  }
}
