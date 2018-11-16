package typings
package jszipLib.jszipMod.JSZipNs

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
  /**
           * Prepare the content in the asked type.
           * @param type the type of the result.
           * @param onUpdate a function to call on each internal update.
           * @return Promise the promise of the result.
           */
  def async[T /* <: OutputType */](`type`: T): stdLib.Promise[_] = js.native
  /**
           * Prepare the content in the asked type.
           * @param type the type of the result.
           * @param onUpdate a function to call on each internal update.
           * @return Promise the promise of the result.
           */
  def async[T /* <: OutputType */](`type`: T, onUpdate: jszipLib.OnUpdateCallback): stdLib.Promise[_] = js.native
  def nodeStream(): nodeLib.NodeJSNs.ReadableStream = js.native
  @JSName("nodeStream")
  def nodeStream_nodestream(`type`: jszipLib.jszipLibStrings.nodestream): nodeLib.NodeJSNs.ReadableStream = js.native
  @JSName("nodeStream")
  def nodeStream_nodestream(`type`: jszipLib.jszipLibStrings.nodestream, onUpdate: jszipLib.OnUpdateCallback): nodeLib.NodeJSNs.ReadableStream = js.native
}

