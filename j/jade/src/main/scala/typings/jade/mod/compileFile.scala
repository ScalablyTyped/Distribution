package typings.jade.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jade", "compileFile")
@js.native
object compileFile extends js.Object {
  def apply(path: String): JadeGenerationFunction = js.native
  def apply(path: String, options: JadeOptions): JadeGenerationFunction = js.native
}

