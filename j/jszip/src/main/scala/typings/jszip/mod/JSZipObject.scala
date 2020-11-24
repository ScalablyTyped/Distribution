package typings.jszip.mod

import typings.jszip.jszipStrings.array
import typings.jszip.jszipStrings.arraybuffer
import typings.jszip.jszipStrings.base64
import typings.jszip.jszipStrings.binarystring
import typings.jszip.jszipStrings.blob
import typings.jszip.jszipStrings.nodebuffer
import typings.jszip.jszipStrings.string
import typings.jszip.jszipStrings.text
import typings.jszip.jszipStrings.uint8array
import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.Date
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSZipObject extends js.Object {
  
  @JSName("async")
  def async_array(`type`: array): js.Promise[js.Array[Double]] = js.native
  @JSName("async")
  def async_array(`type`: array, onUpdate: OnUpdateCallback): js.Promise[js.Array[Double]] = js.native
  @JSName("async")
  def async_arraybuffer(`type`: arraybuffer): js.Promise[ArrayBuffer] = js.native
  @JSName("async")
  def async_arraybuffer(`type`: arraybuffer, onUpdate: OnUpdateCallback): js.Promise[ArrayBuffer] = js.native
  /**
    * Prepare the content in the asked type.
    * @param type the type of the result.
    * @param onUpdate a function to call on each internal update.
    * @return Promise the promise of the result.
    */
  @JSName("async")
  def async_base64(`type`: base64): js.Promise[String] = js.native
  @JSName("async")
  def async_base64(`type`: base64, onUpdate: OnUpdateCallback): js.Promise[String] = js.native
  @JSName("async")
  def async_binarystring(`type`: binarystring): js.Promise[String] = js.native
  @JSName("async")
  def async_binarystring(`type`: binarystring, onUpdate: OnUpdateCallback): js.Promise[String] = js.native
  @JSName("async")
  def async_blob(`type`: blob): js.Promise[Blob] = js.native
  @JSName("async")
  def async_blob(`type`: blob, onUpdate: OnUpdateCallback): js.Promise[Blob] = js.native
  @JSName("async")
  def async_nodebuffer(`type`: nodebuffer): js.Promise[Buffer] = js.native
  @JSName("async")
  def async_nodebuffer(`type`: nodebuffer, onUpdate: OnUpdateCallback): js.Promise[Buffer] = js.native
  @JSName("async")
  def async_string(`type`: string): js.Promise[String] = js.native
  @JSName("async")
  def async_string(`type`: string, onUpdate: OnUpdateCallback): js.Promise[String] = js.native
  @JSName("async")
  def async_text(`type`: text): js.Promise[String] = js.native
  @JSName("async")
  def async_text(`type`: text, onUpdate: OnUpdateCallback): js.Promise[String] = js.native
  @JSName("async")
  def async_uint8array(`type`: uint8array): js.Promise[Uint8Array] = js.native
  @JSName("async")
  def async_uint8array(`type`: uint8array, onUpdate: OnUpdateCallback): js.Promise[Uint8Array] = js.native
  
  var comment: String = js.native
  
  var date: Date = js.native
  
  var dir: Boolean = js.native
  
  /** The UNIX permissions of the file, if any. */
  var dosPermissions: Double | Null = js.native
  
  var name: String = js.native
  
  def nodeStream(): ReadableStream = js.native
  def nodeStream(`type`: js.UndefOr[scala.Nothing], onUpdate: OnUpdateCallback): ReadableStream = js.native
  @JSName("nodeStream")
  def nodeStream_nodebuffer(`type`: nodebuffer): ReadableStream = js.native
  @JSName("nodeStream")
  def nodeStream_nodebuffer(`type`: nodebuffer, onUpdate: OnUpdateCallback): ReadableStream = js.native
  
  var options: JSZipObjectOptions = js.native
  
  /** The UNIX permissions of the file, if any. */
  var unixPermissions: Double | String | Null = js.native
}
