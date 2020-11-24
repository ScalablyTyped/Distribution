package typings.logform.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("logform", "Colorizer")
@js.native
class Colorizer () extends Format_ {
  def this(opts: js.Object) = this()
  
  def addColors(colors: Colors): Colors = js.native
  
  def colorize(level: String, message: String): String = js.native
  
  def createColorize(): Colorizer = js.native
  def createColorize(opts: js.Object): Colorizer = js.native
}
