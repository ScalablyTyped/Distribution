package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotifierConfig extends StObject {
  
  /** The API version of this configuration format. */
  var apiVersion: js.UndefOr[String] = js.undefined
  
  /** The type of notifier to use (e.g. SMTPNotifier). */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Metadata for referring to/handling/deploying this notifier. */
  var metadata: js.UndefOr[NotifierMetadata] = js.undefined
  
  /** The actual configuration for this notifier. */
  var spec: js.UndefOr[NotifierSpec] = js.undefined
}
object NotifierConfig {
  
  inline def apply(): NotifierConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotifierConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotifierConfig] (val x: Self) extends AnyVal {
    
    inline def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMetadata(value: NotifierMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setSpec(value: NotifierSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
  }
}
