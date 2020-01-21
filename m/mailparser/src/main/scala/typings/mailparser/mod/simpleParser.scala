package typings.mailparser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mailparser", "simpleParser")
@js.native
object simpleParser extends js.Object {
  def apply(source: Source): js.Promise[ParsedMail] = js.native
  def apply(source: Source, callback: js.Function2[/* err */ js.Any, /* mail */ ParsedMail, Unit]): Unit = js.native
  def apply(source: Source, options: SimpleParserOptions): js.Promise[ParsedMail] = js.native
  def apply(
    source: Source,
    options: SimpleParserOptions,
    callback: js.Function2[/* err */ js.Any, /* mail */ ParsedMail, Unit]
  ): Unit = js.native
}

