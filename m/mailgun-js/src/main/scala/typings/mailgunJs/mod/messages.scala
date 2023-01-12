package typings.mailgunJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mailgunJs.mailgunJsStrings.False
import typings.mailgunJs.mailgunJsStrings.True
import typings.mailgunJs.mailgunJsStrings.false_
import typings.mailgunJs.mailgunJsStrings.htmlonly
import typings.mailgunJs.mailgunJsStrings.no
import typings.mailgunJs.mailgunJsStrings.true_
import typings.mailgunJs.mailgunJsStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messages {
  
  trait BatchData
    extends StObject
       with SendData {
    
    var `recipient-variables`: js.UndefOr[String | BatchSendRecipientVars] = js.undefined
  }
  object BatchData {
    
    inline def apply(to: String | js.Array[String]): BatchData = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[BatchData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BatchData] (val x: Self) extends AnyVal {
      
      inline def `setRecipient-variables`(value: String | BatchSendRecipientVars): Self = StObject.set(x, "recipient-variables", value.asInstanceOf[js.Any])
      
      inline def `setRecipient-variablesUndefined`: Self = StObject.set(x, "recipient-variables", js.undefined)
    }
  }
  
  type BatchSendRecipientVars = StringDictionary[StringDictionary[Any]]
  
  trait SendData extends StObject {
    
    var `amp-html`: js.UndefOr[String] = js.undefined
    
    var attachment: js.UndefOr[AttachmentData | js.Array[AttachmentData]] = js.undefined
    
    var bcc: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var cc: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var from: js.UndefOr[String] = js.undefined
    
    @JSName("h:Importance")
    var hColonImportance: js.UndefOr[String] = js.undefined
    
    @JSName("h:In-Reply-To")
    var `hColonIn-Reply-To`: js.UndefOr[String] = js.undefined
    
    @JSName("h:References")
    var hColonReferences: js.UndefOr[String] = js.undefined
    
    // Standard email headers
    @JSName("h:Reply-To")
    var `hColonReply-To`: js.UndefOr[String] = js.undefined
    
    var html: js.UndefOr[String] = js.undefined
    
    var `inline`: js.UndefOr[AttachmentData | js.Array[AttachmentData]] = js.undefined
    
    @JSName("o:deliverytime")
    var oColondeliverytime: js.UndefOr[String] = js.undefined
    
    @JSName("o:dkim")
    var oColondkim: js.UndefOr[yes | no | Boolean] = js.undefined
    
    @JSName("o:require-tls")
    var `oColonrequire-tls`: js.UndefOr[yes | no | True | False] = js.undefined
    
    @JSName("o:skip-verification")
    var `oColonskip-verification`: js.UndefOr[yes | no | True | False] = js.undefined
    
    @JSName("o:tag")
    var oColontag: js.UndefOr[String | js.Array[String]] = js.undefined
    
    // Mailgun options
    @JSName("o:testmode")
    var oColontestmode: js.UndefOr[yes | no | true_ | false_ | True | False] = js.undefined
    
    @JSName("o:tracking")
    var oColontracking: js.UndefOr[yes | no | Boolean] = js.undefined
    
    @JSName("o:tracking-clicks")
    var `oColontracking-clicks`: js.UndefOr[yes | no | htmlonly | Boolean] = js.undefined
    
    @JSName("o:tracking-opens")
    var `oColontracking-opens`: js.UndefOr[yes | no | Boolean] = js.undefined
    
    var subject: js.UndefOr[String] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
    
    var to: String | js.Array[String]
  }
  object SendData {
    
    inline def apply(to: String | js.Array[String]): SendData = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[SendData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SendData] (val x: Self) extends AnyVal {
      
      inline def `setAmp-html`(value: String): Self = StObject.set(x, "amp-html", value.asInstanceOf[js.Any])
      
      inline def `setAmp-htmlUndefined`: Self = StObject.set(x, "amp-html", js.undefined)
      
      inline def setAttachment(value: AttachmentData | js.Array[AttachmentData]): Self = StObject.set(x, "attachment", value.asInstanceOf[js.Any])
      
      inline def setAttachmentUndefined: Self = StObject.set(x, "attachment", js.undefined)
      
      inline def setAttachmentVarargs(value: AttachmentData*): Self = StObject.set(x, "attachment", js.Array(value*))
      
      inline def setBcc(value: String | js.Array[String]): Self = StObject.set(x, "bcc", value.asInstanceOf[js.Any])
      
      inline def setBccUndefined: Self = StObject.set(x, "bcc", js.undefined)
      
      inline def setBccVarargs(value: String*): Self = StObject.set(x, "bcc", js.Array(value*))
      
      inline def setCc(value: String | js.Array[String]): Self = StObject.set(x, "cc", value.asInstanceOf[js.Any])
      
      inline def setCcUndefined: Self = StObject.set(x, "cc", js.undefined)
      
      inline def setCcVarargs(value: String*): Self = StObject.set(x, "cc", js.Array(value*))
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setHColonImportance(value: String): Self = StObject.set(x, "h:Importance", value.asInstanceOf[js.Any])
      
      inline def setHColonImportanceUndefined: Self = StObject.set(x, "h:Importance", js.undefined)
      
      inline def `setHColonIn-Reply-To`(value: String): Self = StObject.set(x, "h:In-Reply-To", value.asInstanceOf[js.Any])
      
      inline def `setHColonIn-Reply-ToUndefined`: Self = StObject.set(x, "h:In-Reply-To", js.undefined)
      
      inline def setHColonReferences(value: String): Self = StObject.set(x, "h:References", value.asInstanceOf[js.Any])
      
      inline def setHColonReferencesUndefined: Self = StObject.set(x, "h:References", js.undefined)
      
      inline def `setHColonReply-To`(value: String): Self = StObject.set(x, "h:Reply-To", value.asInstanceOf[js.Any])
      
      inline def `setHColonReply-ToUndefined`: Self = StObject.set(x, "h:Reply-To", js.undefined)
      
      inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      inline def setInline(value: AttachmentData | js.Array[AttachmentData]): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setInlineVarargs(value: AttachmentData*): Self = StObject.set(x, "inline", js.Array(value*))
      
      inline def setOColondeliverytime(value: String): Self = StObject.set(x, "o:deliverytime", value.asInstanceOf[js.Any])
      
      inline def setOColondeliverytimeUndefined: Self = StObject.set(x, "o:deliverytime", js.undefined)
      
      inline def setOColondkim(value: yes | no | Boolean): Self = StObject.set(x, "o:dkim", value.asInstanceOf[js.Any])
      
      inline def setOColondkimUndefined: Self = StObject.set(x, "o:dkim", js.undefined)
      
      inline def `setOColonrequire-tls`(value: yes | no | True | False): Self = StObject.set(x, "o:require-tls", value.asInstanceOf[js.Any])
      
      inline def `setOColonrequire-tlsUndefined`: Self = StObject.set(x, "o:require-tls", js.undefined)
      
      inline def `setOColonskip-verification`(value: yes | no | True | False): Self = StObject.set(x, "o:skip-verification", value.asInstanceOf[js.Any])
      
      inline def `setOColonskip-verificationUndefined`: Self = StObject.set(x, "o:skip-verification", js.undefined)
      
      inline def setOColontag(value: String | js.Array[String]): Self = StObject.set(x, "o:tag", value.asInstanceOf[js.Any])
      
      inline def setOColontagUndefined: Self = StObject.set(x, "o:tag", js.undefined)
      
      inline def setOColontagVarargs(value: String*): Self = StObject.set(x, "o:tag", js.Array(value*))
      
      inline def setOColontestmode(value: yes | no | true_ | false_ | True | False): Self = StObject.set(x, "o:testmode", value.asInstanceOf[js.Any])
      
      inline def setOColontestmodeUndefined: Self = StObject.set(x, "o:testmode", js.undefined)
      
      inline def setOColontracking(value: yes | no | Boolean): Self = StObject.set(x, "o:tracking", value.asInstanceOf[js.Any])
      
      inline def `setOColontracking-clicks`(value: yes | no | htmlonly | Boolean): Self = StObject.set(x, "o:tracking-clicks", value.asInstanceOf[js.Any])
      
      inline def `setOColontracking-clicksUndefined`: Self = StObject.set(x, "o:tracking-clicks", js.undefined)
      
      inline def `setOColontracking-opens`(value: yes | no | Boolean): Self = StObject.set(x, "o:tracking-opens", value.asInstanceOf[js.Any])
      
      inline def `setOColontracking-opensUndefined`: Self = StObject.set(x, "o:tracking-opens", js.undefined)
      
      inline def setOColontrackingUndefined: Self = StObject.set(x, "o:tracking", js.undefined)
      
      inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTo(value: String | js.Array[String]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToVarargs(value: String*): Self = StObject.set(x, "to", js.Array(value*))
    }
  }
  
  trait SendResponse extends StObject {
    
    var id: String
    
    var message: String
  }
  object SendResponse {
    
    inline def apply(id: String, message: String): SendResponse = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[SendResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SendResponse] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  trait SendTemplateData
    extends StObject
       with SendData
       with /* templateVariable */ StringDictionary[Any] {
    
    var template: String
  }
  object SendTemplateData {
    
    inline def apply(template: String, to: String | js.Array[String]): SendTemplateData = {
      val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[SendTemplateData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SendTemplateData] (val x: Self) extends AnyVal {
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    }
  }
}
