package typings.instagramPrivateApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Encrypted extends StObject {
  
  var encrypted: String
  
  var time: String
}
object Encrypted {
  
  inline def apply(encrypted: String, time: String): Encrypted = {
    val __obj = js.Dynamic.literal(encrypted = encrypted.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encrypted]
  }
  
  extension [Self <: Encrypted](x: Self) {
    
    inline def setEncrypted(value: String): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
    
    inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
