package typings.googleapis.gmailpostmastertoolsV1Mod.gmailpostmastertoolsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTrafficStats extends StObject {
  
  /**
    * Delivery errors for the domain. This metric only pertains to traffic that passed [SPF](http://www.openspf.org/) or [DKIM](http://www.dkim.org/).
    */
  var deliveryErrors: js.UndefOr[js.Array[SchemaDeliveryError]] = js.undefined
  
  /**
    * The ratio of mail that successfully authenticated with DKIM vs. all mail that attempted to authenticate with [DKIM](http://www.dkim.org/). Spoofed mail is excluded.
    */
  var dkimSuccessRatio: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The ratio of mail that passed [DMARC](https://dmarc.org/) alignment checks vs all mail received from the domain that successfully authenticated with either of [SPF](http://www.openspf.org/) or [DKIM](http://www.dkim.org/).
    */
  var dmarcSuccessRatio: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Reputation of the domain.
    */
  var domainReputation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ratio of incoming mail (to Gmail), that passed secure transport (TLS) vs all mail received from that domain. This metric only pertains to traffic that passed [SPF](http://www.openspf.org/) or [DKIM](http://www.dkim.org/).
    */
  var inboundEncryptionRatio: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Reputation information pertaining to the IP addresses of the email servers for the domain. There is exactly one entry for each reputation category except REPUTATION_CATEGORY_UNSPECIFIED.
    */
  var ipReputations: js.UndefOr[js.Array[SchemaIpReputation]] = js.undefined
  
  /**
    * The resource name of the traffic statistics. Traffic statistic names have the form `domains/{domain\}/trafficStats/{date\}`, where domain_name is the fully qualified domain name (i.e., mymail.mydomain.com) of the domain this traffic statistics pertains to and date is the date in yyyymmdd format that these statistics corresponds to. For example: domains/mymail.mydomain.com/trafficStats/20160807
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ratio of outgoing mail (from Gmail) that was accepted over secure transport (TLS).
    */
  var outboundEncryptionRatio: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Spammy [Feedback loop identifiers] (https://support.google.com/mail/answer/6254652) with their individual spam rates. This metric only pertains to traffic that is authenticated by [DKIM](http://www.dkim.org/).
    */
  var spammyFeedbackLoops: js.UndefOr[js.Array[SchemaFeedbackLoop]] = js.undefined
  
  /**
    * The ratio of mail that successfully authenticated with SPF vs. all mail that attempted to authenticate with [SPF](http://www.openspf.org/). Spoofed mail is excluded.
    */
  var spfSuccessRatio: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The ratio of user-report spam vs. email that was sent to the inbox. This metric only pertains to emails authenticated by [DKIM](http://www.dkim.org/).
    */
  var userReportedSpamRatio: js.UndefOr[Double | Null] = js.undefined
}
object SchemaTrafficStats {
  
  inline def apply(): SchemaTrafficStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTrafficStats]
  }
  
  extension [Self <: SchemaTrafficStats](x: Self) {
    
    inline def setDeliveryErrors(value: js.Array[SchemaDeliveryError]): Self = StObject.set(x, "deliveryErrors", value.asInstanceOf[js.Any])
    
    inline def setDeliveryErrorsUndefined: Self = StObject.set(x, "deliveryErrors", js.undefined)
    
    inline def setDeliveryErrorsVarargs(value: SchemaDeliveryError*): Self = StObject.set(x, "deliveryErrors", js.Array(value*))
    
    inline def setDkimSuccessRatio(value: Double): Self = StObject.set(x, "dkimSuccessRatio", value.asInstanceOf[js.Any])
    
    inline def setDkimSuccessRatioNull: Self = StObject.set(x, "dkimSuccessRatio", null)
    
    inline def setDkimSuccessRatioUndefined: Self = StObject.set(x, "dkimSuccessRatio", js.undefined)
    
    inline def setDmarcSuccessRatio(value: Double): Self = StObject.set(x, "dmarcSuccessRatio", value.asInstanceOf[js.Any])
    
    inline def setDmarcSuccessRatioNull: Self = StObject.set(x, "dmarcSuccessRatio", null)
    
    inline def setDmarcSuccessRatioUndefined: Self = StObject.set(x, "dmarcSuccessRatio", js.undefined)
    
    inline def setDomainReputation(value: String): Self = StObject.set(x, "domainReputation", value.asInstanceOf[js.Any])
    
    inline def setDomainReputationNull: Self = StObject.set(x, "domainReputation", null)
    
    inline def setDomainReputationUndefined: Self = StObject.set(x, "domainReputation", js.undefined)
    
    inline def setInboundEncryptionRatio(value: Double): Self = StObject.set(x, "inboundEncryptionRatio", value.asInstanceOf[js.Any])
    
    inline def setInboundEncryptionRatioNull: Self = StObject.set(x, "inboundEncryptionRatio", null)
    
    inline def setInboundEncryptionRatioUndefined: Self = StObject.set(x, "inboundEncryptionRatio", js.undefined)
    
    inline def setIpReputations(value: js.Array[SchemaIpReputation]): Self = StObject.set(x, "ipReputations", value.asInstanceOf[js.Any])
    
    inline def setIpReputationsUndefined: Self = StObject.set(x, "ipReputations", js.undefined)
    
    inline def setIpReputationsVarargs(value: SchemaIpReputation*): Self = StObject.set(x, "ipReputations", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOutboundEncryptionRatio(value: Double): Self = StObject.set(x, "outboundEncryptionRatio", value.asInstanceOf[js.Any])
    
    inline def setOutboundEncryptionRatioNull: Self = StObject.set(x, "outboundEncryptionRatio", null)
    
    inline def setOutboundEncryptionRatioUndefined: Self = StObject.set(x, "outboundEncryptionRatio", js.undefined)
    
    inline def setSpammyFeedbackLoops(value: js.Array[SchemaFeedbackLoop]): Self = StObject.set(x, "spammyFeedbackLoops", value.asInstanceOf[js.Any])
    
    inline def setSpammyFeedbackLoopsUndefined: Self = StObject.set(x, "spammyFeedbackLoops", js.undefined)
    
    inline def setSpammyFeedbackLoopsVarargs(value: SchemaFeedbackLoop*): Self = StObject.set(x, "spammyFeedbackLoops", js.Array(value*))
    
    inline def setSpfSuccessRatio(value: Double): Self = StObject.set(x, "spfSuccessRatio", value.asInstanceOf[js.Any])
    
    inline def setSpfSuccessRatioNull: Self = StObject.set(x, "spfSuccessRatio", null)
    
    inline def setSpfSuccessRatioUndefined: Self = StObject.set(x, "spfSuccessRatio", js.undefined)
    
    inline def setUserReportedSpamRatio(value: Double): Self = StObject.set(x, "userReportedSpamRatio", value.asInstanceOf[js.Any])
    
    inline def setUserReportedSpamRatioNull: Self = StObject.set(x, "userReportedSpamRatio", null)
    
    inline def setUserReportedSpamRatioUndefined: Self = StObject.set(x, "userReportedSpamRatio", js.undefined)
  }
}
