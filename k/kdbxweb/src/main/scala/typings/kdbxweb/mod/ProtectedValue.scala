package typings.kdbxweb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kdbxweb", "ProtectedValue")
@js.native
open class ProtectedValue protected ()
  extends typings.kdbxweb.protectedValueMod.ProtectedValue {
  def this(value: js.typedarray.ArrayBuffer, salt: js.typedarray.ArrayBuffer) = this()
}
/* static members */
object ProtectedValue {
  
  @JSImport("kdbxweb", "ProtectedValue")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromBase64(base64: String): typings.kdbxweb.protectedValueMod.ProtectedValue = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64")(base64.asInstanceOf[js.Any]).asInstanceOf[typings.kdbxweb.protectedValueMod.ProtectedValue]
  
  /**
    * Keep in mind that you're passing the ownership of this array, the contents will be destroyed
    */
  inline def fromBinary(binary: js.typedarray.ArrayBuffer): typings.kdbxweb.protectedValueMod.ProtectedValue = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(binary.asInstanceOf[js.Any]).asInstanceOf[typings.kdbxweb.protectedValueMod.ProtectedValue]
  
  inline def fromString(str: String): typings.kdbxweb.protectedValueMod.ProtectedValue = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any]).asInstanceOf[typings.kdbxweb.protectedValueMod.ProtectedValue]
}
