package typings.googleapis.sourcerepoV1Mod.sourcerepoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration to publish a Cloud Pub/Sub message.
  */
@js.native
trait SchemaPubsubConfig extends StObject {
  
  /**
    * The format of the Cloud Pub/Sub messages.
    */
  var messageFormat: js.UndefOr[String] = js.native
  
  /**
    * Email address of the service account used for publishing Cloud Pub/Sub
    * messages. This service account needs to be in the same project as the
    * PubsubConfig. When added, the caller needs to have
    * iam.serviceAccounts.actAs permission on this service account. If
    * unspecified, it defaults to the compute engine default service account.
    */
  var serviceAccountEmail: js.UndefOr[String] = js.native
  
  /**
    * A topic of Cloud Pub/Sub. Values are of the form
    * `projects/&lt;project&gt;/topics/&lt;topic&gt;`. The project needs to be
    * the same project as this config is in.
    */
  var topic: js.UndefOr[String] = js.native
}
object SchemaPubsubConfig {
  
  @scala.inline
  def apply(): SchemaPubsubConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPubsubConfig]
  }
  
  @scala.inline
  implicit class SchemaPubsubConfigMutableBuilder[Self <: SchemaPubsubConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessageFormat(value: String): Self = StObject.set(x, "messageFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageFormatUndefined: Self = StObject.set(x, "messageFormat", js.undefined)
    
    @scala.inline
    def setServiceAccountEmail(value: String): Self = StObject.set(x, "serviceAccountEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceAccountEmailUndefined: Self = StObject.set(x, "serviceAccountEmail", js.undefined)
    
    @scala.inline
    def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
