package typings.ipfsCoreUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("ipfs-core-utils/dist/src/files/normalise-input/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isBlob(obj: js.Any): /* is std.Blob */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlob")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is std.Blob */ Boolean]
  
  @scala.inline
  def isBytes(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBytes")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isFileObject(obj: js.Any): /* is ipfs-core-utils.ipfs-core-utils/dist/src/files/normalise-input/normalise-input.FileInput */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFileObject")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is ipfs-core-utils.ipfs-core-utils/dist/src/files/normalise-input/normalise-input.FileInput */ Boolean]
  
  @scala.inline
  def isReadableStream(value: js.Any): /* is std.ReadableStream<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReadableStream")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.ReadableStream<any> */ Boolean]
}
