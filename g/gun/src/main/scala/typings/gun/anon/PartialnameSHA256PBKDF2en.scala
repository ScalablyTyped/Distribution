package typings.gun.anon

import typings.gun.gunStrings.PBKDF2
import typings.gun.gunStrings.`SHA-256`
import typings.gun.gunStrings.base16
import typings.gun.gunStrings.base32
import typings.gun.gunStrings.base64
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  name :'SHA-256' | 'PBKDF2',   encode :'base64' | 'base32' | 'base16',   iterations :number,   salt :any,   hash :string,   length :any}> */
@js.native
trait PartialnameSHA256PBKDF2en extends StObject {
  
  var encode: js.UndefOr[base64 | base32 | base16] = js.native
  
  var hash: js.UndefOr[String] = js.native
  
  var iterations: js.UndefOr[Double] = js.native
  
  var length: js.UndefOr[js.Any] = js.native
  
  var name: js.UndefOr[`SHA-256` | PBKDF2] = js.native
  
  var salt: js.UndefOr[js.Any] = js.native
}
object PartialnameSHA256PBKDF2en {
  
  @scala.inline
  def apply(): PartialnameSHA256PBKDF2en = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialnameSHA256PBKDF2en]
  }
  
  @scala.inline
  implicit class PartialnameSHA256PBKDF2enMutableBuilder[Self <: PartialnameSHA256PBKDF2en] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncode(value: base64 | base32 | base16): Self = StObject.set(x, "encode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
    
    @scala.inline
    def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    @scala.inline
    def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIterationsUndefined: Self = StObject.set(x, "iterations", js.undefined)
    
    @scala.inline
    def setLength(value: js.Any): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setName(value: `SHA-256` | PBKDF2): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSalt(value: js.Any): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaltUndefined: Self = StObject.set(x, "salt", js.undefined)
  }
}
