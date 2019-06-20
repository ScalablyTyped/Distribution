package typings
package logfmtLib.logfmtMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestLogger extends js.Object {
  def apply(): HTTPHandler = js.native
  def apply(formatter: RequestLoggerFormatter): HTTPHandler = js.native
  def apply(options: RequestLoggerOptions): HTTPHandler = js.native
  def apply(options: RequestLoggerOptions, formatter: RequestLoggerFormatter): HTTPHandler = js.native
  def commonFormatter(req: nodeLib.httpMod.IncomingMessage, res: nodeLib.httpMod.ServerResponse): logfmtLib.Anon_Contentlength = js.native
}

