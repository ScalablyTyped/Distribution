package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use this to have a random data crypto key generated. It will be discarded
  * after the request finishes.
  */
@js.native
trait SchemaGooglePrivacyDlpV2TransientCryptoKey extends StObject {
  
  /**
    * Name of the key. [required] This is an arbitrary string used to
    * differentiate different keys. A unique key is generated per name: two
    * separate `TransientCryptoKey` protos share the same generated key if
    * their names are the same. When the data crypto key is generated, this
    * name is not used in any way (repeating the api call will result in a
    * different key being generated).
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaGooglePrivacyDlpV2TransientCryptoKey {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2TransientCryptoKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2TransientCryptoKey]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2TransientCryptoKeyMutableBuilder[Self <: SchemaGooglePrivacyDlpV2TransientCryptoKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
