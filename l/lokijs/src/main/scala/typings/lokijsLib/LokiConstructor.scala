package typings
package lokijsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * LokiJS
  * A lightweight document oriented javascript database
  * @author Joe Minichino <joe.minichino@gmail.com>
  */
@JSGlobal("LokiConstructor")
@js.native
class LokiConstructor protected () extends Loki {
  def this(filename: java.lang.String) = this()
  def this(filename: java.lang.String, options: stdLib.Partial[LokiConstructorOptions] with stdLib.Partial[LokiConfigOptions] with stdLib.Partial[ThrottledSaveDrainOptions]) = this()
}

