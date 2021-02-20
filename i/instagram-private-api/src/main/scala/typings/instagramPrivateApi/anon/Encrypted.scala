package typings.instagramPrivateApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Encrypted extends StObject {
  
  var encrypted: String = js.native
  
  var time: String = js.native
}
object Encrypted {
  
  @scala.inline
  def apply(encrypted: String, time: String): Encrypted = {
    val __obj = js.Dynamic.literal(encrypted = encrypted.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encrypted]
  }
  
  @scala.inline
  implicit class EncryptedMutableBuilder[Self <: Encrypted] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncrypted(value: String): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
