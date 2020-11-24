package typings.ipfsCoreUtils

import typings.ipfsCoreUtils.normaliseInputNormaliseInputMod.Entry
import typings.ipfsCoreUtils.normaliseInputNormaliseInputMod.Source
import typings.std.AsyncIterable
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core-utils/dist/src/files/normalise-input", JSImport.Namespace)
@js.native
object normaliseInputMod extends js.Object {
  
  def apply(input: Source): AsyncIterable[Entry[AsyncIterable[Uint8Array]]] = js.native
}
