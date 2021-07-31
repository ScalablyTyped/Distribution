package typings.mangopay2NodejsSdk

import org.scalablytyped.runtime.TopLevel
import typings.mangopay2NodejsSdk.anon.Type
import typings.std.Exclude
import typings.std.Partial
import typings.std.Pick
import typings.std.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
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
  trait ApiMethod extends StObject
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AD
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AE
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AF
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AG
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AI
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AL
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AM
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AO
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AQ
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AR
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AS
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AT
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AU
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AW
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AX
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AZ
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BA
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BB
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BD
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BE
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BF
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BG
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BH
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BI
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BJ
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BL
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BM
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BN
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BO
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BQ
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BR
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BS
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BT
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BV
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BW
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BY
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BZ
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CA
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CC
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CD
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CF
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CG
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CH
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CI
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CK
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CL
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CM
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CN
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CO
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CR
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CU
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CV
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CW
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CX
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CY
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CZ
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DE
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DJ
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DK
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DM
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DO
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DZ
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EC
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EE
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EG
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EH
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ER
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ES
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ET
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FI
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FJ
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FK
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FM
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FO
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FR
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GA
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GB
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GD
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GE
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GF
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GG
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GH
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GI
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GL
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GM
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GN
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GP
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GQ
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GR
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GS
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GT
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GU
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GW
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GY
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HK
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HM
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HN
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HR
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HT
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HU
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ID
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IE
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IL
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IM
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IN
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IO
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IQ
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IR
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IS
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IT
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JE
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JM
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JO
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JP
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KE
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KG
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KH
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KI
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KM
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KN
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KP
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KR
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KW
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KY
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KZ
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LA
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LB
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LC
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LI
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LK
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LR
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LS
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LT
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LU
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LV
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LY
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MA
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MC
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MD
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ME
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MF
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MG
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MH
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MK
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ML
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MM
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MN
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MO
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MP
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MQ
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MR
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MS
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MT
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MU
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MV
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MW
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MX
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MY
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MZ
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NA
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NC
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NE
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NF
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NG
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NI
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NL
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NO
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NP
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NR
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NU
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NZ
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OM
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PA
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PE
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PF
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PG
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PH
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PK
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PL
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PM
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PN
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PR
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PS
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PT
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PW
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PY
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.QA
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RE
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RO
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RS
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RU
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RW
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SA
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SB
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SC
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SD
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SE
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SG
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SH
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SI
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SJ
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SK
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SL
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SM
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SN
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SO
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SR
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SS
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ST
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SV
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SX
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SY
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SZ
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TC
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TD
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TF
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TG
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TH
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TJ
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TK
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TL
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TM
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TN
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TO
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TR
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TT
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TV
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TW
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TZ
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UA
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UG
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UM
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.US
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UY
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UZ
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VA
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VC
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VE
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VG
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VI
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VN
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VU
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WF
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WS
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.YE
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.YT
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ZA
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ZM
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ZW
  */
  trait CountryISO extends StObject
  object CountryISO {
    
    @scala.inline
    def AD: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AD = "AD".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AD]
    
    @scala.inline
    def AE: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AE = "AE".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AE]
    
    @scala.inline
    def AF: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AF = "AF".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AF]
    
    @scala.inline
    def AG: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AG = "AG".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AG]
    
    @scala.inline
    def AI: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AI = "AI".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AI]
    
    @scala.inline
    def AL: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AL = "AL".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AL]
    
    @scala.inline
    def AM: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AM = "AM".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AM]
    
    @scala.inline
    def AO: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AO = "AO".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AO]
    
    @scala.inline
    def AQ: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AQ = "AQ".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AQ]
    
    @scala.inline
    def AR: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AR = "AR".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AR]
    
    @scala.inline
    def AS: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AS = "AS".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AS]
    
    @scala.inline
    def AT: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AT = "AT".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AT]
    
    @scala.inline
    def AU: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AU = "AU".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AU]
    
    @scala.inline
    def AW: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AW = "AW".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AW]
    
    @scala.inline
    def AX: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AX = "AX".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AX]
    
    @scala.inline
    def AZ: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AZ = "AZ".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AZ]
    
    @scala.inline
    def BA: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BA = "BA".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BA]
    
    @scala.inline
    def BB: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BB = "BB".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BB]
    
    @scala.inline
    def BD: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BD = "BD".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BD]
    
    @scala.inline
    def BE: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BE = "BE".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BE]
    
    @scala.inline
    def BF: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BF = "BF".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BF]
    
    @scala.inline
    def BG: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BG = "BG".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BG]
    
    @scala.inline
    def BH: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BH = "BH".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BH]
    
    @scala.inline
    def BI: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BI = "BI".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BI]
    
    @scala.inline
    def BJ: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BJ = "BJ".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BJ]
    
    @scala.inline
    def BL: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BL = "BL".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BL]
    
    @scala.inline
    def BM: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BM = "BM".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BM]
    
    @scala.inline
    def BN: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BN = "BN".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BN]
    
    @scala.inline
    def BO: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BO = "BO".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BO]
    
    @scala.inline
    def BQ: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BQ = "BQ".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BQ]
    
    @scala.inline
    def BR: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BR = "BR".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BR]
    
    @scala.inline
    def BS: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BS = "BS".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BS]
    
    @scala.inline
    def BT: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BT = "BT".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BT]
    
    @scala.inline
    def BV: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BV = "BV".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BV]
    
    @scala.inline
    def BW: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BW = "BW".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BW]
    
    @scala.inline
    def BY: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BY = "BY".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BY]
    
    @scala.inline
    def BZ: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BZ = "BZ".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BZ]
    
    @scala.inline
    def CA: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CA = "CA".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CA]
    
    @scala.inline
    def CC: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CC = "CC".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CC]
    
    @scala.inline
    def CD: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CD = "CD".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CD]
    
    @scala.inline
    def CF: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CF = "CF".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CF]
    
    @scala.inline
    def CG: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CG = "CG".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CG]
    
    @scala.inline
    def CH: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CH = "CH".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CH]
    
    @scala.inline
    def CI: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CI = "CI".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CI]
    
    @scala.inline
    def CK: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CK = "CK".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CK]
    
    @scala.inline
    def CL: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CL = "CL".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CL]
    
    @scala.inline
    def CM: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CM = "CM".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CM]
    
    @scala.inline
    def CN: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CN = "CN".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CN]
    
    @scala.inline
    def CO: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CO = "CO".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CO]
    
    @scala.inline
    def CR: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CR = "CR".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CR]
    
    @scala.inline
    def CU: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CU = "CU".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CU]
    
    @scala.inline
    def CV: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CV = "CV".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CV]
    
    @scala.inline
    def CW: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CW = "CW".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CW]
    
    @scala.inline
    def CX: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CX = "CX".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CX]
    
    @scala.inline
    def CY: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CY = "CY".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CY]
    
    @scala.inline
    def CZ: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CZ = "CZ".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CZ]
    
    @scala.inline
    def DE: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DE = "DE".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DE]
    
    @scala.inline
    def DJ: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DJ = "DJ".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DJ]
    
    @scala.inline
    def DK: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DK = "DK".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DK]
    
    @scala.inline
    def DM: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DM = "DM".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DM]
    
    @scala.inline
    def DO: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DO = "DO".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DO]
    
    @scala.inline
    def DZ: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DZ = "DZ".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DZ]
    
    @scala.inline
    def EC: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EC = "EC".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EC]
    
    @scala.inline
    def EE: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EE = "EE".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EE]
    
    @scala.inline
    def EG: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EG = "EG".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EG]
    
    @scala.inline
    def EH: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EH = "EH".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EH]
    
    @scala.inline
    def ER: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ER = "ER".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ER]
    
    @scala.inline
    def ES: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ES = "ES".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ES]
    
    @scala.inline
    def ET: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ET = "ET".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ET]
    
    @scala.inline
    def FI: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FI = "FI".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FI]
    
    @scala.inline
    def FJ: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FJ = "FJ".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FJ]
    
    @scala.inline
    def FK: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FK = "FK".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FK]
    
    @scala.inline
    def FM: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FM = "FM".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FM]
    
    @scala.inline
    def FO: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FO = "FO".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FO]
    
    @scala.inline
    def FR: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FR = "FR".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FR]
    
    @scala.inline
    def GA: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GA = "GA".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GA]
    
    @scala.inline
    def GB: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GB = "GB".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GB]
    
    @scala.inline
    def GD: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GD = "GD".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GD]
    
    @scala.inline
    def GE: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GE = "GE".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GE]
    
    @scala.inline
    def GF: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GF = "GF".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GF]
    
    @scala.inline
    def GG: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GG = "GG".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GG]
    
    @scala.inline
    def GH: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GH = "GH".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GH]
    
    @scala.inline
    def GI: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GI = "GI".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GI]
    
    @scala.inline
    def GL: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GL = "GL".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GL]
    
    @scala.inline
    def GM: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GM = "GM".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GM]
    
    @scala.inline
    def GN: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GN = "GN".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GN]
    
    @scala.inline
    def GP: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GP = "GP".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GP]
    
    @scala.inline
    def GQ: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GQ = "GQ".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GQ]
    
    @scala.inline
    def GR: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GR = "GR".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GR]
    
    @scala.inline
    def GS: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GS = "GS".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GS]
    
    @scala.inline
    def GT: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GT = "GT".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GT]
    
    @scala.inline
    def GU: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GU = "GU".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GU]
    
    @scala.inline
    def GW: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GW = "GW".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GW]
    
    @scala.inline
    def GY: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GY = "GY".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GY]
    
    @scala.inline
    def HK: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HK = "HK".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HK]
    
    @scala.inline
    def HM: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HM = "HM".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HM]
    
    @scala.inline
    def HN: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HN = "HN".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HN]
    
    @scala.inline
    def HR: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HR = "HR".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HR]
    
    @scala.inline
    def HT: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HT = "HT".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HT]
    
    @scala.inline
    def HU: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HU = "HU".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HU]
    
    @scala.inline
    def ID: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ID = "ID".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ID]
    
    @scala.inline
    def IE: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IE = "IE".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IE]
    
    @scala.inline
    def IL: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IL = "IL".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IL]
    
    @scala.inline
    def IM: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IM = "IM".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IM]
    
    @scala.inline
    def IN: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IN = "IN".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IN]
    
    @scala.inline
    def IO: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IO = "IO".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IO]
    
    @scala.inline
    def IQ: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IQ = "IQ".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IQ]
    
    @scala.inline
    def IR: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IR = "IR".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IR]
    
    @scala.inline
    def IS: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IS = "IS".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IS]
    
    @scala.inline
    def IT: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IT = "IT".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IT]
    
    @scala.inline
    def JE: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JE = "JE".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JE]
    
    @scala.inline
    def JM: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JM = "JM".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JM]
    
    @scala.inline
    def JO: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JO = "JO".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JO]
    
    @scala.inline
    def JP: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JP = "JP".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JP]
    
    @scala.inline
    def KE: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KE = "KE".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KE]
    
    @scala.inline
    def KG: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KG = "KG".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KG]
    
    @scala.inline
    def KH: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KH = "KH".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KH]
    
    @scala.inline
    def KI: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KI = "KI".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KI]
    
    @scala.inline
    def KM: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KM = "KM".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KM]
    
    @scala.inline
    def KN: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KN = "KN".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KN]
    
    @scala.inline
    def KP: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KP = "KP".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KP]
    
    @scala.inline
    def KR: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KR = "KR".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KR]
    
    @scala.inline
    def KW: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KW = "KW".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KW]
    
    @scala.inline
    def KY: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KY = "KY".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KY]
    
    @scala.inline
    def KZ: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KZ = "KZ".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KZ]
    
    @scala.inline
    def LA: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LA = "LA".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LA]
    
    @scala.inline
    def LB: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LB = "LB".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LB]
    
    @scala.inline
    def LC: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LC = "LC".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LC]
    
    @scala.inline
    def LI: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LI = "LI".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LI]
    
    @scala.inline
    def LK: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LK = "LK".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LK]
    
    @scala.inline
    def LR: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LR = "LR".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LR]
    
    @scala.inline
    def LS: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LS = "LS".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LS]
    
    @scala.inline
    def LT: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LT = "LT".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LT]
    
    @scala.inline
    def LU: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LU = "LU".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LU]
    
    @scala.inline
    def LV: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LV = "LV".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LV]
    
    @scala.inline
    def LY: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LY = "LY".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LY]
    
    @scala.inline
    def MA: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MA = "MA".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MA]
    
    @scala.inline
    def MC: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MC = "MC".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MC]
    
    @scala.inline
    def MD: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MD = "MD".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MD]
    
    @scala.inline
    def ME: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ME = "ME".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ME]
    
    @scala.inline
    def MF: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MF = "MF".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MF]
    
    @scala.inline
    def MG: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MG = "MG".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MG]
    
    @scala.inline
    def MH: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MH = "MH".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MH]
    
    @scala.inline
    def MK: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MK = "MK".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MK]
    
    @scala.inline
    def ML: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ML = "ML".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ML]
    
    @scala.inline
    def MM: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MM = "MM".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MM]
    
    @scala.inline
    def MN: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MN = "MN".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MN]
    
    @scala.inline
    def MO: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MO = "MO".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MO]
    
    @scala.inline
    def MP: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MP = "MP".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MP]
    
    @scala.inline
    def MQ: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MQ = "MQ".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MQ]
    
    @scala.inline
    def MR: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MR = "MR".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MR]
    
    @scala.inline
    def MS: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MS = "MS".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MS]
    
    @scala.inline
    def MT: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MT = "MT".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MT]
    
    @scala.inline
    def MU: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MU = "MU".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MU]
    
    @scala.inline
    def MV: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MV = "MV".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MV]
    
    @scala.inline
    def MW: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MW = "MW".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MW]
    
    @scala.inline
    def MX: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MX = "MX".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MX]
    
    @scala.inline
    def MY: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MY = "MY".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MY]
    
    @scala.inline
    def MZ: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MZ = "MZ".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MZ]
    
    @scala.inline
    def NA: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NA = "NA".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NA]
    
    @scala.inline
    def NC: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NC = "NC".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NC]
    
    @scala.inline
    def NE: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NE = "NE".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NE]
    
    @scala.inline
    def NF: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NF = "NF".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NF]
    
    @scala.inline
    def NG: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NG = "NG".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NG]
    
    @scala.inline
    def NI: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NI = "NI".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NI]
    
    @scala.inline
    def NL: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NL = "NL".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NL]
    
    @scala.inline
    def NO: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NO = "NO".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NO]
    
    @scala.inline
    def NP: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NP = "NP".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NP]
    
    @scala.inline
    def NR: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NR = "NR".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NR]
    
    @scala.inline
    def NU: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NU = "NU".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NU]
    
    @scala.inline
    def NZ: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NZ = "NZ".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NZ]
    
    @scala.inline
    def OM: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OM = "OM".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OM]
    
    @scala.inline
    def PA: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PA = "PA".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PA]
    
    @scala.inline
    def PE: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PE = "PE".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PE]
    
    @scala.inline
    def PF: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PF = "PF".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PF]
    
    @scala.inline
    def PG: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PG = "PG".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PG]
    
    @scala.inline
    def PH: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PH = "PH".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PH]
    
    @scala.inline
    def PK: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PK = "PK".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PK]
    
    @scala.inline
    def PL: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PL = "PL".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PL]
    
    @scala.inline
    def PM: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PM = "PM".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PM]
    
    @scala.inline
    def PN: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PN = "PN".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PN]
    
    @scala.inline
    def PR: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PR = "PR".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PR]
    
    @scala.inline
    def PS: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PS = "PS".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PS]
    
    @scala.inline
    def PT: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PT = "PT".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PT]
    
    @scala.inline
    def PW: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PW = "PW".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PW]
    
    @scala.inline
    def PY: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PY = "PY".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PY]
    
    @scala.inline
    def QA: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.QA = "QA".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.QA]
    
    @scala.inline
    def RE: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RE = "RE".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RE]
    
    @scala.inline
    def RO: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RO = "RO".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RO]
    
    @scala.inline
    def RS: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RS = "RS".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RS]
    
    @scala.inline
    def RU: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RU = "RU".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RU]
    
    @scala.inline
    def RW: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RW = "RW".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RW]
    
    @scala.inline
    def SA: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SA = "SA".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SA]
    
    @scala.inline
    def SB: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SB = "SB".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SB]
    
    @scala.inline
    def SC: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SC = "SC".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SC]
    
    @scala.inline
    def SD: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SD = "SD".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SD]
    
    @scala.inline
    def SE: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SE = "SE".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SE]
    
    @scala.inline
    def SG: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SG = "SG".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SG]
    
    @scala.inline
    def SH: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SH = "SH".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SH]
    
    @scala.inline
    def SI: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SI = "SI".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SI]
    
    @scala.inline
    def SJ: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SJ = "SJ".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SJ]
    
    @scala.inline
    def SK: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SK = "SK".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SK]
    
    @scala.inline
    def SL: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SL = "SL".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SL]
    
    @scala.inline
    def SM: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SM = "SM".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SM]
    
    @scala.inline
    def SN: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SN = "SN".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SN]
    
    @scala.inline
    def SO: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SO = "SO".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SO]
    
    @scala.inline
    def SR: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SR = "SR".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SR]
    
    @scala.inline
    def SS: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SS = "SS".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SS]
    
    @scala.inline
    def ST: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ST = "ST".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ST]
    
    @scala.inline
    def SV: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SV = "SV".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SV]
    
    @scala.inline
    def SX: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SX = "SX".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SX]
    
    @scala.inline
    def SY: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SY = "SY".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SY]
    
    @scala.inline
    def SZ: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SZ = "SZ".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SZ]
    
    @scala.inline
    def TC: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TC = "TC".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TC]
    
    @scala.inline
    def TD: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TD = "TD".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TD]
    
    @scala.inline
    def TF: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TF = "TF".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TF]
    
    @scala.inline
    def TG: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TG = "TG".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TG]
    
    @scala.inline
    def TH: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TH = "TH".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TH]
    
    @scala.inline
    def TJ: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TJ = "TJ".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TJ]
    
    @scala.inline
    def TK: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TK = "TK".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TK]
    
    @scala.inline
    def TL: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TL = "TL".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TL]
    
    @scala.inline
    def TM: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TM = "TM".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TM]
    
    @scala.inline
    def TN: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TN = "TN".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TN]
    
    @scala.inline
    def TO: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TO = "TO".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TO]
    
    @scala.inline
    def TR: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TR = "TR".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TR]
    
    @scala.inline
    def TT: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TT = "TT".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TT]
    
    @scala.inline
    def TV: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TV = "TV".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TV]
    
    @scala.inline
    def TW: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TW = "TW".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TW]
    
    @scala.inline
    def TZ: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TZ = "TZ".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TZ]
    
    @scala.inline
    def UA: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UA = "UA".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UA]
    
    @scala.inline
    def UG: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UG = "UG".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UG]
    
    @scala.inline
    def UM: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UM = "UM".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UM]
    
    @scala.inline
    def US: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.US = "US".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.US]
    
    @scala.inline
    def UY: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UY = "UY".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UY]
    
    @scala.inline
    def UZ: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UZ = "UZ".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UZ]
    
    @scala.inline
    def VA: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VA = "VA".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VA]
    
    @scala.inline
    def VC: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VC = "VC".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VC]
    
    @scala.inline
    def VE: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VE = "VE".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VE]
    
    @scala.inline
    def VG: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VG = "VG".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VG]
    
    @scala.inline
    def VI: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VI = "VI".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VI]
    
    @scala.inline
    def VN: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VN = "VN".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VN]
    
    @scala.inline
    def VU: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VU = "VU".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VU]
    
    @scala.inline
    def WF: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WF = "WF".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WF]
    
    @scala.inline
    def WS: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WS = "WS".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WS]
    
    @scala.inline
    def YE: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.YE = "YE".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.YE]
    
    @scala.inline
    def YT: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.YT = "YT".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.YT]
    
    @scala.inline
    def ZA: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ZA = "ZA".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ZA]
    
    @scala.inline
    def ZM: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ZM = "ZM".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ZM]
    
    @scala.inline
    def ZW: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ZW = "ZW".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ZW]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AED
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AFN
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ALL
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AMD
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ANG
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AOA
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ARS
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AUD
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AWG
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AZN
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BAM
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BBD
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BDT
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BGN
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BHD
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BIF
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BMD
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BND
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BOB
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BRL
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BSD
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BTN
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BWP
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BYN
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BZD
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CAD
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CDF
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CHF
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CLP
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CNY
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.COP
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CRC
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CUC
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CUP
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CVE
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CZK
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DJF
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DKK
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOP
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DZD
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EGP
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ERN
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ETB
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EUR
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FJD
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FKP
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GBP
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GEL
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GGP
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GHS
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GIP
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GMD
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GNF
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GTQ
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GYD
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HKD
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HNL
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HRK
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HTG
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HUF
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IDR
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ILS
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IMP
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INR
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IQD
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IRR
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ISK
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JEP
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JMD
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JOD
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JPY
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KES
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KGS
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KHR
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KMF
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KPW
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KRW
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KWD
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KYD
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KZT
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LAK
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LBP
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LKR
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LRD
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LSL
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LYD
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MAD
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MDL
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MGA
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MKD
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MMK
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MNT
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MOP
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MRU
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MUR
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MVR
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MWK
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MXN
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MYR
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MZN
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NAD
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NGN
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NIO
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NOK
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NPR
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NZD
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OMR
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAB
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PEN
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PGK
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PHP
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PKR
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PLN
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PYG
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.QAR
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RON
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RSD
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RUB
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RWF
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SAR
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SBD
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SCR
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SDG
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SEK
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SGD
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SHP
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SLL
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SOS
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SPL
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SRD
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.STN
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SVC
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SYP
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SZL
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.THB
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TJS
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TMT
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TND
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TOP
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRY
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TTD
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TVD
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TWD
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TZS
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UAH
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UGX
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.USD
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UYU
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UZS
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VEF
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VND
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VUV
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WST
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.XAF
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.XCD
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.XDR
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.XOF
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.XPF
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.YER
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ZAR
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ZMW
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ZWD
  */
  trait CurrencyISO extends StObject
  object CurrencyISO {
    
    @scala.inline
    def AED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AED = "AED".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AED]
    
    @scala.inline
    def AFN: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AFN = "AFN".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AFN]
    
    @scala.inline
    def ALL: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ALL = "ALL".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ALL]
    
    @scala.inline
    def AMD: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AMD = "AMD".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AMD]
    
    @scala.inline
    def ANG: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ANG = "ANG".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ANG]
    
    @scala.inline
    def AOA: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AOA = "AOA".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AOA]
    
    @scala.inline
    def ARS: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ARS = "ARS".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ARS]
    
    @scala.inline
    def AUD: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AUD = "AUD".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AUD]
    
    @scala.inline
    def AWG: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AWG = "AWG".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AWG]
    
    @scala.inline
    def AZN: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AZN = "AZN".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AZN]
    
    @scala.inline
    def BAM: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BAM = "BAM".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BAM]
    
    @scala.inline
    def BBD: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BBD = "BBD".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BBD]
    
    @scala.inline
    def BDT: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BDT = "BDT".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BDT]
    
    @scala.inline
    def BGN: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BGN = "BGN".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BGN]
    
    @scala.inline
    def BHD: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BHD = "BHD".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BHD]
    
    @scala.inline
    def BIF: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BIF = "BIF".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BIF]
    
    @scala.inline
    def BMD: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BMD = "BMD".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BMD]
    
    @scala.inline
    def BND: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BND = "BND".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BND]
    
    @scala.inline
    def BOB: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BOB = "BOB".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BOB]
    
    @scala.inline
    def BRL: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BRL = "BRL".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BRL]
    
    @scala.inline
    def BSD: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BSD = "BSD".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BSD]
    
    @scala.inline
    def BTN: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BTN = "BTN".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BTN]
    
    @scala.inline
    def BWP: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BWP = "BWP".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BWP]
    
    @scala.inline
    def BYN: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BYN = "BYN".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BYN]
    
    @scala.inline
    def BZD: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BZD = "BZD".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BZD]
    
    @scala.inline
    def CAD: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CAD = "CAD".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CAD]
    
    @scala.inline
    def CDF: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CDF = "CDF".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CDF]
    
    @scala.inline
    def CHF: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CHF = "CHF".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CHF]
    
    @scala.inline
    def CLP: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CLP = "CLP".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CLP]
    
    @scala.inline
    def CNY: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CNY = "CNY".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CNY]
    
    @scala.inline
    def COP: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.COP = "COP".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.COP]
    
    @scala.inline
    def CRC: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CRC = "CRC".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CRC]
    
    @scala.inline
    def CUC: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CUC = "CUC".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CUC]
    
    @scala.inline
    def CUP: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CUP = "CUP".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CUP]
    
    @scala.inline
    def CVE: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CVE = "CVE".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CVE]
    
    @scala.inline
    def CZK: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CZK = "CZK".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CZK]
    
    @scala.inline
    def DJF: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DJF = "DJF".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DJF]
    
    @scala.inline
    def DKK: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DKK = "DKK".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DKK]
    
    @scala.inline
    def DOP: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOP = "DOP".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOP]
    
    @scala.inline
    def DZD: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DZD = "DZD".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DZD]
    
    @scala.inline
    def EGP: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EGP = "EGP".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EGP]
    
    @scala.inline
    def ERN: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ERN = "ERN".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ERN]
    
    @scala.inline
    def ETB: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ETB = "ETB".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ETB]
    
    @scala.inline
    def EUR: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EUR = "EUR".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EUR]
    
    @scala.inline
    def FJD: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FJD = "FJD".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FJD]
    
    @scala.inline
    def FKP: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FKP = "FKP".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FKP]
    
    @scala.inline
    def GBP: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GBP = "GBP".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GBP]
    
    @scala.inline
    def GEL: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GEL = "GEL".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GEL]
    
    @scala.inline
    def GGP: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GGP = "GGP".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GGP]
    
    @scala.inline
    def GHS: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GHS = "GHS".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GHS]
    
    @scala.inline
    def GIP: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GIP = "GIP".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GIP]
    
    @scala.inline
    def GMD: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GMD = "GMD".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GMD]
    
    @scala.inline
    def GNF: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GNF = "GNF".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GNF]
    
    @scala.inline
    def GTQ: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GTQ = "GTQ".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GTQ]
    
    @scala.inline
    def GYD: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GYD = "GYD".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GYD]
    
    @scala.inline
    def HKD: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HKD = "HKD".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HKD]
    
    @scala.inline
    def HNL: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HNL = "HNL".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HNL]
    
    @scala.inline
    def HRK: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HRK = "HRK".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HRK]
    
    @scala.inline
    def HTG: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HTG = "HTG".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HTG]
    
    @scala.inline
    def HUF: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HUF = "HUF".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.HUF]
    
    @scala.inline
    def IDR: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IDR = "IDR".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IDR]
    
    @scala.inline
    def ILS: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ILS = "ILS".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ILS]
    
    @scala.inline
    def IMP: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IMP = "IMP".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IMP]
    
    @scala.inline
    def INR: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INR = "INR".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INR]
    
    @scala.inline
    def IQD: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IQD = "IQD".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IQD]
    
    @scala.inline
    def IRR: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IRR = "IRR".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IRR]
    
    @scala.inline
    def ISK: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ISK = "ISK".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ISK]
    
    @scala.inline
    def JEP: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JEP = "JEP".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JEP]
    
    @scala.inline
    def JMD: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JMD = "JMD".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JMD]
    
    @scala.inline
    def JOD: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JOD = "JOD".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JOD]
    
    @scala.inline
    def JPY: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JPY = "JPY".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.JPY]
    
    @scala.inline
    def KES: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KES = "KES".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KES]
    
    @scala.inline
    def KGS: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KGS = "KGS".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KGS]
    
    @scala.inline
    def KHR: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KHR = "KHR".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KHR]
    
    @scala.inline
    def KMF: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KMF = "KMF".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KMF]
    
    @scala.inline
    def KPW: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KPW = "KPW".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KPW]
    
    @scala.inline
    def KRW: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KRW = "KRW".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KRW]
    
    @scala.inline
    def KWD: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KWD = "KWD".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KWD]
    
    @scala.inline
    def KYD: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KYD = "KYD".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KYD]
    
    @scala.inline
    def KZT: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KZT = "KZT".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KZT]
    
    @scala.inline
    def LAK: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LAK = "LAK".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LAK]
    
    @scala.inline
    def LBP: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LBP = "LBP".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LBP]
    
    @scala.inline
    def LKR: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LKR = "LKR".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LKR]
    
    @scala.inline
    def LRD: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LRD = "LRD".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LRD]
    
    @scala.inline
    def LSL: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LSL = "LSL".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LSL]
    
    @scala.inline
    def LYD: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LYD = "LYD".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LYD]
    
    @scala.inline
    def MAD: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MAD = "MAD".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MAD]
    
    @scala.inline
    def MDL: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MDL = "MDL".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MDL]
    
    @scala.inline
    def MGA: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MGA = "MGA".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MGA]
    
    @scala.inline
    def MKD: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MKD = "MKD".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MKD]
    
    @scala.inline
    def MMK: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MMK = "MMK".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MMK]
    
    @scala.inline
    def MNT: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MNT = "MNT".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MNT]
    
    @scala.inline
    def MOP: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MOP = "MOP".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MOP]
    
    @scala.inline
    def MRU: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MRU = "MRU".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MRU]
    
    @scala.inline
    def MUR: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MUR = "MUR".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MUR]
    
    @scala.inline
    def MVR: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MVR = "MVR".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MVR]
    
    @scala.inline
    def MWK: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MWK = "MWK".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MWK]
    
    @scala.inline
    def MXN: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MXN = "MXN".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MXN]
    
    @scala.inline
    def MYR: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MYR = "MYR".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MYR]
    
    @scala.inline
    def MZN: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MZN = "MZN".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MZN]
    
    @scala.inline
    def NAD: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NAD = "NAD".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NAD]
    
    @scala.inline
    def NGN: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NGN = "NGN".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NGN]
    
    @scala.inline
    def NIO: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NIO = "NIO".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NIO]
    
    @scala.inline
    def NOK: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NOK = "NOK".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NOK]
    
    @scala.inline
    def NPR: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NPR = "NPR".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NPR]
    
    @scala.inline
    def NZD: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NZD = "NZD".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NZD]
    
    @scala.inline
    def OMR: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OMR = "OMR".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OMR]
    
    @scala.inline
    def PAB: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAB = "PAB".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAB]
    
    @scala.inline
    def PEN: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PEN = "PEN".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PEN]
    
    @scala.inline
    def PGK: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PGK = "PGK".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PGK]
    
    @scala.inline
    def PHP: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PHP = "PHP".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PHP]
    
    @scala.inline
    def PKR: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PKR = "PKR".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PKR]
    
    @scala.inline
    def PLN: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PLN = "PLN".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PLN]
    
    @scala.inline
    def PYG: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PYG = "PYG".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PYG]
    
    @scala.inline
    def QAR: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.QAR = "QAR".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.QAR]
    
    @scala.inline
    def RON: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RON = "RON".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RON]
    
    @scala.inline
    def RSD: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RSD = "RSD".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RSD]
    
    @scala.inline
    def RUB: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RUB = "RUB".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RUB]
    
    @scala.inline
    def RWF: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RWF = "RWF".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RWF]
    
    @scala.inline
    def SAR: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SAR = "SAR".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SAR]
    
    @scala.inline
    def SBD: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SBD = "SBD".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SBD]
    
    @scala.inline
    def SCR: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SCR = "SCR".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SCR]
    
    @scala.inline
    def SDG: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SDG = "SDG".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SDG]
    
    @scala.inline
    def SEK: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SEK = "SEK".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SEK]
    
    @scala.inline
    def SGD: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SGD = "SGD".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SGD]
    
    @scala.inline
    def SHP: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SHP = "SHP".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SHP]
    
    @scala.inline
    def SLL: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SLL = "SLL".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SLL]
    
    @scala.inline
    def SOS: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SOS = "SOS".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SOS]
    
    @scala.inline
    def SPL: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SPL = "SPL".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SPL]
    
    @scala.inline
    def SRD: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SRD = "SRD".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SRD]
    
    @scala.inline
    def STN: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.STN = "STN".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.STN]
    
    @scala.inline
    def SVC: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SVC = "SVC".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SVC]
    
    @scala.inline
    def SYP: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SYP = "SYP".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SYP]
    
    @scala.inline
    def SZL: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SZL = "SZL".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SZL]
    
    @scala.inline
    def THB: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.THB = "THB".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.THB]
    
    @scala.inline
    def TJS: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TJS = "TJS".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TJS]
    
    @scala.inline
    def TMT: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TMT = "TMT".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TMT]
    
    @scala.inline
    def TND: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TND = "TND".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TND]
    
    @scala.inline
    def TOP: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TOP = "TOP".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TOP]
    
    @scala.inline
    def TRY: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRY = "TRY".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRY]
    
    @scala.inline
    def TTD: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TTD = "TTD".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TTD]
    
    @scala.inline
    def TVD: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TVD = "TVD".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TVD]
    
    @scala.inline
    def TWD: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TWD = "TWD".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TWD]
    
    @scala.inline
    def TZS: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TZS = "TZS".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TZS]
    
    @scala.inline
    def UAH: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UAH = "UAH".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UAH]
    
    @scala.inline
    def UGX: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UGX = "UGX".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UGX]
    
    @scala.inline
    def USD: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.USD = "USD".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.USD]
    
    @scala.inline
    def UYU: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UYU = "UYU".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UYU]
    
    @scala.inline
    def UZS: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UZS = "UZS".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UZS]
    
    @scala.inline
    def VEF: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VEF = "VEF".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VEF]
    
    @scala.inline
    def VND: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VND = "VND".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VND]
    
    @scala.inline
    def VUV: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VUV = "VUV".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VUV]
    
    @scala.inline
    def WST: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WST = "WST".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WST]
    
    @scala.inline
    def XAF: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.XAF = "XAF".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.XAF]
    
    @scala.inline
    def XCD: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.XCD = "XCD".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.XCD]
    
    @scala.inline
    def XDR: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.XDR = "XDR".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.XDR]
    
    @scala.inline
    def XOF: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.XOF = "XOF".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.XOF]
    
    @scala.inline
    def XPF: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.XPF = "XPF".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.XPF]
    
    @scala.inline
    def YER: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.YER = "YER".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.YER]
    
    @scala.inline
    def ZAR: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ZAR = "ZAR".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ZAR]
    
    @scala.inline
    def ZMW: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ZMW = "ZMW".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ZMW]
    
    @scala.inline
    def ZWD: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ZWD = "ZWD".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ZWD]
  }
  
  type DeepPartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.DeepPartial<T[P]> * / object}
    */ typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DeepPartial & TopLevel[js.Any]
  
  type MakeKeysNullable[T1, T2 /* <: /* keyof T1 */ String */] = (Omit[T1, T2]) & typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MakeKeysNullable & TopLevel[T1]
  
  type MakeKeysOptional[T1, T2 /* <: /* keyof T1 */ String */] = (Omit[T1, T2]) & (Partial[Pick[T1, T2]])
  
  type MakeKeysRequired[T1, T2 /* <: /* keyof T1 */ String */] = (Omit[T1, T2]) & (Required[Pick[T1, T2]])
  
  type Omit[T, K /* <: /* keyof T */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  type OmitType[T /* <: Type */] = Omit[T, typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Type]
  
  type PickPartial[T, Par /* <: /* keyof T */ String */] = Pick[Partial[T], Par]
  
  type PickPartialRequired[T, Par /* <: /* keyof T */ String */, Req /* <: /* keyof T */ String */] = (Pick[Partial[T], Par]) & (Pick[Required[T], Req])
  
  type ValueOf[T] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
}
