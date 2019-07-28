package typings.jade

import typings.jade.jadeMod.JadeGenerationFunction
import typings.jade.jadeMod.TemplateLocals
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Body extends js.Object {
  @JSName("body")
  var body_Original: JadeGenerationFunction = js.native
  var dependencies: js.Array[String] = js.native
  def body(): String = js.native
  def body(locals: TemplateLocals): String = js.native
}

