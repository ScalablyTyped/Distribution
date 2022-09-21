package typings.ktxParse

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("ktx-parse/dist/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def concat(buffers: js.Array[js.typedarray.ArrayBuffer | js.typedarray.Uint8Array]): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(buffers.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def decodeText(buffer: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeText")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def encodeText(text: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeText")(text.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
}
