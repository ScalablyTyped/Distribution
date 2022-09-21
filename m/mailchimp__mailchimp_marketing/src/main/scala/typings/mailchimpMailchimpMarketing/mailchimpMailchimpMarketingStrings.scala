package typings.mailchimpMailchimpMarketing

import typings.mailchimpMailchimpMarketing.mod.HttpMethod
import typings.mailchimpMailchimpMarketing.mod.Status
import typings.mailchimpMailchimpMarketing.mod.StatusTag
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
       with StatusTag
  inline def active: active = "active".asInstanceOf[active]
  
  @js.native
  sealed trait cleaned
    extends StObject
       with Status
  inline def cleaned: cleaned = "cleaned".asInstanceOf[cleaned]
  
  @js.native
  sealed trait inactive
    extends StObject
       with StatusTag
  inline def inactive: inactive = "inactive".asInstanceOf[inactive]
  
  @js.native
  sealed trait pending
    extends StObject
       with Status
  inline def pending: pending = "pending".asInstanceOf[pending]
  
  @js.native
  sealed trait subscribed
    extends StObject
       with Status
  inline def subscribed: subscribed = "subscribed".asInstanceOf[subscribed]
  
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
}
