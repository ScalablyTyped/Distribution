package typings.jsrsasign.jsrsasign

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublicRawRSAKeyHexResult extends StObject {
  
  /** hexadecimal string of public exponent */
  var e: String = js.native
  
  /** hexadecimal string of public key */
  var n: String = js.native
}
object PublicRawRSAKeyHexResult {
  
  @scala.inline
  def apply(e: String, n: String): PublicRawRSAKeyHexResult = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicRawRSAKeyHexResult]
  }
  
  @scala.inline
  implicit class PublicRawRSAKeyHexResultMutableBuilder[Self <: PublicRawRSAKeyHexResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setE(value: String): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setN(value: String): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
  }
}
