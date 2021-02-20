package typings.ipfsCoreUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("ipfs-core-utils/dist/src/files/normalise-input/utils", "isBlob")
  @js.native
  def isBlob(obj: js.Any): /* is std.Blob */ Boolean = js.native
  
  @JSImport("ipfs-core-utils/dist/src/files/normalise-input/utils", "isBytes")
  @js.native
  def isBytes(obj: js.Any): Boolean = js.native
  
  @JSImport("ipfs-core-utils/dist/src/files/normalise-input/utils", "isFileObject")
  @js.native
  def isFileObject(obj: js.Any): /* is ipfs-core-utils.ipfs-core-utils/dist/src/files/normalise-input/normalise-input.FileInput */ Boolean = js.native
  
  @JSImport("ipfs-core-utils/dist/src/files/normalise-input/utils", "isReadableStream")
  @js.native
  def isReadableStream(value: js.Any): /* is std.ReadableStream<any> */ Boolean = js.native
}
