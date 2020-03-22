package typings.mangopay2NodejsSdk.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.authentication_oauth
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.responses_get
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.events_all
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.hooks_create
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.hooks_all
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.hooks_get
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.hooks_save
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.cardregistration_create
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.cardregistration_get
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.cardregistration_save
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.preauthorization_create
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.preauthorization_get
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.preauthorization_save
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.preauthorizations_get_for_user
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.card_get
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.cards_get_by_fingerprint
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.card_save
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.card_get_preauthorizations
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_card-web_create`
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_card-direct_create`
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_preauthorized-direct_create`
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_bankwire-direct_create`
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_directdebit-web_create`
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_directdebit-direct_create`
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_paypal-web_create`
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.payins_get
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.payins_createrefunds
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.payouts_bankwire_create
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.payouts_get
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.refunds_get
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.refunds_get_for_repudiation
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.refunds_get_for_transfer
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.refunds_get_for_payin
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.refunds_get_for_payout
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transfers_create
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transfers_get
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transfers_createrefunds
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createnaturals
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createlegals
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createbankaccounts_iban
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createbankaccounts_gb
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createbankaccounts_us
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createbankaccounts_ca
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createbankaccounts_other
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_all
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_allwallets
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_allbankaccount
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_allcards
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_alltransactions
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_allkycdocuments
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_get
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_getnaturals
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_getlegals
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_getbankaccount
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_deactivate_bankaccount
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_savenaturals
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_savelegals
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_getemoney
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.wallets_create
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.wallets_alltransactions
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.wallets_get
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.wallets_save
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_create
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_get
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_save
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_page_create
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_all
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_get_alt
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_create_consult
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_get
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_save_tag
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_save_contest_funds
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.dispute_save_close
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_get_transactions
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_all
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_get_for_wallet
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_get_for_user
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_create
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_page_create
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_save
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_get
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_get_for_dispute
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_all
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_create_consult
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_repudiation_get
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_repudiation_create_settlement
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_repudiation_get_settlement
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_pending_settlement
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.reports_transaction_create
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.reports_wallet_create
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.reports_get
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.reports_all
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`mandates_directdebit-web_create`
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.mandates_get
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.mandates_cancel
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.mandates_all
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.mandates_get_for_user
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.mandates_get_for_bank_account
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.clients_get
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.clients_update
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.clients_upload_logo
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.client_wallets_all
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.client_wallets_get
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.client_wallets_by_fundsType
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.client_wallets_transactions
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.banking_aliases_iban_create
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.banking_aliases_get
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.banking_aliases_update
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.banking_aliases_all
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ubo_declaration_create
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ubo_declaration_update
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ubo_declaration_get
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transactions_get_for_mandate
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transactions_get_for_card
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transactions_get_for_bank_account
*/
trait ApiMethod extends js.Object

object ApiMethod {
  @scala.inline
  def authentication_oauth: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.authentication_oauth = this.cast("authentication_oauth")
  @scala.inline
  def banking_aliases_all: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.banking_aliases_all = this.cast("banking_aliases_all")
  @scala.inline
  def banking_aliases_get: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.banking_aliases_get = this.cast("banking_aliases_get")
  @scala.inline
  def banking_aliases_iban_create: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.banking_aliases_iban_create = this.cast("banking_aliases_iban_create")
  @scala.inline
  def banking_aliases_update: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.banking_aliases_update = this.cast("banking_aliases_update")
  @scala.inline
  def card_get: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.card_get = this.cast("card_get")
  @scala.inline
  def card_get_preauthorizations: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.card_get_preauthorizations = this.cast("card_get_preauthorizations")
  @scala.inline
  def card_save: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.card_save = this.cast("card_save")
  @scala.inline
  def cardregistration_create: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.cardregistration_create = this.cast("cardregistration_create")
  @scala.inline
  def cardregistration_get: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.cardregistration_get = this.cast("cardregistration_get")
  @scala.inline
  def cardregistration_save: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.cardregistration_save = this.cast("cardregistration_save")
  @scala.inline
  def cards_get_by_fingerprint: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.cards_get_by_fingerprint = this.cast("cards_get_by_fingerprint")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def client_wallets_all: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.client_wallets_all = this.cast("client_wallets_all")
  @scala.inline
  def client_wallets_by_fundsType: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.client_wallets_by_fundsType = this.cast("client_wallets_by_fundsType")
  @scala.inline
  def client_wallets_get: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.client_wallets_get = this.cast("client_wallets_get")
  @scala.inline
  def client_wallets_transactions: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.client_wallets_transactions = this.cast("client_wallets_transactions")
  @scala.inline
  def clients_get: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.clients_get = this.cast("clients_get")
  @scala.inline
  def clients_update: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.clients_update = this.cast("clients_update")
  @scala.inline
  def clients_upload_logo: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.clients_upload_logo = this.cast("clients_upload_logo")
  @scala.inline
  def dispute_save_close: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.dispute_save_close = this.cast("dispute_save_close")
  @scala.inline
  def disputes_all: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_all = this.cast("disputes_all")
  @scala.inline
  def disputes_document_all: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_all = this.cast("disputes_document_all")
  @scala.inline
  def disputes_document_create: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_create = this.cast("disputes_document_create")
  @scala.inline
  def disputes_document_create_consult: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_create_consult = this.cast("disputes_document_create_consult")
  @scala.inline
  def disputes_document_get: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_get = this.cast("disputes_document_get")
  @scala.inline
  def disputes_document_get_for_dispute: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_get_for_dispute = this.cast("disputes_document_get_for_dispute")
  @scala.inline
  def disputes_document_page_create: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_page_create = this.cast("disputes_document_page_create")
  @scala.inline
  def disputes_document_save: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_save = this.cast("disputes_document_save")
  @scala.inline
  def disputes_get: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_get = this.cast("disputes_get")
  @scala.inline
  def disputes_get_for_user: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_get_for_user = this.cast("disputes_get_for_user")
  @scala.inline
  def disputes_get_for_wallet: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_get_for_wallet = this.cast("disputes_get_for_wallet")
  @scala.inline
  def disputes_get_transactions: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_get_transactions = this.cast("disputes_get_transactions")
  @scala.inline
  def disputes_pending_settlement: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_pending_settlement = this.cast("disputes_pending_settlement")
  @scala.inline
  def disputes_repudiation_create_settlement: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_repudiation_create_settlement = this.cast("disputes_repudiation_create_settlement")
  @scala.inline
  def disputes_repudiation_get: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_repudiation_get = this.cast("disputes_repudiation_get")
  @scala.inline
  def disputes_repudiation_get_settlement: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_repudiation_get_settlement = this.cast("disputes_repudiation_get_settlement")
  @scala.inline
  def disputes_save_contest_funds: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_save_contest_funds = this.cast("disputes_save_contest_funds")
  @scala.inline
  def disputes_save_tag: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_save_tag = this.cast("disputes_save_tag")
  @scala.inline
  def events_all: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.events_all = this.cast("events_all")
  @scala.inline
  def hooks_all: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.hooks_all = this.cast("hooks_all")
  @scala.inline
  def hooks_create: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.hooks_create = this.cast("hooks_create")
  @scala.inline
  def hooks_get: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.hooks_get = this.cast("hooks_get")
  @scala.inline
  def hooks_save: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.hooks_save = this.cast("hooks_save")
  @scala.inline
  def kyc_documents_all: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_all = this.cast("kyc_documents_all")
  @scala.inline
  def kyc_documents_create: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_create = this.cast("kyc_documents_create")
  @scala.inline
  def kyc_documents_create_consult: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_create_consult = this.cast("kyc_documents_create_consult")
  @scala.inline
  def kyc_documents_get: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_get = this.cast("kyc_documents_get")
  @scala.inline
  def kyc_documents_get_alt: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_get_alt = this.cast("kyc_documents_get_alt")
  @scala.inline
  def kyc_documents_save: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_save = this.cast("kyc_documents_save")
  @scala.inline
  def kyc_page_create: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_page_create = this.cast("kyc_page_create")
  @scala.inline
  def mandates_all: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.mandates_all = this.cast("mandates_all")
  @scala.inline
  def mandates_cancel: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.mandates_cancel = this.cast("mandates_cancel")
  @scala.inline
  def `mandates_directdebit-web_create`: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`mandates_directdebit-web_create` = this.cast("mandates_directdebit-web_create")
  @scala.inline
  def mandates_get: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.mandates_get = this.cast("mandates_get")
  @scala.inline
  def mandates_get_for_bank_account: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.mandates_get_for_bank_account = this.cast("mandates_get_for_bank_account")
  @scala.inline
  def mandates_get_for_user: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.mandates_get_for_user = this.cast("mandates_get_for_user")
  @scala.inline
  def `payins_bankwire-direct_create`: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_bankwire-direct_create` = this.cast("payins_bankwire-direct_create")
  @scala.inline
  def `payins_card-direct_create`: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_card-direct_create` = this.cast("payins_card-direct_create")
  @scala.inline
  def `payins_card-web_create`: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_card-web_create` = this.cast("payins_card-web_create")
  @scala.inline
  def payins_createrefunds: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.payins_createrefunds = this.cast("payins_createrefunds")
  @scala.inline
  def `payins_directdebit-direct_create`: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_directdebit-direct_create` = this.cast("payins_directdebit-direct_create")
  @scala.inline
  def `payins_directdebit-web_create`: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_directdebit-web_create` = this.cast("payins_directdebit-web_create")
  @scala.inline
  def payins_get: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.payins_get = this.cast("payins_get")
  @scala.inline
  def `payins_paypal-web_create`: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_paypal-web_create` = this.cast("payins_paypal-web_create")
  @scala.inline
  def `payins_preauthorized-direct_create`: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_preauthorized-direct_create` = this.cast("payins_preauthorized-direct_create")
  @scala.inline
  def payouts_bankwire_create: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.payouts_bankwire_create = this.cast("payouts_bankwire_create")
  @scala.inline
  def payouts_get: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.payouts_get = this.cast("payouts_get")
  @scala.inline
  def preauthorization_create: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.preauthorization_create = this.cast("preauthorization_create")
  @scala.inline
  def preauthorization_get: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.preauthorization_get = this.cast("preauthorization_get")
  @scala.inline
  def preauthorization_save: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.preauthorization_save = this.cast("preauthorization_save")
  @scala.inline
  def preauthorizations_get_for_user: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.preauthorizations_get_for_user = this.cast("preauthorizations_get_for_user")
  @scala.inline
  def refunds_get: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.refunds_get = this.cast("refunds_get")
  @scala.inline
  def refunds_get_for_payin: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.refunds_get_for_payin = this.cast("refunds_get_for_payin")
  @scala.inline
  def refunds_get_for_payout: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.refunds_get_for_payout = this.cast("refunds_get_for_payout")
  @scala.inline
  def refunds_get_for_repudiation: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.refunds_get_for_repudiation = this.cast("refunds_get_for_repudiation")
  @scala.inline
  def refunds_get_for_transfer: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.refunds_get_for_transfer = this.cast("refunds_get_for_transfer")
  @scala.inline
  def reports_all: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.reports_all = this.cast("reports_all")
  @scala.inline
  def reports_get: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.reports_get = this.cast("reports_get")
  @scala.inline
  def reports_transaction_create: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.reports_transaction_create = this.cast("reports_transaction_create")
  @scala.inline
  def reports_wallet_create: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.reports_wallet_create = this.cast("reports_wallet_create")
  @scala.inline
  def responses_get: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.responses_get = this.cast("responses_get")
  @scala.inline
  def transactions_get_for_bank_account: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transactions_get_for_bank_account = this.cast("transactions_get_for_bank_account")
  @scala.inline
  def transactions_get_for_card: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transactions_get_for_card = this.cast("transactions_get_for_card")
  @scala.inline
  def transactions_get_for_mandate: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transactions_get_for_mandate = this.cast("transactions_get_for_mandate")
  @scala.inline
  def transfers_create: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transfers_create = this.cast("transfers_create")
  @scala.inline
  def transfers_createrefunds: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transfers_createrefunds = this.cast("transfers_createrefunds")
  @scala.inline
  def transfers_get: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transfers_get = this.cast("transfers_get")
  @scala.inline
  def ubo_declaration_create: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ubo_declaration_create = this.cast("ubo_declaration_create")
  @scala.inline
  def ubo_declaration_get: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ubo_declaration_get = this.cast("ubo_declaration_get")
  @scala.inline
  def ubo_declaration_update: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ubo_declaration_update = this.cast("ubo_declaration_update")
  @scala.inline
  def users_all: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_all = this.cast("users_all")
  @scala.inline
  def users_allbankaccount: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_allbankaccount = this.cast("users_allbankaccount")
  @scala.inline
  def users_allcards: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_allcards = this.cast("users_allcards")
  @scala.inline
  def users_allkycdocuments: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_allkycdocuments = this.cast("users_allkycdocuments")
  @scala.inline
  def users_alltransactions: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_alltransactions = this.cast("users_alltransactions")
  @scala.inline
  def users_allwallets: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_allwallets = this.cast("users_allwallets")
  @scala.inline
  def users_createbankaccounts_ca: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createbankaccounts_ca = this.cast("users_createbankaccounts_ca")
  @scala.inline
  def users_createbankaccounts_gb: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createbankaccounts_gb = this.cast("users_createbankaccounts_gb")
  @scala.inline
  def users_createbankaccounts_iban: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createbankaccounts_iban = this.cast("users_createbankaccounts_iban")
  @scala.inline
  def users_createbankaccounts_other: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createbankaccounts_other = this.cast("users_createbankaccounts_other")
  @scala.inline
  def users_createbankaccounts_us: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createbankaccounts_us = this.cast("users_createbankaccounts_us")
  @scala.inline
  def users_createlegals: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createlegals = this.cast("users_createlegals")
  @scala.inline
  def users_createnaturals: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createnaturals = this.cast("users_createnaturals")
  @scala.inline
  def users_deactivate_bankaccount: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_deactivate_bankaccount = this.cast("users_deactivate_bankaccount")
  @scala.inline
  def users_get: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_get = this.cast("users_get")
  @scala.inline
  def users_getbankaccount: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_getbankaccount = this.cast("users_getbankaccount")
  @scala.inline
  def users_getemoney: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_getemoney = this.cast("users_getemoney")
  @scala.inline
  def users_getlegals: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_getlegals = this.cast("users_getlegals")
  @scala.inline
  def users_getnaturals: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_getnaturals = this.cast("users_getnaturals")
  @scala.inline
  def users_savelegals: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_savelegals = this.cast("users_savelegals")
  @scala.inline
  def users_savenaturals: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_savenaturals = this.cast("users_savenaturals")
  @scala.inline
  def wallets_alltransactions: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.wallets_alltransactions = this.cast("wallets_alltransactions")
  @scala.inline
  def wallets_create: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.wallets_create = this.cast("wallets_create")
  @scala.inline
  def wallets_get: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.wallets_get = this.cast("wallets_get")
  @scala.inline
  def wallets_save: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.wallets_save = this.cast("wallets_save")
}

