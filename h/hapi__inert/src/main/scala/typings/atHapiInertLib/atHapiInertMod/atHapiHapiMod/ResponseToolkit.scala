package typings
package atHapiInertLib.atHapiInertMod.atHapiHapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseToolkit extends js.Object {
  /**
    * Transmits a file from the file system. The 'Content-Type' header defaults to the matching mime type based on filename extension.
    * @see {@link https://github.com/hapijs/inert#replyfilepath-options}
    */
  def file(path: java.lang.String): atHapiHapiLib.atHapiHapiMod.ResponseObject = js.native
  def file(path: java.lang.String, options: atHapiInertLib.atHapiInertMod.ReplyFileHandlerOptions): atHapiHapiLib.atHapiHapiMod.ResponseObject = js.native
}

