package typings.hapiInert.mod.hapiHapiAugmentingMod

import typings.hapiHapi.mod.ResponseObject
import typings.hapiInert.mod.ReplyFileHandlerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponseToolkit extends js.Object {
  
  /**
    * Transmits a file from the file system. The 'Content-Type' header defaults to the matching mime type based on filename extension.
    * @see {@link https://github.com/hapijs/inert#replyfilepath-options}
    */
  def file(path: String): ResponseObject = js.native
  def file(path: String, options: ReplyFileHandlerOptions): ResponseObject = js.native
}
