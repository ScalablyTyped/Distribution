package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BANK_WIRE
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CARD
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DIRECT
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZED
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WEB
import typings.mangopay2NodejsSdk.mod.card.CardType
import typings.mangopay2NodejsSdk.mod.entityBase.EntityBaseData
import typings.mangopay2NodejsSdk.mod.transaction.TransactionNature
import typings.mangopay2NodejsSdk.mod.transaction.TransactionStatus
import typings.mangopay2NodejsSdk.mod.transaction.TransactionType
import typings.mangopay2NodejsSdk.typesMod.CountryISO
import typings.mangopay2NodejsSdk.typesMod.ValueOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object payIn {
  
  @js.native
  trait BankAccountData extends StObject {
    
    /**
      * The BIC of the bank account
      */
    var BIC: String = js.native
    
    /**
      * The IBAN of the bank account
      */
    var IBAN: String = js.native
    
    /**
      * The address of the owner of the bank account
      */
    var OwnerAddress: String = js.native
    
    /**
      * The name of the owner of the bank account
      */
    var OwnerName: String = js.native
    
    /**
      * The type of bank account
      */
    var Type: ValueOf[IBankAccountType] = js.native
  }
  object BankAccountData {
    
    @scala.inline
    def apply(
      BIC: String,
      IBAN: String,
      OwnerAddress: String,
      OwnerName: String,
      Type: ValueOf[IBankAccountType]
    ): BankAccountData = {
      val __obj = js.Dynamic.literal(BIC = BIC.asInstanceOf[js.Any], IBAN = IBAN.asInstanceOf[js.Any], OwnerAddress = OwnerAddress.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[BankAccountData]
    }
    
    @scala.inline
    implicit class BankAccountDataMutableBuilder[Self <: BankAccountData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBIC(value: String): Self = StObject.set(x, "BIC", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIBAN(value: String): Self = StObject.set(x, "IBAN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerAddress(value: String): Self = StObject.set(x, "OwnerAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerName(value: String): Self = StObject.set(x, "OwnerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: ValueOf[IBankAccountType]): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BankWireDirectPayInData
    extends BasePayInData
       with PayInData {
    
    /**
      * Bank account details
      */
    var BankAccount: BankAccountData = js.native
    
    /**
      * The declared debited funds
      */
    var DeclaredDebitedFunds: MoneyData = js.native
    
    /**
      * The declared fees
      */
    var DeclaredFees: MoneyData = js.native
    
    @JSName("ExecutionType")
    var ExecutionType_BankWireDirectPayInData: DIRECT = js.native
    
    @JSName("PaymentType")
    var PaymentType_BankWireDirectPayInData: BANK_WIRE = js.native
    
    /**
      * Wire reference
      */
    var WireReference: String = js.native
  }
  object BankWireDirectPayInData {
    
    @scala.inline
    def apply(
      AuthorId: String,
      BankAccount: BankAccountData,
      CreationDate: Double,
      CreditedFunds: MoneyData,
      CreditedUserId: String,
      CreditedWalletId: String,
      DebitedFunds: MoneyData,
      DebitedWalletId: String,
      DeclaredDebitedFunds: MoneyData,
      DeclaredFees: MoneyData,
      ExecutionDate: Timestamp,
      ExecutionType: DIRECT,
      Fees: MoneyData,
      Id: String,
      Nature: TransactionNature,
      PaymentType: BANK_WIRE,
      ResultCode: String,
      ResultMessage: String,
      Status: TransactionStatus,
      Tag: String,
      Type: TransactionType,
      WireReference: String
    ): BankWireDirectPayInData = {
      val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], BankAccount = BankAccount.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], CreditedFunds = CreditedFunds.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], DebitedWalletId = DebitedWalletId.asInstanceOf[js.Any], DeclaredDebitedFunds = DeclaredDebitedFunds.asInstanceOf[js.Any], DeclaredFees = DeclaredFees.asInstanceOf[js.Any], ExecutionDate = ExecutionDate.asInstanceOf[js.Any], ExecutionType = ExecutionType.asInstanceOf[js.Any], Fees = Fees.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Nature = Nature.asInstanceOf[js.Any], PaymentType = PaymentType.asInstanceOf[js.Any], ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], WireReference = WireReference.asInstanceOf[js.Any])
      __obj.asInstanceOf[BankWireDirectPayInData]
    }
    
    @scala.inline
    implicit class BankWireDirectPayInDataMutableBuilder[Self <: BankWireDirectPayInData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBankAccount(value: BankAccountData): Self = StObject.set(x, "BankAccount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeclaredDebitedFunds(value: MoneyData): Self = StObject.set(x, "DeclaredDebitedFunds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeclaredFees(value: MoneyData): Self = StObject.set(x, "DeclaredFees", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecutionType(value: DIRECT): Self = StObject.set(x, "ExecutionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaymentType(value: BANK_WIRE): Self = StObject.set(x, "PaymentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWireReference(value: String): Self = StObject.set(x, "WireReference", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BasePayInData extends EntityBaseData {
    
    /**
      * A user's ID
      */
    var AuthorId: String = js.native
    
    /**
      * Details about the funds that are being credited (DebitedFunds – Fees = CreditedFunds)
      */
    var CreditedFunds: MoneyData = js.native
    
    /**
      * The user ID who is credited (defaults to the owner of the wallet)
      */
    var CreditedUserId: String = js.native
    
    /**
      * The ID of the wallet where money will be credited
      */
    var CreditedWalletId: String = js.native
    
    /**
      * Information about the funds that are being debited
      */
    var DebitedFunds: MoneyData = js.native
    
    /**
      * The ID of the wallet that was debited
      */
    var DebitedWalletId: String = js.native
    
    /**
      * When the transaction happened
      */
    var ExecutionDate: Timestamp = js.native
    
    /**
      * The type of execution for the payin
      */
    var ExecutionType: PayInExecutionType = js.native
    
    /**
      * Information about the fees that were taken by the client for this transaction (and were hence transferred to the Client's platform wallet)
      */
    var Fees: MoneyData = js.native
    
    /**
      * The nature of the transaction
      */
    var Nature: TransactionNature = js.native
    
    /**
      * The type of payin
      */
    var PaymentType: PayInPaymentType = js.native
    
    /**
      * The result code
      */
    var ResultCode: String = js.native
    
    /**
      * A verbal explanation of the ResultCode
      */
    var ResultMessage: String = js.native
    
    /**
      * The status of the transaction
      */
    var Status: TransactionStatus = js.native
    
    /**
      * The type of the transaction
      */
    var Type: TransactionType = js.native
  }
  object BasePayInData {
    
    @scala.inline
    def apply(
      AuthorId: String,
      CreationDate: Double,
      CreditedFunds: MoneyData,
      CreditedUserId: String,
      CreditedWalletId: String,
      DebitedFunds: MoneyData,
      DebitedWalletId: String,
      ExecutionDate: Timestamp,
      ExecutionType: PayInExecutionType,
      Fees: MoneyData,
      Id: String,
      Nature: TransactionNature,
      PaymentType: PayInPaymentType,
      ResultCode: String,
      ResultMessage: String,
      Status: TransactionStatus,
      Tag: String,
      Type: TransactionType
    ): BasePayInData = {
      val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], CreditedFunds = CreditedFunds.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], DebitedWalletId = DebitedWalletId.asInstanceOf[js.Any], ExecutionDate = ExecutionDate.asInstanceOf[js.Any], ExecutionType = ExecutionType.asInstanceOf[js.Any], Fees = Fees.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Nature = Nature.asInstanceOf[js.Any], PaymentType = PaymentType.asInstanceOf[js.Any], ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[BasePayInData]
    }
    
    @scala.inline
    implicit class BasePayInDataMutableBuilder[Self <: BasePayInData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorId(value: String): Self = StObject.set(x, "AuthorId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreditedFunds(value: MoneyData): Self = StObject.set(x, "CreditedFunds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreditedUserId(value: String): Self = StObject.set(x, "CreditedUserId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreditedWalletId(value: String): Self = StObject.set(x, "CreditedWalletId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebitedFunds(value: MoneyData): Self = StObject.set(x, "DebitedFunds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebitedWalletId(value: String): Self = StObject.set(x, "DebitedWalletId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecutionDate(value: Timestamp): Self = StObject.set(x, "ExecutionDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecutionType(value: PayInExecutionType): Self = StObject.set(x, "ExecutionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFees(value: MoneyData): Self = StObject.set(x, "Fees", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNature(value: TransactionNature): Self = StObject.set(x, "Nature", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaymentType(value: PayInPaymentType): Self = StObject.set(x, "PaymentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultCode(value: String): Self = StObject.set(x, "ResultCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultMessage(value: String): Self = StObject.set(x, "ResultMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: TransactionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: TransactionType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CardDirectPayInData
    extends BasePayInData
       with PayInData {
    
    /**
      * Contains useful information related to the user billing
      */
    var Billing: BillingData = js.native
    
    /**
      * The ID of a card
      */
    var CardId: String = js.native
    
    @JSName("ExecutionType")
    var ExecutionType_CardDirectPayInData: DIRECT = js.native
    
    @JSName("PaymentType")
    var PaymentType_CardDirectPayInData: CARD = js.native
    
    /**
      * The SecureMode corresponds to '3D secure' for CB Visa and MasterCard. This field lets you activate it manually. The field lets you activate it
      * automatically with "DEFAULT" (Secured Mode will be activated from €50 or when MANGOPAY detects there is a higher risk ), "FORCE" (if you wish to specifically force the secured mode).
      */
    var SecureMode: typings.mangopay2NodejsSdk.mod.SecureMode = js.native
    
    /**
      * The value is 'true' if the SecureMode was used
      */
    var SecureModeNeeded: Boolean = js.native
    
    /**
      * This is the URL where to redirect users to proceed to 3D secure validation
      */
    var SecureModeRedirectURL: String = js.native
    
    /**
      * This is the URL where users are automatically redirected after 3D secure validation (if activated)
      */
    var SecureModeReturnURL: String = js.native
    
    /**
      * Contains information related to security and fraud
      */
    var SecurityInfo: SecurityInfoData = js.native
    
    /**
      * A custom description to appear on the user's bank statement. It can be up to 10 characters long, and can only include alphanumeric
      * characters or spaces. See here for important info. Note that each bank handles this information differently, some show less or no information.
      */
    var StatementDescriptor: String = js.native
  }
  object CardDirectPayInData {
    
    @scala.inline
    def apply(
      AuthorId: String,
      Billing: BillingData,
      CardId: String,
      CreationDate: Double,
      CreditedFunds: MoneyData,
      CreditedUserId: String,
      CreditedWalletId: String,
      DebitedFunds: MoneyData,
      DebitedWalletId: String,
      ExecutionDate: Timestamp,
      ExecutionType: DIRECT,
      Fees: MoneyData,
      Id: String,
      Nature: TransactionNature,
      PaymentType: CARD,
      ResultCode: String,
      ResultMessage: String,
      SecureMode: SecureMode,
      SecureModeNeeded: Boolean,
      SecureModeRedirectURL: String,
      SecureModeReturnURL: String,
      SecurityInfo: SecurityInfoData,
      StatementDescriptor: String,
      Status: TransactionStatus,
      Tag: String,
      Type: TransactionType
    ): CardDirectPayInData = {
      val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], Billing = Billing.asInstanceOf[js.Any], CardId = CardId.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], CreditedFunds = CreditedFunds.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], DebitedWalletId = DebitedWalletId.asInstanceOf[js.Any], ExecutionDate = ExecutionDate.asInstanceOf[js.Any], ExecutionType = ExecutionType.asInstanceOf[js.Any], Fees = Fees.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Nature = Nature.asInstanceOf[js.Any], PaymentType = PaymentType.asInstanceOf[js.Any], ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], SecureMode = SecureMode.asInstanceOf[js.Any], SecureModeNeeded = SecureModeNeeded.asInstanceOf[js.Any], SecureModeRedirectURL = SecureModeRedirectURL.asInstanceOf[js.Any], SecureModeReturnURL = SecureModeReturnURL.asInstanceOf[js.Any], SecurityInfo = SecurityInfo.asInstanceOf[js.Any], StatementDescriptor = StatementDescriptor.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardDirectPayInData]
    }
    
    @scala.inline
    implicit class CardDirectPayInDataMutableBuilder[Self <: CardDirectPayInData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBilling(value: BillingData): Self = StObject.set(x, "Billing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardId(value: String): Self = StObject.set(x, "CardId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecutionType(value: DIRECT): Self = StObject.set(x, "ExecutionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaymentType(value: CARD): Self = StObject.set(x, "PaymentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureMode(value: SecureMode): Self = StObject.set(x, "SecureMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureModeNeeded(value: Boolean): Self = StObject.set(x, "SecureModeNeeded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureModeRedirectURL(value: String): Self = StObject.set(x, "SecureModeRedirectURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureModeReturnURL(value: String): Self = StObject.set(x, "SecureModeReturnURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityInfo(value: SecurityInfoData): Self = StObject.set(x, "SecurityInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatementDescriptor(value: String): Self = StObject.set(x, "StatementDescriptor", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CardPreAuthorizedPayInData
    extends BasePayInData
       with PayInData {
    
    @JSName("ExecutionType")
    var ExecutionType_CardPreAuthorizedPayInData: DIRECT = js.native
    
    @JSName("PaymentType")
    var PaymentType_CardPreAuthorizedPayInData: PREAUTHORIZED = js.native
    
    var PreauthorizationId: String = js.native
  }
  object CardPreAuthorizedPayInData {
    
    @scala.inline
    def apply(
      AuthorId: String,
      CreationDate: Double,
      CreditedFunds: MoneyData,
      CreditedUserId: String,
      CreditedWalletId: String,
      DebitedFunds: MoneyData,
      DebitedWalletId: String,
      ExecutionDate: Timestamp,
      ExecutionType: DIRECT,
      Fees: MoneyData,
      Id: String,
      Nature: TransactionNature,
      PaymentType: PREAUTHORIZED,
      PreauthorizationId: String,
      ResultCode: String,
      ResultMessage: String,
      Status: TransactionStatus,
      Tag: String,
      Type: TransactionType
    ): CardPreAuthorizedPayInData = {
      val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], CreditedFunds = CreditedFunds.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], DebitedWalletId = DebitedWalletId.asInstanceOf[js.Any], ExecutionDate = ExecutionDate.asInstanceOf[js.Any], ExecutionType = ExecutionType.asInstanceOf[js.Any], Fees = Fees.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Nature = Nature.asInstanceOf[js.Any], PaymentType = PaymentType.asInstanceOf[js.Any], PreauthorizationId = PreauthorizationId.asInstanceOf[js.Any], ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardPreAuthorizedPayInData]
    }
    
    @scala.inline
    implicit class CardPreAuthorizedPayInDataMutableBuilder[Self <: CardPreAuthorizedPayInData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExecutionType(value: DIRECT): Self = StObject.set(x, "ExecutionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaymentType(value: PREAUTHORIZED): Self = StObject.set(x, "PaymentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreauthorizationId(value: String): Self = StObject.set(x, "PreauthorizationId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CardWebPayInData
    extends BasePayInData
       with PayInData {
    
    /**
      * The type of card
      */
    var CardType: typings.mangopay2NodejsSdk.mod.card.CardType = js.native
    
    /**
      * The language to use for the payment page - needs to be the ISO code of the language
      */
    var Culture: CountryISO = js.native
    
    @JSName("ExecutionType")
    var ExecutionType_CardWebPayInData: WEB = js.native
    
    @JSName("PaymentType")
    var PaymentType_CardWebPayInData: CARD = js.native
    
    /**
      * The URL to redirect to user to for them to proceed with the payment
      */
    var RedirectURL: String = js.native
    
    /**
      * The URL to redirect to after payment (whether successful or not)
      */
    var ReturnURL: String = js.native
    
    /**
      * The SecureMode corresponds to '3D secure' for CB Visa and MasterCard. This field lets you activate it manually. The field lets you activate it
      * automatically with "DEFAULT" (Secured Mode will be activated from €50 or when MANGOPAY detects there is a higher risk ), "FORCE" (if you wish to specifically force the secured mode).
      */
    var SecureMode: typings.mangopay2NodejsSdk.mod.SecureMode = js.native
    
    /**
      * A custom description to appear on the user's bank statement. It can be up to 10 characters long, and can only include alphanumeric characters or spaces.
      * See here for important info. Note that each bank handles this information differently, some show less or no information.
      */
    var StatementDescriptor: String = js.native
    
    /**
      * The URL to use for the payment page template
      */
    var TemplateURL: String = js.native
  }
  object CardWebPayInData {
    
    @scala.inline
    def apply(
      AuthorId: String,
      CardType: CardType,
      CreationDate: Double,
      CreditedFunds: MoneyData,
      CreditedUserId: String,
      CreditedWalletId: String,
      Culture: CountryISO,
      DebitedFunds: MoneyData,
      DebitedWalletId: String,
      ExecutionDate: Timestamp,
      ExecutionType: WEB,
      Fees: MoneyData,
      Id: String,
      Nature: TransactionNature,
      PaymentType: CARD,
      RedirectURL: String,
      ResultCode: String,
      ResultMessage: String,
      ReturnURL: String,
      SecureMode: SecureMode,
      StatementDescriptor: String,
      Status: TransactionStatus,
      Tag: String,
      TemplateURL: String,
      Type: TransactionType
    ): CardWebPayInData = {
      val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], CardType = CardType.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], CreditedFunds = CreditedFunds.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], Culture = Culture.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], DebitedWalletId = DebitedWalletId.asInstanceOf[js.Any], ExecutionDate = ExecutionDate.asInstanceOf[js.Any], ExecutionType = ExecutionType.asInstanceOf[js.Any], Fees = Fees.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Nature = Nature.asInstanceOf[js.Any], PaymentType = PaymentType.asInstanceOf[js.Any], RedirectURL = RedirectURL.asInstanceOf[js.Any], ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], ReturnURL = ReturnURL.asInstanceOf[js.Any], SecureMode = SecureMode.asInstanceOf[js.Any], StatementDescriptor = StatementDescriptor.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], TemplateURL = TemplateURL.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardWebPayInData]
    }
    
    @scala.inline
    implicit class CardWebPayInDataMutableBuilder[Self <: CardWebPayInData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCardType(value: CardType): Self = StObject.set(x, "CardType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCulture(value: CountryISO): Self = StObject.set(x, "Culture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecutionType(value: WEB): Self = StObject.set(x, "ExecutionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaymentType(value: CARD): Self = StObject.set(x, "PaymentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectURL(value: String): Self = StObject.set(x, "RedirectURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnURL(value: String): Self = StObject.set(x, "ReturnURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureMode(value: SecureMode): Self = StObject.set(x, "SecureMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatementDescriptor(value: String): Self = StObject.set(x, "StatementDescriptor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateURL(value: String): Self = StObject.set(x, "TemplateURL", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.PickPartialRequired<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.payIn.BankWireDirectPayInData, 'Tag', 'AuthorId' | 'CreditedUserId' | 'CreditedWalletId' | 'DeclaredDebitedFunds' | 'DeclaredFees'> */
  @js.native
  trait CreateBankWireDirectPayIn extends StObject {
    
    var AuthorId: String = js.native
    
    var CreditedUserId: String = js.native
    
    var CreditedWalletId: String = js.native
    
    var DeclaredDebitedFunds: MoneyData = js.native
    
    var DeclaredFees: MoneyData = js.native
    
    var ExecutionType: DIRECT = js.native
    
    var PaymentType: BANK_WIRE = js.native
    
    var Tag: js.UndefOr[String] = js.native
  }
  object CreateBankWireDirectPayIn {
    
    @scala.inline
    def apply(
      AuthorId: String,
      CreditedUserId: String,
      CreditedWalletId: String,
      DeclaredDebitedFunds: MoneyData,
      DeclaredFees: MoneyData,
      ExecutionType: DIRECT,
      PaymentType: BANK_WIRE
    ): CreateBankWireDirectPayIn = {
      val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DeclaredDebitedFunds = DeclaredDebitedFunds.asInstanceOf[js.Any], DeclaredFees = DeclaredFees.asInstanceOf[js.Any], ExecutionType = ExecutionType.asInstanceOf[js.Any], PaymentType = PaymentType.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateBankWireDirectPayIn]
    }
    
    @scala.inline
    implicit class CreateBankWireDirectPayInMutableBuilder[Self <: CreateBankWireDirectPayIn] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorId(value: String): Self = StObject.set(x, "AuthorId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreditedUserId(value: String): Self = StObject.set(x, "CreditedUserId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreditedWalletId(value: String): Self = StObject.set(x, "CreditedWalletId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeclaredDebitedFunds(value: MoneyData): Self = StObject.set(x, "DeclaredDebitedFunds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeclaredFees(value: MoneyData): Self = StObject.set(x, "DeclaredFees", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecutionType(value: DIRECT): Self = StObject.set(x, "ExecutionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaymentType(value: BANK_WIRE): Self = StObject.set(x, "PaymentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
    }
  }
  
  @js.native
  trait CreateCardDirectPayIn extends StObject {
    
    /**
      * A user's ID
      */
    var AuthorId: String = js.native
    
    /**
      * Contains useful information related to the user billing
      */
    var Billing: js.UndefOr[BillingData] = js.native
    
    /**
      * The ID of a card
      */
    var CardId: String = js.native
    
    /**
      * The user ID who is credited (defaults to the owner of the wallet)
      */
    var CreditedUserId: js.UndefOr[String] = js.native
    
    /**
      * The ID of the wallet where money will be credited
      */
    var CreditedWalletId: String = js.native
    
    /**
      * Information about the funds that are being debited
      */
    var DebitedFunds: MoneyData = js.native
    
    var ExecutionType: DIRECT = js.native
    
    /**
      * Information about the fees that were taken by the client for this transaction (and were hence transferred to the Client's platform wallet)
      */
    var Fees: MoneyData = js.native
    
    var PaymentType: CARD = js.native
    
    /**
      * The SecureMode corresponds to '3D secure' for CB Visa and MasterCard. This field lets you activate it manually. The field lets you activate it automatically
      *  with "DEFAULT" (Secured Mode will be activated from €50 or when MANGOPAY detects there is a higher risk ), "FORCE" (if you wish to specifically force the secured mode).
      */
    var SecureMode: js.UndefOr[typings.mangopay2NodejsSdk.mod.SecureMode] = js.native
    
    /**
      * This is the URL where users are automatically redirected after 3D secure validation (if activated)
      */
    var SecureModeReturnURL: String = js.native
    
    /**
      * A custom description to appear on the user's bank statement. It can be up to 10 characters long, and can only include alphanumeric characters or spaces.
      * See here for important info. Note that each bank handles this information differently, some show less or no information.
      */
    var StatementDescriptor: js.UndefOr[String] = js.native
  }
  object CreateCardDirectPayIn {
    
    @scala.inline
    def apply(
      AuthorId: String,
      CardId: String,
      CreditedWalletId: String,
      DebitedFunds: MoneyData,
      ExecutionType: DIRECT,
      Fees: MoneyData,
      PaymentType: CARD,
      SecureModeReturnURL: String
    ): CreateCardDirectPayIn = {
      val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], CardId = CardId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], ExecutionType = ExecutionType.asInstanceOf[js.Any], Fees = Fees.asInstanceOf[js.Any], PaymentType = PaymentType.asInstanceOf[js.Any], SecureModeReturnURL = SecureModeReturnURL.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateCardDirectPayIn]
    }
    
    @scala.inline
    implicit class CreateCardDirectPayInMutableBuilder[Self <: CreateCardDirectPayIn] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorId(value: String): Self = StObject.set(x, "AuthorId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBilling(value: BillingData): Self = StObject.set(x, "Billing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBillingUndefined: Self = StObject.set(x, "Billing", js.undefined)
      
      @scala.inline
      def setCardId(value: String): Self = StObject.set(x, "CardId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreditedUserId(value: String): Self = StObject.set(x, "CreditedUserId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreditedUserIdUndefined: Self = StObject.set(x, "CreditedUserId", js.undefined)
      
      @scala.inline
      def setCreditedWalletId(value: String): Self = StObject.set(x, "CreditedWalletId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebitedFunds(value: MoneyData): Self = StObject.set(x, "DebitedFunds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecutionType(value: DIRECT): Self = StObject.set(x, "ExecutionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFees(value: MoneyData): Self = StObject.set(x, "Fees", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaymentType(value: CARD): Self = StObject.set(x, "PaymentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureMode(value: SecureMode): Self = StObject.set(x, "SecureMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureModeReturnURL(value: String): Self = StObject.set(x, "SecureModeReturnURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureModeUndefined: Self = StObject.set(x, "SecureMode", js.undefined)
      
      @scala.inline
      def setStatementDescriptor(value: String): Self = StObject.set(x, "StatementDescriptor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatementDescriptorUndefined: Self = StObject.set(x, "StatementDescriptor", js.undefined)
    }
  }
  
  @js.native
  trait CreateCardPreAuthorizedPayIn extends StObject {
    
    /**
      * A user's ID
      */
    var AuthorId: String = js.native
    
    /**
      * The user ID who is credited (defaults to the owner of the wallet)
      */
    var CreditedUserId: js.UndefOr[String] = js.native
    
    /**
      * The ID of the wallet where money will be credited
      */
    var CreditedWalletId: String = js.native
    
    /**
      * Information about the funds that are being debited
      */
    var DebitedFunds: MoneyData = js.native
    
    var ExecutionType: DIRECT = js.native
    
    /**
      * Information about the fees that were taken by the client for this transaction (and were hence transferred to the Client's platform wallet)
      */
    var Fees: MoneyData = js.native
    
    var PaymentType: PREAUTHORIZED = js.native
    
    /**
      * The ID of the Preauthorization object
      */
    var PreauthorizationId: String = js.native
    
    /**
      * Custom data that you can add to this item
      */
    var Tag: js.UndefOr[String] = js.native
  }
  object CreateCardPreAuthorizedPayIn {
    
    @scala.inline
    def apply(
      AuthorId: String,
      CreditedWalletId: String,
      DebitedFunds: MoneyData,
      ExecutionType: DIRECT,
      Fees: MoneyData,
      PaymentType: PREAUTHORIZED,
      PreauthorizationId: String
    ): CreateCardPreAuthorizedPayIn = {
      val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], ExecutionType = ExecutionType.asInstanceOf[js.Any], Fees = Fees.asInstanceOf[js.Any], PaymentType = PaymentType.asInstanceOf[js.Any], PreauthorizationId = PreauthorizationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateCardPreAuthorizedPayIn]
    }
    
    @scala.inline
    implicit class CreateCardPreAuthorizedPayInMutableBuilder[Self <: CreateCardPreAuthorizedPayIn] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorId(value: String): Self = StObject.set(x, "AuthorId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreditedUserId(value: String): Self = StObject.set(x, "CreditedUserId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreditedUserIdUndefined: Self = StObject.set(x, "CreditedUserId", js.undefined)
      
      @scala.inline
      def setCreditedWalletId(value: String): Self = StObject.set(x, "CreditedWalletId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebitedFunds(value: MoneyData): Self = StObject.set(x, "DebitedFunds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecutionType(value: DIRECT): Self = StObject.set(x, "ExecutionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFees(value: MoneyData): Self = StObject.set(x, "Fees", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaymentType(value: PREAUTHORIZED): Self = StObject.set(x, "PaymentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreauthorizationId(value: String): Self = StObject.set(x, "PreauthorizationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
    }
  }
  
  @js.native
  trait CreateCardWebPayIn extends StObject {
    
    /**
      * A user's ID
      */
    var AuthorId: String = js.native
    
    /**
      * The type of card
      */
    var CardType: typings.mangopay2NodejsSdk.mod.card.CardType = js.native
    
    /**
      * The user ID who is credited (defaults to the owner of the wallet)
      */
    var CreditedUserId: js.UndefOr[String] = js.native
    
    /**
      * The ID of the wallet where money will be credited
      */
    var CreditedWalletId: String = js.native
    
    /**
      * The language to use for the payment page - needs to be the ISO code of the language
      */
    var Culture: CountryISO = js.native
    
    /**
      * Information about the funds that are being debited
      */
    var DebitedFunds: MoneyData = js.native
    
    var ExecutionType: WEB = js.native
    
    /**
      * Information about the fees that were taken by the client for this transaction (and were hence transferred to the Client's platform wallet)
      */
    var Fees: MoneyData = js.native
    
    var PaymentType: CARD = js.native
    
    /**
      * The URL to redirect to after payment (whether successful or not)
      */
    var ReturnURL: String = js.native
    
    /**
      * The SecureMode corresponds to '3D secure' for CB Visa and MasterCard. This field lets you activate it manually.
      * The field lets you activate it automatically with "DEFAULT" (Secured Mode will be activated from €50 or when MANGOPAY detects
      * there is a higher risk ), "FORCE" (if you wish to specifically force the secured mode).
      */
    var SecureMode: js.UndefOr[typings.mangopay2NodejsSdk.mod.SecureMode] = js.native
    
    /**
      * A custom description to appear on the user's bank statement. It can be up to 10 characters long, and
      * can only include alphanumeric characters or spaces. See here for important info. Note that each bank handles this information differently, some show less or no information.
      */
    var StatementDescriptor: js.UndefOr[String] = js.native
    
    /**
      * A URL to an SSL page to allow you to customise the payment page. Must be in the format: array("PAYLINE"=>"https://...") and meet all the
      * specifications listed here. Note that only a template for Payline is currently available
      */
    var TemplateURLOptions: js.UndefOr[typings.mangopay2NodejsSdk.mod.payIn.TemplateURLOptions] = js.native
  }
  object CreateCardWebPayIn {
    
    @scala.inline
    def apply(
      AuthorId: String,
      CardType: CardType,
      CreditedWalletId: String,
      Culture: CountryISO,
      DebitedFunds: MoneyData,
      ExecutionType: WEB,
      Fees: MoneyData,
      PaymentType: CARD,
      ReturnURL: String
    ): CreateCardWebPayIn = {
      val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], CardType = CardType.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], Culture = Culture.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], ExecutionType = ExecutionType.asInstanceOf[js.Any], Fees = Fees.asInstanceOf[js.Any], PaymentType = PaymentType.asInstanceOf[js.Any], ReturnURL = ReturnURL.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateCardWebPayIn]
    }
    
    @scala.inline
    implicit class CreateCardWebPayInMutableBuilder[Self <: CreateCardWebPayIn] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorId(value: String): Self = StObject.set(x, "AuthorId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardType(value: CardType): Self = StObject.set(x, "CardType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreditedUserId(value: String): Self = StObject.set(x, "CreditedUserId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreditedUserIdUndefined: Self = StObject.set(x, "CreditedUserId", js.undefined)
      
      @scala.inline
      def setCreditedWalletId(value: String): Self = StObject.set(x, "CreditedWalletId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCulture(value: CountryISO): Self = StObject.set(x, "Culture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebitedFunds(value: MoneyData): Self = StObject.set(x, "DebitedFunds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecutionType(value: WEB): Self = StObject.set(x, "ExecutionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFees(value: MoneyData): Self = StObject.set(x, "Fees", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaymentType(value: CARD): Self = StObject.set(x, "PaymentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnURL(value: String): Self = StObject.set(x, "ReturnURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureMode(value: SecureMode): Self = StObject.set(x, "SecureMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureModeUndefined: Self = StObject.set(x, "SecureMode", js.undefined)
      
      @scala.inline
      def setStatementDescriptor(value: String): Self = StObject.set(x, "StatementDescriptor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatementDescriptorUndefined: Self = StObject.set(x, "StatementDescriptor", js.undefined)
      
      @scala.inline
      def setTemplateURLOptions(value: TemplateURLOptions): Self = StObject.set(x, "TemplateURLOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateURLOptionsUndefined: Self = StObject.set(x, "TemplateURLOptions", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.mangopay2NodejsSdk.mod.payIn.CardDirectPayInData
    - typings.mangopay2NodejsSdk.mod.payIn.CardPreAuthorizedPayInData
    - typings.mangopay2NodejsSdk.mod.payIn.CardWebPayInData
    - typings.mangopay2NodejsSdk.mod.payIn.BankWireDirectPayInData
  */
  trait PayInData extends StObject
  object PayInData {
    
    @scala.inline
    def BankWireDirectPayInData(
      AuthorId: String,
      BankAccount: BankAccountData,
      CreationDate: Double,
      CreditedFunds: MoneyData,
      CreditedUserId: String,
      CreditedWalletId: String,
      DebitedFunds: MoneyData,
      DebitedWalletId: String,
      DeclaredDebitedFunds: MoneyData,
      DeclaredFees: MoneyData,
      ExecutionDate: Timestamp,
      ExecutionType: DIRECT,
      Fees: MoneyData,
      Id: String,
      Nature: TransactionNature,
      PaymentType: BANK_WIRE,
      ResultCode: String,
      ResultMessage: String,
      Status: TransactionStatus,
      Tag: String,
      Type: TransactionType,
      WireReference: String
    ): typings.mangopay2NodejsSdk.mod.payIn.BankWireDirectPayInData = {
      val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], BankAccount = BankAccount.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], CreditedFunds = CreditedFunds.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], DebitedWalletId = DebitedWalletId.asInstanceOf[js.Any], DeclaredDebitedFunds = DeclaredDebitedFunds.asInstanceOf[js.Any], DeclaredFees = DeclaredFees.asInstanceOf[js.Any], ExecutionDate = ExecutionDate.asInstanceOf[js.Any], ExecutionType = ExecutionType.asInstanceOf[js.Any], Fees = Fees.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Nature = Nature.asInstanceOf[js.Any], PaymentType = PaymentType.asInstanceOf[js.Any], ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], WireReference = WireReference.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.mangopay2NodejsSdk.mod.payIn.BankWireDirectPayInData]
    }
    
    @scala.inline
    def CardDirectPayInData(
      AuthorId: String,
      Billing: BillingData,
      CardId: String,
      CreationDate: Double,
      CreditedFunds: MoneyData,
      CreditedUserId: String,
      CreditedWalletId: String,
      DebitedFunds: MoneyData,
      DebitedWalletId: String,
      ExecutionDate: Timestamp,
      ExecutionType: DIRECT,
      Fees: MoneyData,
      Id: String,
      Nature: TransactionNature,
      PaymentType: CARD,
      ResultCode: String,
      ResultMessage: String,
      SecureMode: SecureMode,
      SecureModeNeeded: Boolean,
      SecureModeRedirectURL: String,
      SecureModeReturnURL: String,
      SecurityInfo: SecurityInfoData,
      StatementDescriptor: String,
      Status: TransactionStatus,
      Tag: String,
      Type: TransactionType
    ): typings.mangopay2NodejsSdk.mod.payIn.CardDirectPayInData = {
      val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], Billing = Billing.asInstanceOf[js.Any], CardId = CardId.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], CreditedFunds = CreditedFunds.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], DebitedWalletId = DebitedWalletId.asInstanceOf[js.Any], ExecutionDate = ExecutionDate.asInstanceOf[js.Any], ExecutionType = ExecutionType.asInstanceOf[js.Any], Fees = Fees.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Nature = Nature.asInstanceOf[js.Any], PaymentType = PaymentType.asInstanceOf[js.Any], ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], SecureMode = SecureMode.asInstanceOf[js.Any], SecureModeNeeded = SecureModeNeeded.asInstanceOf[js.Any], SecureModeRedirectURL = SecureModeRedirectURL.asInstanceOf[js.Any], SecureModeReturnURL = SecureModeReturnURL.asInstanceOf[js.Any], SecurityInfo = SecurityInfo.asInstanceOf[js.Any], StatementDescriptor = StatementDescriptor.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.mangopay2NodejsSdk.mod.payIn.CardDirectPayInData]
    }
    
    @scala.inline
    def CardPreAuthorizedPayInData(
      AuthorId: String,
      CreationDate: Double,
      CreditedFunds: MoneyData,
      CreditedUserId: String,
      CreditedWalletId: String,
      DebitedFunds: MoneyData,
      DebitedWalletId: String,
      ExecutionDate: Timestamp,
      ExecutionType: DIRECT,
      Fees: MoneyData,
      Id: String,
      Nature: TransactionNature,
      PaymentType: PREAUTHORIZED,
      PreauthorizationId: String,
      ResultCode: String,
      ResultMessage: String,
      Status: TransactionStatus,
      Tag: String,
      Type: TransactionType
    ): typings.mangopay2NodejsSdk.mod.payIn.CardPreAuthorizedPayInData = {
      val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], CreditedFunds = CreditedFunds.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], DebitedWalletId = DebitedWalletId.asInstanceOf[js.Any], ExecutionDate = ExecutionDate.asInstanceOf[js.Any], ExecutionType = ExecutionType.asInstanceOf[js.Any], Fees = Fees.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Nature = Nature.asInstanceOf[js.Any], PaymentType = PaymentType.asInstanceOf[js.Any], PreauthorizationId = PreauthorizationId.asInstanceOf[js.Any], ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.mangopay2NodejsSdk.mod.payIn.CardPreAuthorizedPayInData]
    }
    
    @scala.inline
    def CardWebPayInData(
      AuthorId: String,
      CardType: CardType,
      CreationDate: Double,
      CreditedFunds: MoneyData,
      CreditedUserId: String,
      CreditedWalletId: String,
      Culture: CountryISO,
      DebitedFunds: MoneyData,
      DebitedWalletId: String,
      ExecutionDate: Timestamp,
      ExecutionType: WEB,
      Fees: MoneyData,
      Id: String,
      Nature: TransactionNature,
      PaymentType: CARD,
      RedirectURL: String,
      ResultCode: String,
      ResultMessage: String,
      ReturnURL: String,
      SecureMode: SecureMode,
      StatementDescriptor: String,
      Status: TransactionStatus,
      Tag: String,
      TemplateURL: String,
      Type: TransactionType
    ): typings.mangopay2NodejsSdk.mod.payIn.CardWebPayInData = {
      val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], CardType = CardType.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], CreditedFunds = CreditedFunds.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], Culture = Culture.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], DebitedWalletId = DebitedWalletId.asInstanceOf[js.Any], ExecutionDate = ExecutionDate.asInstanceOf[js.Any], ExecutionType = ExecutionType.asInstanceOf[js.Any], Fees = Fees.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Nature = Nature.asInstanceOf[js.Any], PaymentType = PaymentType.asInstanceOf[js.Any], RedirectURL = RedirectURL.asInstanceOf[js.Any], ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], ReturnURL = ReturnURL.asInstanceOf[js.Any], SecureMode = SecureMode.asInstanceOf[js.Any], StatementDescriptor = StatementDescriptor.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], TemplateURL = TemplateURL.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.mangopay2NodejsSdk.mod.payIn.CardWebPayInData]
    }
  }
  
  /* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.ValueOf<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.IPayInExecutionType> | 'EXTERNAL_INSTRUCTION' */
  /* Rewritten from type alias, can be one of: 
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DIRECT
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WEB
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EXTERNAL_INSTRUCTION
  */
  trait PayInExecutionType extends StObject
  object PayInExecutionType {
    
    @scala.inline
    def DIRECT: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DIRECT = "DIRECT".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DIRECT]
    
    @scala.inline
    def EXTERNAL_INSTRUCTION: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EXTERNAL_INSTRUCTION = "EXTERNAL_INSTRUCTION".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EXTERNAL_INSTRUCTION]
    
    @scala.inline
    def WEB: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WEB = "WEB".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WEB]
  }
  
  /* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.ValueOf<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.IPayInPaymentType> */
  /* Rewritten from type alias, can be one of: 
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BANK_WIRE
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYPAL
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CARD
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZED
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DIRECT_DEBIT
  */
  trait PayInPaymentType extends StObject
  object PayInPaymentType {
    
    @scala.inline
    def BANK_WIRE: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BANK_WIRE = "BANK_WIRE".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BANK_WIRE]
    
    @scala.inline
    def CARD: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CARD = "CARD".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CARD]
    
    @scala.inline
    def DIRECT_DEBIT: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DIRECT_DEBIT = "DIRECT_DEBIT".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DIRECT_DEBIT]
    
    @scala.inline
    def PAYPAL: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYPAL = "PAYPAL".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYPAL]
    
    @scala.inline
    def PREAUTHORIZED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZED = "PREAUTHORIZED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZED]
  }
  
  @js.native
  trait TemplateURLOptions extends StObject {
    
    var Payline: String = js.native
  }
  object TemplateURLOptions {
    
    @scala.inline
    def apply(Payline: String): TemplateURLOptions = {
      val __obj = js.Dynamic.literal(Payline = Payline.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplateURLOptions]
    }
    
    @scala.inline
    implicit class TemplateURLOptionsMutableBuilder[Self <: TemplateURLOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPayline(value: String): Self = StObject.set(x, "Payline", value.asInstanceOf[js.Any])
    }
  }
}
