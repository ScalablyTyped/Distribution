package typings.ipfsCoreUtils

import typings.ipfsCoreUtils.normaliseInputNormaliseInputMod.ToContent
import typings.std.AsyncIterable
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core-utils/dist/src/files/normalise-input/normalise-content", JSImport.Namespace)
@js.native
object normaliseContentMod extends js.Object {
  
  /**
    * @param {import('./normalise-input').ToContent} input
    * @returns {AsyncIterable<Uint8Array>}
    */
  def apply(input: ToContent): AsyncIterable[Uint8Array] = js.native
}
