package typings
package atJupyterlabCoreutilsLib.atJupyterlabCoreutilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/coreutils", "Time")
@js.native
object TimeNs extends js.Object {
  /**
    * Convert a timestring to a date format.
    *
    * @param value - The date timestring or date object.
    *
    * @param format - The format string.
    *
    * @returns A formatted date.
    */
  def format(value: java.lang.String): java.lang.String = js.native
  def format(value: java.lang.String, format: java.lang.String): java.lang.String = js.native
  def format(value: stdLib.Date): java.lang.String = js.native
  def format(value: stdLib.Date, format: java.lang.String): java.lang.String = js.native
  /**
    * Convert a timestring to a human readable string (e.g. 'two minutes ago').
    *
    * @param value - The date timestring or date object.
    *
    * @returns A formatted date.
    */
  def formatHuman(value: java.lang.String): java.lang.String = js.native
  def formatHuman(value: stdLib.Date): java.lang.String = js.native
}

