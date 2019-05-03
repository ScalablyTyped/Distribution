package typings
package jszipLib.jszipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSZipObject extends js.Object {
  var comment: java.lang.String = js.native
  var date: stdLib.Date = js.native
  var dir: scala.Boolean = js.native
  /** The UNIX permissions of the file, if any. */
  var dosPermissions: scala.Double | scala.Null = js.native
  var name: java.lang.String = js.native
  var options: JSZipObjectOptions = js.native
  /** The UNIX permissions of the file, if any. */
  var unixPermissions: scala.Double | java.lang.String | scala.Null = js.native
  @JSName("async")
  def async_array(`type`: jszipLib.jszipLibStrings.array): js.Promise[js.Array[scala.Double]] = js.native
  @JSName("async")
  def async_array(`type`: jszipLib.jszipLibStrings.array, onUpdate: OnUpdateCallback): js.Promise[js.Array[scala.Double]] = js.native
  @JSName("async")
  def async_arraybuffer(`type`: jszipLib.jszipLibStrings.arraybuffer): js.Promise[stdLib.ArrayBuffer] = js.native
  @JSName("async")
  def async_arraybuffer(`type`: jszipLib.jszipLibStrings.arraybuffer, onUpdate: OnUpdateCallback): js.Promise[stdLib.ArrayBuffer] = js.native
  /**
    * Prepare the content in the asked type.
    * @param type the type of the result.
    * @param onUpdate a function to call on each internal update.
    * @return Promise the promise of the result.
    */
  @JSName("async")
  def async_base64(`type`: jszipLib.jszipLibStrings.base64): js.Promise[java.lang.String] = js.native
  @JSName("async")
  def async_base64(`type`: jszipLib.jszipLibStrings.base64, onUpdate: OnUpdateCallback): js.Promise[java.lang.String] = js.native
  @JSName("async")
  def async_binarystring(`type`: jszipLib.jszipLibStrings.binarystring): js.Promise[java.lang.String] = js.native
  @JSName("async")
  def async_binarystring(`type`: jszipLib.jszipLibStrings.binarystring, onUpdate: OnUpdateCallback): js.Promise[java.lang.String] = js.native
  @JSName("async")
  def async_blob(`type`: jszipLib.jszipLibStrings.blob): js.Promise[stdLib.Blob] = js.native
  @JSName("async")
  def async_blob(`type`: jszipLib.jszipLibStrings.blob, onUpdate: OnUpdateCallback): js.Promise[stdLib.Blob] = js.native
  @JSName("async")
  def async_nodebuffer(`type`: jszipLib.jszipLibStrings.nodebuffer): js.Promise[nodeLib.Buffer] = js.native
  @JSName("async")
  def async_nodebuffer(`type`: jszipLib.jszipLibStrings.nodebuffer, onUpdate: OnUpdateCallback): js.Promise[nodeLib.Buffer] = js.native
  @JSName("async")
  def async_text(`type`: jszipLib.jszipLibStrings.text): js.Promise[java.lang.String] = js.native
  @JSName("async")
  def async_text(`type`: jszipLib.jszipLibStrings.text, onUpdate: OnUpdateCallback): js.Promise[java.lang.String] = js.native
  @JSName("async")
  def async_uint8array(`type`: jszipLib.jszipLibStrings.uint8array): js.Promise[stdLib.Uint8Array] = js.native
  @JSName("async")
  def async_uint8array(`type`: jszipLib.jszipLibStrings.uint8array, onUpdate: OnUpdateCallback): js.Promise[stdLib.Uint8Array] = js.native
  def nodeStream(): nodeLib.NodeJSNs.ReadableStream = js.native
  @JSName("nodeStream")
  def nodeStream_nodestream(`type`: jszipLib.jszipLibStrings.nodestream): nodeLib.NodeJSNs.ReadableStream = js.native
  @JSName("nodeStream")
  def nodeStream_nodestream(`type`: jszipLib.jszipLibStrings.nodestream, onUpdate: OnUpdateCallback): nodeLib.NodeJSNs.ReadableStream = js.native
}

