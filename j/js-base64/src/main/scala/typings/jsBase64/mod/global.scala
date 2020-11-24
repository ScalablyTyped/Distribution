package typings.jsBase64.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  trait String extends js.Object {
    
    def fromBase64(): java.lang.String = js.native
    
    def toBase64(): java.lang.String = js.native
    def toBase64(uriSafe: Boolean): java.lang.String = js.native
    
    def toBase64URI(): java.lang.String = js.native
    
    def toBase64URL(): java.lang.String = js.native
    
    def toUint8Array(): Uint8Array = js.native
  }
  
  @js.native
  trait Uint8Array extends js.Object {
    
    def toBase64(): java.lang.String = js.native
    def toBase64(uriSafe: Boolean): java.lang.String = js.native
    
    def toBase64URI(): java.lang.String = js.native
    
    def toBase64URL(): java.lang.String = js.native
  }
}
