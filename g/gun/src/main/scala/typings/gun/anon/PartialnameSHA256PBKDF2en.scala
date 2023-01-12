package typings.gun.anon

import typings.gun.gunStrings.PBKDF2
import typings.gun.gunStrings.`SHA-256`
import typings.gun.gunStrings.base16
import typings.gun.gunStrings.base32
import typings.gun.gunStrings.base64
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  name :'SHA-256' | 'PBKDF2',   encode :'base64' | 'base32' | 'base16',   iterations :number,   salt :any,   hash :string,   length :any}> */
trait PartialnameSHA256PBKDF2en extends StObject {
  
  var encode: js.UndefOr[base64 | base32 | base16] = js.undefined
  
  var hash: js.UndefOr[String] = js.undefined
  
  var iterations: js.UndefOr[Double] = js.undefined
  
  var length: js.UndefOr[Any] = js.undefined
  
  var name: js.UndefOr[`SHA-256` | PBKDF2] = js.undefined
  
  var salt: js.UndefOr[Any] = js.undefined
}
object PartialnameSHA256PBKDF2en {
  
  inline def apply(): PartialnameSHA256PBKDF2en = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialnameSHA256PBKDF2en]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialnameSHA256PBKDF2en] (val x: Self) extends AnyVal {
    
    inline def setEncode(value: base64 | base32 | base16): Self = StObject.set(x, "encode", value.asInstanceOf[js.Any])
    
    inline def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    inline def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
    
    inline def setIterationsUndefined: Self = StObject.set(x, "iterations", js.undefined)
    
    inline def setLength(value: Any): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setName(value: `SHA-256` | PBKDF2): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSalt(value: Any): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
    
    inline def setSaltUndefined: Self = StObject.set(x, "salt", js.undefined)
  }
}
