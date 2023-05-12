package typings.mailchimpMailchimpMarketing

import typings.mailchimpMailchimpMarketing.mod.HttpMethod
import typings.mailchimpMailchimpMarketing.mod.MergeFieldType
import typings.mailchimpMailchimpMarketing.mod.Status
import typings.mailchimpMailchimpMarketing.mod.lists.EmailType
import typings.mailchimpMailchimpMarketing.mod.lists.ListStatusTag
import typings.mailchimpMailchimpMarketing.mod.lists.ListVisibility
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mailchimpMailchimpMarketingStrings {
  
  @js.native
  sealed trait DELETE
    extends StObject
       with HttpMethod
  inline def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  
  @js.native
  sealed trait GET
    extends StObject
       with HttpMethod
  inline def GET: GET = "GET".asInstanceOf[GET]
  
  @js.native
  sealed trait HEAD
    extends StObject
       with HttpMethod
  inline def HEAD: HEAD = "HEAD".asInstanceOf[HEAD]
  
  @js.native
  sealed trait OPTIONS
    extends StObject
       with HttpMethod
  inline def OPTIONS: OPTIONS = "OPTIONS".asInstanceOf[OPTIONS]
  
  @js.native
  sealed trait PATCH
    extends StObject
       with HttpMethod
  inline def PATCH: PATCH = "PATCH".asInstanceOf[PATCH]
  
  @js.native
  sealed trait POST
    extends StObject
       with HttpMethod
  inline def POST: POST = "POST".asInstanceOf[POST]
  
  @js.native
  sealed trait PUT
    extends StObject
       with HttpMethod
  inline def PUT: PUT = "PUT".asInstanceOf[PUT]
  
  @js.native
  sealed trait active
    extends StObject
       with ListStatusTag
  inline def active: active = "active".asInstanceOf[active]
  
  @js.native
  sealed trait address
    extends StObject
       with MergeFieldType
  inline def address: address = "address".asInstanceOf[address]
  
  @js.native
  sealed trait birthday
    extends StObject
       with MergeFieldType
  inline def birthday: birthday = "birthday".asInstanceOf[birthday]
  
  @js.native
  sealed trait cleaned
    extends StObject
       with Status
  inline def cleaned: cleaned = "cleaned".asInstanceOf[cleaned]
  
  @js.native
  sealed trait date
    extends StObject
       with MergeFieldType
  inline def date: date = "date".asInstanceOf[date]
  
  @js.native
  sealed trait dropdown
    extends StObject
       with MergeFieldType
  inline def dropdown: dropdown = "dropdown".asInstanceOf[dropdown]
  
  @js.native
  sealed trait html
    extends StObject
       with EmailType
  inline def html: html = "html".asInstanceOf[html]
  
  @js.native
  sealed trait imageurl
    extends StObject
       with MergeFieldType
  inline def imageurl: imageurl = "imageurl".asInstanceOf[imageurl]
  
  @js.native
  sealed trait inactive
    extends StObject
       with ListStatusTag
  inline def inactive: inactive = "inactive".asInstanceOf[inactive]
  
  @js.native
  sealed trait number
    extends StObject
       with MergeFieldType
  inline def number: number = "number".asInstanceOf[number]
  
  @js.native
  sealed trait pending
    extends StObject
       with Status
  inline def pending: pending = "pending".asInstanceOf[pending]
  
  @js.native
  sealed trait phone
    extends StObject
       with MergeFieldType
  inline def phone: phone = "phone".asInstanceOf[phone]
  
  @js.native
  sealed trait prv
    extends StObject
       with ListVisibility
  inline def prv: prv = "prv".asInstanceOf[prv]
  
  @js.native
  sealed trait pub
    extends StObject
       with ListVisibility
  inline def pub: pub = "pub".asInstanceOf[pub]
  
  @js.native
  sealed trait radio
    extends StObject
       with MergeFieldType
  inline def radio: radio = "radio".asInstanceOf[radio]
  
  @js.native
  sealed trait subscribed
    extends StObject
       with Status
  inline def subscribed: subscribed = "subscribed".asInstanceOf[subscribed]
  
  @js.native
  sealed trait text
    extends StObject
       with EmailType
       with MergeFieldType
  inline def text: text = "text".asInstanceOf[text]
  
  @js.native
  sealed trait transactional
    extends StObject
       with Status
  inline def transactional: transactional = "transactional".asInstanceOf[transactional]
  
  @js.native
  sealed trait unsubscribed
    extends StObject
       with Status
  inline def unsubscribed: unsubscribed = "unsubscribed".asInstanceOf[unsubscribed]
  
  @js.native
  sealed trait url
    extends StObject
       with MergeFieldType
  inline def url: url = "url".asInstanceOf[url]
  
  @js.native
  sealed trait zip
    extends StObject
       with MergeFieldType
  inline def zip: zip = "zip".asInstanceOf[zip]
}
