package typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn

import typings.mangopay2NodejsSdk.typingsModelsBillingMod.billing.BillingData
import typings.mangopay2NodejsSdk.typingsModelsCardMod.card.CardType
import typings.mangopay2NodejsSdk.typingsModelsMoneyMod.money.MoneyData
import typings.mangopay2NodejsSdk.typingsModelsSecurityInfoMod.securityInfo.SecurityInfoData
import typings.mangopay2NodejsSdk.typingsModelsTransactionMod.transaction.TransactionNature
import typings.mangopay2NodejsSdk.typingsModelsTransactionMod.transaction.TransactionStatus
import typings.mangopay2NodejsSdk.typingsModelsTransactionMod.transaction.TransactionType
import typings.mangopay2NodejsSdk.typingsTypesMod.CountryISO
import typings.mangopay2NodejsSdk.typingsTypesMod.SecureMode
import typings.mangopay2NodejsSdk.typingsTypesMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn.CardDirectPayInData
  - typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn.CardPreAuthorizedPayInData
  - typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn.CardWebPayInData
  - typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn.BankWireDirectPayInData
  - typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn.PayconiqWebPayInData
  - typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn.DirectDebitDirectPayInData
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
  ): typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn.BankWireDirectPayInData = {
    val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], BankAccount = BankAccount.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], CreditedFunds = CreditedFunds.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], DebitedWalletId = DebitedWalletId.asInstanceOf[js.Any], DeclaredDebitedFunds = DeclaredDebitedFunds.asInstanceOf[js.Any], DeclaredFees = DeclaredFees.asInstanceOf[js.Any], ExecutionDate = ExecutionDate.asInstanceOf[js.Any], ExecutionType = "DIRECT", Fees = Fees.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Nature = Nature.asInstanceOf[js.Any], PaymentType = "BANK_WIRE", ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], WireReference = WireReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn.BankWireDirectPayInData]
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
  ): typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn.CardDirectPayInData = {
    val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], Billing = Billing.asInstanceOf[js.Any], CardId = CardId.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], CreditedFunds = CreditedFunds.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], DebitedWalletId = DebitedWalletId.asInstanceOf[js.Any], ExecutionDate = ExecutionDate.asInstanceOf[js.Any], ExecutionType = "DIRECT", Fees = Fees.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Nature = Nature.asInstanceOf[js.Any], PaymentType = "CARD", ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], SecureMode = SecureMode.asInstanceOf[js.Any], SecureModeNeeded = SecureModeNeeded.asInstanceOf[js.Any], SecureModeRedirectURL = SecureModeRedirectURL.asInstanceOf[js.Any], SecureModeReturnURL = SecureModeReturnURL.asInstanceOf[js.Any], SecurityInfo = SecurityInfo.asInstanceOf[js.Any], StatementDescriptor = StatementDescriptor.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn.CardDirectPayInData]
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
  ): typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn.CardPreAuthorizedPayInData = {
    val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], CreditedFunds = CreditedFunds.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], DebitedWalletId = DebitedWalletId.asInstanceOf[js.Any], ExecutionDate = ExecutionDate.asInstanceOf[js.Any], ExecutionType = "DIRECT", Fees = Fees.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Nature = Nature.asInstanceOf[js.Any], PaymentType = "PREAUTHORIZED", PreauthorizationId = PreauthorizationId.asInstanceOf[js.Any], ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn.CardPreAuthorizedPayInData]
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
  ): typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn.CardWebPayInData = {
    val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], CardType = CardType.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], CreditedFunds = CreditedFunds.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], Culture = Culture.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], DebitedWalletId = DebitedWalletId.asInstanceOf[js.Any], ExecutionDate = ExecutionDate.asInstanceOf[js.Any], ExecutionType = "WEB", Fees = Fees.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Nature = Nature.asInstanceOf[js.Any], PaymentType = "CARD", RedirectURL = RedirectURL.asInstanceOf[js.Any], ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], ReturnURL = ReturnURL.asInstanceOf[js.Any], SecureMode = SecureMode.asInstanceOf[js.Any], StatementDescriptor = StatementDescriptor.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], TemplateURL = TemplateURL.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn.CardWebPayInData]
  }
  
  inline def DirectDebitDirectPayInData(
    AuthorId: String,
    ChargeDate: Timestamp,
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
    MandateId: String,
    Nature: TransactionNature,
    PaymentType: PayInPaymentType,
    ResultCode: String,
    ResultMessage: String,
    StatementDescriptor: String,
    Status: TransactionStatus,
    Tag: String,
    Type: TransactionType
  ): typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn.DirectDebitDirectPayInData = {
    val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], ChargeDate = ChargeDate.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], CreditedFunds = CreditedFunds.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], DebitedWalletId = DebitedWalletId.asInstanceOf[js.Any], ExecutionDate = ExecutionDate.asInstanceOf[js.Any], ExecutionType = ExecutionType.asInstanceOf[js.Any], Fees = Fees.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], MandateId = MandateId.asInstanceOf[js.Any], Nature = Nature.asInstanceOf[js.Any], PaymentType = PaymentType.asInstanceOf[js.Any], ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], StatementDescriptor = StatementDescriptor.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn.DirectDebitDirectPayInData]
  }
  
  inline def PayconiqWebPayInData(
    AuthorId: String,
    CreationDate: Double,
    CreditedFunds: MoneyData,
    CreditedUserId: String,
    CreditedWalletId: String,
    DebitedFunds: MoneyData,
    DebitedWalletId: String,
    DeepLinkURL: String,
    ExecutionDate: Timestamp,
    ExpirationDate: Timestamp,
    Fees: MoneyData,
    Id: String,
    Nature: TransactionNature,
    RedirectURL: String,
    ResultCode: String,
    ResultMessage: String,
    ReturnURL: String,
    Status: TransactionStatus,
    Tag: String,
    Type: TransactionType
  ): typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn.PayconiqWebPayInData = {
    val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], CreditedFunds = CreditedFunds.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], DebitedWalletId = DebitedWalletId.asInstanceOf[js.Any], DeepLinkURL = DeepLinkURL.asInstanceOf[js.Any], ExecutionDate = ExecutionDate.asInstanceOf[js.Any], ExecutionType = "WEB", ExpirationDate = ExpirationDate.asInstanceOf[js.Any], Fees = Fees.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Nature = Nature.asInstanceOf[js.Any], PaymentType = "PAYCONIQ", RedirectURL = RedirectURL.asInstanceOf[js.Any], ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], ReturnURL = ReturnURL.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn.PayconiqWebPayInData]
  }
}
