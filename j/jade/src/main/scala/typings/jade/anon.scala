package typings.jade

import typings.jade.mod.JadeGenerationFunction
import typings.jade.mod.TemplateLocals
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object anon extends js.Object {
  @js.native
  trait Body extends js.Object {
    @JSName("body")
    var body_Original: JadeGenerationFunction = js.native
    var dependencies: js.Array[String] = js.native
    def body(): String = js.native
    def body(locals: TemplateLocals): String = js.native
  }
  
}

