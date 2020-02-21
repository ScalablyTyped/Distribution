package typings.istanbulLibReport.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istanbul-lib-report", "ContentWriter")
@js.native
class ContentWriter () extends js.Object {
  /**
    * closes this content writer. Should be called after all writes are complete.
    */
  def close(): Unit = js.native
  /**
    * returns the colorized version of a string. Typically,
    * content writers that write to files will return the
    * same string and ones writing to a tty will wrap it in
    * appropriate escape sequences.
    */
  def colorize(str: String): String = js.native
  def colorize(str: String, clazz: String): String = js.native
  /**
    * writes a string appended with a newline to the destination
    */
  def println(str: String): Unit = js.native
}

