package typings.limeJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Session extends Envelope {
  
  var authentication: js.UndefOr[js.Any] = js.native
  
  var compression: js.UndefOr[String] = js.native
  
  var compressionOptions: js.UndefOr[js.Array[String]] = js.native
  
  var encryption: js.UndefOr[String] = js.native
  
  var encryptionOptions: js.UndefOr[js.Array[String]] = js.native
  
  var reason: js.UndefOr[Reason] = js.native
  
  var scheme: js.UndefOr[String] = js.native
  
  var state: String = js.native
}
object Session {
  
  @scala.inline
  def apply(state: String): Session = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Session]
  }
  
  @scala.inline
  implicit class SessionMutableBuilder[Self <: Session] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthentication(value: js.Any): Self = StObject.set(x, "authentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationUndefined: Self = StObject.set(x, "authentication", js.undefined)
    
    @scala.inline
    def setCompression(value: String): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressionOptions(value: js.Array[String]): Self = StObject.set(x, "compressionOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressionOptionsUndefined: Self = StObject.set(x, "compressionOptions", js.undefined)
    
    @scala.inline
    def setCompressionOptionsVarargs(value: String*): Self = StObject.set(x, "compressionOptions", js.Array(value :_*))
    
    @scala.inline
    def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
    
    @scala.inline
    def setEncryption(value: String): Self = StObject.set(x, "encryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionOptions(value: js.Array[String]): Self = StObject.set(x, "encryptionOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionOptionsUndefined: Self = StObject.set(x, "encryptionOptions", js.undefined)
    
    @scala.inline
    def setEncryptionOptionsVarargs(value: String*): Self = StObject.set(x, "encryptionOptions", js.Array(value :_*))
    
    @scala.inline
    def setEncryptionUndefined: Self = StObject.set(x, "encryption", js.undefined)
    
    @scala.inline
    def setReason(value: Reason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    @scala.inline
    def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
