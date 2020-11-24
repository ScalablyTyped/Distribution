package typings.jade

import typings.jade.mod.JadeGenerationFunction
import typings.jade.mod.TemplateLocals
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  @js.native
  trait Body extends js.Object {
    
    def body(): String = js.native
    def body(locals: TemplateLocals): String = js.native
    @JSName("body")
    var body_Original: JadeGenerationFunction = js.native
    
    var dependencies: js.Array[String] = js.native
  }
}
