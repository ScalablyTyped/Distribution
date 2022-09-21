package typings.hellosignSdk

import typings.hellosignSdk.mod.HellosignEvents
import typings.hellosignSdk.mod._Field
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hellosignSdkStrings {
  
  @js.native
  sealed trait `DD - MM - YYYY` extends StObject
  inline def `DD - MM - YYYY`: `DD - MM - YYYY` = ("DD - MM - YYYY").asInstanceOf[`DD - MM - YYYY`]
  
  @js.native
  sealed trait `DD Slash MM Slash YYYY` extends StObject
  inline def `DD Slash MM Slash YYYY`: `DD Slash MM Slash YYYY` = ("DD / MM / YYYY").asInstanceOf[`DD Slash MM Slash YYYY`]
  
  @js.native
  sealed trait `MM - DD - YYYY` extends StObject
  inline def `MM - DD - YYYY`: `MM - DD - YYYY` = ("MM - DD - YYYY").asInstanceOf[`MM - DD - YYYY`]
  
  @js.native
  sealed trait `MM Slash DD Slash YYYY` extends StObject
  inline def `MM Slash DD Slash YYYY`: `MM Slash DD Slash YYYY` = ("MM / DD / YYYY").asInstanceOf[`MM Slash DD Slash YYYY`]
  
  @js.native
  sealed trait `YYYY - MM - DD` extends StObject
  inline def `YYYY - MM - DD`: `YYYY - MM - DD` = ("YYYY - MM - DD").asInstanceOf[`YYYY - MM - DD`]
  
  @js.native
  sealed trait `YYYY Slash MM Slash DD` extends StObject
  inline def `YYYY Slash MM Slash DD`: `YYYY Slash MM Slash DD` = ("YYYY / MM / DD").asInstanceOf[`YYYY Slash MM Slash DD`]
  
  @js.native
  sealed trait account_confirmed
    extends StObject
       with HellosignEvents
  inline def account_confirmed: account_confirmed = "account_confirmed".asInstanceOf[account_confirmed]
  
  @js.native
  sealed trait awaiting_signature extends StObject
  inline def awaiting_signature: awaiting_signature = "awaiting_signature".asInstanceOf[awaiting_signature]
  
  @js.native
  sealed trait bank_account_number extends StObject
  inline def bank_account_number: bank_account_number = "bank_account_number".asInstanceOf[bank_account_number]
  
  @js.native
  sealed trait bank_routing_number extends StObject
  inline def bank_routing_number: bank_routing_number = "bank_routing_number".asInstanceOf[bank_routing_number]
  
  @js.native
  sealed trait callback_test
    extends StObject
       with HellosignEvents
  inline def callback_test: callback_test = "callback_test".asInstanceOf[callback_test]
  
  @js.native
  sealed trait checkbox
    extends StObject
       with _Field
  inline def checkbox: checkbox = "checkbox".asInstanceOf[checkbox]
  
  @js.native
  sealed trait `checkbox-merge`
    extends StObject
       with _Field
  inline def `checkbox-merge`: `checkbox-merge` = "checkbox-merge".asInstanceOf[`checkbox-merge`]
  
  @js.native
  sealed trait custom_regex extends StObject
  inline def custom_regex: custom_regex = "custom_regex".asInstanceOf[custom_regex]
  
  @js.native
  sealed trait date_signed
    extends StObject
       with _Field
  inline def date_signed: date_signed = "date_signed".asInstanceOf[date_signed]
  
  @js.native
  sealed trait declined extends StObject
  inline def declined: declined = "declined".asInstanceOf[declined]
  
  @js.native
  sealed trait dropdown
    extends StObject
       with _Field
  inline def dropdown: dropdown = "dropdown".asInstanceOf[dropdown]
  
  @js.native
  sealed trait email_address extends StObject
  inline def email_address: email_address = "email_address".asInstanceOf[email_address]
  
  @js.native
  sealed trait employer_identification_number extends StObject
  inline def employer_identification_number: employer_identification_number = "employer_identification_number".asInstanceOf[employer_identification_number]
  
  @js.native
  sealed trait file_error
    extends StObject
       with HellosignEvents
  inline def file_error: file_error = "file_error".asInstanceOf[file_error]
  
  @js.native
  sealed trait initials
    extends StObject
       with _Field
  inline def initials: initials = "initials".asInstanceOf[initials]
  
  @js.native
  sealed trait letters_only extends StObject
  inline def letters_only: letters_only = "letters_only".asInstanceOf[letters_only]
  
  @js.native
  sealed trait numbers_only extends StObject
  inline def numbers_only: numbers_only = "numbers_only".asInstanceOf[numbers_only]
  
  @js.native
  sealed trait pdf extends StObject
  inline def pdf: pdf = "pdf".asInstanceOf[pdf]
  
  @js.native
  sealed trait phone_number extends StObject
  inline def phone_number: phone_number = "phone_number".asInstanceOf[phone_number]
  
  @js.native
  sealed trait radio
    extends StObject
       with _Field
  inline def radio: radio = "radio".asInstanceOf[radio]
  
  @js.native
  sealed trait sign_url_invalid
    extends StObject
       with HellosignEvents
  inline def sign_url_invalid: sign_url_invalid = "sign_url_invalid".asInstanceOf[sign_url_invalid]
  
  @js.native
  sealed trait signature
    extends StObject
       with _Field
  inline def signature: signature = "signature".asInstanceOf[signature]
  
  @js.native
  sealed trait signature_request_all_signed
    extends StObject
       with HellosignEvents
  inline def signature_request_all_signed: signature_request_all_signed = "signature_request_all_signed".asInstanceOf[signature_request_all_signed]
  
  @js.native
  sealed trait signature_request_canceled
    extends StObject
       with HellosignEvents
  inline def signature_request_canceled: signature_request_canceled = "signature_request_canceled".asInstanceOf[signature_request_canceled]
  
  @js.native
  sealed trait signature_request_declined
    extends StObject
       with HellosignEvents
  inline def signature_request_declined: signature_request_declined = "signature_request_declined".asInstanceOf[signature_request_declined]
  
  @js.native
  sealed trait signature_request_downloadable
    extends StObject
       with HellosignEvents
  inline def signature_request_downloadable: signature_request_downloadable = "signature_request_downloadable".asInstanceOf[signature_request_downloadable]
  
  @js.native
  sealed trait signature_request_email_bounce
    extends StObject
       with HellosignEvents
  inline def signature_request_email_bounce: signature_request_email_bounce = "signature_request_email_bounce".asInstanceOf[signature_request_email_bounce]
  
  @js.native
  sealed trait signature_request_invalid
    extends StObject
       with HellosignEvents
  inline def signature_request_invalid: signature_request_invalid = "signature_request_invalid".asInstanceOf[signature_request_invalid]
  
  @js.native
  sealed trait signature_request_prepared
    extends StObject
       with HellosignEvents
  inline def signature_request_prepared: signature_request_prepared = "signature_request_prepared".asInstanceOf[signature_request_prepared]
  
  @js.native
  sealed trait signature_request_reassigned
    extends StObject
       with HellosignEvents
  inline def signature_request_reassigned: signature_request_reassigned = "signature_request_reassigned".asInstanceOf[signature_request_reassigned]
  
  @js.native
  sealed trait signature_request_remind
    extends StObject
       with HellosignEvents
  inline def signature_request_remind: signature_request_remind = "signature_request_remind".asInstanceOf[signature_request_remind]
  
  @js.native
  sealed trait signature_request_sent
    extends StObject
       with HellosignEvents
  inline def signature_request_sent: signature_request_sent = "signature_request_sent".asInstanceOf[signature_request_sent]
  
  @js.native
  sealed trait signature_request_signed
    extends StObject
       with HellosignEvents
  inline def signature_request_signed: signature_request_signed = "signature_request_signed".asInstanceOf[signature_request_signed]
  
  @js.native
  sealed trait signature_request_viewed
    extends StObject
       with HellosignEvents
  inline def signature_request_viewed: signature_request_viewed = "signature_request_viewed".asInstanceOf[signature_request_viewed]
  
  @js.native
  sealed trait signed extends StObject
  inline def signed: signed = "signed".asInstanceOf[signed]
  
  @js.native
  sealed trait social_security_number extends StObject
  inline def social_security_number: social_security_number = "social_security_number".asInstanceOf[social_security_number]
  
  @js.native
  sealed trait template_created
    extends StObject
       with HellosignEvents
  inline def template_created: template_created = "template_created".asInstanceOf[template_created]
  
  @js.native
  sealed trait template_error
    extends StObject
       with HellosignEvents
  inline def template_error: template_error = "template_error".asInstanceOf[template_error]
  
  @js.native
  sealed trait text
    extends StObject
       with _Field
  inline def text: text = "text".asInstanceOf[text]
  
  @js.native
  sealed trait `text-merge`
    extends StObject
       with _Field
  inline def `text-merge`: `text-merge` = "text-merge".asInstanceOf[`text-merge`]
  
  @js.native
  sealed trait unknown_error
    extends StObject
       with HellosignEvents
  inline def unknown_error: unknown_error = "unknown_error".asInstanceOf[unknown_error]
  
  @js.native
  sealed trait zip extends StObject
  inline def zip: zip = "zip".asInstanceOf[zip]
  
  @js.native
  sealed trait zip_code extends StObject
  inline def zip_code: zip_code = "zip_code".asInstanceOf[zip_code]
}
