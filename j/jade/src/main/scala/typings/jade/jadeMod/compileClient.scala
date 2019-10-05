package typings.jade.jadeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jade", "compileClient")
@js.native
object compileClient extends js.Object {
  def apply(template: String): JadeGenerationFunction = js.native
  def apply(template: String, options: JadeOptions): JadeGenerationFunction = js.native
}

