package typings.lokijs

import typings.std.Partial
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
  def this(filename: String) = this()
  def this(
    filename: String,
    options: Partial[LokiConstructorOptions] with Partial[LokiConfigOptions] with Partial[ThrottledSaveDrainOptions]
  ) = this()
}

