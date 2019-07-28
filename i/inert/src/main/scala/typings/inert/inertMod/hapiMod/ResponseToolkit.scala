package typings.inert.inertMod.hapiMod

import typings.hapi.hapiMod.ResponseObject
import typings.inert.inertMod.ReplyFileHandlerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseToolkit extends js.Object {
  /**
    * Transmits a file from the file system. The 'Content-Type' header defaults to the matching mime type based on filename extension.
    * @see {@link https://github.com/hapijs/inert#replyfilepath-options}
    */
  def file(path: String): ResponseObject = js.native
  def file(path: String, options: ReplyFileHandlerOptions): ResponseObject = js.native
}

