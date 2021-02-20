package typings.jade

import typings.jade.mod.JadeGenerationFunction
import typings.jade.mod.TemplateLocals
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Body extends StObject {
    
    def body(): String = js.native
    def body(locals: TemplateLocals): String = js.native
    @JSName("body")
    var body_Original: JadeGenerationFunction = js.native
    
    var dependencies: js.Array[String] = js.native
  }
}
