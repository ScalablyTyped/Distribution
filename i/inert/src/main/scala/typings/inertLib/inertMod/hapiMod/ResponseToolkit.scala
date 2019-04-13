package typings
package inertLib.inertMod.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseToolkit extends js.Object {
  /**
    * Transmits a file from the file system. The 'Content-Type' header defaults to the matching mime type based on filename extension.
    * @see {@link https://github.com/hapijs/inert#replyfilepath-options}
    */
  def file(path: java.lang.String): hapiLib.hapiMod.ResponseObject = js.native
  def file(path: java.lang.String, options: inertLib.inertMod.ReplyFileHandlerOptions): hapiLib.hapiMod.ResponseObject = js.native
}

