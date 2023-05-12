package typings.lib0

import typings.std.SubtleCrypto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distWebcryptoMod {
  
  @JSImport("lib0/dist/webcrypto", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRandomValues[T /* <: js.typedarray.ArrayBufferView | Null */](array: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("getRandomValues")(array.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @JSImport("lib0/dist/webcrypto", "subtle")
  @js.native
  val subtle: SubtleCrypto = js.native
}
