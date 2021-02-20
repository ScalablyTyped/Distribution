package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotifierConfig extends StObject {
  
  /** The API version of this configuration format. */
  var apiVersion: js.UndefOr[String] = js.native
  
  /** The type of notifier to use (e.g. SMTPNotifier). */
  var kind: js.UndefOr[String] = js.native
  
  /** Metadata for referring to/handling/deploying this notifier. */
  var metadata: js.UndefOr[NotifierMetadata] = js.native
  
  /** The actual configuration for this notifier. */
  var spec: js.UndefOr[NotifierSpec] = js.native
}
object NotifierConfig {
  
  @scala.inline
  def apply(): NotifierConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotifierConfig]
  }
  
  @scala.inline
  implicit class NotifierConfigMutableBuilder[Self <: NotifierConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMetadata(value: NotifierMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setSpec(value: NotifierSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
  }
}
