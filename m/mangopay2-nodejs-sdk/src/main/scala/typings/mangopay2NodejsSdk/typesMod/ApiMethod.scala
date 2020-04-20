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
  def authentication_oauth: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.authentication_oauth = "authentication_oauth".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.authentication_oauth]
  @scala.inline
  def banking_aliases_all: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.banking_aliases_all = "banking_aliases_all".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.banking_aliases_all]
  @scala.inline
  def banking_aliases_get: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.banking_aliases_get = "banking_aliases_get".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.banking_aliases_get]
  @scala.inline
  def banking_aliases_iban_create: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.banking_aliases_iban_create = "banking_aliases_iban_create".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.banking_aliases_iban_create]
  @scala.inline
  def banking_aliases_update: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.banking_aliases_update = "banking_aliases_update".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.banking_aliases_update]
  @scala.inline
  def card_get: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.card_get = "card_get".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.card_get]
  @scala.inline
  def card_get_preauthorizations: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.card_get_preauthorizations = "card_get_preauthorizations".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.card_get_preauthorizations]
  @scala.inline
  def card_save: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.card_save = "card_save".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.card_save]
  @scala.inline
  def cardregistration_create: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.cardregistration_create = "cardregistration_create".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.cardregistration_create]
  @scala.inline
  def cardregistration_get: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.cardregistration_get = "cardregistration_get".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.cardregistration_get]
  @scala.inline
  def cardregistration_save: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.cardregistration_save = "cardregistration_save".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.cardregistration_save]
  @scala.inline
  def cards_get_by_fingerprint: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.cards_get_by_fingerprint = "cards_get_by_fingerprint".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.cards_get_by_fingerprint]
  @scala.inline
  def client_wallets_all: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.client_wallets_all = "client_wallets_all".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.client_wallets_all]
  @scala.inline
  def client_wallets_by_fundsType: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.client_wallets_by_fundsType = "client_wallets_by_fundsType".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.client_wallets_by_fundsType]
  @scala.inline
  def client_wallets_get: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.client_wallets_get = "client_wallets_get".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.client_wallets_get]
  @scala.inline
  def client_wallets_transactions: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.client_wallets_transactions = "client_wallets_transactions".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.client_wallets_transactions]
  @scala.inline
  def clients_get: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.clients_get = "clients_get".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.clients_get]
  @scala.inline
  def clients_update: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.clients_update = "clients_update".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.clients_update]
  @scala.inline
  def clients_upload_logo: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.clients_upload_logo = "clients_upload_logo".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.clients_upload_logo]
  @scala.inline
  def dispute_save_close: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.dispute_save_close = "dispute_save_close".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.dispute_save_close]
  @scala.inline
  def disputes_all: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_all = "disputes_all".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_all]
  @scala.inline
  def disputes_document_all: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_all = "disputes_document_all".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_all]
  @scala.inline
  def disputes_document_create: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_create = "disputes_document_create".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_create]
  @scala.inline
  def disputes_document_create_consult: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_create_consult = "disputes_document_create_consult".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_create_consult]
  @scala.inline
  def disputes_document_get: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_get = "disputes_document_get".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_get]
  @scala.inline
  def disputes_document_get_for_dispute: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_get_for_dispute = "disputes_document_get_for_dispute".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_get_for_dispute]
  @scala.inline
  def disputes_document_page_create: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_page_create = "disputes_document_page_create".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_page_create]
  @scala.inline
  def disputes_document_save: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_save = "disputes_document_save".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_document_save]
  @scala.inline
  def disputes_get: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_get = "disputes_get".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_get]
  @scala.inline
  def disputes_get_for_user: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_get_for_user = "disputes_get_for_user".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_get_for_user]
  @scala.inline
  def disputes_get_for_wallet: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_get_for_wallet = "disputes_get_for_wallet".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_get_for_wallet]
  @scala.inline
  def disputes_get_transactions: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_get_transactions = "disputes_get_transactions".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_get_transactions]
  @scala.inline
  def disputes_pending_settlement: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_pending_settlement = "disputes_pending_settlement".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_pending_settlement]
  @scala.inline
  def disputes_repudiation_create_settlement: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_repudiation_create_settlement = "disputes_repudiation_create_settlement".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_repudiation_create_settlement]
  @scala.inline
  def disputes_repudiation_get: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_repudiation_get = "disputes_repudiation_get".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_repudiation_get]
  @scala.inline
  def disputes_repudiation_get_settlement: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_repudiation_get_settlement = "disputes_repudiation_get_settlement".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_repudiation_get_settlement]
  @scala.inline
  def disputes_save_contest_funds: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_save_contest_funds = "disputes_save_contest_funds".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_save_contest_funds]
  @scala.inline
  def disputes_save_tag: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_save_tag = "disputes_save_tag".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.disputes_save_tag]
  @scala.inline
  def events_all: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.events_all = "events_all".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.events_all]
  @scala.inline
  def hooks_all: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.hooks_all = "hooks_all".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.hooks_all]
  @scala.inline
  def hooks_create: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.hooks_create = "hooks_create".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.hooks_create]
  @scala.inline
  def hooks_get: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.hooks_get = "hooks_get".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.hooks_get]
  @scala.inline
  def hooks_save: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.hooks_save = "hooks_save".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.hooks_save]
  @scala.inline
  def kyc_documents_all: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_all = "kyc_documents_all".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_all]
  @scala.inline
  def kyc_documents_create: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_create = "kyc_documents_create".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_create]
  @scala.inline
  def kyc_documents_create_consult: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_create_consult = "kyc_documents_create_consult".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_create_consult]
  @scala.inline
  def kyc_documents_get: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_get = "kyc_documents_get".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_get]
  @scala.inline
  def kyc_documents_get_alt: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_get_alt = "kyc_documents_get_alt".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_get_alt]
  @scala.inline
  def kyc_documents_save: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_save = "kyc_documents_save".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_documents_save]
  @scala.inline
  def kyc_page_create: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_page_create = "kyc_page_create".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.kyc_page_create]
  @scala.inline
  def mandates_all: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.mandates_all = "mandates_all".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.mandates_all]
  @scala.inline
  def mandates_cancel: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.mandates_cancel = "mandates_cancel".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.mandates_cancel]
  @scala.inline
  def `mandates_directdebit-web_create`: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`mandates_directdebit-web_create` = "mandates_directdebit-web_create".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`mandates_directdebit-web_create`]
  @scala.inline
  def mandates_get: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.mandates_get = "mandates_get".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.mandates_get]
  @scala.inline
  def mandates_get_for_bank_account: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.mandates_get_for_bank_account = "mandates_get_for_bank_account".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.mandates_get_for_bank_account]
  @scala.inline
  def mandates_get_for_user: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.mandates_get_for_user = "mandates_get_for_user".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.mandates_get_for_user]
  @scala.inline
  def `payins_bankwire-direct_create`: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_bankwire-direct_create` = "payins_bankwire-direct_create".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_bankwire-direct_create`]
  @scala.inline
  def `payins_card-direct_create`: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_card-direct_create` = "payins_card-direct_create".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_card-direct_create`]
  @scala.inline
  def `payins_card-web_create`: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_card-web_create` = "payins_card-web_create".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_card-web_create`]
  @scala.inline
  def payins_createrefunds: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.payins_createrefunds = "payins_createrefunds".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.payins_createrefunds]
  @scala.inline
  def `payins_directdebit-direct_create`: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_directdebit-direct_create` = "payins_directdebit-direct_create".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_directdebit-direct_create`]
  @scala.inline
  def `payins_directdebit-web_create`: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_directdebit-web_create` = "payins_directdebit-web_create".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_directdebit-web_create`]
  @scala.inline
  def payins_get: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.payins_get = "payins_get".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.payins_get]
  @scala.inline
  def `payins_paypal-web_create`: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_paypal-web_create` = "payins_paypal-web_create".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_paypal-web_create`]
  @scala.inline
  def `payins_preauthorized-direct_create`: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_preauthorized-direct_create` = "payins_preauthorized-direct_create".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.`payins_preauthorized-direct_create`]
  @scala.inline
  def payouts_bankwire_create: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.payouts_bankwire_create = "payouts_bankwire_create".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.payouts_bankwire_create]
  @scala.inline
  def payouts_get: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.payouts_get = "payouts_get".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.payouts_get]
  @scala.inline
  def preauthorization_create: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.preauthorization_create = "preauthorization_create".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.preauthorization_create]
  @scala.inline
  def preauthorization_get: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.preauthorization_get = "preauthorization_get".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.preauthorization_get]
  @scala.inline
  def preauthorization_save: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.preauthorization_save = "preauthorization_save".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.preauthorization_save]
  @scala.inline
  def preauthorizations_get_for_user: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.preauthorizations_get_for_user = "preauthorizations_get_for_user".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.preauthorizations_get_for_user]
  @scala.inline
  def refunds_get: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.refunds_get = "refunds_get".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.refunds_get]
  @scala.inline
  def refunds_get_for_payin: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.refunds_get_for_payin = "refunds_get_for_payin".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.refunds_get_for_payin]
  @scala.inline
  def refunds_get_for_payout: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.refunds_get_for_payout = "refunds_get_for_payout".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.refunds_get_for_payout]
  @scala.inline
  def refunds_get_for_repudiation: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.refunds_get_for_repudiation = "refunds_get_for_repudiation".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.refunds_get_for_repudiation]
  @scala.inline
  def refunds_get_for_transfer: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.refunds_get_for_transfer = "refunds_get_for_transfer".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.refunds_get_for_transfer]
  @scala.inline
  def reports_all: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.reports_all = "reports_all".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.reports_all]
  @scala.inline
  def reports_get: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.reports_get = "reports_get".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.reports_get]
  @scala.inline
  def reports_transaction_create: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.reports_transaction_create = "reports_transaction_create".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.reports_transaction_create]
  @scala.inline
  def reports_wallet_create: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.reports_wallet_create = "reports_wallet_create".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.reports_wallet_create]
  @scala.inline
  def responses_get: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.responses_get = "responses_get".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.responses_get]
  @scala.inline
  def transactions_get_for_bank_account: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transactions_get_for_bank_account = "transactions_get_for_bank_account".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transactions_get_for_bank_account]
  @scala.inline
  def transactions_get_for_card: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transactions_get_for_card = "transactions_get_for_card".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transactions_get_for_card]
  @scala.inline
  def transactions_get_for_mandate: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transactions_get_for_mandate = "transactions_get_for_mandate".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transactions_get_for_mandate]
  @scala.inline
  def transfers_create: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transfers_create = "transfers_create".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transfers_create]
  @scala.inline
  def transfers_createrefunds: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transfers_createrefunds = "transfers_createrefunds".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transfers_createrefunds]
  @scala.inline
  def transfers_get: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transfers_get = "transfers_get".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.transfers_get]
  @scala.inline
  def ubo_declaration_create: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ubo_declaration_create = "ubo_declaration_create".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ubo_declaration_create]
  @scala.inline
  def ubo_declaration_get: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ubo_declaration_get = "ubo_declaration_get".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ubo_declaration_get]
  @scala.inline
  def ubo_declaration_update: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ubo_declaration_update = "ubo_declaration_update".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ubo_declaration_update]
  @scala.inline
  def users_all: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_all = "users_all".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_all]
  @scala.inline
  def users_allbankaccount: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_allbankaccount = "users_allbankaccount".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_allbankaccount]
  @scala.inline
  def users_allcards: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_allcards = "users_allcards".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_allcards]
  @scala.inline
  def users_allkycdocuments: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_allkycdocuments = "users_allkycdocuments".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_allkycdocuments]
  @scala.inline
  def users_alltransactions: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_alltransactions = "users_alltransactions".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_alltransactions]
  @scala.inline
  def users_allwallets: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_allwallets = "users_allwallets".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_allwallets]
  @scala.inline
  def users_createbankaccounts_ca: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createbankaccounts_ca = "users_createbankaccounts_ca".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createbankaccounts_ca]
  @scala.inline
  def users_createbankaccounts_gb: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createbankaccounts_gb = "users_createbankaccounts_gb".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createbankaccounts_gb]
  @scala.inline
  def users_createbankaccounts_iban: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createbankaccounts_iban = "users_createbankaccounts_iban".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createbankaccounts_iban]
  @scala.inline
  def users_createbankaccounts_other: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createbankaccounts_other = "users_createbankaccounts_other".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createbankaccounts_other]
  @scala.inline
  def users_createbankaccounts_us: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createbankaccounts_us = "users_createbankaccounts_us".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createbankaccounts_us]
  @scala.inline
  def users_createlegals: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createlegals = "users_createlegals".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createlegals]
  @scala.inline
  def users_createnaturals: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createnaturals = "users_createnaturals".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_createnaturals]
  @scala.inline
  def users_deactivate_bankaccount: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_deactivate_bankaccount = "users_deactivate_bankaccount".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_deactivate_bankaccount]
  @scala.inline
  def users_get: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_get = "users_get".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_get]
  @scala.inline
  def users_getbankaccount: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_getbankaccount = "users_getbankaccount".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_getbankaccount]
  @scala.inline
  def users_getemoney: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_getemoney = "users_getemoney".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_getemoney]
  @scala.inline
  def users_getlegals: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_getlegals = "users_getlegals".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_getlegals]
  @scala.inline
  def users_getnaturals: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_getnaturals = "users_getnaturals".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_getnaturals]
  @scala.inline
  def users_savelegals: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_savelegals = "users_savelegals".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_savelegals]
  @scala.inline
  def users_savenaturals: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_savenaturals = "users_savenaturals".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.users_savenaturals]
  @scala.inline
  def wallets_alltransactions: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.wallets_alltransactions = "wallets_alltransactions".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.wallets_alltransactions]
  @scala.inline
  def wallets_create: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.wallets_create = "wallets_create".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.wallets_create]
  @scala.inline
  def wallets_get: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.wallets_get = "wallets_get".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.wallets_get]
  @scala.inline
  def wallets_save: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.wallets_save = "wallets_save".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.wallets_save]
}

