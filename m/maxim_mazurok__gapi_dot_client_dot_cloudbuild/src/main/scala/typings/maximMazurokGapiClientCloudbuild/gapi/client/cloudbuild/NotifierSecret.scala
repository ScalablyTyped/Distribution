package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotifierSecret extends StObject {
  
  /** Name is the local name of the secret, such as the verbatim string "my-smtp-password". */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Value is interpreted to be a resource path for fetching the actual (versioned) secret data for this secret. For example, this would be a Google Cloud Secret Manager secret version
    * resource path like: "projects/my-project/secrets/my-secret/versions/latest".
    */
  var value: js.UndefOr[String] = js.native
}
object NotifierSecret {
  
  @scala.inline
  def apply(): NotifierSecret = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotifierSecret]
  }
  
  @scala.inline
  implicit class NotifierSecretMutableBuilder[Self <: NotifierSecret] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
