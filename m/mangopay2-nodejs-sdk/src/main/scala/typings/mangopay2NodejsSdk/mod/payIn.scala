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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object payIn {
  
  trait BankAccountData extends StObject {
    
    /**
      * The BIC of the bank account
      */
    var BIC: String
    
    /**
      * The IBAN of the bank account
      */
    var IBAN: String
    
    /**
      * The address of the owner of the bank account
      */
    var OwnerAddress: String
    
    /**
      * The name of the owner of the bank account
      */
    var OwnerName: String
    
    /**
      * The type of bank account
      */
    var Type: ValueOf[IBankAccountType]
  }
  object BankAccountData {
    
    inline def apply(
      BIC: String,
      IBAN: String,
      OwnerAddress: String,
      OwnerName: String,
      Type: ValueOf[IBankAccountType]
    ): BankAccountData = {
      val __obj = js.Dynamic.literal(BIC = BIC.asInstanceOf[js.Any], IBAN = IBAN.asInstanceOf[js.Any], OwnerAddress = OwnerAddress.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[BankAccountData]
    }
    
    extension [Self <: BankAccountData](x: Self) {
      
      inline def setBIC(value: String): Self = StObject.set(x, "BIC", value.asInstanceOf[js.Any])
      
      inline def setIBAN(value: String): Self = StObject.set(x, "IBAN", value.asInstanceOf[js.Any])
      
      inline def setOwnerAddress(value: String): Self = StObject.set(x, "OwnerAddress", value.asInstanceOf[js.Any])
      
      inline def setOwnerName(value: String): Self = StObject.set(x, "OwnerName", value.asInstanceOf[js.Any])
      
      inline def setType(value: ValueOf[IBankAccountType]): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    }
  }
  
  trait BankWireDirectPayInData
    extends StObject
       with BasePayInData
       with PayInData {
    
    /**
      * Bank account details
      */
    var BankAccount: BankAccountData
    
    /**
      * The declared debited funds
      */
    var DeclaredDebitedFunds: MoneyData
    
    /**
      * The declared fees
      */
    var DeclaredFees: MoneyData
    
    @JSName("ExecutionType")
    var ExecutionType_BankWireDirectPayInData: DIRECT
    
    @JSName("PaymentType")
    var PaymentType_BankWireDirectPayInData: BANK_WIRE
    
    /**
      * Wire reference
      */
    var WireReference: String
  }
  object BankWireDirectPayInData {
    
    inline def apply(
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
      Fees: MoneyData,
      Id: String,
      Nature: TransactionNature,
      ResultCode: String,
      ResultMessage: String,
      Status: TransactionStatus,
      Tag: String,
      Type: TransactionType,
      WireReference: String
    ): BankWireDirectPayInData = {
      val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], BankAccount = BankAccount.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], CreditedFunds = CreditedFunds.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], DebitedWalletId = DebitedWalletId.asInstanceOf[js.Any], DeclaredDebitedFunds = DeclaredDebitedFunds.asInstanceOf[js.Any], DeclaredFees = DeclaredFees.asInstanceOf[js.Any], ExecutionDate = ExecutionDate.asInstanceOf[js.Any], ExecutionType = "DIRECT", Fees = Fees.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Nature = Nature.asInstanceOf[js.Any], PaymentType = "BANK_WIRE", ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], WireReference = WireReference.asInstanceOf[js.Any])
      __obj.asInstanceOf[BankWireDirectPayInData]
    }
    
    extension [Self <: BankWireDirectPayInData](x: Self) {
      
      inline def setBankAccount(value: BankAccountData): Self = StObject.set(x, "BankAccount", value.asInstanceOf[js.Any])
      
      inline def setDeclaredDebitedFunds(value: MoneyData): Self = StObject.set(x, "DeclaredDebitedFunds", value.asInstanceOf[js.Any])
      
      inline def setDeclaredFees(value: MoneyData): Self = StObject.set(x, "DeclaredFees", value.asInstanceOf[js.Any])
      
      inline def setExecutionType(value: DIRECT): Self = StObject.set(x, "ExecutionType", value.asInstanceOf[js.Any])
      
      inline def setPaymentType(value: BANK_WIRE): Self = StObject.set(x, "PaymentType", value.asInstanceOf[js.Any])
      
      inline def setWireReference(value: String): Self = StObject.set(x, "WireReference", value.asInstanceOf[js.Any])
    }
  }
  
  trait BasePayInData
    extends StObject
       with EntityBaseData {
    
    /**
      * A user's ID
      */
    var AuthorId: String
    
    /**
      * Details about the funds that are being credited (DebitedFunds – Fees = CreditedFunds)
      */
    var CreditedFunds: MoneyData
    
    /**
      * The user ID who is credited (defaults to the owner of the wallet)
      */
    var CreditedUserId: String
    
    /**
      * The ID of the wallet where money will be credited
      */
    var CreditedWalletId: String
    
    /**
      * Information about the funds that are being debited
      */
    var DebitedFunds: MoneyData
    
    /**
      * The ID of the wallet that was debited
      */
    var DebitedWalletId: String
    
    /**
      * When the transaction happened
      */
    var ExecutionDate: Timestamp
    
    /**
      * The type of execution for the payin
      */
    var ExecutionType: PayInExecutionType
    
    /**
      * Information about the fees that were taken by the client for this transaction (and were hence transferred to the Client's platform wallet)
      */
    var Fees: MoneyData
    
    /**
      * The nature of the transaction
      */
    var Nature: TransactionNature
    
    /**
      * The type of payin
      */
    var PaymentType: PayInPaymentType
    
    /**
      * The result code
      */
    var ResultCode: String
    
    /**
      * A verbal explanation of the ResultCode
      */
    var ResultMessage: String
    
    /**
      * The status of the transaction
      */
    var Status: TransactionStatus
    
    /**
      * The type of the transaction
      */
    var Type: TransactionType
  }
  object BasePayInData {
    
    inline def apply(
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
    
    extension [Self <: BasePayInData](x: Self) {
      
      inline def setAuthorId(value: String): Self = StObject.set(x, "AuthorId", value.asInstanceOf[js.Any])
      
      inline def setCreditedFunds(value: MoneyData): Self = StObject.set(x, "CreditedFunds", value.asInstanceOf[js.Any])
      
      inline def setCreditedUserId(value: String): Self = StObject.set(x, "CreditedUserId", value.asInstanceOf[js.Any])
      
      inline def setCreditedWalletId(value: String): Self = StObject.set(x, "CreditedWalletId", value.asInstanceOf[js.Any])
      
      inline def setDebitedFunds(value: MoneyData): Self = StObject.set(x, "DebitedFunds", value.asInstanceOf[js.Any])
      
      inline def setDebitedWalletId(value: String): Self = StObject.set(x, "DebitedWalletId", value.asInstanceOf[js.Any])
      
      inline def setExecutionDate(value: Timestamp): Self = StObject.set(x, "ExecutionDate", value.asInstanceOf[js.Any])
      
      inline def setExecutionType(value: PayInExecutionType): Self = StObject.set(x, "ExecutionType", value.asInstanceOf[js.Any])
      
      inline def setFees(value: MoneyData): Self = StObject.set(x, "Fees", value.asInstanceOf[js.Any])
      
      inline def setNature(value: TransactionNature): Self = StObject.set(x, "Nature", value.asInstanceOf[js.Any])
      
      inline def setPaymentType(value: PayInPaymentType): Self = StObject.set(x, "PaymentType", value.asInstanceOf[js.Any])
      
      inline def setResultCode(value: String): Self = StObject.set(x, "ResultCode", value.asInstanceOf[js.Any])
      
      inline def setResultMessage(value: String): Self = StObject.set(x, "ResultMessage", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: TransactionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
      
      inline def setType(value: TransactionType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    }
  }
  
  trait CardDirectPayInData
    extends StObject
       with BasePayInData
       with PayInData {
    
    /**
      * Contains useful information related to the user billing
      */
    var Billing: BillingData
    
    /**
      * The ID of a card
      */
    var CardId: String
    
    @JSName("ExecutionType")
    var ExecutionType_CardDirectPayInData: DIRECT
    
    @JSName("PaymentType")
    var PaymentType_CardDirectPayInData: CARD
    
    /**
      * The SecureMode corresponds to '3D secure' for CB Visa and MasterCard. This field lets you activate it manually. The field lets you activate it
      * automatically with "DEFAULT" (Secured Mode will be activated from €50 or when MANGOPAY detects there is a higher risk ), "FORCE" (if you wish to specifically force the secured mode).
      */
    var SecureMode: typings.mangopay2NodejsSdk.mod.SecureMode
    
    /**
      * The value is 'true' if the SecureMode was used
      */
    var SecureModeNeeded: Boolean
    
    /**
      * This is the URL where to redirect users to proceed to 3D secure validation
      */
    var SecureModeRedirectURL: String
    
    /**
      * This is the URL where users are automatically redirected after 3D secure validation (if activated)
      */
    var SecureModeReturnURL: String
    
    /**
      * Contains information related to security and fraud
      */
    var SecurityInfo: SecurityInfoData
    
    /**
      * A custom description to appear on the user's bank statement. It can be up to 10 characters long, and can only include alphanumeric
      * characters or spaces. See here for important info. Note that each bank handles this information differently, some show less or no information.
      */
    var StatementDescriptor: String
  }
  object CardDirectPayInData {
    
    inline def apply(
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
      Fees: MoneyData,
      Id: String,
      Nature: TransactionNature,
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
      val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], Billing = Billing.asInstanceOf[js.Any], CardId = CardId.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], CreditedFunds = CreditedFunds.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], DebitedWalletId = DebitedWalletId.asInstanceOf[js.Any], ExecutionDate = ExecutionDate.asInstanceOf[js.Any], ExecutionType = "DIRECT", Fees = Fees.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Nature = Nature.asInstanceOf[js.Any], PaymentType = "CARD", ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], SecureMode = SecureMode.asInstanceOf[js.Any], SecureModeNeeded = SecureModeNeeded.asInstanceOf[js.Any], SecureModeRedirectURL = SecureModeRedirectURL.asInstanceOf[js.Any], SecureModeReturnURL = SecureModeReturnURL.asInstanceOf[js.Any], SecurityInfo = SecurityInfo.asInstanceOf[js.Any], StatementDescriptor = StatementDescriptor.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardDirectPayInData]
    }
    
    extension [Self <: CardDirectPayInData](x: Self) {
      
      inline def setBilling(value: BillingData): Self = StObject.set(x, "Billing", value.asInstanceOf[js.Any])
      
      inline def setCardId(value: String): Self = StObject.set(x, "CardId", value.asInstanceOf[js.Any])
      
      inline def setExecutionType(value: DIRECT): Self = StObject.set(x, "ExecutionType", value.asInstanceOf[js.Any])
      
      inline def setPaymentType(value: CARD): Self = StObject.set(x, "PaymentType", value.asInstanceOf[js.Any])
      
      inline def setSecureMode(value: SecureMode): Self = StObject.set(x, "SecureMode", value.asInstanceOf[js.Any])
      
      inline def setSecureModeNeeded(value: Boolean): Self = StObject.set(x, "SecureModeNeeded", value.asInstanceOf[js.Any])
      
      inline def setSecureModeRedirectURL(value: String): Self = StObject.set(x, "SecureModeRedirectURL", value.asInstanceOf[js.Any])
      
      inline def setSecureModeReturnURL(value: String): Self = StObject.set(x, "SecureModeReturnURL", value.asInstanceOf[js.Any])
      
      inline def setSecurityInfo(value: SecurityInfoData): Self = StObject.set(x, "SecurityInfo", value.asInstanceOf[js.Any])
      
      inline def setStatementDescriptor(value: String): Self = StObject.set(x, "StatementDescriptor", value.asInstanceOf[js.Any])
    }
  }
  
  trait CardPreAuthorizedPayInData
    extends StObject
       with BasePayInData
       with PayInData {
    
    @JSName("ExecutionType")
    var ExecutionType_CardPreAuthorizedPayInData: DIRECT
    
    @JSName("PaymentType")
    var PaymentType_CardPreAuthorizedPayInData: PREAUTHORIZED
    
    var PreauthorizationId: String
  }
  object CardPreAuthorizedPayInData {
    
    inline def apply(
      AuthorId: String,
      CreationDate: Double,
      CreditedFunds: MoneyData,
      CreditedUserId: String,
      CreditedWalletId: String,
      DebitedFunds: MoneyData,
      DebitedWalletId: String,
      ExecutionDate: Timestamp,
      Fees: MoneyData,
      Id: String,
      Nature: TransactionNature,
      PreauthorizationId: String,
      ResultCode: String,
      ResultMessage: String,
      Status: TransactionStatus,
      Tag: String,
      Type: TransactionType
    ): CardPreAuthorizedPayInData = {
      val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], CreditedFunds = CreditedFunds.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], DebitedWalletId = DebitedWalletId.asInstanceOf[js.Any], ExecutionDate = ExecutionDate.asInstanceOf[js.Any], ExecutionType = "DIRECT", Fees = Fees.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Nature = Nature.asInstanceOf[js.Any], PaymentType = "PREAUTHORIZED", PreauthorizationId = PreauthorizationId.asInstanceOf[js.Any], ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardPreAuthorizedPayInData]
    }
    
    extension [Self <: CardPreAuthorizedPayInData](x: Self) {
      
      inline def setExecutionType(value: DIRECT): Self = StObject.set(x, "ExecutionType", value.asInstanceOf[js.Any])
      
      inline def setPaymentType(value: PREAUTHORIZED): Self = StObject.set(x, "PaymentType", value.asInstanceOf[js.Any])
      
      inline def setPreauthorizationId(value: String): Self = StObject.set(x, "PreauthorizationId", value.asInstanceOf[js.Any])
    }
  }
  
  trait CardWebPayInData
    extends StObject
       with BasePayInData
       with PayInData {
    
    /**
      * The type of card
      */
    var CardType: typings.mangopay2NodejsSdk.mod.card.CardType
    
    /**
      * The language to use for the payment page - needs to be the ISO code of the language
      */
    var Culture: CountryISO
    
    @JSName("ExecutionType")
    var ExecutionType_CardWebPayInData: WEB
    
    @JSName("PaymentType")
    var PaymentType_CardWebPayInData: CARD
    
    /**
      * The URL to redirect to user to for them to proceed with the payment
      */
    var RedirectURL: String
    
    /**
      * The URL to redirect to after payment (whether successful or not)
      */
    var ReturnURL: String
    
    /**
      * The SecureMode corresponds to '3D secure' for CB Visa and MasterCard. This field lets you activate it manually. The field lets you activate it
      * automatically with "DEFAULT" (Secured Mode will be activated from €50 or when MANGOPAY detects there is a higher risk ), "FORCE" (if you wish to specifically force the secured mode).
      */
    var SecureMode: typings.mangopay2NodejsSdk.mod.SecureMode
    
    /**
      * A custom description to appear on the user's bank statement. It can be up to 10 characters long, and can only include alphanumeric characters or spaces.
      * See here for important info. Note that each bank handles this information differently, some show less or no information.
      */
    var StatementDescriptor: String
    
    /**
      * The URL to use for the payment page template
      */
    var TemplateURL: String
  }
  object CardWebPayInData {
    
    inline def apply(
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
      Fees: MoneyData,
      Id: String,
      Nature: TransactionNature,
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
      val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], CardType = CardType.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], CreditedFunds = CreditedFunds.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], Culture = Culture.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], DebitedWalletId = DebitedWalletId.asInstanceOf[js.Any], ExecutionDate = ExecutionDate.asInstanceOf[js.Any], ExecutionType = "WEB", Fees = Fees.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Nature = Nature.asInstanceOf[js.Any], PaymentType = "CARD", RedirectURL = RedirectURL.asInstanceOf[js.Any], ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], ReturnURL = ReturnURL.asInstanceOf[js.Any], SecureMode = SecureMode.asInstanceOf[js.Any], StatementDescriptor = StatementDescriptor.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], TemplateURL = TemplateURL.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardWebPayInData]
    }
    
    extension [Self <: CardWebPayInData](x: Self) {
      
      inline def setCardType(value: CardType): Self = StObject.set(x, "CardType", value.asInstanceOf[js.Any])
      
      inline def setCulture(value: CountryISO): Self = StObject.set(x, "Culture", value.asInstanceOf[js.Any])
      
      inline def setExecutionType(value: WEB): Self = StObject.set(x, "ExecutionType", value.asInstanceOf[js.Any])
      
      inline def setPaymentType(value: CARD): Self = StObject.set(x, "PaymentType", value.asInstanceOf[js.Any])
      
      inline def setRedirectURL(value: String): Self = StObject.set(x, "RedirectURL", value.asInstanceOf[js.Any])
      
      inline def setReturnURL(value: String): Self = StObject.set(x, "ReturnURL", value.asInstanceOf[js.Any])
      
      inline def setSecureMode(value: SecureMode): Self = StObject.set(x, "SecureMode", value.asInstanceOf[js.Any])
      
      inline def setStatementDescriptor(value: String): Self = StObject.set(x, "StatementDescriptor", value.asInstanceOf[js.Any])
      
      inline def setTemplateURL(value: String): Self = StObject.set(x, "TemplateURL", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.PickPartialRequired<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.payIn.BankWireDirectPayInData, 'Tag', 'AuthorId' | 'CreditedUserId' | 'CreditedWalletId' | 'DeclaredDebitedFunds' | 'DeclaredFees'> */
  trait CreateBankWireDirectPayIn extends StObject {
    
    var AuthorId: String
    
    var CreditedUserId: String
    
    var CreditedWalletId: String
    
    var DeclaredDebitedFunds: MoneyData
    
    var DeclaredFees: MoneyData
    
    var ExecutionType: DIRECT
    
    var PaymentType: BANK_WIRE
    
    var Tag: js.UndefOr[String] = js.undefined
  }
  object CreateBankWireDirectPayIn {
    
    inline def apply(
      AuthorId: String,
      CreditedUserId: String,
      CreditedWalletId: String,
      DeclaredDebitedFunds: MoneyData,
      DeclaredFees: MoneyData
    ): CreateBankWireDirectPayIn = {
      val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DeclaredDebitedFunds = DeclaredDebitedFunds.asInstanceOf[js.Any], DeclaredFees = DeclaredFees.asInstanceOf[js.Any], ExecutionType = "DIRECT", PaymentType = "BANK_WIRE")
      __obj.asInstanceOf[CreateBankWireDirectPayIn]
    }
    
    extension [Self <: CreateBankWireDirectPayIn](x: Self) {
      
      inline def setAuthorId(value: String): Self = StObject.set(x, "AuthorId", value.asInstanceOf[js.Any])
      
      inline def setCreditedUserId(value: String): Self = StObject.set(x, "CreditedUserId", value.asInstanceOf[js.Any])
      
      inline def setCreditedWalletId(value: String): Self = StObject.set(x, "CreditedWalletId", value.asInstanceOf[js.Any])
      
      inline def setDeclaredDebitedFunds(value: MoneyData): Self = StObject.set(x, "DeclaredDebitedFunds", value.asInstanceOf[js.Any])
      
      inline def setDeclaredFees(value: MoneyData): Self = StObject.set(x, "DeclaredFees", value.asInstanceOf[js.Any])
      
      inline def setExecutionType(value: DIRECT): Self = StObject.set(x, "ExecutionType", value.asInstanceOf[js.Any])
      
      inline def setPaymentType(value: BANK_WIRE): Self = StObject.set(x, "PaymentType", value.asInstanceOf[js.Any])
      
      inline def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
    }
  }
  
  trait CreateCardDirectPayIn extends StObject {
    
    /**
      * A user's ID
      */
    var AuthorId: String
    
    /**
      * Contains useful information related to the user billing
      */
    var Billing: js.UndefOr[BillingData] = js.undefined
    
    /**
      * The ID of a card
      */
    var CardId: String
    
    /**
      * The user ID who is credited (defaults to the owner of the wallet)
      */
    var CreditedUserId: js.UndefOr[String] = js.undefined
    
    /**
      * The ID of the wallet where money will be credited
      */
    var CreditedWalletId: String
    
    /**
      * Information about the funds that are being debited
      */
    var DebitedFunds: MoneyData
    
    var ExecutionType: DIRECT
    
    /**
      * Information about the fees that were taken by the client for this transaction (and were hence transferred to the Client's platform wallet)
      */
    var Fees: MoneyData
    
    var PaymentType: CARD
    
    /**
      * The SecureMode corresponds to '3D secure' for CB Visa and MasterCard. This field lets you activate it manually. The field lets you activate it automatically
      *  with "DEFAULT" (Secured Mode will be activated from €50 or when MANGOPAY detects there is a higher risk ), "FORCE" (if you wish to specifically force the secured mode).
      */
    var SecureMode: js.UndefOr[typings.mangopay2NodejsSdk.mod.SecureMode] = js.undefined
    
    /**
      * This is the URL where users are automatically redirected after 3D secure validation (if activated)
      */
    var SecureModeReturnURL: String
    
    /**
      * A custom description to appear on the user's bank statement. It can be up to 10 characters long, and can only include alphanumeric characters or spaces.
      * See here for important info. Note that each bank handles this information differently, some show less or no information.
      */
    var StatementDescriptor: js.UndefOr[String] = js.undefined
  }
  object CreateCardDirectPayIn {
    
    inline def apply(
      AuthorId: String,
      CardId: String,
      CreditedWalletId: String,
      DebitedFunds: MoneyData,
      Fees: MoneyData,
      SecureModeReturnURL: String
    ): CreateCardDirectPayIn = {
      val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], CardId = CardId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], ExecutionType = "DIRECT", Fees = Fees.asInstanceOf[js.Any], PaymentType = "CARD", SecureModeReturnURL = SecureModeReturnURL.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateCardDirectPayIn]
    }
    
    extension [Self <: CreateCardDirectPayIn](x: Self) {
      
      inline def setAuthorId(value: String): Self = StObject.set(x, "AuthorId", value.asInstanceOf[js.Any])
      
      inline def setBilling(value: BillingData): Self = StObject.set(x, "Billing", value.asInstanceOf[js.Any])
      
      inline def setBillingUndefined: Self = StObject.set(x, "Billing", js.undefined)
      
      inline def setCardId(value: String): Self = StObject.set(x, "CardId", value.asInstanceOf[js.Any])
      
      inline def setCreditedUserId(value: String): Self = StObject.set(x, "CreditedUserId", value.asInstanceOf[js.Any])
      
      inline def setCreditedUserIdUndefined: Self = StObject.set(x, "CreditedUserId", js.undefined)
      
      inline def setCreditedWalletId(value: String): Self = StObject.set(x, "CreditedWalletId", value.asInstanceOf[js.Any])
      
      inline def setDebitedFunds(value: MoneyData): Self = StObject.set(x, "DebitedFunds", value.asInstanceOf[js.Any])
      
      inline def setExecutionType(value: DIRECT): Self = StObject.set(x, "ExecutionType", value.asInstanceOf[js.Any])
      
      inline def setFees(value: MoneyData): Self = StObject.set(x, "Fees", value.asInstanceOf[js.Any])
      
      inline def setPaymentType(value: CARD): Self = StObject.set(x, "PaymentType", value.asInstanceOf[js.Any])
      
      inline def setSecureMode(value: SecureMode): Self = StObject.set(x, "SecureMode", value.asInstanceOf[js.Any])
      
      inline def setSecureModeReturnURL(value: String): Self = StObject.set(x, "SecureModeReturnURL", value.asInstanceOf[js.Any])
      
      inline def setSecureModeUndefined: Self = StObject.set(x, "SecureMode", js.undefined)
      
      inline def setStatementDescriptor(value: String): Self = StObject.set(x, "StatementDescriptor", value.asInstanceOf[js.Any])
      
      inline def setStatementDescriptorUndefined: Self = StObject.set(x, "StatementDescriptor", js.undefined)
    }
  }
  
  trait CreateCardPreAuthorizedPayIn extends StObject {
    
    /**
      * A user's ID
      */
    var AuthorId: String
    
    /**
      * The user ID who is credited (defaults to the owner of the wallet)
      */
    var CreditedUserId: js.UndefOr[String] = js.undefined
    
    /**
      * The ID of the wallet where money will be credited
      */
    var CreditedWalletId: String
    
    /**
      * Information about the funds that are being debited
      */
    var DebitedFunds: MoneyData
    
    var ExecutionType: DIRECT
    
    /**
      * Information about the fees that were taken by the client for this transaction (and were hence transferred to the Client's platform wallet)
      */
    var Fees: MoneyData
    
    var PaymentType: PREAUTHORIZED
    
    /**
      * The ID of the Preauthorization object
      */
    var PreauthorizationId: String
    
    /**
      * Custom data that you can add to this item
      */
    var Tag: js.UndefOr[String] = js.undefined
  }
  object CreateCardPreAuthorizedPayIn {
    
    inline def apply(
      AuthorId: String,
      CreditedWalletId: String,
      DebitedFunds: MoneyData,
      Fees: MoneyData,
      PreauthorizationId: String
    ): CreateCardPreAuthorizedPayIn = {
      val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], ExecutionType = "DIRECT", Fees = Fees.asInstanceOf[js.Any], PaymentType = "PREAUTHORIZED", PreauthorizationId = PreauthorizationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateCardPreAuthorizedPayIn]
    }
    
    extension [Self <: CreateCardPreAuthorizedPayIn](x: Self) {
      
      inline def setAuthorId(value: String): Self = StObject.set(x, "AuthorId", value.asInstanceOf[js.Any])
      
      inline def setCreditedUserId(value: String): Self = StObject.set(x, "CreditedUserId", value.asInstanceOf[js.Any])
      
      inline def setCreditedUserIdUndefined: Self = StObject.set(x, "CreditedUserId", js.undefined)
      
      inline def setCreditedWalletId(value: String): Self = StObject.set(x, "CreditedWalletId", value.asInstanceOf[js.Any])
      
      inline def setDebitedFunds(value: MoneyData): Self = StObject.set(x, "DebitedFunds", value.asInstanceOf[js.Any])
      
      inline def setExecutionType(value: DIRECT): Self = StObject.set(x, "ExecutionType", value.asInstanceOf[js.Any])
      
      inline def setFees(value: MoneyData): Self = StObject.set(x, "Fees", value.asInstanceOf[js.Any])
      
      inline def setPaymentType(value: PREAUTHORIZED): Self = StObject.set(x, "PaymentType", value.asInstanceOf[js.Any])
      
      inline def setPreauthorizationId(value: String): Self = StObject.set(x, "PreauthorizationId", value.asInstanceOf[js.Any])
      
      inline def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
    }
  }
  
  trait CreateCardWebPayIn extends StObject {
    
    /**
      * A user's ID
      */
    var AuthorId: String
    
    /**
      * The type of card
      */
    var CardType: typings.mangopay2NodejsSdk.mod.card.CardType
    
    /**
      * The user ID who is credited (defaults to the owner of the wallet)
      */
    var CreditedUserId: js.UndefOr[String] = js.undefined
    
    /**
      * The ID of the wallet where money will be credited
      */
    var CreditedWalletId: String
    
    /**
      * The language to use for the payment page - needs to be the ISO code of the language
      */
    var Culture: CountryISO
    
    /**
      * Information about the funds that are being debited
      */
    var DebitedFunds: MoneyData
    
    var ExecutionType: WEB
    
    /**
      * Information about the fees that were taken by the client for this transaction (and were hence transferred to the Client's platform wallet)
      */
    var Fees: MoneyData
    
    var PaymentType: CARD
    
    /**
      * The URL to redirect to after payment (whether successful or not)
      */
    var ReturnURL: String
    
    /**
      * The SecureMode corresponds to '3D secure' for CB Visa and MasterCard. This field lets you activate it manually.
      * The field lets you activate it automatically with "DEFAULT" (Secured Mode will be activated from €50 or when MANGOPAY detects
      * there is a higher risk ), "FORCE" (if you wish to specifically force the secured mode).
      */
    var SecureMode: js.UndefOr[typings.mangopay2NodejsSdk.mod.SecureMode] = js.undefined
    
    /**
      * A custom description to appear on the user's bank statement. It can be up to 10 characters long, and
      * can only include alphanumeric characters or spaces. See here for important info. Note that each bank handles this information differently, some show less or no information.
      */
    var StatementDescriptor: js.UndefOr[String] = js.undefined
    
    /**
      * A URL to an SSL page to allow you to customise the payment page. Must be in the format: array("PAYLINE"=>"https://...") and meet all the
      * specifications listed here. Note that only a template for Payline is currently available
      */
    var TemplateURLOptions: js.UndefOr[typings.mangopay2NodejsSdk.mod.payIn.TemplateURLOptions] = js.undefined
  }
  object CreateCardWebPayIn {
    
    inline def apply(
      AuthorId: String,
      CardType: CardType,
      CreditedWalletId: String,
      Culture: CountryISO,
      DebitedFunds: MoneyData,
      Fees: MoneyData,
      ReturnURL: String
    ): CreateCardWebPayIn = {
      val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], CardType = CardType.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], Culture = Culture.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], ExecutionType = "WEB", Fees = Fees.asInstanceOf[js.Any], PaymentType = "CARD", ReturnURL = ReturnURL.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateCardWebPayIn]
    }
    
    extension [Self <: CreateCardWebPayIn](x: Self) {
      
      inline def setAuthorId(value: String): Self = StObject.set(x, "AuthorId", value.asInstanceOf[js.Any])
      
      inline def setCardType(value: CardType): Self = StObject.set(x, "CardType", value.asInstanceOf[js.Any])
      
      inline def setCreditedUserId(value: String): Self = StObject.set(x, "CreditedUserId", value.asInstanceOf[js.Any])
      
      inline def setCreditedUserIdUndefined: Self = StObject.set(x, "CreditedUserId", js.undefined)
      
      inline def setCreditedWalletId(value: String): Self = StObject.set(x, "CreditedWalletId", value.asInstanceOf[js.Any])
      
      inline def setCulture(value: CountryISO): Self = StObject.set(x, "Culture", value.asInstanceOf[js.Any])
      
      inline def setDebitedFunds(value: MoneyData): Self = StObject.set(x, "DebitedFunds", value.asInstanceOf[js.Any])
      
      inline def setExecutionType(value: WEB): Self = StObject.set(x, "ExecutionType", value.asInstanceOf[js.Any])
      
      inline def setFees(value: MoneyData): Self = StObject.set(x, "Fees", value.asInstanceOf[js.Any])
      
      inline def setPaymentType(value: CARD): Self = StObject.set(x, "PaymentType", value.asInstanceOf[js.Any])
      
      inline def setReturnURL(value: String): Self = StObject.set(x, "ReturnURL", value.asInstanceOf[js.Any])
      
      inline def setSecureMode(value: SecureMode): Self = StObject.set(x, "SecureMode", value.asInstanceOf[js.Any])
      
      inline def setSecureModeUndefined: Self = StObject.set(x, "SecureMode", js.undefined)
      
      inline def setStatementDescriptor(value: String): Self = StObject.set(x, "StatementDescriptor", value.asInstanceOf[js.Any])
      
      inline def setStatementDescriptorUndefined: Self = StObject.set(x, "StatementDescriptor", js.undefined)
      
      inline def setTemplateURLOptions(value: TemplateURLOptions): Self = StObject.set(x, "TemplateURLOptions", value.asInstanceOf[js.Any])
      
      inline def setTemplateURLOptionsUndefined: Self = StObject.set(x, "TemplateURLOptions", js.undefined)
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
    
    inline def BankWireDirectPayInData(
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
      Fees: MoneyData,
      Id: String,
      Nature: TransactionNature,
      ResultCode: String,
      ResultMessage: String,
      Status: TransactionStatus,
      Tag: String,
      Type: TransactionType,
      WireReference: String
    ): typings.mangopay2NodejsSdk.mod.payIn.BankWireDirectPayInData = {
      val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], BankAccount = BankAccount.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], CreditedFunds = CreditedFunds.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], DebitedWalletId = DebitedWalletId.asInstanceOf[js.Any], DeclaredDebitedFunds = DeclaredDebitedFunds.asInstanceOf[js.Any], DeclaredFees = DeclaredFees.asInstanceOf[js.Any], ExecutionDate = ExecutionDate.asInstanceOf[js.Any], ExecutionType = "DIRECT", Fees = Fees.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Nature = Nature.asInstanceOf[js.Any], PaymentType = "BANK_WIRE", ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], WireReference = WireReference.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.mangopay2NodejsSdk.mod.payIn.BankWireDirectPayInData]
    }
    
    inline def CardDirectPayInData(
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
      Fees: MoneyData,
      Id: String,
      Nature: TransactionNature,
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
      val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], Billing = Billing.asInstanceOf[js.Any], CardId = CardId.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], CreditedFunds = CreditedFunds.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], DebitedWalletId = DebitedWalletId.asInstanceOf[js.Any], ExecutionDate = ExecutionDate.asInstanceOf[js.Any], ExecutionType = "DIRECT", Fees = Fees.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Nature = Nature.asInstanceOf[js.Any], PaymentType = "CARD", ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], SecureMode = SecureMode.asInstanceOf[js.Any], SecureModeNeeded = SecureModeNeeded.asInstanceOf[js.Any], SecureModeRedirectURL = SecureModeRedirectURL.asInstanceOf[js.Any], SecureModeReturnURL = SecureModeReturnURL.asInstanceOf[js.Any], SecurityInfo = SecurityInfo.asInstanceOf[js.Any], StatementDescriptor = StatementDescriptor.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.mangopay2NodejsSdk.mod.payIn.CardDirectPayInData]
    }
    
    inline def CardPreAuthorizedPayInData(
      AuthorId: String,
      CreationDate: Double,
      CreditedFunds: MoneyData,
      CreditedUserId: String,
      CreditedWalletId: String,
      DebitedFunds: MoneyData,
      DebitedWalletId: String,
      ExecutionDate: Timestamp,
      Fees: MoneyData,
      Id: String,
      Nature: TransactionNature,
      PreauthorizationId: String,
      ResultCode: String,
      ResultMessage: String,
      Status: TransactionStatus,
      Tag: String,
      Type: TransactionType
    ): typings.mangopay2NodejsSdk.mod.payIn.CardPreAuthorizedPayInData = {
      val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], CreditedFunds = CreditedFunds.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], DebitedWalletId = DebitedWalletId.asInstanceOf[js.Any], ExecutionDate = ExecutionDate.asInstanceOf[js.Any], ExecutionType = "DIRECT", Fees = Fees.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Nature = Nature.asInstanceOf[js.Any], PaymentType = "PREAUTHORIZED", PreauthorizationId = PreauthorizationId.asInstanceOf[js.Any], ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.mangopay2NodejsSdk.mod.payIn.CardPreAuthorizedPayInData]
    }
    
    inline def CardWebPayInData(
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
      Fees: MoneyData,
      Id: String,
      Nature: TransactionNature,
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
      val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], CardType = CardType.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], CreditedFunds = CreditedFunds.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], Culture = Culture.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], DebitedWalletId = DebitedWalletId.asInstanceOf[js.Any], ExecutionDate = ExecutionDate.asInstanceOf[js.Any], ExecutionType = "WEB", Fees = Fees.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Nature = Nature.asInstanceOf[js.Any], PaymentType = "CARD", RedirectURL = RedirectURL.asInstanceOf[js.Any], ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], ReturnURL = ReturnURL.asInstanceOf[js.Any], SecureMode = SecureMode.asInstanceOf[js.Any], StatementDescriptor = StatementDescriptor.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], TemplateURL = TemplateURL.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
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
    
    inline def DIRECT: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DIRECT = "DIRECT".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DIRECT]
    
    inline def EXTERNAL_INSTRUCTION: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EXTERNAL_INSTRUCTION = "EXTERNAL_INSTRUCTION".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EXTERNAL_INSTRUCTION]
    
    inline def WEB: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WEB = "WEB".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WEB]
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
    
    inline def BANK_WIRE: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BANK_WIRE = "BANK_WIRE".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BANK_WIRE]
    
    inline def CARD: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CARD = "CARD".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CARD]
    
    inline def DIRECT_DEBIT: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DIRECT_DEBIT = "DIRECT_DEBIT".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DIRECT_DEBIT]
    
    inline def PAYPAL: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYPAL = "PAYPAL".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYPAL]
    
    inline def PREAUTHORIZED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZED = "PREAUTHORIZED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZED]
  }
  
  trait TemplateURLOptions extends StObject {
    
    var Payline: String
  }
  object TemplateURLOptions {
    
    inline def apply(Payline: String): TemplateURLOptions = {
      val __obj = js.Dynamic.literal(Payline = Payline.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplateURLOptions]
    }
    
    extension [Self <: TemplateURLOptions](x: Self) {
      
      inline def setPayline(value: String): Self = StObject.set(x, "Payline", value.asInstanceOf[js.Any])
    }
  }
}
