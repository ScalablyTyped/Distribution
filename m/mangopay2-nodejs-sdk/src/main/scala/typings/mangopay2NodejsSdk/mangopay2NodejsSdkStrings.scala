package typings.mangopay2NodejsSdk

import typings.mangopay2NodejsSdk.mod.AVSResult
import typings.mangopay2NodejsSdk.mod.ColumnAndDirection
import typings.mangopay2NodejsSdk.mod.PaymentStatus
import typings.mangopay2NodejsSdk.mod.PreAuthorizationStatus
import typings.mangopay2NodejsSdk.mod.SecureMode
import typings.mangopay2NodejsSdk.mod.bankAccount.BankAccountType
import typings.mangopay2NodejsSdk.mod.bankAccount.DepositAccountType
import typings.mangopay2NodejsSdk.mod.card.CardStatus
import typings.mangopay2NodejsSdk.mod.card.CardValidity
import typings.mangopay2NodejsSdk.mod.client.BusinessType
import typings.mangopay2NodejsSdk.mod.client.PlatformType
import typings.mangopay2NodejsSdk.mod.client.Sector
import typings.mangopay2NodejsSdk.mod.dispute.DisputeReasonType
import typings.mangopay2NodejsSdk.mod.dispute.DisputeStatus
import typings.mangopay2NodejsSdk.mod.dispute.DisputeType
import typings.mangopay2NodejsSdk.mod.disputeDocument.DisputeDocumentType
import typings.mangopay2NodejsSdk.mod.disputeDocument.DocumentStatus
import typings.mangopay2NodejsSdk.mod.disputeDocument.RefusedReasonType
import typings.mangopay2NodejsSdk.mod.event.EventType
import typings.mangopay2NodejsSdk.mod.hook.HookStatus
import typings.mangopay2NodejsSdk.mod.hook.HookValidity
import typings.mangopay2NodejsSdk.mod.kycDocument.KYCDocumentRefusedReasonType
import typings.mangopay2NodejsSdk.mod.kycDocument.KycDocumentType
import typings.mangopay2NodejsSdk.mod.mandate.MandateCultureCode
import typings.mangopay2NodejsSdk.mod.mandate.MandateScheme
import typings.mangopay2NodejsSdk.mod.mandate.MandateStatus
import typings.mangopay2NodejsSdk.mod.payIn.PayInExecutionType
import typings.mangopay2NodejsSdk.mod.payIn.PayInPaymentType
import typings.mangopay2NodejsSdk.mod.refund.RefundReasonType
import typings.mangopay2NodejsSdk.mod.report.Column
import typings.mangopay2NodejsSdk.mod.transaction.TransactionNature
import typings.mangopay2NodejsSdk.mod.transaction.TransactionStatus
import typings.mangopay2NodejsSdk.mod.transaction.TransactionType
import typings.mangopay2NodejsSdk.mod.user.RequiredUserLegalData
import typings.mangopay2NodejsSdk.mod.user.RequiredUserNaturalData
import typings.mangopay2NodejsSdk.mod.user.StaticKeys
import typings.mangopay2NodejsSdk.mod.wallet.ClientFundsType
import typings.mangopay2NodejsSdk.mod.wallet.FundsType
import typings.mangopay2NodejsSdk.typesMod.ApiMethod
import typings.mangopay2NodejsSdk.typesMod.CountryISO
import typings.mangopay2NodejsSdk.typesMod.CurrencyISO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mangopay2NodejsSdkStrings {
  
  @js.native
  sealed trait ACTIVE
    extends StObject
       with MandateStatus
  inline def ACTIVE: ACTIVE = "ACTIVE".asInstanceOf[ACTIVE]
  
  @js.native
  sealed trait AD
    extends StObject
       with CountryISO
  inline def AD: AD = "AD".asInstanceOf[AD]
  
  @js.native
  sealed trait ADDRESS_MATCH_ONLY
    extends StObject
       with AVSResult
  inline def ADDRESS_MATCH_ONLY: ADDRESS_MATCH_ONLY = "ADDRESS_MATCH_ONLY".asInstanceOf[ADDRESS_MATCH_ONLY]
  
  @js.native
  sealed trait ADDRESS_PROOF
    extends StObject
       with KycDocumentType
  inline def ADDRESS_PROOF: ADDRESS_PROOF = "ADDRESS_PROOF".asInstanceOf[ADDRESS_PROOF]
  
  @js.native
  sealed trait AE
    extends StObject
       with CountryISO
  inline def AE: AE = "AE".asInstanceOf[AE]
  
  @js.native
  sealed trait AED
    extends StObject
       with CurrencyISO
  inline def AED: AED = "AED".asInstanceOf[AED]
  
  @js.native
  sealed trait AF
    extends StObject
       with CountryISO
  inline def AF: AF = "AF".asInstanceOf[AF]
  
  @js.native
  sealed trait AFN
    extends StObject
       with CurrencyISO
  inline def AFN: AFN = "AFN".asInstanceOf[AFN]
  
  @js.native
  sealed trait AG
    extends StObject
       with CountryISO
  inline def AG: AG = "AG".asInstanceOf[AG]
  
  @js.native
  sealed trait AI
    extends StObject
       with CountryISO
  inline def AI: AI = "AI".asInstanceOf[AI]
  
  @js.native
  sealed trait AL
    extends StObject
       with CountryISO
  inline def AL: AL = "AL".asInstanceOf[AL]
  
  @js.native
  sealed trait ALL
    extends StObject
       with CurrencyISO
  inline def ALL: ALL = "ALL".asInstanceOf[ALL]
  
  @js.native
  sealed trait AM
    extends StObject
       with CountryISO
  inline def AM: AM = "AM".asInstanceOf[AM]
  
  @js.native
  sealed trait AMD
    extends StObject
       with CurrencyISO
  inline def AMD: AMD = "AMD".asInstanceOf[AMD]
  
  @js.native
  sealed trait ANG
    extends StObject
       with CurrencyISO
  inline def ANG: ANG = "ANG".asInstanceOf[ANG]
  
  @js.native
  sealed trait AO
    extends StObject
       with CountryISO
  inline def AO: AO = "AO".asInstanceOf[AO]
  
  @js.native
  sealed trait AOA
    extends StObject
       with CurrencyISO
  inline def AOA: AOA = "AOA".asInstanceOf[AOA]
  
  @js.native
  sealed trait AQ
    extends StObject
       with CountryISO
  inline def AQ: AQ = "AQ".asInstanceOf[AQ]
  
  @js.native
  sealed trait AR
    extends StObject
       with CountryISO
  inline def AR: AR = "AR".asInstanceOf[AR]
  
  @js.native
  sealed trait ARS
    extends StObject
       with CurrencyISO
  inline def ARS: ARS = "ARS".asInstanceOf[ARS]
  
  @js.native
  sealed trait ARTICLES_OF_ASSOCIATION
    extends StObject
       with KycDocumentType
  inline def ARTICLES_OF_ASSOCIATION: ARTICLES_OF_ASSOCIATION = "ARTICLES_OF_ASSOCIATION".asInstanceOf[ARTICLES_OF_ASSOCIATION]
  
  @js.native
  sealed trait ART_MUSIC_ENTERTAINMENT
    extends StObject
       with Sector
  inline def ART_MUSIC_ENTERTAINMENT: ART_MUSIC_ENTERTAINMENT = "ART_MUSIC_ENTERTAINMENT".asInstanceOf[ART_MUSIC_ENTERTAINMENT]
  
  @js.native
  sealed trait AS
    extends StObject
       with CountryISO
  inline def AS: AS = "AS".asInstanceOf[AS]
  
  @js.native
  sealed trait ASC
    extends StObject
       with ColumnAndDirection
  inline def ASC: ASC = "ASC".asInstanceOf[ASC]
  
  @js.native
  sealed trait AT
    extends StObject
       with CountryISO
  inline def AT: AT = "AT".asInstanceOf[AT]
  
  @js.native
  sealed trait AU
    extends StObject
       with CountryISO
  inline def AU: AU = "AU".asInstanceOf[AU]
  
  @js.native
  sealed trait AUD
    extends StObject
       with CurrencyISO
  inline def AUD: AUD = "AUD".asInstanceOf[AUD]
  
  @js.native
  sealed trait AUTHORISATION_DISPUTED
    extends StObject
       with DisputeReasonType
  inline def AUTHORISATION_DISPUTED: AUTHORISATION_DISPUTED = "AUTHORISATION_DISPUTED".asInstanceOf[AUTHORISATION_DISPUTED]
  
  @js.native
  sealed trait AW
    extends StObject
       with CountryISO
  inline def AW: AW = "AW".asInstanceOf[AW]
  
  @js.native
  sealed trait AWG
    extends StObject
       with CurrencyISO
  inline def AWG: AWG = "AWG".asInstanceOf[AWG]
  
  @js.native
  sealed trait AX
    extends StObject
       with CountryISO
  inline def AX: AX = "AX".asInstanceOf[AX]
  
  @js.native
  sealed trait AZ
    extends StObject
       with CountryISO
  inline def AZ: AZ = "AZ".asInstanceOf[AZ]
  
  @js.native
  sealed trait AZN
    extends StObject
       with CurrencyISO
  inline def AZN: AZN = "AZN".asInstanceOf[AZN]
  
  @js.native
  sealed trait Alias
    extends StObject
       with Column
  inline def Alias: Alias = "Alias".asInstanceOf[Alias]
  
  @js.native
  sealed trait AuthorId
    extends StObject
       with Column
  inline def AuthorId: AuthorId = "AuthorId".asInstanceOf[AuthorId]
  
  @js.native
  sealed trait BA
    extends StObject
       with CountryISO
  inline def BA: BA = "BA".asInstanceOf[BA]
  
  @js.native
  sealed trait BACS
    extends StObject
       with MandateScheme
  inline def BACS: BACS = "BACS".asInstanceOf[BACS]
  
  @js.native
  sealed trait BAM
    extends StObject
       with CurrencyISO
  inline def BAM: BAM = "BAM".asInstanceOf[BAM]
  
  @js.native
  sealed trait BANKACCOUNT_HAS_BEEN_CLOSED
    extends StObject
       with RefundReasonType
  inline def BANKACCOUNT_HAS_BEEN_CLOSED: BANKACCOUNT_HAS_BEEN_CLOSED = "BANKACCOUNT_HAS_BEEN_CLOSED".asInstanceOf[BANKACCOUNT_HAS_BEEN_CLOSED]
  
  @js.native
  sealed trait BANKACCOUNT_INCORRECT
    extends StObject
       with RefundReasonType
  inline def BANKACCOUNT_INCORRECT: BANKACCOUNT_INCORRECT = "BANKACCOUNT_INCORRECT".asInstanceOf[BANKACCOUNT_INCORRECT]
  
  @js.native
  sealed trait BANK_WIRE
    extends StObject
       with PayInPaymentType
  inline def BANK_WIRE: BANK_WIRE = "BANK_WIRE".asInstanceOf[BANK_WIRE]
  
  @js.native
  sealed trait BB
    extends StObject
       with CountryISO
  inline def BB: BB = "BB".asInstanceOf[BB]
  
  @js.native
  sealed trait BBD
    extends StObject
       with CurrencyISO
  inline def BBD: BBD = "BBD".asInstanceOf[BBD]
  
  @js.native
  sealed trait BCMC
    extends StObject
       with typings.mangopay2NodejsSdk.mod.card.CardType
  inline def BCMC: BCMC = "BCMC".asInstanceOf[BCMC]
  
  @js.native
  sealed trait BD
    extends StObject
       with CountryISO
  inline def BD: BD = "BD".asInstanceOf[BD]
  
  @js.native
  sealed trait BDT
    extends StObject
       with CurrencyISO
  inline def BDT: BDT = "BDT".asInstanceOf[BDT]
  
  @js.native
  sealed trait BE
    extends StObject
       with CountryISO
  inline def BE: BE = "BE".asInstanceOf[BE]
  
  @js.native
  sealed trait BEAUTY_COSMETICS_HEALTH
    extends StObject
       with Sector
  inline def BEAUTY_COSMETICS_HEALTH: BEAUTY_COSMETICS_HEALTH = "BEAUTY_COSMETICS_HEALTH".asInstanceOf[BEAUTY_COSMETICS_HEALTH]
  
  @js.native
  sealed trait BF
    extends StObject
       with CountryISO
  inline def BF: BF = "BF".asInstanceOf[BF]
  
  @js.native
  sealed trait BG
    extends StObject
       with CountryISO
  inline def BG: BG = "BG".asInstanceOf[BG]
  
  @js.native
  sealed trait BGN
    extends StObject
       with CurrencyISO
  inline def BGN: BGN = "BGN".asInstanceOf[BGN]
  
  @js.native
  sealed trait BH
    extends StObject
       with CountryISO
  inline def BH: BH = "BH".asInstanceOf[BH]
  
  @js.native
  sealed trait BHD
    extends StObject
       with CurrencyISO
  inline def BHD: BHD = "BHD".asInstanceOf[BHD]
  
  @js.native
  sealed trait BI
    extends StObject
       with CountryISO
  inline def BI: BI = "BI".asInstanceOf[BI]
  
  @js.native
  sealed trait BIF
    extends StObject
       with CurrencyISO
  inline def BIF: BIF = "BIF".asInstanceOf[BIF]
  
  @js.native
  sealed trait BJ
    extends StObject
       with CountryISO
  inline def BJ: BJ = "BJ".asInstanceOf[BJ]
  
  @js.native
  sealed trait BL
    extends StObject
       with CountryISO
  inline def BL: BL = "BL".asInstanceOf[BL]
  
  @js.native
  sealed trait BM
    extends StObject
       with CountryISO
  inline def BM: BM = "BM".asInstanceOf[BM]
  
  @js.native
  sealed trait BMD
    extends StObject
       with CurrencyISO
  inline def BMD: BMD = "BMD".asInstanceOf[BMD]
  
  @js.native
  sealed trait BN
    extends StObject
       with CountryISO
  inline def BN: BN = "BN".asInstanceOf[BN]
  
  @js.native
  sealed trait BND
    extends StObject
       with CurrencyISO
  inline def BND: BND = "BND".asInstanceOf[BND]
  
  @js.native
  sealed trait BO
    extends StObject
       with CountryISO
  inline def BO: BO = "BO".asInstanceOf[BO]
  
  @js.native
  sealed trait BOB
    extends StObject
       with CurrencyISO
  inline def BOB: BOB = "BOB".asInstanceOf[BOB]
  
  @js.native
  sealed trait BQ
    extends StObject
       with CountryISO
  inline def BQ: BQ = "BQ".asInstanceOf[BQ]
  
  @js.native
  sealed trait BR
    extends StObject
       with CountryISO
  inline def BR: BR = "BR".asInstanceOf[BR]
  
  @js.native
  sealed trait BRL
    extends StObject
       with CurrencyISO
  inline def BRL: BRL = "BRL".asInstanceOf[BRL]
  
  @js.native
  sealed trait BS
    extends StObject
       with CountryISO
  inline def BS: BS = "BS".asInstanceOf[BS]
  
  @js.native
  sealed trait BSD
    extends StObject
       with CurrencyISO
  inline def BSD: BSD = "BSD".asInstanceOf[BSD]
  
  @js.native
  sealed trait BT
    extends StObject
       with CountryISO
  inline def BT: BT = "BT".asInstanceOf[BT]
  
  @js.native
  sealed trait BTN
    extends StObject
       with CurrencyISO
  inline def BTN: BTN = "BTN".asInstanceOf[BTN]
  
  @js.native
  sealed trait BUSINESS
    extends StObject
       with typings.mangopay2NodejsSdk.mod.user.LegalPersonType
  inline def BUSINESS: BUSINESS = "BUSINESS".asInstanceOf[BUSINESS]
  
  @js.native
  sealed trait BV
    extends StObject
       with CountryISO
  inline def BV: BV = "BV".asInstanceOf[BV]
  
  @js.native
  sealed trait BW
    extends StObject
       with CountryISO
  inline def BW: BW = "BW".asInstanceOf[BW]
  
  @js.native
  sealed trait BWP
    extends StObject
       with CurrencyISO
  inline def BWP: BWP = "BWP".asInstanceOf[BWP]
  
  @js.native
  sealed trait BY
    extends StObject
       with CountryISO
  inline def BY: BY = "BY".asInstanceOf[BY]
  
  @js.native
  sealed trait BYN
    extends StObject
       with CurrencyISO
  inline def BYN: BYN = "BYN".asInstanceOf[BYN]
  
  @js.native
  sealed trait BZ
    extends StObject
       with CountryISO
  inline def BZ: BZ = "BZ".asInstanceOf[BZ]
  
  @js.native
  sealed trait BZD
    extends StObject
       with CurrencyISO
  inline def BZD: BZD = "BZD".asInstanceOf[BZD]
  
  @js.native
  sealed trait BankAccountId
    extends StObject
       with Column
  inline def BankAccountId: BankAccountId = "BankAccountId".asInstanceOf[BankAccountId]
  
  @js.native
  sealed trait BankWireRef
    extends StObject
       with Column
  inline def BankWireRef: BankWireRef = "BankWireRef".asInstanceOf[BankWireRef]
  
  @js.native
  sealed trait Birthday
    extends StObject
       with RequiredUserNaturalData
  inline def Birthday: Birthday = "Birthday".asInstanceOf[Birthday]
  
  @js.native
  sealed trait CA
    extends StObject
       with BankAccountType
       with CountryISO
  inline def CA: CA = "CA".asInstanceOf[CA]
  
  @js.native
  sealed trait CAD
    extends StObject
       with CurrencyISO
  inline def CAD: CAD = "CAD".asInstanceOf[CAD]
  
  @js.native
  sealed trait CANCELED
    extends StObject
       with PaymentStatus
  inline def CANCELED: CANCELED = "CANCELED".asInstanceOf[CANCELED]
  
  @js.native
  sealed trait CANCELED_REOCCURING_TRANSACTION
    extends StObject
       with DisputeReasonType
  inline def CANCELED_REOCCURING_TRANSACTION: CANCELED_REOCCURING_TRANSACTION = "CANCELED_REOCCURING_TRANSACTION".asInstanceOf[CANCELED_REOCCURING_TRANSACTION]
  
  @js.native
  sealed trait CARD
    extends StObject
       with PayInPaymentType
  inline def CARD: CARD = "CARD".asInstanceOf[CARD]
  
  @js.native
  sealed trait CB_VISA_MASTERCARD
    extends StObject
       with typings.mangopay2NodejsSdk.mod.card.CardType
  inline def CB_VISA_MASTERCARD: CB_VISA_MASTERCARD = "CB_VISA_MASTERCARD".asInstanceOf[CB_VISA_MASTERCARD]
  
  @js.native
  sealed trait CC
    extends StObject
       with CountryISO
  inline def CC: CC = "CC".asInstanceOf[CC]
  
  @js.native
  sealed trait CD
    extends StObject
       with CountryISO
  inline def CD: CD = "CD".asInstanceOf[CD]
  
  @js.native
  sealed trait CDF
    extends StObject
       with CurrencyISO
  inline def CDF: CDF = "CDF".asInstanceOf[CDF]
  
  @js.native
  sealed trait CF
    extends StObject
       with CountryISO
  inline def CF: CF = "CF".asInstanceOf[CF]
  
  @js.native
  sealed trait CG
    extends StObject
       with CountryISO
  inline def CG: CG = "CG".asInstanceOf[CG]
  
  @js.native
  sealed trait CH
    extends StObject
       with CountryISO
  inline def CH: CH = "CH".asInstanceOf[CH]
  
  @js.native
  sealed trait CHECKING
    extends StObject
       with DepositAccountType
  inline def CHECKING: CHECKING = "CHECKING".asInstanceOf[CHECKING]
  
  @js.native
  sealed trait CHF
    extends StObject
       with CurrencyISO
  inline def CHF: CHF = "CHF".asInstanceOf[CHF]
  
  @js.native
  sealed trait CI
    extends StObject
       with CountryISO
  inline def CI: CI = "CI".asInstanceOf[CI]
  
  @js.native
  sealed trait CK
    extends StObject
       with CountryISO
  inline def CK: CK = "CK".asInstanceOf[CK]
  
  @js.native
  sealed trait CL
    extends StObject
       with CountryISO
  inline def CL: CL = "CL".asInstanceOf[CL]
  
  @js.native
  sealed trait CLOSED
    extends StObject
       with DisputeStatus
  inline def CLOSED: CLOSED = "CLOSED".asInstanceOf[CLOSED]
  
  @js.native
  sealed trait CLP
    extends StObject
       with CurrencyISO
  inline def CLP: CLP = "CLP".asInstanceOf[CLP]
  
  @js.native
  sealed trait CM
    extends StObject
       with CountryISO
  inline def CM: CM = "CM".asInstanceOf[CM]
  
  @js.native
  sealed trait CN
    extends StObject
       with CountryISO
  inline def CN: CN = "CN".asInstanceOf[CN]
  
  @js.native
  sealed trait CNY
    extends StObject
       with CurrencyISO
  inline def CNY: CNY = "CNY".asInstanceOf[CNY]
  
  @js.native
  sealed trait CO
    extends StObject
       with CountryISO
  inline def CO: CO = "CO".asInstanceOf[CO]
  
  @js.native
  sealed trait CONTESTABLE
    extends StObject
       with DisputeType
  inline def CONTESTABLE: CONTESTABLE = "CONTESTABLE".asInstanceOf[CONTESTABLE]
  
  @js.native
  sealed trait COP
    extends StObject
       with CurrencyISO
  inline def COP: COP = "COP".asInstanceOf[COP]
  
  @js.native
  sealed trait CR
    extends StObject
       with CountryISO
  inline def CR: CR = "CR".asInstanceOf[CR]
  
  @js.native
  sealed trait CRC
    extends StObject
       with CurrencyISO
  inline def CRC: CRC = "CRC".asInstanceOf[CRC]
  
  @js.native
  sealed trait CREATED
    extends StObject
       with CardStatus
       with DisputeStatus
       with DocumentStatus
       with typings.mangopay2NodejsSdk.mod.kycDocument.DocumentStatus
       with MandateStatus
       with PreAuthorizationStatus
       with TransactionStatus
  inline def CREATED: CREATED = "CREATED".asInstanceOf[CREATED]
  
  @js.native
  sealed trait CREDIT
    extends StObject
       with ClientFundsType
       with FundsType
  inline def CREDIT: CREDIT = "CREDIT".asInstanceOf[CREDIT]
  
  @js.native
  sealed trait CROWDFUNDING
    extends StObject
       with BusinessType
  inline def CROWDFUNDING: CROWDFUNDING = "CROWDFUNDING".asInstanceOf[CROWDFUNDING]
  
  @js.native
  sealed trait CROWDFUNDING_DONATION
    extends StObject
       with PlatformType
  inline def CROWDFUNDING_DONATION: CROWDFUNDING_DONATION = "CROWDFUNDING_DONATION".asInstanceOf[CROWDFUNDING_DONATION]
  
  @js.native
  sealed trait CROWDFUNDING_EQUITY
    extends StObject
       with PlatformType
  inline def CROWDFUNDING_EQUITY: CROWDFUNDING_EQUITY = "CROWDFUNDING_EQUITY".asInstanceOf[CROWDFUNDING_EQUITY]
  
  @js.native
  sealed trait CROWDFUNDING_LOAN
    extends StObject
       with PlatformType
  inline def CROWDFUNDING_LOAN: CROWDFUNDING_LOAN = "CROWDFUNDING_LOAN".asInstanceOf[CROWDFUNDING_LOAN]
  
  @js.native
  sealed trait CROWDFUNDING_REWARD
    extends StObject
       with PlatformType
  inline def CROWDFUNDING_REWARD: CROWDFUNDING_REWARD = "CROWDFUNDING_REWARD".asInstanceOf[CROWDFUNDING_REWARD]
  
  @js.native
  sealed trait CSV extends StObject
  inline def CSV: CSV = "CSV".asInstanceOf[CSV]
  
  @js.native
  sealed trait CU
    extends StObject
       with CountryISO
  inline def CU: CU = "CU".asInstanceOf[CU]
  
  @js.native
  sealed trait CUC
    extends StObject
       with CurrencyISO
  inline def CUC: CUC = "CUC".asInstanceOf[CUC]
  
  @js.native
  sealed trait CUP
    extends StObject
       with CurrencyISO
  inline def CUP: CUP = "CUP".asInstanceOf[CUP]
  
  @js.native
  sealed trait CV
    extends StObject
       with CountryISO
  inline def CV: CV = "CV".asInstanceOf[CV]
  
  @js.native
  sealed trait CVE
    extends StObject
       with CurrencyISO
  inline def CVE: CVE = "CVE".asInstanceOf[CVE]
  
  @js.native
  sealed trait CW
    extends StObject
       with CountryISO
  inline def CW: CW = "CW".asInstanceOf[CW]
  
  @js.native
  sealed trait CX
    extends StObject
       with CountryISO
  inline def CX: CX = "CX".asInstanceOf[CX]
  
  @js.native
  sealed trait CY
    extends StObject
       with CountryISO
  inline def CY: CY = "CY".asInstanceOf[CY]
  
  @js.native
  sealed trait CZ
    extends StObject
       with CountryISO
  inline def CZ: CZ = "CZ".asInstanceOf[CZ]
  
  @js.native
  sealed trait CZK
    extends StObject
       with CurrencyISO
  inline def CZK: CZK = "CZK".asInstanceOf[CZK]
  
  @js.native
  sealed trait CardId
    extends StObject
       with Column
  inline def CardId: CardId = "CardId".asInstanceOf[CardId]
  
  @js.native
  sealed trait CardType
    extends StObject
       with Column
  inline def CardType: CardType = "CardType".asInstanceOf[CardType]
  
  @js.native
  sealed trait Country
    extends StObject
       with Column
  inline def Country: Country = "Country".asInstanceOf[Country]
  
  @js.native
  sealed trait CountryOfResidence
    extends StObject
       with RequiredUserNaturalData
  inline def CountryOfResidence: CountryOfResidence = "CountryOfResidence".asInstanceOf[CountryOfResidence]
  
  @js.native
  sealed trait CreationDate
    extends StObject
       with Column
       with StaticKeys
  inline def CreationDate: CreationDate = "CreationDate".asInstanceOf[CreationDate]
  
  @js.native
  sealed trait CreditedFundsAmount
    extends StObject
       with Column
  inline def CreditedFundsAmount: CreditedFundsAmount = "CreditedFundsAmount".asInstanceOf[CreditedFundsAmount]
  
  @js.native
  sealed trait CreditedFundsCurrency
    extends StObject
       with Column
  inline def CreditedFundsCurrency: CreditedFundsCurrency = "CreditedFundsCurrency".asInstanceOf[CreditedFundsCurrency]
  
  @js.native
  sealed trait CreditedUserId
    extends StObject
       with Column
  inline def CreditedUserId: CreditedUserId = "CreditedUserId".asInstanceOf[CreditedUserId]
  
  @js.native
  sealed trait CreditedWalletId
    extends StObject
       with Column
  inline def CreditedWalletId: CreditedWalletId = "CreditedWalletId".asInstanceOf[CreditedWalletId]
  
  @js.native
  sealed trait Culture
    extends StObject
       with Column
  inline def Culture: Culture = "Culture".asInstanceOf[Culture]
  
  @js.native
  sealed trait DE
    extends StObject
       with CountryISO
       with MandateCultureCode
  inline def DE: DE = "DE".asInstanceOf[DE]
  
  @js.native
  sealed trait DECLARATIVE extends StObject
  inline def DECLARATIVE: DECLARATIVE = "DECLARATIVE".asInstanceOf[DECLARATIVE]
  
  @js.native
  sealed trait DEFAULT
    extends StObject
       with FundsType
       with SecureMode
  inline def DEFAULT: DEFAULT = "DEFAULT".asInstanceOf[DEFAULT]
  
  @js.native
  sealed trait DELIVERY_PROOF
    extends StObject
       with DisputeDocumentType
  inline def DELIVERY_PROOF: DELIVERY_PROOF = "DELIVERY_PROOF".asInstanceOf[DELIVERY_PROOF]
  
  @js.native
  sealed trait DESC
    extends StObject
       with ColumnAndDirection
  inline def DESC: DESC = "DESC".asInstanceOf[DESC]
  
  @js.native
  sealed trait DINERS
    extends StObject
       with typings.mangopay2NodejsSdk.mod.card.CardType
  inline def DINERS: DINERS = "DINERS".asInstanceOf[DINERS]
  
  @js.native
  sealed trait DIRECT
    extends StObject
       with PayInExecutionType
  inline def DIRECT: DIRECT = "DIRECT".asInstanceOf[DIRECT]
  
  @js.native
  sealed trait DIRECT_DEBIT
    extends StObject
       with PayInPaymentType
  inline def DIRECT_DEBIT: DIRECT_DEBIT = "DIRECT_DEBIT".asInstanceOf[DIRECT_DEBIT]
  
  @js.native
  sealed trait DISABLED
    extends StObject
       with HookStatus
  inline def DISABLED: DISABLED = "DISABLED".asInstanceOf[DISABLED]
  
  @js.native
  sealed trait DISPUTE_ACTION_REQUIRED
    extends StObject
       with EventType
  inline def DISPUTE_ACTION_REQUIRED: DISPUTE_ACTION_REQUIRED = "DISPUTE_ACTION_REQUIRED".asInstanceOf[DISPUTE_ACTION_REQUIRED]
  
  @js.native
  sealed trait DISPUTE_CLOSED
    extends StObject
       with EventType
  inline def DISPUTE_CLOSED: DISPUTE_CLOSED = "DISPUTE_CLOSED".asInstanceOf[DISPUTE_CLOSED]
  
  @js.native
  sealed trait DISPUTE_CREATED
    extends StObject
       with EventType
  inline def DISPUTE_CREATED: DISPUTE_CREATED = "DISPUTE_CREATED".asInstanceOf[DISPUTE_CREATED]
  
  @js.native
  sealed trait DISPUTE_DOCUMENT_CREATED
    extends StObject
       with EventType
  inline def DISPUTE_DOCUMENT_CREATED: DISPUTE_DOCUMENT_CREATED = "DISPUTE_DOCUMENT_CREATED".asInstanceOf[DISPUTE_DOCUMENT_CREATED]
  
  @js.native
  sealed trait DISPUTE_DOCUMENT_FAILED
    extends StObject
       with EventType
  inline def DISPUTE_DOCUMENT_FAILED: DISPUTE_DOCUMENT_FAILED = "DISPUTE_DOCUMENT_FAILED".asInstanceOf[DISPUTE_DOCUMENT_FAILED]
  
  @js.native
  sealed trait DISPUTE_DOCUMENT_SUCCEEDED
    extends StObject
       with EventType
  inline def DISPUTE_DOCUMENT_SUCCEEDED: DISPUTE_DOCUMENT_SUCCEEDED = "DISPUTE_DOCUMENT_SUCCEEDED".asInstanceOf[DISPUTE_DOCUMENT_SUCCEEDED]
  
  @js.native
  sealed trait DISPUTE_DOCUMENT_VALIDATION_ASKED
    extends StObject
       with EventType
  inline def DISPUTE_DOCUMENT_VALIDATION_ASKED: DISPUTE_DOCUMENT_VALIDATION_ASKED = "DISPUTE_DOCUMENT_VALIDATION_ASKED".asInstanceOf[DISPUTE_DOCUMENT_VALIDATION_ASKED]
  
  @js.native
  sealed trait DISPUTE_FURTHER_ACTION_REQUIRED
    extends StObject
       with EventType
  inline def DISPUTE_FURTHER_ACTION_REQUIRED: DISPUTE_FURTHER_ACTION_REQUIRED = "DISPUTE_FURTHER_ACTION_REQUIRED".asInstanceOf[DISPUTE_FURTHER_ACTION_REQUIRED]
  
  @js.native
  sealed trait DISPUTE_SENT_TO_BANK
    extends StObject
       with EventType
  inline def DISPUTE_SENT_TO_BANK: DISPUTE_SENT_TO_BANK = "DISPUTE_SENT_TO_BANK".asInstanceOf[DISPUTE_SENT_TO_BANK]
  
  @js.native
  sealed trait DISPUTE_SUBMITTED
    extends StObject
       with EventType
  inline def DISPUTE_SUBMITTED: DISPUTE_SUBMITTED = "DISPUTE_SUBMITTED".asInstanceOf[DISPUTE_SUBMITTED]
  
  @js.native
  sealed trait DJ
    extends StObject
       with CountryISO
  inline def DJ: DJ = "DJ".asInstanceOf[DJ]
  
  @js.native
  sealed trait DJF
    extends StObject
       with CurrencyISO
  inline def DJF: DJF = "DJF".asInstanceOf[DJF]
  
  @js.native
  sealed trait DK
    extends StObject
       with CountryISO
  inline def DK: DK = "DK".asInstanceOf[DK]
  
  @js.native
  sealed trait DKK
    extends StObject
       with CurrencyISO
  inline def DKK: DKK = "DKK".asInstanceOf[DKK]
  
  @js.native
  sealed trait DM
    extends StObject
       with CountryISO
  inline def DM: DM = "DM".asInstanceOf[DM]
  
  @js.native
  sealed trait DO
    extends StObject
       with CountryISO
  inline def DO: DO = "DO".asInstanceOf[DO]
  
  @js.native
  sealed trait DOCUMENT_DO_NOT_MATCH_ACCOUNT_DATA
    extends StObject
       with KYCDocumentRefusedReasonType
  inline def DOCUMENT_DO_NOT_MATCH_ACCOUNT_DATA: DOCUMENT_DO_NOT_MATCH_ACCOUNT_DATA = "DOCUMENT_DO_NOT_MATCH_ACCOUNT_DATA".asInstanceOf[DOCUMENT_DO_NOT_MATCH_ACCOUNT_DATA]
  
  @js.native
  sealed trait DOCUMENT_DO_NOT_MATCH_USER_DATA
    extends StObject
       with KYCDocumentRefusedReasonType
  inline def DOCUMENT_DO_NOT_MATCH_USER_DATA: DOCUMENT_DO_NOT_MATCH_USER_DATA = "DOCUMENT_DO_NOT_MATCH_USER_DATA".asInstanceOf[DOCUMENT_DO_NOT_MATCH_USER_DATA]
  
  @js.native
  sealed trait DOCUMENT_FALSIFIED
    extends StObject
       with KYCDocumentRefusedReasonType
       with RefusedReasonType
  inline def DOCUMENT_FALSIFIED: DOCUMENT_FALSIFIED = "DOCUMENT_FALSIFIED".asInstanceOf[DOCUMENT_FALSIFIED]
  
  @js.native
  sealed trait DOCUMENT_HAS_EXPIRED
    extends StObject
       with KYCDocumentRefusedReasonType
       with RefusedReasonType
  inline def DOCUMENT_HAS_EXPIRED: DOCUMENT_HAS_EXPIRED = "DOCUMENT_HAS_EXPIRED".asInstanceOf[DOCUMENT_HAS_EXPIRED]
  
  @js.native
  sealed trait DOCUMENT_INCOMPLETE
    extends StObject
       with KYCDocumentRefusedReasonType
       with RefusedReasonType
  inline def DOCUMENT_INCOMPLETE: DOCUMENT_INCOMPLETE = "DOCUMENT_INCOMPLETE".asInstanceOf[DOCUMENT_INCOMPLETE]
  
  @js.native
  sealed trait DOCUMENT_MISSING
    extends StObject
       with KYCDocumentRefusedReasonType
       with RefusedReasonType
  inline def DOCUMENT_MISSING: DOCUMENT_MISSING = "DOCUMENT_MISSING".asInstanceOf[DOCUMENT_MISSING]
  
  @js.native
  sealed trait DOCUMENT_NOT_ACCEPTED
    extends StObject
       with KYCDocumentRefusedReasonType
       with RefusedReasonType
  inline def DOCUMENT_NOT_ACCEPTED: DOCUMENT_NOT_ACCEPTED = "DOCUMENT_NOT_ACCEPTED".asInstanceOf[DOCUMENT_NOT_ACCEPTED]
  
  @js.native
  sealed trait DOCUMENT_UNREADABLE
    extends StObject
       with KYCDocumentRefusedReasonType
       with RefusedReasonType
  inline def DOCUMENT_UNREADABLE: DOCUMENT_UNREADABLE = "DOCUMENT_UNREADABLE".asInstanceOf[DOCUMENT_UNREADABLE]
  
  @js.native
  sealed trait DOP
    extends StObject
       with CurrencyISO
  inline def DOP: DOP = "DOP".asInstanceOf[DOP]
  
  @js.native
  sealed trait DUPLICATE
    extends StObject
       with DisputeReasonType
  inline def DUPLICATE: DUPLICATE = "DUPLICATE".asInstanceOf[DUPLICATE]
  
  @js.native
  sealed trait DZ
    extends StObject
       with CountryISO
  inline def DZ: DZ = "DZ".asInstanceOf[DZ]
  
  @js.native
  sealed trait DZD
    extends StObject
       with CurrencyISO
  inline def DZD: DZD = "DZD".asInstanceOf[DZD]
  
  @js.native
  sealed trait DebitedFundsAmount
    extends StObject
       with Column
  inline def DebitedFundsAmount: DebitedFundsAmount = "DebitedFundsAmount".asInstanceOf[DebitedFundsAmount]
  
  @js.native
  sealed trait DebitedFundsCurrency
    extends StObject
       with Column
  inline def DebitedFundsCurrency: DebitedFundsCurrency = "DebitedFundsCurrency".asInstanceOf[DebitedFundsCurrency]
  
  @js.native
  sealed trait DebitedWalletId
    extends StObject
       with Column
  inline def DebitedWalletId: DebitedWalletId = "DebitedWalletId".asInstanceOf[DebitedWalletId]
  
  @js.native
  sealed trait DeclaredDebitedFundsAmount
    extends StObject
       with Column
  inline def DeclaredDebitedFundsAmount: DeclaredDebitedFundsAmount = "DeclaredDebitedFundsAmount".asInstanceOf[DeclaredDebitedFundsAmount]
  
  @js.native
  sealed trait DeclaredDebitedFundsCurrency
    extends StObject
       with Column
  inline def DeclaredDebitedFundsCurrency: DeclaredDebitedFundsCurrency = "DeclaredDebitedFundsCurrency".asInstanceOf[DeclaredDebitedFundsCurrency]
  
  @js.native
  sealed trait DeclaredFeesAmount
    extends StObject
       with Column
  inline def DeclaredFeesAmount: DeclaredFeesAmount = "DeclaredFeesAmount".asInstanceOf[DeclaredFeesAmount]
  
  @js.native
  sealed trait DeclaredFeesCurrency
    extends StObject
       with Column
  inline def DeclaredFeesCurrency: DeclaredFeesCurrency = "DeclaredFeesCurrency".asInstanceOf[DeclaredFeesCurrency]
  
  @js.native
  sealed trait DeepPartial extends StObject
  inline def DeepPartial: DeepPartial = "DeepPartial".asInstanceOf[DeepPartial]
  
  @js.native
  sealed trait EC
    extends StObject
       with CountryISO
  inline def EC: EC = "EC".asInstanceOf[EC]
  
  @js.native
  sealed trait EE
    extends StObject
       with CountryISO
  inline def EE: EE = "EE".asInstanceOf[EE]
  
  @js.native
  sealed trait EG
    extends StObject
       with CountryISO
  inline def EG: EG = "EG".asInstanceOf[EG]
  
  @js.native
  sealed trait EGP
    extends StObject
       with CurrencyISO
  inline def EGP: EGP = "EGP".asInstanceOf[EGP]
  
  @js.native
  sealed trait EH
    extends StObject
       with CountryISO
  inline def EH: EH = "EH".asInstanceOf[EH]
  
  @js.native
  sealed trait EN
    extends StObject
       with MandateCultureCode
  inline def EN: EN = "EN".asInstanceOf[EN]
  
  @js.native
  sealed trait ENABLED
    extends StObject
       with HookStatus
  inline def ENABLED: ENABLED = "ENABLED".asInstanceOf[ENABLED]
  
  @js.native
  sealed trait ER
    extends StObject
       with CountryISO
  inline def ER: ER = "ER".asInstanceOf[ER]
  
  @js.native
  sealed trait ERN
    extends StObject
       with CurrencyISO
  inline def ERN: ERN = "ERN".asInstanceOf[ERN]
  
  @js.native
  sealed trait ERROR
    extends StObject
       with CardStatus
  inline def ERROR: ERROR = "ERROR".asInstanceOf[ERROR]
  
  @js.native
  sealed trait ES
    extends StObject
       with CountryISO
       with MandateCultureCode
  inline def ES: ES = "ES".asInstanceOf[ES]
  
  @js.native
  sealed trait ET
    extends StObject
       with CountryISO
  inline def ET: ET = "ET".asInstanceOf[ET]
  
  @js.native
  sealed trait ETB
    extends StObject
       with CurrencyISO
  inline def ETB: ETB = "ETB".asInstanceOf[ETB]
  
  @js.native
  sealed trait EUR
    extends StObject
       with CurrencyISO
  inline def EUR: EUR = "EUR".asInstanceOf[EUR]
  
  @js.native
  sealed trait EXPIRED
    extends StObject
       with PaymentStatus
  inline def EXPIRED: EXPIRED = "EXPIRED".asInstanceOf[EXPIRED]
  
  @js.native
  sealed trait EXTERNAL_INSTRUCTION
    extends StObject
       with PayInExecutionType
  inline def EXTERNAL_INSTRUCTION: EXTERNAL_INSTRUCTION = "EXTERNAL_INSTRUCTION".asInstanceOf[EXTERNAL_INSTRUCTION]
  
  @js.native
  sealed trait Email
    extends StObject
       with RequiredUserLegalData
       with RequiredUserNaturalData
  inline def Email: Email = "Email".asInstanceOf[Email]
  
  @js.native
  sealed trait ExecutionDate
    extends StObject
       with Column
  inline def ExecutionDate: ExecutionDate = "ExecutionDate".asInstanceOf[ExecutionDate]
  
  @js.native
  sealed trait ExecutionType
    extends StObject
       with Column
  inline def ExecutionType: ExecutionType = "ExecutionType".asInstanceOf[ExecutionType]
  
  @js.native
  sealed trait ExpirationDate
    extends StObject
       with Column
  inline def ExpirationDate: ExpirationDate = "ExpirationDate".asInstanceOf[ExpirationDate]
  
  @js.native
  sealed trait FAILED
    extends StObject
       with MandateStatus
       with PreAuthorizationStatus
       with TransactionStatus
  inline def FAILED: FAILED = "FAILED".asInstanceOf[FAILED]
  
  @js.native
  sealed trait FEES
    extends StObject
       with ClientFundsType
       with FundsType
  inline def FEES: FEES = "FEES".asInstanceOf[FEES]
  
  @js.native
  sealed trait FI
    extends StObject
       with CountryISO
  inline def FI: FI = "FI".asInstanceOf[FI]
  
  @js.native
  sealed trait FJ
    extends StObject
       with CountryISO
  inline def FJ: FJ = "FJ".asInstanceOf[FJ]
  
  @js.native
  sealed trait FJD
    extends StObject
       with CurrencyISO
  inline def FJD: FJD = "FJD".asInstanceOf[FJD]
  
  @js.native
  sealed trait FK
    extends StObject
       with CountryISO
  inline def FK: FK = "FK".asInstanceOf[FK]
  
  @js.native
  sealed trait FKP
    extends StObject
       with CurrencyISO
  inline def FKP: FKP = "FKP".asInstanceOf[FKP]
  
  @js.native
  sealed trait FM
    extends StObject
       with CountryISO
  inline def FM: FM = "FM".asInstanceOf[FM]
  
  @js.native
  sealed trait FO
    extends StObject
       with CountryISO
  inline def FO: FO = "FO".asInstanceOf[FO]
  
  @js.native
  sealed trait FOOD_WINE_RESTAURANTS
    extends StObject
       with Sector
  inline def FOOD_WINE_RESTAURANTS: FOOD_WINE_RESTAURANTS = "FOOD_WINE_RESTAURANTS".asInstanceOf[FOOD_WINE_RESTAURANTS]
  
  @js.native
  sealed trait FORCE
    extends StObject
       with SecureMode
  inline def FORCE: FORCE = "FORCE".asInstanceOf[FORCE]
  
  @js.native
  sealed trait FR
    extends StObject
       with CountryISO
       with MandateCultureCode
  inline def FR: FR = "FR".asInstanceOf[FR]
  
  @js.native
  sealed trait FRANCHISE
    extends StObject
       with BusinessType
  inline def FRANCHISE: FRANCHISE = "FRANCHISE".asInstanceOf[FRANCHISE]
  
  @js.native
  sealed trait FRAUD
    extends StObject
       with DisputeReasonType
  inline def FRAUD: FRAUD = "FRAUD".asInstanceOf[FRAUD]
  
  @js.native
  sealed trait FULL_MATCH
    extends StObject
       with AVSResult
  inline def FULL_MATCH: FULL_MATCH = "FULL_MATCH".asInstanceOf[FULL_MATCH]
  
  @js.native
  sealed trait FURNITURE_GARDEN
    extends StObject
       with Sector
  inline def FURNITURE_GARDEN: FURNITURE_GARDEN = "FURNITURE_GARDEN".asInstanceOf[FURNITURE_GARDEN]
  
  @js.native
  sealed trait FeesAmount
    extends StObject
       with Column
  inline def FeesAmount: FeesAmount = "FeesAmount".asInstanceOf[FeesAmount]
  
  @js.native
  sealed trait FeesCurrency
    extends StObject
       with Column
  inline def FeesCurrency: FeesCurrency = "FeesCurrency".asInstanceOf[FeesCurrency]
  
  @js.native
  sealed trait FirstName
    extends StObject
       with RequiredUserNaturalData
  inline def FirstName: FirstName = "FirstName".asInstanceOf[FirstName]
  
  @js.native
  sealed trait GA
    extends StObject
       with CountryISO
  inline def GA: GA = "GA".asInstanceOf[GA]
  
  @js.native
  sealed trait GB
    extends StObject
       with BankAccountType
       with CountryISO
  inline def GB: GB = "GB".asInstanceOf[GB]
  
  @js.native
  sealed trait GBP
    extends StObject
       with CurrencyISO
  inline def GBP: GBP = "GBP".asInstanceOf[GBP]
  
  @js.native
  sealed trait GD
    extends StObject
       with CountryISO
  inline def GD: GD = "GD".asInstanceOf[GD]
  
  @js.native
  sealed trait GE
    extends StObject
       with CountryISO
  inline def GE: GE = "GE".asInstanceOf[GE]
  
  @js.native
  sealed trait GEL
    extends StObject
       with CurrencyISO
  inline def GEL: GEL = "GEL".asInstanceOf[GEL]
  
  @js.native
  sealed trait GF
    extends StObject
       with CountryISO
  inline def GF: GF = "GF".asInstanceOf[GF]
  
  @js.native
  sealed trait GG
    extends StObject
       with CountryISO
  inline def GG: GG = "GG".asInstanceOf[GG]
  
  @js.native
  sealed trait GGP
    extends StObject
       with CurrencyISO
  inline def GGP: GGP = "GGP".asInstanceOf[GGP]
  
  @js.native
  sealed trait GH
    extends StObject
       with CountryISO
  inline def GH: GH = "GH".asInstanceOf[GH]
  
  @js.native
  sealed trait GHS
    extends StObject
       with CurrencyISO
  inline def GHS: GHS = "GHS".asInstanceOf[GHS]
  
  @js.native
  sealed trait GI
    extends StObject
       with CountryISO
  inline def GI: GI = "GI".asInstanceOf[GI]
  
  @js.native
  sealed trait GIP
    extends StObject
       with CurrencyISO
  inline def GIP: GIP = "GIP".asInstanceOf[GIP]
  
  @js.native
  sealed trait GL
    extends StObject
       with CountryISO
  inline def GL: GL = "GL".asInstanceOf[GL]
  
  @js.native
  sealed trait GM
    extends StObject
       with CountryISO
  inline def GM: GM = "GM".asInstanceOf[GM]
  
  @js.native
  sealed trait GMD
    extends StObject
       with CurrencyISO
  inline def GMD: GMD = "GMD".asInstanceOf[GMD]
  
  @js.native
  sealed trait GN
    extends StObject
       with CountryISO
  inline def GN: GN = "GN".asInstanceOf[GN]
  
  @js.native
  sealed trait GNF
    extends StObject
       with CurrencyISO
  inline def GNF: GNF = "GNF".asInstanceOf[GNF]
  
  @js.native
  sealed trait GP
    extends StObject
       with CountryISO
  inline def GP: GP = "GP".asInstanceOf[GP]
  
  @js.native
  sealed trait GQ
    extends StObject
       with CountryISO
  inline def GQ: GQ = "GQ".asInstanceOf[GQ]
  
  @js.native
  sealed trait GR
    extends StObject
       with CountryISO
  inline def GR: GR = "GR".asInstanceOf[GR]
  
  @js.native
  sealed trait GS
    extends StObject
       with CountryISO
  inline def GS: GS = "GS".asInstanceOf[GS]
  
  @js.native
  sealed trait GT
    extends StObject
       with CountryISO
  inline def GT: GT = "GT".asInstanceOf[GT]
  
  @js.native
  sealed trait GTQ
    extends StObject
       with CurrencyISO
  inline def GTQ: GTQ = "GTQ".asInstanceOf[GTQ]
  
  @js.native
  sealed trait GU
    extends StObject
       with CountryISO
  inline def GU: GU = "GU".asInstanceOf[GU]
  
  @js.native
  sealed trait GW
    extends StObject
       with CountryISO
  inline def GW: GW = "GW".asInstanceOf[GW]
  
  @js.native
  sealed trait GY
    extends StObject
       with CountryISO
  inline def GY: GY = "GY".asInstanceOf[GY]
  
  @js.native
  sealed trait GYD
    extends StObject
       with CurrencyISO
  inline def GYD: GYD = "GYD".asInstanceOf[GYD]
  
  @js.native
  sealed trait HK
    extends StObject
       with CountryISO
  inline def HK: HK = "HK".asInstanceOf[HK]
  
  @js.native
  sealed trait HKD
    extends StObject
       with CurrencyISO
  inline def HKD: HKD = "HKD".asInstanceOf[HKD]
  
  @js.native
  sealed trait HM
    extends StObject
       with CountryISO
  inline def HM: HM = "HM".asInstanceOf[HM]
  
  @js.native
  sealed trait HN
    extends StObject
       with CountryISO
  inline def HN: HN = "HN".asInstanceOf[HN]
  
  @js.native
  sealed trait HNL
    extends StObject
       with CurrencyISO
  inline def HNL: HNL = "HNL".asInstanceOf[HNL]
  
  @js.native
  sealed trait HOSPITALITY_TRAVEL_CORIDING
    extends StObject
       with Sector
  inline def HOSPITALITY_TRAVEL_CORIDING: HOSPITALITY_TRAVEL_CORIDING = "HOSPITALITY_TRAVEL_CORIDING".asInstanceOf[HOSPITALITY_TRAVEL_CORIDING]
  
  @js.native
  sealed trait HR
    extends StObject
       with CountryISO
  inline def HR: HR = "HR".asInstanceOf[HR]
  
  @js.native
  sealed trait HRK
    extends StObject
       with CurrencyISO
  inline def HRK: HRK = "HRK".asInstanceOf[HRK]
  
  @js.native
  sealed trait HT
    extends StObject
       with CountryISO
  inline def HT: HT = "HT".asInstanceOf[HT]
  
  @js.native
  sealed trait HTG
    extends StObject
       with CurrencyISO
  inline def HTG: HTG = "HTG".asInstanceOf[HTG]
  
  @js.native
  sealed trait HU
    extends StObject
       with CountryISO
  inline def HU: HU = "HU".asInstanceOf[HU]
  
  @js.native
  sealed trait HUF
    extends StObject
       with CurrencyISO
  inline def HUF: HUF = "HUF".asInstanceOf[HUF]
  
  @js.native
  sealed trait IBAN
    extends StObject
       with BankAccountType
  inline def IBAN: IBAN = "IBAN".asInstanceOf[IBAN]
  
  @js.native
  sealed trait ID
    extends StObject
       with CountryISO
  inline def ID: ID = "ID".asInstanceOf[ID]
  
  @js.native
  sealed trait IDEAL
    extends StObject
       with typings.mangopay2NodejsSdk.mod.card.CardType
  inline def IDEAL: IDEAL = "IDEAL".asInstanceOf[IDEAL]
  
  @js.native
  sealed trait IDENTITY_PROOF
    extends StObject
       with KycDocumentType
  inline def IDENTITY_PROOF: IDENTITY_PROOF = "IDENTITY_PROOF".asInstanceOf[IDENTITY_PROOF]
  
  @js.native
  sealed trait IDR
    extends StObject
       with CurrencyISO
  inline def IDR: IDR = "IDR".asInstanceOf[IDR]
  
  @js.native
  sealed trait IE
    extends StObject
       with CountryISO
  inline def IE: IE = "IE".asInstanceOf[IE]
  
  @js.native
  sealed trait IL
    extends StObject
       with CountryISO
  inline def IL: IL = "IL".asInstanceOf[IL]
  
  @js.native
  sealed trait ILS
    extends StObject
       with CurrencyISO
  inline def ILS: ILS = "ILS".asInstanceOf[ILS]
  
  @js.native
  sealed trait IM
    extends StObject
       with CountryISO
  inline def IM: IM = "IM".asInstanceOf[IM]
  
  @js.native
  sealed trait IMP
    extends StObject
       with CurrencyISO
  inline def IMP: IMP = "IMP".asInstanceOf[IMP]
  
  @js.native
  sealed trait IN
    extends StObject
       with CountryISO
  inline def IN: IN = "IN".asInstanceOf[IN]
  
  @js.native
  sealed trait INITIALIZED_BY_CLIENT
    extends StObject
       with RefundReasonType
  inline def INITIALIZED_BY_CLIENT: INITIALIZED_BY_CLIENT = "INITIALIZED_BY_CLIENT".asInstanceOf[INITIALIZED_BY_CLIENT]
  
  @js.native
  sealed trait INR
    extends StObject
       with CurrencyISO
  inline def INR: INR = "INR".asInstanceOf[INR]
  
  @js.native
  sealed trait INVALID
    extends StObject
       with CardValidity
       with HookValidity
  inline def INVALID: INVALID = "INVALID".asInstanceOf[INVALID]
  
  @js.native
  sealed trait INVALID_DECLARED_UBO extends StObject
  inline def INVALID_DECLARED_UBO: INVALID_DECLARED_UBO = "INVALID_DECLARED_UBO".asInstanceOf[INVALID_DECLARED_UBO]
  
  @js.native
  sealed trait INVALID_UBO_DETAILS extends StObject
  inline def INVALID_UBO_DETAILS: INVALID_UBO_DETAILS = "INVALID_UBO_DETAILS".asInstanceOf[INVALID_UBO_DETAILS]
  
  @js.native
  sealed trait INVOICE
    extends StObject
       with DisputeDocumentType
  inline def INVOICE: INVOICE = "INVOICE".asInstanceOf[INVOICE]
  
  @js.native
  sealed trait IO
    extends StObject
       with CountryISO
  inline def IO: IO = "IO".asInstanceOf[IO]
  
  @js.native
  sealed trait IQ
    extends StObject
       with CountryISO
  inline def IQ: IQ = "IQ".asInstanceOf[IQ]
  
  @js.native
  sealed trait IQD
    extends StObject
       with CurrencyISO
  inline def IQD: IQD = "IQD".asInstanceOf[IQD]
  
  @js.native
  sealed trait IR
    extends StObject
       with CountryISO
  inline def IR: IR = "IR".asInstanceOf[IR]
  
  @js.native
  sealed trait IRR
    extends StObject
       with CurrencyISO
  inline def IRR: IRR = "IRR".asInstanceOf[IRR]
  
  @js.native
  sealed trait IS
    extends StObject
       with CountryISO
  inline def IS: IS = "IS".asInstanceOf[IS]
  
  @js.native
  sealed trait ISK
    extends StObject
       with CurrencyISO
  inline def ISK: ISK = "ISK".asInstanceOf[ISK]
  
  @js.native
  sealed trait IT
    extends StObject
       with CountryISO
       with MandateCultureCode
  inline def IT: IT = "IT".asInstanceOf[IT]
  
  @js.native
  sealed trait Id_
    extends StObject
       with Column
       with StaticKeys
  inline def Id_ : Id_ = "Id".asInstanceOf[Id_]
  
  @js.native
  sealed trait JE
    extends StObject
       with CountryISO
  inline def JE: JE = "JE".asInstanceOf[JE]
  
  @js.native
  sealed trait JEP
    extends StObject
       with CurrencyISO
  inline def JEP: JEP = "JEP".asInstanceOf[JEP]
  
  @js.native
  sealed trait JM
    extends StObject
       with CountryISO
  inline def JM: JM = "JM".asInstanceOf[JM]
  
  @js.native
  sealed trait JMD
    extends StObject
       with CurrencyISO
  inline def JMD: JMD = "JMD".asInstanceOf[JMD]
  
  @js.native
  sealed trait JO
    extends StObject
       with CountryISO
  inline def JO: JO = "JO".asInstanceOf[JO]
  
  @js.native
  sealed trait JOD
    extends StObject
       with CurrencyISO
  inline def JOD: JOD = "JOD".asInstanceOf[JOD]
  
  @js.native
  sealed trait JP
    extends StObject
       with CountryISO
  inline def JP: JP = "JP".asInstanceOf[JP]
  
  @js.native
  sealed trait JPY
    extends StObject
       with CurrencyISO
  inline def JPY: JPY = "JPY".asInstanceOf[JPY]
  
  @js.native
  sealed trait KE
    extends StObject
       with CountryISO
  inline def KE: KE = "KE".asInstanceOf[KE]
  
  @js.native
  sealed trait KES
    extends StObject
       with CurrencyISO
  inline def KES: KES = "KES".asInstanceOf[KES]
  
  @js.native
  sealed trait KG
    extends StObject
       with CountryISO
  inline def KG: KG = "KG".asInstanceOf[KG]
  
  @js.native
  sealed trait KGS
    extends StObject
       with CurrencyISO
  inline def KGS: KGS = "KGS".asInstanceOf[KGS]
  
  @js.native
  sealed trait KH
    extends StObject
       with CountryISO
  inline def KH: KH = "KH".asInstanceOf[KH]
  
  @js.native
  sealed trait KHR
    extends StObject
       with CurrencyISO
  inline def KHR: KHR = "KHR".asInstanceOf[KHR]
  
  @js.native
  sealed trait KI
    extends StObject
       with CountryISO
  inline def KI: KI = "KI".asInstanceOf[KI]
  
  @js.native
  sealed trait KM
    extends StObject
       with CountryISO
  inline def KM: KM = "KM".asInstanceOf[KM]
  
  @js.native
  sealed trait KMF
    extends StObject
       with CurrencyISO
  inline def KMF: KMF = "KMF".asInstanceOf[KMF]
  
  @js.native
  sealed trait KN
    extends StObject
       with CountryISO
  inline def KN: KN = "KN".asInstanceOf[KN]
  
  @js.native
  sealed trait KP
    extends StObject
       with CountryISO
  inline def KP: KP = "KP".asInstanceOf[KP]
  
  @js.native
  sealed trait KPW
    extends StObject
       with CurrencyISO
  inline def KPW: KPW = "KPW".asInstanceOf[KPW]
  
  @js.native
  sealed trait KR
    extends StObject
       with CountryISO
  inline def KR: KR = "KR".asInstanceOf[KR]
  
  @js.native
  sealed trait KRW
    extends StObject
       with CurrencyISO
  inline def KRW: KRW = "KRW".asInstanceOf[KRW]
  
  @js.native
  sealed trait KW
    extends StObject
       with CountryISO
  inline def KW: KW = "KW".asInstanceOf[KW]
  
  @js.native
  sealed trait KWD
    extends StObject
       with CurrencyISO
  inline def KWD: KWD = "KWD".asInstanceOf[KWD]
  
  @js.native
  sealed trait KY
    extends StObject
       with CountryISO
  inline def KY: KY = "KY".asInstanceOf[KY]
  
  @js.native
  sealed trait KYCLevel
    extends StObject
       with StaticKeys
  inline def KYCLevel: KYCLevel = "KYCLevel".asInstanceOf[KYCLevel]
  
  @js.native
  sealed trait KYC_CREATED
    extends StObject
       with EventType
  inline def KYC_CREATED: KYC_CREATED = "KYC_CREATED".asInstanceOf[KYC_CREATED]
  
  @js.native
  sealed trait KYC_FAILED
    extends StObject
       with EventType
  inline def KYC_FAILED: KYC_FAILED = "KYC_FAILED".asInstanceOf[KYC_FAILED]
  
  @js.native
  sealed trait KYC_SUCCEEDED
    extends StObject
       with EventType
  inline def KYC_SUCCEEDED: KYC_SUCCEEDED = "KYC_SUCCEEDED".asInstanceOf[KYC_SUCCEEDED]
  
  @js.native
  sealed trait KYC_VALIDATION_ASKED
    extends StObject
       with EventType
  inline def KYC_VALIDATION_ASKED: KYC_VALIDATION_ASKED = "KYC_VALIDATION_ASKED".asInstanceOf[KYC_VALIDATION_ASKED]
  
  @js.native
  sealed trait KYD
    extends StObject
       with CurrencyISO
  inline def KYD: KYD = "KYD".asInstanceOf[KYD]
  
  @js.native
  sealed trait KZ
    extends StObject
       with CountryISO
  inline def KZ: KZ = "KZ".asInstanceOf[KZ]
  
  @js.native
  sealed trait KZT
    extends StObject
       with CurrencyISO
  inline def KZT: KZT = "KZT".asInstanceOf[KZT]
  
  @js.native
  sealed trait LA
    extends StObject
       with CountryISO
  inline def LA: LA = "LA".asInstanceOf[LA]
  
  @js.native
  sealed trait LAK
    extends StObject
       with CurrencyISO
  inline def LAK: LAK = "LAK".asInstanceOf[LAK]
  
  @js.native
  sealed trait LATE_FAILURE_BANKACCOUNT_CLOSED
    extends StObject
       with DisputeReasonType
  inline def LATE_FAILURE_BANKACCOUNT_CLOSED: LATE_FAILURE_BANKACCOUNT_CLOSED = "LATE_FAILURE_BANKACCOUNT_CLOSED".asInstanceOf[LATE_FAILURE_BANKACCOUNT_CLOSED]
  
  @js.native
  sealed trait LATE_FAILURE_BANKACCOUNT_INCOMPATIBLE
    extends StObject
       with DisputeReasonType
  inline def LATE_FAILURE_BANKACCOUNT_INCOMPATIBLE: LATE_FAILURE_BANKACCOUNT_INCOMPATIBLE = "LATE_FAILURE_BANKACCOUNT_INCOMPATIBLE".asInstanceOf[LATE_FAILURE_BANKACCOUNT_INCOMPATIBLE]
  
  @js.native
  sealed trait LATE_FAILURE_BANKACCOUNT_INCORRECT
    extends StObject
       with DisputeReasonType
  inline def LATE_FAILURE_BANKACCOUNT_INCORRECT: LATE_FAILURE_BANKACCOUNT_INCORRECT = "LATE_FAILURE_BANKACCOUNT_INCORRECT".asInstanceOf[LATE_FAILURE_BANKACCOUNT_INCORRECT]
  
  @js.native
  sealed trait LATE_FAILURE_CONTACT_USER
    extends StObject
       with DisputeReasonType
  inline def LATE_FAILURE_CONTACT_USER: LATE_FAILURE_CONTACT_USER = "LATE_FAILURE_CONTACT_USER".asInstanceOf[LATE_FAILURE_CONTACT_USER]
  
  @js.native
  sealed trait LATE_FAILURE_INSUFFICIENT_FUNDS
    extends StObject
       with DisputeReasonType
  inline def LATE_FAILURE_INSUFFICIENT_FUNDS: LATE_FAILURE_INSUFFICIENT_FUNDS = "LATE_FAILURE_INSUFFICIENT_FUNDS".asInstanceOf[LATE_FAILURE_INSUFFICIENT_FUNDS]
  
  @js.native
  sealed trait LB
    extends StObject
       with CountryISO
  inline def LB: LB = "LB".asInstanceOf[LB]
  
  @js.native
  sealed trait LBP
    extends StObject
       with CurrencyISO
  inline def LBP: LBP = "LBP".asInstanceOf[LBP]
  
  @js.native
  sealed trait LC
    extends StObject
       with CountryISO
  inline def LC: LC = "LC".asInstanceOf[LC]
  
  @js.native
  sealed trait LEGAL
    extends StObject
       with typings.mangopay2NodejsSdk.mod.user.PersonType
  inline def LEGAL: LEGAL = "LEGAL".asInstanceOf[LEGAL]
  
  @js.native
  sealed trait LI
    extends StObject
       with CountryISO
  inline def LI: LI = "LI".asInstanceOf[LI]
  
  @js.native
  sealed trait LIGHT
    extends StObject
       with typings.mangopay2NodejsSdk.mod.user.KYCLevel
  inline def LIGHT: LIGHT = "LIGHT".asInstanceOf[LIGHT]
  
  @js.native
  sealed trait LK
    extends StObject
       with CountryISO
  inline def LK: LK = "LK".asInstanceOf[LK]
  
  @js.native
  sealed trait LKR
    extends StObject
       with CurrencyISO
  inline def LKR: LKR = "LKR".asInstanceOf[LKR]
  
  @js.native
  sealed trait LR
    extends StObject
       with CountryISO
  inline def LR: LR = "LR".asInstanceOf[LR]
  
  @js.native
  sealed trait LRD
    extends StObject
       with CurrencyISO
  inline def LRD: LRD = "LRD".asInstanceOf[LRD]
  
  @js.native
  sealed trait LS
    extends StObject
       with CountryISO
  inline def LS: LS = "LS".asInstanceOf[LS]
  
  @js.native
  sealed trait LSL
    extends StObject
       with CurrencyISO
  inline def LSL: LSL = "LSL".asInstanceOf[LSL]
  
  @js.native
  sealed trait LT
    extends StObject
       with CountryISO
  inline def LT: LT = "LT".asInstanceOf[LT]
  
  @js.native
  sealed trait LU
    extends StObject
       with CountryISO
  inline def LU: LU = "LU".asInstanceOf[LU]
  
  @js.native
  sealed trait LV
    extends StObject
       with CountryISO
  inline def LV: LV = "LV".asInstanceOf[LV]
  
  @js.native
  sealed trait LY
    extends StObject
       with CountryISO
  inline def LY: LY = "LY".asInstanceOf[LY]
  
  @js.native
  sealed trait LYD
    extends StObject
       with CurrencyISO
  inline def LYD: LYD = "LYD".asInstanceOf[LYD]
  
  @js.native
  sealed trait LastName
    extends StObject
       with RequiredUserNaturalData
  inline def LastName: LastName = "LastName".asInstanceOf[LastName]
  
  @js.native
  sealed trait LegalPersonType
    extends StObject
       with RequiredUserLegalData
  inline def LegalPersonType: LegalPersonType = "LegalPersonType".asInstanceOf[LegalPersonType]
  
  @js.native
  sealed trait LegalRepresentativeBirthday
    extends StObject
       with RequiredUserLegalData
  inline def LegalRepresentativeBirthday: LegalRepresentativeBirthday = "LegalRepresentativeBirthday".asInstanceOf[LegalRepresentativeBirthday]
  
  @js.native
  sealed trait LegalRepresentativeCountryOfResidence
    extends StObject
       with RequiredUserLegalData
  inline def LegalRepresentativeCountryOfResidence: LegalRepresentativeCountryOfResidence = "LegalRepresentativeCountryOfResidence".asInstanceOf[LegalRepresentativeCountryOfResidence]
  
  @js.native
  sealed trait LegalRepresentativeFirstName
    extends StObject
       with RequiredUserLegalData
  inline def LegalRepresentativeFirstName: LegalRepresentativeFirstName = "LegalRepresentativeFirstName".asInstanceOf[LegalRepresentativeFirstName]
  
  @js.native
  sealed trait LegalRepresentativeLastName
    extends StObject
       with RequiredUserLegalData
  inline def LegalRepresentativeLastName: LegalRepresentativeLastName = "LegalRepresentativeLastName".asInstanceOf[LegalRepresentativeLastName]
  
  @js.native
  sealed trait LegalRepresentativeNationality
    extends StObject
       with RequiredUserLegalData
  inline def LegalRepresentativeNationality: LegalRepresentativeNationality = "LegalRepresentativeNationality".asInstanceOf[LegalRepresentativeNationality]
  
  @js.native
  sealed trait LegalRepresentativeProofOfIdentity
    extends StObject
       with StaticKeys
  inline def LegalRepresentativeProofOfIdentity: LegalRepresentativeProofOfIdentity = "LegalRepresentativeProofOfIdentity".asInstanceOf[LegalRepresentativeProofOfIdentity]
  
  @js.native
  sealed trait MA
    extends StObject
       with CountryISO
  inline def MA: MA = "MA".asInstanceOf[MA]
  
  @js.native
  sealed trait MAD
    extends StObject
       with CurrencyISO
  inline def MAD: MAD = "MAD".asInstanceOf[MAD]
  
  @js.native
  sealed trait MAESTRO
    extends StObject
       with typings.mangopay2NodejsSdk.mod.card.CardType
  inline def MAESTRO: MAESTRO = "MAESTRO".asInstanceOf[MAESTRO]
  
  @js.native
  sealed trait MANDATE_ACTIVATED
    extends StObject
       with EventType
  inline def MANDATE_ACTIVATED: MANDATE_ACTIVATED = "MANDATE_ACTIVATED".asInstanceOf[MANDATE_ACTIVATED]
  
  @js.native
  sealed trait MANDATE_CREATED
    extends StObject
       with EventType
  inline def MANDATE_CREATED: MANDATE_CREATED = "MANDATE_CREATED".asInstanceOf[MANDATE_CREATED]
  
  @js.native
  sealed trait MANDATE_FAILED
    extends StObject
       with EventType
  inline def MANDATE_FAILED: MANDATE_FAILED = "MANDATE_FAILED".asInstanceOf[MANDATE_FAILED]
  
  @js.native
  sealed trait MANDATE_SUBMITTED
    extends StObject
       with EventType
  inline def MANDATE_SUBMITTED: MANDATE_SUBMITTED = "MANDATE_SUBMITTED".asInstanceOf[MANDATE_SUBMITTED]
  
  @js.native
  sealed trait MARKETPLACE
    extends StObject
       with BusinessType
       with PlatformType
  inline def MARKETPLACE: MARKETPLACE = "MARKETPLACE".asInstanceOf[MARKETPLACE]
  
  @js.native
  sealed trait MASTERPASS
    extends StObject
       with typings.mangopay2NodejsSdk.mod.card.CardType
  inline def MASTERPASS: MASTERPASS = "MASTERPASS".asInstanceOf[MASTERPASS]
  
  @js.native
  sealed trait MC
    extends StObject
       with CountryISO
  inline def MC: MC = "MC".asInstanceOf[MC]
  
  @js.native
  sealed trait MD
    extends StObject
       with CountryISO
  inline def MD: MD = "MD".asInstanceOf[MD]
  
  @js.native
  sealed trait MDL
    extends StObject
       with CurrencyISO
  inline def MDL: MDL = "MDL".asInstanceOf[MDL]
  
  @js.native
  sealed trait ME
    extends StObject
       with CountryISO
  inline def ME: ME = "ME".asInstanceOf[ME]
  
  @js.native
  sealed trait MF
    extends StObject
       with CountryISO
  inline def MF: MF = "MF".asInstanceOf[MF]
  
  @js.native
  sealed trait MG
    extends StObject
       with CountryISO
  inline def MG: MG = "MG".asInstanceOf[MG]
  
  @js.native
  sealed trait MGA
    extends StObject
       with CurrencyISO
  inline def MGA: MGA = "MGA".asInstanceOf[MGA]
  
  @js.native
  sealed trait MH
    extends StObject
       with CountryISO
  inline def MH: MH = "MH".asInstanceOf[MH]
  
  @js.native
  sealed trait MISSING_UBO extends StObject
  inline def MISSING_UBO: MISSING_UBO = "MISSING_UBO".asInstanceOf[MISSING_UBO]
  
  @js.native
  sealed trait MK
    extends StObject
       with CountryISO
  inline def MK: MK = "MK".asInstanceOf[MK]
  
  @js.native
  sealed trait MKD
    extends StObject
       with CurrencyISO
  inline def MKD: MKD = "MKD".asInstanceOf[MKD]
  
  @js.native
  sealed trait ML
    extends StObject
       with CountryISO
  inline def ML: ML = "ML".asInstanceOf[ML]
  
  @js.native
  sealed trait MM
    extends StObject
       with CountryISO
  inline def MM: MM = "MM".asInstanceOf[MM]
  
  @js.native
  sealed trait MMK
    extends StObject
       with CurrencyISO
  inline def MMK: MMK = "MMK".asInstanceOf[MMK]
  
  @js.native
  sealed trait MN
    extends StObject
       with CountryISO
  inline def MN: MN = "MN".asInstanceOf[MN]
  
  @js.native
  sealed trait MNT
    extends StObject
       with CurrencyISO
  inline def MNT: MNT = "MNT".asInstanceOf[MNT]
  
  @js.native
  sealed trait MO
    extends StObject
       with CountryISO
  inline def MO: MO = "MO".asInstanceOf[MO]
  
  @js.native
  sealed trait MOP
    extends StObject
       with CurrencyISO
  inline def MOP: MOP = "MOP".asInstanceOf[MOP]
  
  @js.native
  sealed trait MP
    extends StObject
       with CountryISO
  inline def MP: MP = "MP".asInstanceOf[MP]
  
  @js.native
  sealed trait MQ
    extends StObject
       with CountryISO
  inline def MQ: MQ = "MQ".asInstanceOf[MQ]
  
  @js.native
  sealed trait MR
    extends StObject
       with CountryISO
  inline def MR: MR = "MR".asInstanceOf[MR]
  
  @js.native
  sealed trait MRU
    extends StObject
       with CurrencyISO
  inline def MRU: MRU = "MRU".asInstanceOf[MRU]
  
  @js.native
  sealed trait MS
    extends StObject
       with CountryISO
  inline def MS: MS = "MS".asInstanceOf[MS]
  
  @js.native
  sealed trait MT
    extends StObject
       with CountryISO
  inline def MT: MT = "MT".asInstanceOf[MT]
  
  @js.native
  sealed trait MU
    extends StObject
       with CountryISO
  inline def MU: MU = "MU".asInstanceOf[MU]
  
  @js.native
  sealed trait MUR
    extends StObject
       with CurrencyISO
  inline def MUR: MUR = "MUR".asInstanceOf[MUR]
  
  @js.native
  sealed trait MV
    extends StObject
       with CountryISO
  inline def MV: MV = "MV".asInstanceOf[MV]
  
  @js.native
  sealed trait MVR
    extends StObject
       with CurrencyISO
  inline def MVR: MVR = "MVR".asInstanceOf[MVR]
  
  @js.native
  sealed trait MW
    extends StObject
       with CountryISO
  inline def MW: MW = "MW".asInstanceOf[MW]
  
  @js.native
  sealed trait MWK
    extends StObject
       with CurrencyISO
  inline def MWK: MWK = "MWK".asInstanceOf[MWK]
  
  @js.native
  sealed trait MX
    extends StObject
       with CountryISO
  inline def MX: MX = "MX".asInstanceOf[MX]
  
  @js.native
  sealed trait MXN
    extends StObject
       with CurrencyISO
  inline def MXN: MXN = "MXN".asInstanceOf[MXN]
  
  @js.native
  sealed trait MY
    extends StObject
       with CountryISO
  inline def MY: MY = "MY".asInstanceOf[MY]
  
  @js.native
  sealed trait MYR
    extends StObject
       with CurrencyISO
  inline def MYR: MYR = "MYR".asInstanceOf[MYR]
  
  @js.native
  sealed trait MZ
    extends StObject
       with CountryISO
  inline def MZ: MZ = "MZ".asInstanceOf[MZ]
  
  @js.native
  sealed trait MZN
    extends StObject
       with CurrencyISO
  inline def MZN: MZN = "MZN".asInstanceOf[MZN]
  
  @js.native
  sealed trait MakeKeysNullable extends StObject
  inline def MakeKeysNullable: MakeKeysNullable = "MakeKeysNullable".asInstanceOf[MakeKeysNullable]
  
  @js.native
  sealed trait NA
    extends StObject
       with CountryISO
  inline def NA: NA = "NA".asInstanceOf[NA]
  
  @js.native
  sealed trait NAD
    extends StObject
       with CurrencyISO
  inline def NAD: NAD = "NAD".asInstanceOf[NAD]
  
  @js.native
  sealed trait NATURAL
    extends StObject
       with typings.mangopay2NodejsSdk.mod.user.PersonType
  inline def NATURAL: NATURAL = "NATURAL".asInstanceOf[NATURAL]
  
  @js.native
  sealed trait NC
    extends StObject
       with CountryISO
  inline def NC: NC = "NC".asInstanceOf[NC]
  
  @js.native
  sealed trait NE
    extends StObject
       with CountryISO
  inline def NE: NE = "NE".asInstanceOf[NE]
  
  @js.native
  sealed trait NF
    extends StObject
       with CountryISO
  inline def NF: NF = "NF".asInstanceOf[NF]
  
  @js.native
  sealed trait NG
    extends StObject
       with CountryISO
  inline def NG: NG = "NG".asInstanceOf[NG]
  
  @js.native
  sealed trait NGN
    extends StObject
       with CurrencyISO
  inline def NGN: NGN = "NGN".asInstanceOf[NGN]
  
  @js.native
  sealed trait NI
    extends StObject
       with CountryISO
  inline def NI: NI = "NI".asInstanceOf[NI]
  
  @js.native
  sealed trait NIO
    extends StObject
       with CurrencyISO
  inline def NIO: NIO = "NIO".asInstanceOf[NIO]
  
  @js.native
  sealed trait NL
    extends StObject
       with CountryISO
       with MandateCultureCode
  inline def NL: NL = "NL".asInstanceOf[NL]
  
  @js.native
  sealed trait NO
    extends StObject
       with CountryISO
  inline def NO: NO = "NO".asInstanceOf[NO]
  
  @js.native
  sealed trait NOK
    extends StObject
       with CurrencyISO
  inline def NOK: NOK = "NOK".asInstanceOf[NOK]
  
  @js.native
  sealed trait NORMAL extends StObject
  inline def NORMAL: NORMAL = "NORMAL".asInstanceOf[NORMAL]
  
  @js.native
  sealed trait NOT_CONTESTABLE
    extends StObject
       with DisputeType
  inline def NOT_CONTESTABLE: NOT_CONTESTABLE = "NOT_CONTESTABLE".asInstanceOf[NOT_CONTESTABLE]
  
  @js.native
  sealed trait NO_CHECK
    extends StObject
       with AVSResult
  inline def NO_CHECK: NO_CHECK = "NO_CHECK".asInstanceOf[NO_CHECK]
  
  @js.native
  sealed trait NO_MATCH
    extends StObject
       with AVSResult
  inline def NO_MATCH: NO_MATCH = "NO_MATCH".asInstanceOf[NO_MATCH]
  
  @js.native
  sealed trait NP
    extends StObject
       with CountryISO
  inline def NP: NP = "NP".asInstanceOf[NP]
  
  @js.native
  sealed trait NPR
    extends StObject
       with CurrencyISO
  inline def NPR: NPR = "NPR".asInstanceOf[NPR]
  
  @js.native
  sealed trait NR
    extends StObject
       with CountryISO
  inline def NR: NR = "NR".asInstanceOf[NR]
  
  @js.native
  sealed trait NU
    extends StObject
       with CountryISO
  inline def NU: NU = "NU".asInstanceOf[NU]
  
  @js.native
  sealed trait NZ
    extends StObject
       with CountryISO
  inline def NZ: NZ = "NZ".asInstanceOf[NZ]
  
  @js.native
  sealed trait NZD
    extends StObject
       with CurrencyISO
  inline def NZD: NZD = "NZD".asInstanceOf[NZD]
  
  @js.native
  sealed trait Name
    extends StObject
       with RequiredUserLegalData
  inline def Name: Name = "Name".asInstanceOf[Name]
  
  @js.native
  sealed trait Nationality
    extends StObject
       with RequiredUserNaturalData
  inline def Nationality: Nationality = "Nationality".asInstanceOf[Nationality]
  
  @js.native
  sealed trait Nature
    extends StObject
       with Column
  inline def Nature: Nature = "Nature".asInstanceOf[Nature]
  
  @js.native
  sealed trait NotSpecified
    extends StObject
       with PlatformType
  inline def NotSpecified: NotSpecified = "NotSpecified".asInstanceOf[NotSpecified]
  
  @js.native
  sealed trait OM
    extends StObject
       with CountryISO
  inline def OM: OM = "OM".asInstanceOf[OM]
  
  @js.native
  sealed trait OMR
    extends StObject
       with CurrencyISO
  inline def OMR: OMR = "OMR".asInstanceOf[OMR]
  
  @js.native
  sealed trait ORGANIZATION
    extends StObject
       with typings.mangopay2NodejsSdk.mod.user.LegalPersonType
  inline def ORGANIZATION: ORGANIZATION = "ORGANIZATION".asInstanceOf[ORGANIZATION]
  
  @js.native
  sealed trait OTHER
    extends StObject
       with BankAccountType
       with BusinessType
       with DisputeDocumentType
       with DisputeReasonType
       with PlatformType
       with RefundReasonType
       with RefusedReasonType
  inline def OTHER: OTHER = "OTHER".asInstanceOf[OTHER]
  
  @js.native
  sealed trait OWNER_DO_NOT_MATCH_BANKACCOUNT
    extends StObject
       with RefundReasonType
  inline def OWNER_DO_NOT_MATCH_BANKACCOUNT: OWNER_DO_NOT_MATCH_BANKACCOUNT = "OWNER_DO_NOT_MATCH_BANKACCOUNT".asInstanceOf[OWNER_DO_NOT_MATCH_BANKACCOUNT]
  
  @js.native
  sealed trait P24
    extends StObject
       with typings.mangopay2NodejsSdk.mod.card.CardType
  inline def P24: P24 = "P24".asInstanceOf[P24]
  
  @js.native
  sealed trait P2P_PAYMENT
    extends StObject
       with PlatformType
  inline def P2P_PAYMENT: P2P_PAYMENT = "P2P_PAYMENT".asInstanceOf[P2P_PAYMENT]
  
  @js.native
  sealed trait PA
    extends StObject
       with CountryISO
  inline def PA: PA = "PA".asInstanceOf[PA]
  
  @js.native
  sealed trait PAB
    extends StObject
       with CurrencyISO
  inline def PAB: PAB = "PAB".asInstanceOf[PAB]
  
  @js.native
  sealed trait PAYIN
    extends StObject
       with TransactionType
  inline def PAYIN: PAYIN = "PAYIN".asInstanceOf[PAYIN]
  
  @js.native
  sealed trait PAYIN_NORMAL_CREATED
    extends StObject
       with EventType
  inline def PAYIN_NORMAL_CREATED: PAYIN_NORMAL_CREATED = "PAYIN_NORMAL_CREATED".asInstanceOf[PAYIN_NORMAL_CREATED]
  
  @js.native
  sealed trait PAYIN_NORMAL_FAILED
    extends StObject
       with EventType
  inline def PAYIN_NORMAL_FAILED: PAYIN_NORMAL_FAILED = "PAYIN_NORMAL_FAILED".asInstanceOf[PAYIN_NORMAL_FAILED]
  
  @js.native
  sealed trait PAYIN_NORMAL_SUCCEEDED
    extends StObject
       with EventType
  inline def PAYIN_NORMAL_SUCCEEDED: PAYIN_NORMAL_SUCCEEDED = "PAYIN_NORMAL_SUCCEEDED".asInstanceOf[PAYIN_NORMAL_SUCCEEDED]
  
  @js.native
  sealed trait PAYIN_REFUND_CREATED
    extends StObject
       with EventType
  inline def PAYIN_REFUND_CREATED: PAYIN_REFUND_CREATED = "PAYIN_REFUND_CREATED".asInstanceOf[PAYIN_REFUND_CREATED]
  
  @js.native
  sealed trait PAYIN_REFUND_FAILED
    extends StObject
       with EventType
  inline def PAYIN_REFUND_FAILED: PAYIN_REFUND_FAILED = "PAYIN_REFUND_FAILED".asInstanceOf[PAYIN_REFUND_FAILED]
  
  @js.native
  sealed trait PAYIN_REFUND_SUCCEEDED
    extends StObject
       with EventType
  inline def PAYIN_REFUND_SUCCEEDED: PAYIN_REFUND_SUCCEEDED = "PAYIN_REFUND_SUCCEEDED".asInstanceOf[PAYIN_REFUND_SUCCEEDED]
  
  @js.native
  sealed trait PAYIN_REPUDIATION_CREATED
    extends StObject
       with EventType
  inline def PAYIN_REPUDIATION_CREATED: PAYIN_REPUDIATION_CREATED = "PAYIN_REPUDIATION_CREATED".asInstanceOf[PAYIN_REPUDIATION_CREATED]
  
  @js.native
  sealed trait PAYIN_REPUDIATION_FAILED
    extends StObject
       with EventType
  inline def PAYIN_REPUDIATION_FAILED: PAYIN_REPUDIATION_FAILED = "PAYIN_REPUDIATION_FAILED".asInstanceOf[PAYIN_REPUDIATION_FAILED]
  
  @js.native
  sealed trait PAYIN_REPUDIATION_SUCCEEDED
    extends StObject
       with EventType
  inline def PAYIN_REPUDIATION_SUCCEEDED: PAYIN_REPUDIATION_SUCCEEDED = "PAYIN_REPUDIATION_SUCCEEDED".asInstanceOf[PAYIN_REPUDIATION_SUCCEEDED]
  
  @js.native
  sealed trait PAYLIB
    extends StObject
       with typings.mangopay2NodejsSdk.mod.card.CardType
  inline def PAYLIB: PAYLIB = "PAYLIB".asInstanceOf[PAYLIB]
  
  @js.native
  sealed trait PAYOUT
    extends StObject
       with TransactionType
  inline def PAYOUT: PAYOUT = "PAYOUT".asInstanceOf[PAYOUT]
  
  @js.native
  sealed trait PAYOUT_NORMAL_CREATED
    extends StObject
       with EventType
  inline def PAYOUT_NORMAL_CREATED: PAYOUT_NORMAL_CREATED = "PAYOUT_NORMAL_CREATED".asInstanceOf[PAYOUT_NORMAL_CREATED]
  
  @js.native
  sealed trait PAYOUT_NORMAL_FAILED
    extends StObject
       with EventType
  inline def PAYOUT_NORMAL_FAILED: PAYOUT_NORMAL_FAILED = "PAYOUT_NORMAL_FAILED".asInstanceOf[PAYOUT_NORMAL_FAILED]
  
  @js.native
  sealed trait PAYOUT_NORMAL_SUCCEEDED
    extends StObject
       with EventType
  inline def PAYOUT_NORMAL_SUCCEEDED: PAYOUT_NORMAL_SUCCEEDED = "PAYOUT_NORMAL_SUCCEEDED".asInstanceOf[PAYOUT_NORMAL_SUCCEEDED]
  
  @js.native
  sealed trait PAYOUT_REFUND_CREATED
    extends StObject
       with EventType
  inline def PAYOUT_REFUND_CREATED: PAYOUT_REFUND_CREATED = "PAYOUT_REFUND_CREATED".asInstanceOf[PAYOUT_REFUND_CREATED]
  
  @js.native
  sealed trait PAYOUT_REFUND_FAILED
    extends StObject
       with EventType
  inline def PAYOUT_REFUND_FAILED: PAYOUT_REFUND_FAILED = "PAYOUT_REFUND_FAILED".asInstanceOf[PAYOUT_REFUND_FAILED]
  
  @js.native
  sealed trait PAYOUT_REFUND_SUCCEEDED
    extends StObject
       with EventType
  inline def PAYOUT_REFUND_SUCCEEDED: PAYOUT_REFUND_SUCCEEDED = "PAYOUT_REFUND_SUCCEEDED".asInstanceOf[PAYOUT_REFUND_SUCCEEDED]
  
  @js.native
  sealed trait PAYPAL
    extends StObject
       with PayInPaymentType
  inline def PAYPAL: PAYPAL = "PAYPAL".asInstanceOf[PAYPAL]
  
  @js.native
  sealed trait PE
    extends StObject
       with CountryISO
  inline def PE: PE = "PE".asInstanceOf[PE]
  
  @js.native
  sealed trait PEN
    extends StObject
       with CurrencyISO
  inline def PEN: PEN = "PEN".asInstanceOf[PEN]
  
  @js.native
  sealed trait PENDING_BANK_ACTION
    extends StObject
       with DisputeStatus
  inline def PENDING_BANK_ACTION: PENDING_BANK_ACTION = "PENDING_BANK_ACTION".asInstanceOf[PENDING_BANK_ACTION]
  
  @js.native
  sealed trait PENDING_CLIENT_ACTION
    extends StObject
       with DisputeStatus
  inline def PENDING_CLIENT_ACTION: PENDING_CLIENT_ACTION = "PENDING_CLIENT_ACTION".asInstanceOf[PENDING_CLIENT_ACTION]
  
  @js.native
  sealed trait PF
    extends StObject
       with CountryISO
  inline def PF: PF = "PF".asInstanceOf[PF]
  
  @js.native
  sealed trait PG
    extends StObject
       with CountryISO
  inline def PG: PG = "PG".asInstanceOf[PG]
  
  @js.native
  sealed trait PGK
    extends StObject
       with CurrencyISO
  inline def PGK: PGK = "PGK".asInstanceOf[PGK]
  
  @js.native
  sealed trait PH
    extends StObject
       with CountryISO
  inline def PH: PH = "PH".asInstanceOf[PH]
  
  @js.native
  sealed trait PHP
    extends StObject
       with CurrencyISO
  inline def PHP: PHP = "PHP".asInstanceOf[PHP]
  
  @js.native
  sealed trait PK
    extends StObject
       with CountryISO
  inline def PK: PK = "PK".asInstanceOf[PK]
  
  @js.native
  sealed trait PKR
    extends StObject
       with CurrencyISO
  inline def PKR: PKR = "PKR".asInstanceOf[PKR]
  
  @js.native
  sealed trait PL
    extends StObject
       with CountryISO
       with MandateCultureCode
  inline def PL: PL = "PL".asInstanceOf[PL]
  
  @js.native
  sealed trait PLN
    extends StObject
       with CurrencyISO
  inline def PLN: PLN = "PLN".asInstanceOf[PLN]
  
  @js.native
  sealed trait PM
    extends StObject
       with CountryISO
  inline def PM: PM = "PM".asInstanceOf[PM]
  
  @js.native
  sealed trait PN
    extends StObject
       with CountryISO
  inline def PN: PN = "PN".asInstanceOf[PN]
  
  @js.native
  sealed trait POSTAL_CODE_MATCH_ONLY
    extends StObject
       with AVSResult
  inline def POSTAL_CODE_MATCH_ONLY: POSTAL_CODE_MATCH_ONLY = "POSTAL_CODE_MATCH_ONLY".asInstanceOf[POSTAL_CODE_MATCH_ONLY]
  
  @js.native
  sealed trait PR
    extends StObject
       with CountryISO
  inline def PR: PR = "PR".asInstanceOf[PR]
  
  @js.native
  sealed trait PREAUTHORIZATION_PAYMENT_CANCELED
    extends StObject
       with EventType
  inline def PREAUTHORIZATION_PAYMENT_CANCELED: PREAUTHORIZATION_PAYMENT_CANCELED = "PREAUTHORIZATION_PAYMENT_CANCELED".asInstanceOf[PREAUTHORIZATION_PAYMENT_CANCELED]
  
  @js.native
  sealed trait PREAUTHORIZATION_PAYMENT_EXPIRED
    extends StObject
       with EventType
  inline def PREAUTHORIZATION_PAYMENT_EXPIRED: PREAUTHORIZATION_PAYMENT_EXPIRED = "PREAUTHORIZATION_PAYMENT_EXPIRED".asInstanceOf[PREAUTHORIZATION_PAYMENT_EXPIRED]
  
  @js.native
  sealed trait PREAUTHORIZATION_PAYMENT_VALIDATED
    extends StObject
       with EventType
  inline def PREAUTHORIZATION_PAYMENT_VALIDATED: PREAUTHORIZATION_PAYMENT_VALIDATED = "PREAUTHORIZATION_PAYMENT_VALIDATED".asInstanceOf[PREAUTHORIZATION_PAYMENT_VALIDATED]
  
  @js.native
  sealed trait PREAUTHORIZATION_PAYMENT_WAITING
    extends StObject
       with EventType
  inline def PREAUTHORIZATION_PAYMENT_WAITING: PREAUTHORIZATION_PAYMENT_WAITING = "PREAUTHORIZATION_PAYMENT_WAITING".asInstanceOf[PREAUTHORIZATION_PAYMENT_WAITING]
  
  @js.native
  sealed trait PREAUTHORIZED
    extends StObject
       with PayInPaymentType
  inline def PREAUTHORIZED: PREAUTHORIZED = "PREAUTHORIZED".asInstanceOf[PREAUTHORIZED]
  
  @js.native
  sealed trait PRODUCT_NOT_PROVIDED
    extends StObject
       with DisputeReasonType
  inline def PRODUCT_NOT_PROVIDED: PRODUCT_NOT_PROVIDED = "PRODUCT_NOT_PROVIDED".asInstanceOf[PRODUCT_NOT_PROVIDED]
  
  @js.native
  sealed trait PRODUCT_REPLACEMENT_PROOF
    extends StObject
       with DisputeDocumentType
  inline def PRODUCT_REPLACEMENT_PROOF: PRODUCT_REPLACEMENT_PROOF = "PRODUCT_REPLACEMENT_PROOF".asInstanceOf[PRODUCT_REPLACEMENT_PROOF]
  
  @js.native
  sealed trait PRODUCT_UNACCEPTABLE
    extends StObject
       with DisputeReasonType
  inline def PRODUCT_UNACCEPTABLE: PRODUCT_UNACCEPTABLE = "PRODUCT_UNACCEPTABLE".asInstanceOf[PRODUCT_UNACCEPTABLE]
  
  @js.native
  sealed trait PS
    extends StObject
       with CountryISO
  inline def PS: PS = "PS".asInstanceOf[PS]
  
  @js.native
  sealed trait PT
    extends StObject
       with CountryISO
  inline def PT: PT = "PT".asInstanceOf[PT]
  
  @js.native
  sealed trait PW
    extends StObject
       with CountryISO
  inline def PW: PW = "PW".asInstanceOf[PW]
  
  @js.native
  sealed trait PY
    extends StObject
       with CountryISO
  inline def PY: PY = "PY".asInstanceOf[PY]
  
  @js.native
  sealed trait PYG
    extends StObject
       with CurrencyISO
  inline def PYG: PYG = "PYG".asInstanceOf[PYG]
  
  @js.native
  sealed trait PaymentType
    extends StObject
       with Column
  inline def PaymentType: PaymentType = "PaymentType".asInstanceOf[PaymentType]
  
  @js.native
  sealed trait PersonType
    extends StObject
       with StaticKeys
  inline def PersonType: PersonType = "PersonType".asInstanceOf[PersonType]
  
  @js.native
  sealed trait PreauthorizationId
    extends StObject
       with Column
  inline def PreauthorizationId: PreauthorizationId = "PreauthorizationId".asInstanceOf[PreauthorizationId]
  
  @js.native
  sealed trait ProofOfAddress
    extends StObject
       with StaticKeys
  inline def ProofOfAddress: ProofOfAddress = "ProofOfAddress".asInstanceOf[ProofOfAddress]
  
  @js.native
  sealed trait ProofOfIdentity
    extends StObject
       with StaticKeys
  inline def ProofOfIdentity: ProofOfIdentity = "ProofOfIdentity".asInstanceOf[ProofOfIdentity]
  
  @js.native
  sealed trait ProofOfRegistration
    extends StObject
       with StaticKeys
  inline def ProofOfRegistration: ProofOfRegistration = "ProofOfRegistration".asInstanceOf[ProofOfRegistration]
  
  @js.native
  sealed trait QA
    extends StObject
       with CountryISO
  inline def QA: QA = "QA".asInstanceOf[QA]
  
  @js.native
  sealed trait QAR
    extends StObject
       with CurrencyISO
  inline def QAR: QAR = "QAR".asInstanceOf[QAR]
  
  @js.native
  sealed trait RE
    extends StObject
       with CountryISO
  inline def RE: RE = "RE".asInstanceOf[RE]
  
  @js.native
  sealed trait REFUND
    extends StObject
       with TransactionNature
  inline def REFUND: REFUND = "REFUND".asInstanceOf[REFUND]
  
  @js.native
  sealed trait REFUND_CONVERSION_RATE
    extends StObject
       with DisputeReasonType
  inline def REFUND_CONVERSION_RATE: REFUND_CONVERSION_RATE = "REFUND_CONVERSION_RATE".asInstanceOf[REFUND_CONVERSION_RATE]
  
  @js.native
  sealed trait REFUND_NOT_PROCESSED
    extends StObject
       with DisputeReasonType
  inline def REFUND_NOT_PROCESSED: REFUND_NOT_PROCESSED = "REFUND_NOT_PROCESSED".asInstanceOf[REFUND_NOT_PROCESSED]
  
  @js.native
  sealed trait REFUND_PROOF
    extends StObject
       with DisputeDocumentType
  inline def REFUND_PROOF: REFUND_PROOF = "REFUND_PROOF".asInstanceOf[REFUND_PROOF]
  
  @js.native
  sealed trait REFUSED
    extends StObject
       with DocumentStatus
       with typings.mangopay2NodejsSdk.mod.kycDocument.DocumentStatus
  inline def REFUSED: REFUSED = "REFUSED".asInstanceOf[REFUSED]
  
  @js.native
  sealed trait REGISTRATION_PROOF
    extends StObject
       with KycDocumentType
  inline def REGISTRATION_PROOF: REGISTRATION_PROOF = "REGISTRATION_PROOF".asInstanceOf[REGISTRATION_PROOF]
  
  @js.native
  sealed trait REGULAR
    extends StObject
       with typings.mangopay2NodejsSdk.mod.user.KYCLevel
       with TransactionNature
  inline def REGULAR: REGULAR = "REGULAR".asInstanceOf[REGULAR]
  
  @js.native
  sealed trait RENTALS
    extends StObject
       with Sector
  inline def RENTALS: RENTALS = "RENTALS".asInstanceOf[RENTALS]
  
  @js.native
  sealed trait REOPENED_PENDING_CLIENT_ACTION
    extends StObject
       with DisputeStatus
  inline def REOPENED_PENDING_CLIENT_ACTION: REOPENED_PENDING_CLIENT_ACTION = "REOPENED_PENDING_CLIENT_ACTION".asInstanceOf[REOPENED_PENDING_CLIENT_ACTION]
  
  @js.native
  sealed trait REPUDIATION
    extends StObject
       with TransactionNature
  inline def REPUDIATION: REPUDIATION = "REPUDIATION".asInstanceOf[REPUDIATION]
  
  @js.native
  sealed trait RETRIEVAL
    extends StObject
       with DisputeType
  inline def RETRIEVAL: RETRIEVAL = "RETRIEVAL".asInstanceOf[RETRIEVAL]
  
  @js.native
  sealed trait RO
    extends StObject
       with CountryISO
  inline def RO: RO = "RO".asInstanceOf[RO]
  
  @js.native
  sealed trait RON
    extends StObject
       with CurrencyISO
  inline def RON: RON = "RON".asInstanceOf[RON]
  
  @js.native
  sealed trait RS
    extends StObject
       with CountryISO
  inline def RS: RS = "RS".asInstanceOf[RS]
  
  @js.native
  sealed trait RSD
    extends StObject
       with CurrencyISO
  inline def RSD: RSD = "RSD".asInstanceOf[RSD]
  
  @js.native
  sealed trait RU
    extends StObject
       with CountryISO
  inline def RU: RU = "RU".asInstanceOf[RU]
  
  @js.native
  sealed trait RUB
    extends StObject
       with CurrencyISO
  inline def RUB: RUB = "RUB".asInstanceOf[RUB]
  
  @js.native
  sealed trait RW
    extends StObject
       with CountryISO
  inline def RW: RW = "RW".asInstanceOf[RW]
  
  @js.native
  sealed trait RWF
    extends StObject
       with CurrencyISO
  inline def RWF: RWF = "RWF".asInstanceOf[RWF]
  
  @js.native
  sealed trait ResultCode
    extends StObject
       with Column
  inline def ResultCode: ResultCode = "ResultCode".asInstanceOf[ResultCode]
  
  @js.native
  sealed trait ResultMessage
    extends StObject
       with Column
  inline def ResultMessage: ResultMessage = "ResultMessage".asInstanceOf[ResultMessage]
  
  @js.native
  sealed trait SA
    extends StObject
       with CountryISO
  inline def SA: SA = "SA".asInstanceOf[SA]
  
  @js.native
  sealed trait SAR
    extends StObject
       with CurrencyISO
  inline def SAR: SAR = "SAR".asInstanceOf[SAR]
  
  @js.native
  sealed trait SAVINGS
    extends StObject
       with DepositAccountType
  inline def SAVINGS: SAVINGS = "SAVINGS".asInstanceOf[SAVINGS]
  
  @js.native
  sealed trait SB
    extends StObject
       with CountryISO
  inline def SB: SB = "SB".asInstanceOf[SB]
  
  @js.native
  sealed trait SBD
    extends StObject
       with CurrencyISO
  inline def SBD: SBD = "SBD".asInstanceOf[SBD]
  
  @js.native
  sealed trait SC
    extends StObject
       with CountryISO
  inline def SC: SC = "SC".asInstanceOf[SC]
  
  @js.native
  sealed trait SCR
    extends StObject
       with CurrencyISO
  inline def SCR: SCR = "SCR".asInstanceOf[SCR]
  
  @js.native
  sealed trait SD
    extends StObject
       with CountryISO
  inline def SD: SD = "SD".asInstanceOf[SD]
  
  @js.native
  sealed trait SDG
    extends StObject
       with CurrencyISO
  inline def SDG: SDG = "SDG".asInstanceOf[SDG]
  
  @js.native
  sealed trait SE
    extends StObject
       with CountryISO
  inline def SE: SE = "SE".asInstanceOf[SE]
  
  @js.native
  sealed trait SEK
    extends StObject
       with CurrencyISO
  inline def SEK: SEK = "SEK".asInstanceOf[SEK]
  
  @js.native
  sealed trait SEPA
    extends StObject
       with MandateScheme
  inline def SEPA: SEPA = "SEPA".asInstanceOf[SEPA]
  
  @js.native
  sealed trait SERVICES_JOBBING_EDUCATION
    extends StObject
       with Sector
  inline def SERVICES_JOBBING_EDUCATION: SERVICES_JOBBING_EDUCATION = "SERVICES_JOBBING_EDUCATION".asInstanceOf[SERVICES_JOBBING_EDUCATION]
  
  @js.native
  sealed trait SETTLEMENT
    extends StObject
       with TransactionNature
  inline def SETTLEMENT: SETTLEMENT = "SETTLEMENT".asInstanceOf[SETTLEMENT]
  
  @js.native
  sealed trait SG
    extends StObject
       with CountryISO
  inline def SG: SG = "SG".asInstanceOf[SG]
  
  @js.native
  sealed trait SGD
    extends StObject
       with CurrencyISO
  inline def SGD: SGD = "SGD".asInstanceOf[SGD]
  
  @js.native
  sealed trait SH
    extends StObject
       with CountryISO
  inline def SH: SH = "SH".asInstanceOf[SH]
  
  @js.native
  sealed trait SHAREHOLDER_DECLARATION
    extends StObject
       with KycDocumentType
  inline def SHAREHOLDER_DECLARATION: SHAREHOLDER_DECLARATION = "SHAREHOLDER_DECLARATION".asInstanceOf[SHAREHOLDER_DECLARATION]
  
  @js.native
  sealed trait SHP
    extends StObject
       with CurrencyISO
  inline def SHP: SHP = "SHP".asInstanceOf[SHP]
  
  @js.native
  sealed trait SI
    extends StObject
       with CountryISO
  inline def SI: SI = "SI".asInstanceOf[SI]
  
  @js.native
  sealed trait SJ
    extends StObject
       with CountryISO
  inline def SJ: SJ = "SJ".asInstanceOf[SJ]
  
  @js.native
  sealed trait SK
    extends StObject
       with CountryISO
  inline def SK: SK = "SK".asInstanceOf[SK]
  
  @js.native
  sealed trait SL
    extends StObject
       with CountryISO
  inline def SL: SL = "SL".asInstanceOf[SL]
  
  @js.native
  sealed trait SLL
    extends StObject
       with CurrencyISO
  inline def SLL: SLL = "SLL".asInstanceOf[SLL]
  
  @js.native
  sealed trait SM
    extends StObject
       with CountryISO
  inline def SM: SM = "SM".asInstanceOf[SM]
  
  @js.native
  sealed trait SN
    extends StObject
       with CountryISO
  inline def SN: SN = "SN".asInstanceOf[SN]
  
  @js.native
  sealed trait SO
    extends StObject
       with CountryISO
  inline def SO: SO = "SO".asInstanceOf[SO]
  
  @js.native
  sealed trait SOLETRADER
    extends StObject
       with typings.mangopay2NodejsSdk.mod.user.LegalPersonType
  inline def SOLETRADER: SOLETRADER = "SOLETRADER".asInstanceOf[SOLETRADER]
  
  @js.native
  sealed trait SOS
    extends StObject
       with CurrencyISO
  inline def SOS: SOS = "SOS".asInstanceOf[SOS]
  
  @js.native
  sealed trait SPECIFIC_CASE
    extends StObject
       with KYCDocumentRefusedReasonType
       with RefusedReasonType
  inline def SPECIFIC_CASE: SPECIFIC_CASE = "SPECIFIC_CASE".asInstanceOf[SPECIFIC_CASE]
  
  @js.native
  sealed trait SPL
    extends StObject
       with CurrencyISO
  inline def SPL: SPL = "SPL".asInstanceOf[SPL]
  
  @js.native
  sealed trait SPORT_RECREATION_ACTIVITIES
    extends StObject
       with Sector
  inline def SPORT_RECREATION_ACTIVITIES: SPORT_RECREATION_ACTIVITIES = "SPORT_RECREATION_ACTIVITIES".asInstanceOf[SPORT_RECREATION_ACTIVITIES]
  
  @js.native
  sealed trait SR
    extends StObject
       with CountryISO
  inline def SR: SR = "SR".asInstanceOf[SR]
  
  @js.native
  sealed trait SRD
    extends StObject
       with CurrencyISO
  inline def SRD: SRD = "SRD".asInstanceOf[SRD]
  
  @js.native
  sealed trait SS
    extends StObject
       with CountryISO
  inline def SS: SS = "SS".asInstanceOf[SS]
  
  @js.native
  sealed trait ST
    extends StObject
       with CountryISO
  inline def ST: ST = "ST".asInstanceOf[ST]
  
  @js.native
  sealed trait STN
    extends StObject
       with CurrencyISO
  inline def STN: STN = "STN".asInstanceOf[STN]
  
  @js.native
  sealed trait STORES_FASHION_ACCESSORIES_OBJECTS
    extends StObject
       with Sector
  inline def STORES_FASHION_ACCESSORIES_OBJECTS: STORES_FASHION_ACCESSORIES_OBJECTS = "STORES_FASHION_ACCESSORIES_OBJECTS".asInstanceOf[STORES_FASHION_ACCESSORIES_OBJECTS]
  
  @js.native
  sealed trait SUBMITTED
    extends StObject
       with DisputeStatus
       with MandateStatus
  inline def SUBMITTED: SUBMITTED = "SUBMITTED".asInstanceOf[SUBMITTED]
  
  @js.native
  sealed trait SUCCEEDED
    extends StObject
       with PreAuthorizationStatus
       with TransactionStatus
  inline def SUCCEEDED: SUCCEEDED = "SUCCEEDED".asInstanceOf[SUCCEEDED]
  
  @js.native
  sealed trait SV
    extends StObject
       with CountryISO
  inline def SV: SV = "SV".asInstanceOf[SV]
  
  @js.native
  sealed trait SVC
    extends StObject
       with CurrencyISO
  inline def SVC: SVC = "SVC".asInstanceOf[SVC]
  
  @js.native
  sealed trait SX
    extends StObject
       with CountryISO
  inline def SX: SX = "SX".asInstanceOf[SX]
  
  @js.native
  sealed trait SY
    extends StObject
       with CountryISO
  inline def SY: SY = "SY".asInstanceOf[SY]
  
  @js.native
  sealed trait SYP
    extends StObject
       with CurrencyISO
  inline def SYP: SYP = "SYP".asInstanceOf[SYP]
  
  @js.native
  sealed trait SZ
    extends StObject
       with CountryISO
  inline def SZ: SZ = "SZ".asInstanceOf[SZ]
  
  @js.native
  sealed trait SZL
    extends StObject
       with CurrencyISO
  inline def SZL: SZL = "SZL".asInstanceOf[SZL]
  
  @js.native
  sealed trait ShareholderDeclaration
    extends StObject
       with StaticKeys
  inline def ShareholderDeclaration: ShareholderDeclaration = "ShareholderDeclaration".asInstanceOf[ShareholderDeclaration]
  
  @js.native
  sealed trait Status
    extends StObject
       with Column
  inline def Status: Status = "Status".asInstanceOf[Status]
  
  @js.native
  sealed trait Statute
    extends StObject
       with StaticKeys
  inline def Statute: Statute = "Statute".asInstanceOf[Statute]
  
  @js.native
  sealed trait TC
    extends StObject
       with CountryISO
  inline def TC: TC = "TC".asInstanceOf[TC]
  
  @js.native
  sealed trait TD
    extends StObject
       with CountryISO
  inline def TD: TD = "TD".asInstanceOf[TD]
  
  @js.native
  sealed trait TF
    extends StObject
       with CountryISO
  inline def TF: TF = "TF".asInstanceOf[TF]
  
  @js.native
  sealed trait TG
    extends StObject
       with CountryISO
  inline def TG: TG = "TG".asInstanceOf[TG]
  
  @js.native
  sealed trait TH
    extends StObject
       with CountryISO
  inline def TH: TH = "TH".asInstanceOf[TH]
  
  @js.native
  sealed trait THB
    extends StObject
       with CurrencyISO
  inline def THB: THB = "THB".asInstanceOf[THB]
  
  @js.native
  sealed trait TICKETING
    extends StObject
       with Sector
  inline def TICKETING: TICKETING = "TICKETING".asInstanceOf[TICKETING]
  
  @js.native
  sealed trait TJ
    extends StObject
       with CountryISO
  inline def TJ: TJ = "TJ".asInstanceOf[TJ]
  
  @js.native
  sealed trait TJS
    extends StObject
       with CurrencyISO
  inline def TJS: TJS = "TJS".asInstanceOf[TJS]
  
  @js.native
  sealed trait TK
    extends StObject
       with CountryISO
  inline def TK: TK = "TK".asInstanceOf[TK]
  
  @js.native
  sealed trait TL
    extends StObject
       with CountryISO
  inline def TL: TL = "TL".asInstanceOf[TL]
  
  @js.native
  sealed trait TM
    extends StObject
       with CountryISO
  inline def TM: TM = "TM".asInstanceOf[TM]
  
  @js.native
  sealed trait TMT
    extends StObject
       with CurrencyISO
  inline def TMT: TMT = "TMT".asInstanceOf[TMT]
  
  @js.native
  sealed trait TN
    extends StObject
       with CountryISO
  inline def TN: TN = "TN".asInstanceOf[TN]
  
  @js.native
  sealed trait TND
    extends StObject
       with CurrencyISO
  inline def TND: TND = "TND".asInstanceOf[TND]
  
  @js.native
  sealed trait TO
    extends StObject
       with CountryISO
  inline def TO: TO = "TO".asInstanceOf[TO]
  
  @js.native
  sealed trait TOP
    extends StObject
       with CurrencyISO
  inline def TOP: TOP = "TOP".asInstanceOf[TOP]
  
  @js.native
  sealed trait TR
    extends StObject
       with CountryISO
  inline def TR: TR = "TR".asInstanceOf[TR]
  
  @js.native
  sealed trait TRANSACTIONS extends StObject
  inline def TRANSACTIONS: TRANSACTIONS = "TRANSACTIONS".asInstanceOf[TRANSACTIONS]
  
  @js.native
  sealed trait TRANSACTION_NOT_RECOGNIZED
    extends StObject
       with DisputeReasonType
  inline def TRANSACTION_NOT_RECOGNIZED: TRANSACTION_NOT_RECOGNIZED = "TRANSACTION_NOT_RECOGNIZED".asInstanceOf[TRANSACTION_NOT_RECOGNIZED]
  
  @js.native
  sealed trait TRANSFER
    extends StObject
       with TransactionType
  inline def TRANSFER: TRANSFER = "TRANSFER".asInstanceOf[TRANSFER]
  
  @js.native
  sealed trait TRANSFER_NORMAL_CREATED
    extends StObject
       with EventType
  inline def TRANSFER_NORMAL_CREATED: TRANSFER_NORMAL_CREATED = "TRANSFER_NORMAL_CREATED".asInstanceOf[TRANSFER_NORMAL_CREATED]
  
  @js.native
  sealed trait TRANSFER_NORMAL_FAILED
    extends StObject
       with EventType
  inline def TRANSFER_NORMAL_FAILED: TRANSFER_NORMAL_FAILED = "TRANSFER_NORMAL_FAILED".asInstanceOf[TRANSFER_NORMAL_FAILED]
  
  @js.native
  sealed trait TRANSFER_NORMAL_SUCCEEDED
    extends StObject
       with EventType
  inline def TRANSFER_NORMAL_SUCCEEDED: TRANSFER_NORMAL_SUCCEEDED = "TRANSFER_NORMAL_SUCCEEDED".asInstanceOf[TRANSFER_NORMAL_SUCCEEDED]
  
  @js.native
  sealed trait TRANSFER_REFUND_CREATED
    extends StObject
       with EventType
  inline def TRANSFER_REFUND_CREATED: TRANSFER_REFUND_CREATED = "TRANSFER_REFUND_CREATED".asInstanceOf[TRANSFER_REFUND_CREATED]
  
  @js.native
  sealed trait TRANSFER_REFUND_FAILED
    extends StObject
       with EventType
  inline def TRANSFER_REFUND_FAILED: TRANSFER_REFUND_FAILED = "TRANSFER_REFUND_FAILED".asInstanceOf[TRANSFER_REFUND_FAILED]
  
  @js.native
  sealed trait TRANSFER_REFUND_SUCCEEDED
    extends StObject
       with EventType
  inline def TRANSFER_REFUND_SUCCEEDED: TRANSFER_REFUND_SUCCEEDED = "TRANSFER_REFUND_SUCCEEDED".asInstanceOf[TRANSFER_REFUND_SUCCEEDED]
  
  @js.native
  sealed trait TRANSFER_SETTLEMENT_CREATED
    extends StObject
       with EventType
  inline def TRANSFER_SETTLEMENT_CREATED: TRANSFER_SETTLEMENT_CREATED = "TRANSFER_SETTLEMENT_CREATED".asInstanceOf[TRANSFER_SETTLEMENT_CREATED]
  
  @js.native
  sealed trait TRANSFER_SETTLEMENT_FAILED
    extends StObject
       with EventType
  inline def TRANSFER_SETTLEMENT_FAILED: TRANSFER_SETTLEMENT_FAILED = "TRANSFER_SETTLEMENT_FAILED".asInstanceOf[TRANSFER_SETTLEMENT_FAILED]
  
  @js.native
  sealed trait TRANSFER_SETTLEMENT_SUCCEEDED
    extends StObject
       with EventType
  inline def TRANSFER_SETTLEMENT_SUCCEEDED: TRANSFER_SETTLEMENT_SUCCEEDED = "TRANSFER_SETTLEMENT_SUCCEEDED".asInstanceOf[TRANSFER_SETTLEMENT_SUCCEEDED]
  
  @js.native
  sealed trait TRY
    extends StObject
       with CurrencyISO
  inline def TRY: TRY = "TRY".asInstanceOf[TRY]
  
  @js.native
  sealed trait TT
    extends StObject
       with CountryISO
  inline def TT: TT = "TT".asInstanceOf[TT]
  
  @js.native
  sealed trait TTD
    extends StObject
       with CurrencyISO
  inline def TTD: TTD = "TTD".asInstanceOf[TTD]
  
  @js.native
  sealed trait TV
    extends StObject
       with CountryISO
  inline def TV: TV = "TV".asInstanceOf[TV]
  
  @js.native
  sealed trait TVD
    extends StObject
       with CurrencyISO
  inline def TVD: TVD = "TVD".asInstanceOf[TVD]
  
  @js.native
  sealed trait TW
    extends StObject
       with CountryISO
  inline def TW: TW = "TW".asInstanceOf[TW]
  
  @js.native
  sealed trait TWD
    extends StObject
       with CurrencyISO
  inline def TWD: TWD = "TWD".asInstanceOf[TWD]
  
  @js.native
  sealed trait TZ
    extends StObject
       with CountryISO
  inline def TZ: TZ = "TZ".asInstanceOf[TZ]
  
  @js.native
  sealed trait TZS
    extends StObject
       with CurrencyISO
  inline def TZS: TZS = "TZS".asInstanceOf[TZS]
  
  @js.native
  sealed trait Tag
    extends StObject
       with Column
  inline def Tag: Tag = "Tag".asInstanceOf[Tag]
  
  @js.native
  sealed trait Type
    extends StObject
       with Column
  inline def Type: Type = "Type".asInstanceOf[Type]
  
  @js.native
  sealed trait UA
    extends StObject
       with CountryISO
  inline def UA: UA = "UA".asInstanceOf[UA]
  
  @js.native
  sealed trait UAH
    extends StObject
       with CurrencyISO
  inline def UAH: UAH = "UAH".asInstanceOf[UAH]
  
  @js.native
  sealed trait UBO_DECLARATION_CREATED
    extends StObject
       with EventType
  inline def UBO_DECLARATION_CREATED: UBO_DECLARATION_CREATED = "UBO_DECLARATION_CREATED".asInstanceOf[UBO_DECLARATION_CREATED]
  
  @js.native
  sealed trait UBO_DECLARATION_REFUSED
    extends StObject
       with EventType
  inline def UBO_DECLARATION_REFUSED: UBO_DECLARATION_REFUSED = "UBO_DECLARATION_REFUSED".asInstanceOf[UBO_DECLARATION_REFUSED]
  
  @js.native
  sealed trait UBO_DECLARATION_VALIDATED
    extends StObject
       with EventType
  inline def UBO_DECLARATION_VALIDATED: UBO_DECLARATION_VALIDATED = "UBO_DECLARATION_VALIDATED".asInstanceOf[UBO_DECLARATION_VALIDATED]
  
  @js.native
  sealed trait UBO_DECLARATION_VALIDATION_ASKED
    extends StObject
       with EventType
  inline def UBO_DECLARATION_VALIDATION_ASKED: UBO_DECLARATION_VALIDATION_ASKED = "UBO_DECLARATION_VALIDATION_ASKED".asInstanceOf[UBO_DECLARATION_VALIDATION_ASKED]
  
  @js.native
  sealed trait UG
    extends StObject
       with CountryISO
  inline def UG: UG = "UG".asInstanceOf[UG]
  
  @js.native
  sealed trait UGX
    extends StObject
       with CurrencyISO
  inline def UGX: UGX = "UGX".asInstanceOf[UGX]
  
  @js.native
  sealed trait UM
    extends StObject
       with CountryISO
  inline def UM: UM = "UM".asInstanceOf[UM]
  
  @js.native
  sealed trait UNDERAGE_PERSON
    extends StObject
       with KYCDocumentRefusedReasonType
  inline def UNDERAGE_PERSON: UNDERAGE_PERSON = "UNDERAGE_PERSON".asInstanceOf[UNDERAGE_PERSON]
  
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with CardValidity
       with DisputeReasonType
       with HookValidity
  inline def UNKNOWN: UNKNOWN = "UNKNOWN".asInstanceOf[UNKNOWN]
  
  @js.native
  sealed trait US
    extends StObject
       with BankAccountType
       with CountryISO
  inline def US: US = "US".asInstanceOf[US]
  
  @js.native
  sealed trait USD
    extends StObject
       with CurrencyISO
  inline def USD: USD = "USD".asInstanceOf[USD]
  
  @js.native
  sealed trait USER_ACCEPTANCE_PROOF
    extends StObject
       with DisputeDocumentType
  inline def USER_ACCEPTANCE_PROOF: USER_ACCEPTANCE_PROOF = "USER_ACCEPTANCE_PROOF".asInstanceOf[USER_ACCEPTANCE_PROOF]
  
  @js.native
  sealed trait USER_CORRESPONDANCE
    extends StObject
       with DisputeDocumentType
  inline def USER_CORRESPONDANCE: USER_CORRESPONDANCE = "USER_CORRESPONDANCE".asInstanceOf[USER_CORRESPONDANCE]
  
  @js.native
  sealed trait UY
    extends StObject
       with CountryISO
  inline def UY: UY = "UY".asInstanceOf[UY]
  
  @js.native
  sealed trait UYU
    extends StObject
       with CurrencyISO
  inline def UYU: UYU = "UYU".asInstanceOf[UYU]
  
  @js.native
  sealed trait UZ
    extends StObject
       with CountryISO
  inline def UZ: UZ = "UZ".asInstanceOf[UZ]
  
  @js.native
  sealed trait UZS
    extends StObject
       with CurrencyISO
  inline def UZS: UZS = "UZS".asInstanceOf[UZS]
  
  @js.native
  sealed trait VA
    extends StObject
       with CountryISO
  inline def VA: VA = "VA".asInstanceOf[VA]
  
  @js.native
  sealed trait VALID
    extends StObject
       with CardValidity
       with HookValidity
  inline def VALID: VALID = "VALID".asInstanceOf[VALID]
  
  @js.native
  sealed trait VALIDATED
    extends StObject
       with CardStatus
       with DocumentStatus
       with typings.mangopay2NodejsSdk.mod.kycDocument.DocumentStatus
       with PaymentStatus
  inline def VALIDATED: VALIDATED = "VALIDATED".asInstanceOf[VALIDATED]
  
  @js.native
  sealed trait VALIDATION_ASKED
    extends StObject
       with DocumentStatus
       with typings.mangopay2NodejsSdk.mod.kycDocument.DocumentStatus
  inline def VALIDATION_ASKED: VALIDATION_ASKED = "VALIDATION_ASKED".asInstanceOf[VALIDATION_ASKED]
  
  @js.native
  sealed trait VC
    extends StObject
       with CountryISO
  inline def VC: VC = "VC".asInstanceOf[VC]
  
  @js.native
  sealed trait VE
    extends StObject
       with CountryISO
  inline def VE: VE = "VE".asInstanceOf[VE]
  
  @js.native
  sealed trait VEF
    extends StObject
       with CurrencyISO
  inline def VEF: VEF = "VEF".asInstanceOf[VEF]
  
  @js.native
  sealed trait VG
    extends StObject
       with CountryISO
  inline def VG: VG = "VG".asInstanceOf[VG]
  
  @js.native
  sealed trait VI
    extends StObject
       with CountryISO
  inline def VI: VI = "VI".asInstanceOf[VI]
  
  @js.native
  sealed trait VN
    extends StObject
       with CountryISO
  inline def VN: VN = "VN".asInstanceOf[VN]
  
  @js.native
  sealed trait VND
    extends StObject
       with CurrencyISO
  inline def VND: VND = "VND".asInstanceOf[VND]
  
  @js.native
  sealed trait VU
    extends StObject
       with CountryISO
  inline def VU: VU = "VU".asInstanceOf[VU]
  
  @js.native
  sealed trait VUV
    extends StObject
       with CurrencyISO
  inline def VUV: VUV = "VUV".asInstanceOf[VUV]
  
  @js.native
  sealed trait WAITING
    extends StObject
       with PaymentStatus
  inline def WAITING: WAITING = "WAITING".asInstanceOf[WAITING]
  
  @js.native
  sealed trait WEB
    extends StObject
       with PayInExecutionType
  inline def WEB: WEB = "WEB".asInstanceOf[WEB]
  
  @js.native
  sealed trait WF
    extends StObject
       with CountryISO
  inline def WF: WF = "WF".asInstanceOf[WF]
  
  @js.native
  sealed trait WITHDRAWAL_IMPOSSIBLE_ON_SAVINGS_ACCOUNTS
    extends StObject
       with RefundReasonType
  inline def WITHDRAWAL_IMPOSSIBLE_ON_SAVINGS_ACCOUNTS: WITHDRAWAL_IMPOSSIBLE_ON_SAVINGS_ACCOUNTS = "WITHDRAWAL_IMPOSSIBLE_ON_SAVINGS_ACCOUNTS".asInstanceOf[WITHDRAWAL_IMPOSSIBLE_ON_SAVINGS_ACCOUNTS]
  
  @js.native
  sealed trait WS
    extends StObject
       with CountryISO
  inline def WS: WS = "WS".asInstanceOf[WS]
  
  @js.native
  sealed trait WST
    extends StObject
       with CurrencyISO
  inline def WST: WST = "WST".asInstanceOf[WST]
  
  @js.native
  sealed trait WireReference
    extends StObject
       with Column
  inline def WireReference: WireReference = "WireReference".asInstanceOf[WireReference]
  
  @js.native
  sealed trait XAF
    extends StObject
       with CurrencyISO
  inline def XAF: XAF = "XAF".asInstanceOf[XAF]
  
  @js.native
  sealed trait XCD
    extends StObject
       with CurrencyISO
  inline def XCD: XCD = "XCD".asInstanceOf[XCD]
  
  @js.native
  sealed trait XDR
    extends StObject
       with CurrencyISO
  inline def XDR: XDR = "XDR".asInstanceOf[XDR]
  
  @js.native
  sealed trait XOF
    extends StObject
       with CurrencyISO
  inline def XOF: XOF = "XOF".asInstanceOf[XOF]
  
  @js.native
  sealed trait XPF
    extends StObject
       with CurrencyISO
  inline def XPF: XPF = "XPF".asInstanceOf[XPF]
  
  @js.native
  sealed trait YE
    extends StObject
       with CountryISO
  inline def YE: YE = "YE".asInstanceOf[YE]
  
  @js.native
  sealed trait YER
    extends StObject
       with CurrencyISO
  inline def YER: YER = "YER".asInstanceOf[YER]
  
  @js.native
  sealed trait YT
    extends StObject
       with CountryISO
  inline def YT: YT = "YT".asInstanceOf[YT]
  
  @js.native
  sealed trait ZA
    extends StObject
       with CountryISO
  inline def ZA: ZA = "ZA".asInstanceOf[ZA]
  
  @js.native
  sealed trait ZAR
    extends StObject
       with CurrencyISO
  inline def ZAR: ZAR = "ZAR".asInstanceOf[ZAR]
  
  @js.native
  sealed trait ZM
    extends StObject
       with CountryISO
  inline def ZM: ZM = "ZM".asInstanceOf[ZM]
  
  @js.native
  sealed trait ZMW
    extends StObject
       with CurrencyISO
  inline def ZMW: ZMW = "ZMW".asInstanceOf[ZMW]
  
  @js.native
  sealed trait ZW
    extends StObject
       with CountryISO
  inline def ZW: ZW = "ZW".asInstanceOf[ZW]
  
  @js.native
  sealed trait ZWD
    extends StObject
       with CurrencyISO
  inline def ZWD: ZWD = "ZWD".asInstanceOf[ZWD]
  
  @js.native
  sealed trait authentication_oauth
    extends StObject
       with ApiMethod
  inline def authentication_oauth: authentication_oauth = "authentication_oauth".asInstanceOf[authentication_oauth]
  
  @js.native
  sealed trait banking_aliases_all
    extends StObject
       with ApiMethod
  inline def banking_aliases_all: banking_aliases_all = "banking_aliases_all".asInstanceOf[banking_aliases_all]
  
  @js.native
  sealed trait banking_aliases_get
    extends StObject
       with ApiMethod
  inline def banking_aliases_get: banking_aliases_get = "banking_aliases_get".asInstanceOf[banking_aliases_get]
  
  @js.native
  sealed trait banking_aliases_iban_create
    extends StObject
       with ApiMethod
  inline def banking_aliases_iban_create: banking_aliases_iban_create = "banking_aliases_iban_create".asInstanceOf[banking_aliases_iban_create]
  
  @js.native
  sealed trait banking_aliases_update
    extends StObject
       with ApiMethod
  inline def banking_aliases_update: banking_aliases_update = "banking_aliases_update".asInstanceOf[banking_aliases_update]
  
  @js.native
  sealed trait card_get
    extends StObject
       with ApiMethod
  inline def card_get: card_get = "card_get".asInstanceOf[card_get]
  
  @js.native
  sealed trait card_get_preauthorizations
    extends StObject
       with ApiMethod
  inline def card_get_preauthorizations: card_get_preauthorizations = "card_get_preauthorizations".asInstanceOf[card_get_preauthorizations]
  
  @js.native
  sealed trait card_save
    extends StObject
       with ApiMethod
  inline def card_save: card_save = "card_save".asInstanceOf[card_save]
  
  @js.native
  sealed trait cardregistration_create
    extends StObject
       with ApiMethod
  inline def cardregistration_create: cardregistration_create = "cardregistration_create".asInstanceOf[cardregistration_create]
  
  @js.native
  sealed trait cardregistration_get
    extends StObject
       with ApiMethod
  inline def cardregistration_get: cardregistration_get = "cardregistration_get".asInstanceOf[cardregistration_get]
  
  @js.native
  sealed trait cardregistration_save
    extends StObject
       with ApiMethod
  inline def cardregistration_save: cardregistration_save = "cardregistration_save".asInstanceOf[cardregistration_save]
  
  @js.native
  sealed trait cards_get_by_fingerprint
    extends StObject
       with ApiMethod
  inline def cards_get_by_fingerprint: cards_get_by_fingerprint = "cards_get_by_fingerprint".asInstanceOf[cards_get_by_fingerprint]
  
  @js.native
  sealed trait client_wallets_all
    extends StObject
       with ApiMethod
  inline def client_wallets_all: client_wallets_all = "client_wallets_all".asInstanceOf[client_wallets_all]
  
  @js.native
  sealed trait client_wallets_by_fundsType
    extends StObject
       with ApiMethod
  inline def client_wallets_by_fundsType: client_wallets_by_fundsType = "client_wallets_by_fundsType".asInstanceOf[client_wallets_by_fundsType]
  
  @js.native
  sealed trait client_wallets_get
    extends StObject
       with ApiMethod
  inline def client_wallets_get: client_wallets_get = "client_wallets_get".asInstanceOf[client_wallets_get]
  
  @js.native
  sealed trait client_wallets_transactions
    extends StObject
       with ApiMethod
  inline def client_wallets_transactions: client_wallets_transactions = "client_wallets_transactions".asInstanceOf[client_wallets_transactions]
  
  @js.native
  sealed trait clients_get
    extends StObject
       with ApiMethod
  inline def clients_get: clients_get = "clients_get".asInstanceOf[clients_get]
  
  @js.native
  sealed trait clients_update
    extends StObject
       with ApiMethod
  inline def clients_update: clients_update = "clients_update".asInstanceOf[clients_update]
  
  @js.native
  sealed trait clients_upload_logo
    extends StObject
       with ApiMethod
  inline def clients_upload_logo: clients_upload_logo = "clients_upload_logo".asInstanceOf[clients_upload_logo]
  
  @js.native
  sealed trait dispute_save_close
    extends StObject
       with ApiMethod
  inline def dispute_save_close: dispute_save_close = "dispute_save_close".asInstanceOf[dispute_save_close]
  
  @js.native
  sealed trait disputes_all
    extends StObject
       with ApiMethod
  inline def disputes_all: disputes_all = "disputes_all".asInstanceOf[disputes_all]
  
  @js.native
  sealed trait disputes_document_all
    extends StObject
       with ApiMethod
  inline def disputes_document_all: disputes_document_all = "disputes_document_all".asInstanceOf[disputes_document_all]
  
  @js.native
  sealed trait disputes_document_create
    extends StObject
       with ApiMethod
  inline def disputes_document_create: disputes_document_create = "disputes_document_create".asInstanceOf[disputes_document_create]
  
  @js.native
  sealed trait disputes_document_create_consult
    extends StObject
       with ApiMethod
  inline def disputes_document_create_consult: disputes_document_create_consult = "disputes_document_create_consult".asInstanceOf[disputes_document_create_consult]
  
  @js.native
  sealed trait disputes_document_get
    extends StObject
       with ApiMethod
  inline def disputes_document_get: disputes_document_get = "disputes_document_get".asInstanceOf[disputes_document_get]
  
  @js.native
  sealed trait disputes_document_get_for_dispute
    extends StObject
       with ApiMethod
  inline def disputes_document_get_for_dispute: disputes_document_get_for_dispute = "disputes_document_get_for_dispute".asInstanceOf[disputes_document_get_for_dispute]
  
  @js.native
  sealed trait disputes_document_page_create
    extends StObject
       with ApiMethod
  inline def disputes_document_page_create: disputes_document_page_create = "disputes_document_page_create".asInstanceOf[disputes_document_page_create]
  
  @js.native
  sealed trait disputes_document_save
    extends StObject
       with ApiMethod
  inline def disputes_document_save: disputes_document_save = "disputes_document_save".asInstanceOf[disputes_document_save]
  
  @js.native
  sealed trait disputes_get
    extends StObject
       with ApiMethod
  inline def disputes_get: disputes_get = "disputes_get".asInstanceOf[disputes_get]
  
  @js.native
  sealed trait disputes_get_for_user
    extends StObject
       with ApiMethod
  inline def disputes_get_for_user: disputes_get_for_user = "disputes_get_for_user".asInstanceOf[disputes_get_for_user]
  
  @js.native
  sealed trait disputes_get_for_wallet
    extends StObject
       with ApiMethod
  inline def disputes_get_for_wallet: disputes_get_for_wallet = "disputes_get_for_wallet".asInstanceOf[disputes_get_for_wallet]
  
  @js.native
  sealed trait disputes_get_transactions
    extends StObject
       with ApiMethod
  inline def disputes_get_transactions: disputes_get_transactions = "disputes_get_transactions".asInstanceOf[disputes_get_transactions]
  
  @js.native
  sealed trait disputes_pending_settlement
    extends StObject
       with ApiMethod
  inline def disputes_pending_settlement: disputes_pending_settlement = "disputes_pending_settlement".asInstanceOf[disputes_pending_settlement]
  
  @js.native
  sealed trait disputes_repudiation_create_settlement
    extends StObject
       with ApiMethod
  inline def disputes_repudiation_create_settlement: disputes_repudiation_create_settlement = "disputes_repudiation_create_settlement".asInstanceOf[disputes_repudiation_create_settlement]
  
  @js.native
  sealed trait disputes_repudiation_get
    extends StObject
       with ApiMethod
  inline def disputes_repudiation_get: disputes_repudiation_get = "disputes_repudiation_get".asInstanceOf[disputes_repudiation_get]
  
  @js.native
  sealed trait disputes_repudiation_get_settlement
    extends StObject
       with ApiMethod
  inline def disputes_repudiation_get_settlement: disputes_repudiation_get_settlement = "disputes_repudiation_get_settlement".asInstanceOf[disputes_repudiation_get_settlement]
  
  @js.native
  sealed trait disputes_save_contest_funds
    extends StObject
       with ApiMethod
  inline def disputes_save_contest_funds: disputes_save_contest_funds = "disputes_save_contest_funds".asInstanceOf[disputes_save_contest_funds]
  
  @js.native
  sealed trait disputes_save_tag
    extends StObject
       with ApiMethod
  inline def disputes_save_tag: disputes_save_tag = "disputes_save_tag".asInstanceOf[disputes_save_tag]
  
  @js.native
  sealed trait events_all
    extends StObject
       with ApiMethod
  inline def events_all: events_all = "events_all".asInstanceOf[events_all]
  
  @js.native
  sealed trait hooks_all
    extends StObject
       with ApiMethod
  inline def hooks_all: hooks_all = "hooks_all".asInstanceOf[hooks_all]
  
  @js.native
  sealed trait hooks_create
    extends StObject
       with ApiMethod
  inline def hooks_create: hooks_create = "hooks_create".asInstanceOf[hooks_create]
  
  @js.native
  sealed trait hooks_get
    extends StObject
       with ApiMethod
  inline def hooks_get: hooks_get = "hooks_get".asInstanceOf[hooks_get]
  
  @js.native
  sealed trait hooks_save
    extends StObject
       with ApiMethod
  inline def hooks_save: hooks_save = "hooks_save".asInstanceOf[hooks_save]
  
  @js.native
  sealed trait kyc_documents_all
    extends StObject
       with ApiMethod
  inline def kyc_documents_all: kyc_documents_all = "kyc_documents_all".asInstanceOf[kyc_documents_all]
  
  @js.native
  sealed trait kyc_documents_create
    extends StObject
       with ApiMethod
  inline def kyc_documents_create: kyc_documents_create = "kyc_documents_create".asInstanceOf[kyc_documents_create]
  
  @js.native
  sealed trait kyc_documents_create_consult
    extends StObject
       with ApiMethod
  inline def kyc_documents_create_consult: kyc_documents_create_consult = "kyc_documents_create_consult".asInstanceOf[kyc_documents_create_consult]
  
  @js.native
  sealed trait kyc_documents_get
    extends StObject
       with ApiMethod
  inline def kyc_documents_get: kyc_documents_get = "kyc_documents_get".asInstanceOf[kyc_documents_get]
  
  @js.native
  sealed trait kyc_documents_get_alt
    extends StObject
       with ApiMethod
  inline def kyc_documents_get_alt: kyc_documents_get_alt = "kyc_documents_get_alt".asInstanceOf[kyc_documents_get_alt]
  
  @js.native
  sealed trait kyc_documents_save
    extends StObject
       with ApiMethod
  inline def kyc_documents_save: kyc_documents_save = "kyc_documents_save".asInstanceOf[kyc_documents_save]
  
  @js.native
  sealed trait kyc_page_create
    extends StObject
       with ApiMethod
  inline def kyc_page_create: kyc_page_create = "kyc_page_create".asInstanceOf[kyc_page_create]
  
  @js.native
  sealed trait mandates_all
    extends StObject
       with ApiMethod
  inline def mandates_all: mandates_all = "mandates_all".asInstanceOf[mandates_all]
  
  @js.native
  sealed trait mandates_cancel
    extends StObject
       with ApiMethod
  inline def mandates_cancel: mandates_cancel = "mandates_cancel".asInstanceOf[mandates_cancel]
  
  @js.native
  sealed trait `mandates_directdebit-web_create`
    extends StObject
       with ApiMethod
  inline def `mandates_directdebit-web_create`: `mandates_directdebit-web_create` = "mandates_directdebit-web_create".asInstanceOf[`mandates_directdebit-web_create`]
  
  @js.native
  sealed trait mandates_get
    extends StObject
       with ApiMethod
  inline def mandates_get: mandates_get = "mandates_get".asInstanceOf[mandates_get]
  
  @js.native
  sealed trait mandates_get_for_bank_account
    extends StObject
       with ApiMethod
  inline def mandates_get_for_bank_account: mandates_get_for_bank_account = "mandates_get_for_bank_account".asInstanceOf[mandates_get_for_bank_account]
  
  @js.native
  sealed trait mandates_get_for_user
    extends StObject
       with ApiMethod
  inline def mandates_get_for_user: mandates_get_for_user = "mandates_get_for_user".asInstanceOf[mandates_get_for_user]
  
  @js.native
  sealed trait `payins_bankwire-direct_create`
    extends StObject
       with ApiMethod
  inline def `payins_bankwire-direct_create`: `payins_bankwire-direct_create` = "payins_bankwire-direct_create".asInstanceOf[`payins_bankwire-direct_create`]
  
  @js.native
  sealed trait `payins_card-direct_create`
    extends StObject
       with ApiMethod
  inline def `payins_card-direct_create`: `payins_card-direct_create` = "payins_card-direct_create".asInstanceOf[`payins_card-direct_create`]
  
  @js.native
  sealed trait `payins_card-web_create`
    extends StObject
       with ApiMethod
  inline def `payins_card-web_create`: `payins_card-web_create` = "payins_card-web_create".asInstanceOf[`payins_card-web_create`]
  
  @js.native
  sealed trait payins_createrefunds
    extends StObject
       with ApiMethod
  inline def payins_createrefunds: payins_createrefunds = "payins_createrefunds".asInstanceOf[payins_createrefunds]
  
  @js.native
  sealed trait `payins_directdebit-direct_create`
    extends StObject
       with ApiMethod
  inline def `payins_directdebit-direct_create`: `payins_directdebit-direct_create` = "payins_directdebit-direct_create".asInstanceOf[`payins_directdebit-direct_create`]
  
  @js.native
  sealed trait `payins_directdebit-web_create`
    extends StObject
       with ApiMethod
  inline def `payins_directdebit-web_create`: `payins_directdebit-web_create` = "payins_directdebit-web_create".asInstanceOf[`payins_directdebit-web_create`]
  
  @js.native
  sealed trait payins_get
    extends StObject
       with ApiMethod
  inline def payins_get: payins_get = "payins_get".asInstanceOf[payins_get]
  
  @js.native
  sealed trait `payins_paypal-web_create`
    extends StObject
       with ApiMethod
  inline def `payins_paypal-web_create`: `payins_paypal-web_create` = "payins_paypal-web_create".asInstanceOf[`payins_paypal-web_create`]
  
  @js.native
  sealed trait `payins_preauthorized-direct_create`
    extends StObject
       with ApiMethod
  inline def `payins_preauthorized-direct_create`: `payins_preauthorized-direct_create` = "payins_preauthorized-direct_create".asInstanceOf[`payins_preauthorized-direct_create`]
  
  @js.native
  sealed trait payouts_bankwire_create
    extends StObject
       with ApiMethod
  inline def payouts_bankwire_create: payouts_bankwire_create = "payouts_bankwire_create".asInstanceOf[payouts_bankwire_create]
  
  @js.native
  sealed trait payouts_get
    extends StObject
       with ApiMethod
  inline def payouts_get: payouts_get = "payouts_get".asInstanceOf[payouts_get]
  
  @js.native
  sealed trait preauthorization_create
    extends StObject
       with ApiMethod
  inline def preauthorization_create: preauthorization_create = "preauthorization_create".asInstanceOf[preauthorization_create]
  
  @js.native
  sealed trait preauthorization_get
    extends StObject
       with ApiMethod
  inline def preauthorization_get: preauthorization_get = "preauthorization_get".asInstanceOf[preauthorization_get]
  
  @js.native
  sealed trait preauthorization_save
    extends StObject
       with ApiMethod
  inline def preauthorization_save: preauthorization_save = "preauthorization_save".asInstanceOf[preauthorization_save]
  
  @js.native
  sealed trait preauthorizations_get_for_user
    extends StObject
       with ApiMethod
  inline def preauthorizations_get_for_user: preauthorizations_get_for_user = "preauthorizations_get_for_user".asInstanceOf[preauthorizations_get_for_user]
  
  @js.native
  sealed trait refunds_get
    extends StObject
       with ApiMethod
  inline def refunds_get: refunds_get = "refunds_get".asInstanceOf[refunds_get]
  
  @js.native
  sealed trait refunds_get_for_payin
    extends StObject
       with ApiMethod
  inline def refunds_get_for_payin: refunds_get_for_payin = "refunds_get_for_payin".asInstanceOf[refunds_get_for_payin]
  
  @js.native
  sealed trait refunds_get_for_payout
    extends StObject
       with ApiMethod
  inline def refunds_get_for_payout: refunds_get_for_payout = "refunds_get_for_payout".asInstanceOf[refunds_get_for_payout]
  
  @js.native
  sealed trait refunds_get_for_repudiation
    extends StObject
       with ApiMethod
  inline def refunds_get_for_repudiation: refunds_get_for_repudiation = "refunds_get_for_repudiation".asInstanceOf[refunds_get_for_repudiation]
  
  @js.native
  sealed trait refunds_get_for_transfer
    extends StObject
       with ApiMethod
  inline def refunds_get_for_transfer: refunds_get_for_transfer = "refunds_get_for_transfer".asInstanceOf[refunds_get_for_transfer]
  
  @js.native
  sealed trait reports_all
    extends StObject
       with ApiMethod
  inline def reports_all: reports_all = "reports_all".asInstanceOf[reports_all]
  
  @js.native
  sealed trait reports_get
    extends StObject
       with ApiMethod
  inline def reports_get: reports_get = "reports_get".asInstanceOf[reports_get]
  
  @js.native
  sealed trait reports_transaction_create
    extends StObject
       with ApiMethod
  inline def reports_transaction_create: reports_transaction_create = "reports_transaction_create".asInstanceOf[reports_transaction_create]
  
  @js.native
  sealed trait reports_wallet_create
    extends StObject
       with ApiMethod
  inline def reports_wallet_create: reports_wallet_create = "reports_wallet_create".asInstanceOf[reports_wallet_create]
  
  @js.native
  sealed trait responses_get
    extends StObject
       with ApiMethod
  inline def responses_get: responses_get = "responses_get".asInstanceOf[responses_get]
  
  @js.native
  sealed trait transactions_get_for_bank_account
    extends StObject
       with ApiMethod
  inline def transactions_get_for_bank_account: transactions_get_for_bank_account = "transactions_get_for_bank_account".asInstanceOf[transactions_get_for_bank_account]
  
  @js.native
  sealed trait transactions_get_for_card
    extends StObject
       with ApiMethod
  inline def transactions_get_for_card: transactions_get_for_card = "transactions_get_for_card".asInstanceOf[transactions_get_for_card]
  
  @js.native
  sealed trait transactions_get_for_mandate
    extends StObject
       with ApiMethod
  inline def transactions_get_for_mandate: transactions_get_for_mandate = "transactions_get_for_mandate".asInstanceOf[transactions_get_for_mandate]
  
  @js.native
  sealed trait transfers_create
    extends StObject
       with ApiMethod
  inline def transfers_create: transfers_create = "transfers_create".asInstanceOf[transfers_create]
  
  @js.native
  sealed trait transfers_createrefunds
    extends StObject
       with ApiMethod
  inline def transfers_createrefunds: transfers_createrefunds = "transfers_createrefunds".asInstanceOf[transfers_createrefunds]
  
  @js.native
  sealed trait transfers_get
    extends StObject
       with ApiMethod
  inline def transfers_get: transfers_get = "transfers_get".asInstanceOf[transfers_get]
  
  @js.native
  sealed trait ubo_declaration_create
    extends StObject
       with ApiMethod
  inline def ubo_declaration_create: ubo_declaration_create = "ubo_declaration_create".asInstanceOf[ubo_declaration_create]
  
  @js.native
  sealed trait ubo_declaration_get
    extends StObject
       with ApiMethod
  inline def ubo_declaration_get: ubo_declaration_get = "ubo_declaration_get".asInstanceOf[ubo_declaration_get]
  
  @js.native
  sealed trait ubo_declaration_update
    extends StObject
       with ApiMethod
  inline def ubo_declaration_update: ubo_declaration_update = "ubo_declaration_update".asInstanceOf[ubo_declaration_update]
  
  @js.native
  sealed trait users_all
    extends StObject
       with ApiMethod
  inline def users_all: users_all = "users_all".asInstanceOf[users_all]
  
  @js.native
  sealed trait users_allbankaccount
    extends StObject
       with ApiMethod
  inline def users_allbankaccount: users_allbankaccount = "users_allbankaccount".asInstanceOf[users_allbankaccount]
  
  @js.native
  sealed trait users_allcards
    extends StObject
       with ApiMethod
  inline def users_allcards: users_allcards = "users_allcards".asInstanceOf[users_allcards]
  
  @js.native
  sealed trait users_allkycdocuments
    extends StObject
       with ApiMethod
  inline def users_allkycdocuments: users_allkycdocuments = "users_allkycdocuments".asInstanceOf[users_allkycdocuments]
  
  @js.native
  sealed trait users_alltransactions
    extends StObject
       with ApiMethod
  inline def users_alltransactions: users_alltransactions = "users_alltransactions".asInstanceOf[users_alltransactions]
  
  @js.native
  sealed trait users_allwallets
    extends StObject
       with ApiMethod
  inline def users_allwallets: users_allwallets = "users_allwallets".asInstanceOf[users_allwallets]
  
  @js.native
  sealed trait users_createbankaccounts_ca
    extends StObject
       with ApiMethod
  inline def users_createbankaccounts_ca: users_createbankaccounts_ca = "users_createbankaccounts_ca".asInstanceOf[users_createbankaccounts_ca]
  
  @js.native
  sealed trait users_createbankaccounts_gb
    extends StObject
       with ApiMethod
  inline def users_createbankaccounts_gb: users_createbankaccounts_gb = "users_createbankaccounts_gb".asInstanceOf[users_createbankaccounts_gb]
  
  @js.native
  sealed trait users_createbankaccounts_iban
    extends StObject
       with ApiMethod
  inline def users_createbankaccounts_iban: users_createbankaccounts_iban = "users_createbankaccounts_iban".asInstanceOf[users_createbankaccounts_iban]
  
  @js.native
  sealed trait users_createbankaccounts_other
    extends StObject
       with ApiMethod
  inline def users_createbankaccounts_other: users_createbankaccounts_other = "users_createbankaccounts_other".asInstanceOf[users_createbankaccounts_other]
  
  @js.native
  sealed trait users_createbankaccounts_us
    extends StObject
       with ApiMethod
  inline def users_createbankaccounts_us: users_createbankaccounts_us = "users_createbankaccounts_us".asInstanceOf[users_createbankaccounts_us]
  
  @js.native
  sealed trait users_createlegals
    extends StObject
       with ApiMethod
  inline def users_createlegals: users_createlegals = "users_createlegals".asInstanceOf[users_createlegals]
  
  @js.native
  sealed trait users_createnaturals
    extends StObject
       with ApiMethod
  inline def users_createnaturals: users_createnaturals = "users_createnaturals".asInstanceOf[users_createnaturals]
  
  @js.native
  sealed trait users_deactivate_bankaccount
    extends StObject
       with ApiMethod
  inline def users_deactivate_bankaccount: users_deactivate_bankaccount = "users_deactivate_bankaccount".asInstanceOf[users_deactivate_bankaccount]
  
  @js.native
  sealed trait users_get
    extends StObject
       with ApiMethod
  inline def users_get: users_get = "users_get".asInstanceOf[users_get]
  
  @js.native
  sealed trait users_getbankaccount
    extends StObject
       with ApiMethod
  inline def users_getbankaccount: users_getbankaccount = "users_getbankaccount".asInstanceOf[users_getbankaccount]
  
  @js.native
  sealed trait users_getemoney
    extends StObject
       with ApiMethod
  inline def users_getemoney: users_getemoney = "users_getemoney".asInstanceOf[users_getemoney]
  
  @js.native
  sealed trait users_getlegals
    extends StObject
       with ApiMethod
  inline def users_getlegals: users_getlegals = "users_getlegals".asInstanceOf[users_getlegals]
  
  @js.native
  sealed trait users_getnaturals
    extends StObject
       with ApiMethod
  inline def users_getnaturals: users_getnaturals = "users_getnaturals".asInstanceOf[users_getnaturals]
  
  @js.native
  sealed trait users_savelegals
    extends StObject
       with ApiMethod
  inline def users_savelegals: users_savelegals = "users_savelegals".asInstanceOf[users_savelegals]
  
  @js.native
  sealed trait users_savenaturals
    extends StObject
       with ApiMethod
  inline def users_savenaturals: users_savenaturals = "users_savenaturals".asInstanceOf[users_savenaturals]
  
  @js.native
  sealed trait wallets_alltransactions
    extends StObject
       with ApiMethod
  inline def wallets_alltransactions: wallets_alltransactions = "wallets_alltransactions".asInstanceOf[wallets_alltransactions]
  
  @js.native
  sealed trait wallets_create
    extends StObject
       with ApiMethod
  inline def wallets_create: wallets_create = "wallets_create".asInstanceOf[wallets_create]
  
  @js.native
  sealed trait wallets_get
    extends StObject
       with ApiMethod
  inline def wallets_get: wallets_get = "wallets_get".asInstanceOf[wallets_get]
  
  @js.native
  sealed trait wallets_save
    extends StObject
       with ApiMethod
  inline def wallets_save: wallets_save = "wallets_save".asInstanceOf[wallets_save]
}
