package typings.maximMazurokGapiClientCloudiot.gapi.client.cloudiot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublicKeyCredential extends StObject {
  
  /** The format of the key. */
  var format: js.UndefOr[String] = js.native
  
  /** The key data. */
  var key: js.UndefOr[String] = js.native
}
object PublicKeyCredential {
  
  @scala.inline
  def apply(): PublicKeyCredential = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublicKeyCredential]
  }
  
  @scala.inline
  implicit class PublicKeyCredentialMutableBuilder[Self <: PublicKeyCredential] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
