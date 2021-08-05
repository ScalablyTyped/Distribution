package typings.ipfsCoreUtils

import typings.ipfsCoreUtils.normaliseInputNormaliseInputMod.Entry
import typings.ipfsCoreUtils.normaliseInputNormaliseInputMod.Source
import typings.std.AsyncIterable
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object normaliseInputMod {
  
  inline def apply(input: Source): AsyncIterable[Entry[AsyncIterable[Uint8Array]]] = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[AsyncIterable[Entry[AsyncIterable[Uint8Array]]]]
  
  @JSImport("ipfs-core-utils/dist/src/files/normalise-input", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
