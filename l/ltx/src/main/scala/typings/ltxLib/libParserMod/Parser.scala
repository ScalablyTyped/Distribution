package typings
package ltxLib.libParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ltx/lib/Parser", "Parser")
@js.native
class Parser ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(options: ParserOptions) = this()
  def end(data: java.lang.String): scala.Unit = js.native
  def write(data: java.lang.String): scala.Unit = js.native
}

