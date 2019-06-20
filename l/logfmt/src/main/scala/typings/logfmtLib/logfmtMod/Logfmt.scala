package typings
package logfmtLib.logfmtMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Logfmt extends js.Object {
  var maxErrorLines: scala.Double = js.native
  @JSName("requestLogger")
  var requestLogger_Original: RequestLogger = js.native
  var stream: WritableStream = js.native
  def bodyParser(): HTTPHandler = js.native
  def bodyParser(options: logfmtLib.Anon_ContentType): HTTPHandler = js.native
  def bodyParserStream(): HTTPHandler = js.native
  def bodyParserStream(options: logfmtLib.Anon_ContentType): HTTPHandler = js.native
  def error(err: stdLib.Error): scala.Unit = js.native
  def error(err: stdLib.Error, id: java.lang.String): scala.Unit = js.native
  def log(): scala.Unit = js.native
  def log(data: js.Object): scala.Unit = js.native
  def log(data: js.Object, stream: WritableStream): scala.Unit = js.native
  def namespace(data: js.Object): Logfmt = js.native
  def parse(line: java.lang.String): js.Object = js.native
  def requestLogger(): HTTPHandler = js.native
  def requestLogger(formatter: RequestLoggerFormatter): HTTPHandler = js.native
  def requestLogger(options: RequestLoggerOptions): HTTPHandler = js.native
  def requestLogger(options: RequestLoggerOptions, formatter: RequestLoggerFormatter): HTTPHandler = js.native
  def streamParser(): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def streamParser(options: logfmtLib.Anon_End): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def streamStringify(): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def streamStringify(options: logfmtLib.Anon_Delimiter): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def stringify(data: js.Object): java.lang.String = js.native
  def time(): Logfmt = js.native
  def time(label: java.lang.String): Logfmt = js.native
}

