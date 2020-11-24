package typings.ipfsCoreUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core-utils/dist/src/files/normalise-input/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  def isBlob(obj: js.Any): /* is std.Blob */ Boolean = js.native
  
  def isBytes(obj: js.Any): Boolean = js.native
  
  def isFileObject(obj: js.Any): /* is ipfs-core-utils.ipfs-core-utils/dist/src/files/normalise-input/normalise-input.FileInput */ Boolean = js.native
  
  def isReadableStream(value: js.Any): /* is std.ReadableStream<any> */ Boolean = js.native
}
