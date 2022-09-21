package typings.mailchimpMailchimpTransactional

import typings.mailchimpMailchimpTransactional.mod.ExportsJobState
import typings.mailchimpMailchimpTransactional.mod.ExportsJobType
import typings.mailchimpMailchimpTransactional.mod.ExportsMessageState
import typings.mailchimpMailchimpTransactional.mod.MessageRecipientType
import typings.mailchimpMailchimpTransactional.mod.MetadataState
import typings.mailchimpMailchimpTransactional.mod.OutputFormat
import typings.mailchimpMailchimpTransactional.mod.RejectReason
import typings.mailchimpMailchimpTransactional.mod.RejectsRejectReason
import typings.mailchimpMailchimpTransactional.mod.SendingStatus
import typings.mailchimpMailchimpTransactional.mod.SubaccountsStatus
import typings.mailchimpMailchimpTransactional.mod.WebhookEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mailchimpMailchimpTransactionalStrings {
  
  @js.native
  sealed trait PONGExclamationmark extends StObject
  inline def PONGExclamationmark: PONGExclamationmark = "PONG!".asInstanceOf[PONGExclamationmark]
  
  @js.native
  sealed trait active
    extends StObject
       with MetadataState
       with SubaccountsStatus
  inline def active: active = "active".asInstanceOf[active]
  
  @js.native
  sealed trait activity
    extends StObject
       with ExportsJobType
  inline def activity: activity = "activity".asInstanceOf[activity]
  
  @js.native
  sealed trait allowlist
    extends StObject
       with ExportsJobType
  inline def allowlist: allowlist = "allowlist".asInstanceOf[allowlist]
  
  @js.native
  sealed trait already_verified extends StObject
  inline def already_verified: already_verified = "already_verified".asInstanceOf[already_verified]
  
  @js.native
  sealed trait bcc
    extends StObject
       with MessageRecipientType
  inline def bcc: bcc = "bcc".asInstanceOf[bcc]
  
  @js.native
  sealed trait blacklist
    extends StObject
       with WebhookEvent
  inline def blacklist: blacklist = "blacklist".asInstanceOf[blacklist]
  
  @js.native
  sealed trait bounced
    extends StObject
       with ExportsMessageState
  inline def bounced: bounced = "bounced".asInstanceOf[bounced]
  
  @js.native
  sealed trait cc
    extends StObject
       with MessageRecipientType
  inline def cc: cc = "cc".asInstanceOf[cc]
  
  @js.native
  sealed trait click
    extends StObject
       with WebhookEvent
  inline def click: click = "click".asInstanceOf[click]
  
  @js.native
  sealed trait complete
    extends StObject
       with ExportsJobState
  inline def complete: complete = "complete".asInstanceOf[complete]
  
  @js.native
  sealed trait custom
    extends StObject
       with RejectReason
       with RejectsRejectReason
  inline def custom: custom = "custom".asInstanceOf[custom]
  
  @js.native
  sealed trait delete
    extends StObject
       with MetadataState
  inline def delete: delete = "delete".asInstanceOf[delete]
  
  @js.native
  sealed trait error
    extends StObject
       with ExportsJobState
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait expired
    extends StObject
       with ExportsJobState
  inline def expired: expired = "expired".asInstanceOf[expired]
  
  @js.native
  sealed trait handlebars extends StObject
  inline def handlebars: handlebars = "handlebars".asInstanceOf[handlebars]
  
  @js.native
  sealed trait `hard-bounce`
    extends StObject
       with RejectReason
       with RejectsRejectReason
  inline def `hard-bounce`: `hard-bounce` = "hard-bounce".asInstanceOf[`hard-bounce`]
  
  @js.native
  sealed trait hard_bounce
    extends StObject
       with WebhookEvent
  inline def hard_bounce: hard_bounce = "hard_bounce".asInstanceOf[hard_bounce]
  
  @js.native
  sealed trait index
    extends StObject
       with MetadataState
  inline def index: index = "index".asInstanceOf[index]
  
  @js.native
  sealed trait invalid
    extends StObject
       with RejectReason
       with SendingStatus
  inline def invalid: invalid = "invalid".asInstanceOf[invalid]
  
  @js.native
  sealed trait `invalid-sender`
    extends StObject
       with RejectReason
  inline def `invalid-sender`: `invalid-sender` = "invalid-sender".asInstanceOf[`invalid-sender`]
  
  @js.native
  sealed trait json
    extends StObject
       with OutputFormat
  inline def json: json = "json".asInstanceOf[json]
  
  @js.native
  sealed trait mailchimp extends StObject
  inline def mailchimp: mailchimp = "mailchimp".asInstanceOf[mailchimp]
  
  @js.native
  sealed trait open
    extends StObject
       with WebhookEvent
  inline def open: open = "open".asInstanceOf[open]
  
  @js.native
  sealed trait paused
    extends StObject
       with SubaccountsStatus
  inline def paused: paused = "paused".asInstanceOf[paused]
  
  @js.native
  sealed trait php
    extends StObject
       with OutputFormat
  inline def php: php = "php".asInstanceOf[php]
  
  @js.native
  sealed trait queued
    extends StObject
       with SendingStatus
  inline def queued: queued = "queued".asInstanceOf[queued]
  
  @js.native
  sealed trait reject
    extends StObject
       with ExportsJobType
       with WebhookEvent
  inline def reject: reject = "reject".asInstanceOf[reject]
  
  @js.native
  sealed trait rejected
    extends StObject
       with ExportsMessageState
       with SendingStatus
  inline def rejected: rejected = "rejected".asInstanceOf[rejected]
  
  @js.native
  sealed trait rule
    extends StObject
       with RejectReason
  inline def rule: rule = "rule".asInstanceOf[rule]
  
  @js.native
  sealed trait scheduled
    extends StObject
       with SendingStatus
  inline def scheduled: scheduled = "scheduled".asInstanceOf[scheduled]
  
  @js.native
  sealed trait send
    extends StObject
       with WebhookEvent
  inline def send: send = "send".asInstanceOf[send]
  
  @js.native
  sealed trait sent
    extends StObject
       with ExportsMessageState
       with SendingStatus
  inline def sent: sent = "sent".asInstanceOf[sent]
  
  @js.native
  sealed trait `soft-bounce`
    extends StObject
       with RejectReason
       with RejectsRejectReason
  inline def `soft-bounce`: `soft-bounce` = "soft-bounce".asInstanceOf[`soft-bounce`]
  
  @js.native
  sealed trait `soft-bounced`
    extends StObject
       with ExportsMessageState
  inline def `soft-bounced`: `soft-bounced` = "soft-bounced".asInstanceOf[`soft-bounced`]
  
  @js.native
  sealed trait soft_bounce
    extends StObject
       with WebhookEvent
  inline def soft_bounce: soft_bounce = "soft_bounce".asInstanceOf[soft_bounce]
  
  @js.native
  sealed trait spam
    extends StObject
       with ExportsMessageState
       with RejectReason
       with RejectsRejectReason
       with WebhookEvent
  inline def spam: spam = "spam".asInstanceOf[spam]
  
  @js.native
  sealed trait `test-mode-limit`
    extends StObject
       with RejectReason
  inline def `test-mode-limit`: `test-mode-limit` = "test-mode-limit".asInstanceOf[`test-mode-limit`]
  
  @js.native
  sealed trait to
    extends StObject
       with MessageRecipientType
  inline def to: to = "to".asInstanceOf[to]
  
  @js.native
  sealed trait unsigned
    extends StObject
       with RejectReason
  inline def unsigned: unsigned = "unsigned".asInstanceOf[unsigned]
  
  @js.native
  sealed trait unsub
    extends StObject
       with ExportsMessageState
       with RejectReason
       with RejectsRejectReason
       with WebhookEvent
  inline def unsub: unsub = "unsub".asInstanceOf[unsub]
  
  @js.native
  sealed trait waiting
    extends StObject
       with ExportsJobState
  inline def waiting: waiting = "waiting".asInstanceOf[waiting]
  
  @js.native
  sealed trait whitelist
    extends StObject
       with WebhookEvent
  inline def whitelist: whitelist = "whitelist".asInstanceOf[whitelist]
  
  @js.native
  sealed trait working
    extends StObject
       with ExportsJobState
  inline def working: working = "working".asInstanceOf[working]
  
  @js.native
  sealed trait xml
    extends StObject
       with OutputFormat
  inline def xml: xml = "xml".asInstanceOf[xml]
  
  @js.native
  sealed trait yaml
    extends StObject
       with OutputFormat
  inline def yaml: yaml = "yaml".asInstanceOf[yaml]
}
