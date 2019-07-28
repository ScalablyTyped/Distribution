package typings.logfmt.logfmtMod

import typings.logfmt.Anon_Contentlength
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestLogger extends js.Object {
  def apply(): HTTPHandler = js.native
  def apply(formatter: RequestLoggerFormatter): HTTPHandler = js.native
  def apply(options: RequestLoggerOptions): HTTPHandler = js.native
  def apply(options: RequestLoggerOptions, formatter: RequestLoggerFormatter): HTTPHandler = js.native
  def commonFormatter(req: IncomingMessage, res: ServerResponse): Anon_Contentlength = js.native
}

