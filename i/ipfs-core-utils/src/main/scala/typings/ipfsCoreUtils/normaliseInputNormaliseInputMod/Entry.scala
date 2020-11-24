package typings.ipfsCoreUtils.normaliseInputNormaliseInputMod

import typings.std.AsyncIterable
import typings.std.Blob
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.ipfsCoreUtils.normaliseInputNormaliseInputMod.File[Content]
  - typings.ipfsCoreUtils.normaliseInputNormaliseInputMod.Directory
*/
trait Entry[Content /* <: Blob | AsyncIterable[Uint8Array] */] extends js.Object
object Entry {
  
  @scala.inline
  def File[Content /* <: Blob | AsyncIterable[Uint8Array] */](path: String): Entry[Content] = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entry[Content]]
  }
  
  @scala.inline
  def Directory[Content /* <: Blob | AsyncIterable[Uint8Array] */](path: String): Entry[Content] = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entry[Content]]
  }
}
