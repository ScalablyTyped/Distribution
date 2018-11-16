package typings
package logformLib.logformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("logform", "Colorizer")
@js.native
class Colorizer () extends Format {
  def this(opts: js.Object) = this()
  def addColors(colors: Colors): Colors = js.native
  def colorize(level: java.lang.String, message: java.lang.String): java.lang.String = js.native
  def createColorize(): Colorizer = js.native
  def createColorize(opts: js.Object): Colorizer = js.native
}

