package typings.googleapis.cloudshellV1alpha1Mod.cloudshellV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A public SSH key, corresponding to a private SSH key held by the client.
  */
trait SchemaPublicKey extends StObject {
  
  /**
    * Required. Format of this key&#39;s content.
    */
  var format: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Content of this key.
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Full name of this resource, in the format
    * `users/{owner_email}/environments/{environment_id}/publicKeys/{key_id}`.
    * `{owner_email}` is the email address of the user to whom the key belongs.
    * `{environment_id}` is the identifier of the environment to which the key
    * grants access. `{key_id}` is the unique identifier of the key. For
    * example,
    * `users/someone@example.com/environments/default/publicKeys/myKey`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaPublicKey {
  
  @scala.inline
  def apply(): SchemaPublicKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPublicKey]
  }
  
  @scala.inline
  implicit class SchemaPublicKeyMutableBuilder[Self <: SchemaPublicKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
