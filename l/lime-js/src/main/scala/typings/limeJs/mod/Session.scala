package typings.limeJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Session
  extends StObject
     with Envelope {
  
  var authentication: js.UndefOr[js.Any] = js.undefined
  
  var compression: js.UndefOr[String] = js.undefined
  
  var compressionOptions: js.UndefOr[js.Array[String]] = js.undefined
  
  var encryption: js.UndefOr[String] = js.undefined
  
  var encryptionOptions: js.UndefOr[js.Array[String]] = js.undefined
  
  var reason: js.UndefOr[Reason] = js.undefined
  
  var scheme: js.UndefOr[String] = js.undefined
  
  var state: String
}
object Session {
  
  inline def apply(state: String): Session = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Session]
  }
  
  extension [Self <: Session](x: Self) {
    
    inline def setAuthentication(value: js.Any): Self = StObject.set(x, "authentication", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationUndefined: Self = StObject.set(x, "authentication", js.undefined)
    
    inline def setCompression(value: String): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
    
    inline def setCompressionOptions(value: js.Array[String]): Self = StObject.set(x, "compressionOptions", value.asInstanceOf[js.Any])
    
    inline def setCompressionOptionsUndefined: Self = StObject.set(x, "compressionOptions", js.undefined)
    
    inline def setCompressionOptionsVarargs(value: String*): Self = StObject.set(x, "compressionOptions", js.Array(value :_*))
    
    inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
    
    inline def setEncryption(value: String): Self = StObject.set(x, "encryption", value.asInstanceOf[js.Any])
    
    inline def setEncryptionOptions(value: js.Array[String]): Self = StObject.set(x, "encryptionOptions", value.asInstanceOf[js.Any])
    
    inline def setEncryptionOptionsUndefined: Self = StObject.set(x, "encryptionOptions", js.undefined)
    
    inline def setEncryptionOptionsVarargs(value: String*): Self = StObject.set(x, "encryptionOptions", js.Array(value :_*))
    
    inline def setEncryptionUndefined: Self = StObject.set(x, "encryption", js.undefined)
    
    inline def setReason(value: Reason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    inline def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
