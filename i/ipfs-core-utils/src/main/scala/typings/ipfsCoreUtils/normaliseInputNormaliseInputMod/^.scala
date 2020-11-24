package typings.ipfsCoreUtils.normaliseInputNormaliseInputMod

import typings.std.AsyncIterable
import typings.std.Blob
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core-utils/dist/src/files/normalise-input/normalise-input", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply[Content /* <: Blob | AsyncIterable[Uint8Array] */](
    input: Source,
    normaliseContent: js.Function1[/* content */ ToContent, Content | js.Promise[Content]]
  ): AsyncIterable[Directory | File[Content]] = js.native
}
