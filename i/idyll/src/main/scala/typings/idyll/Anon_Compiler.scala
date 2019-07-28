package typings.idyll

import typings.idyllDashCompiler.idyllDashCompilerMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Compiler extends js.Object {
  var compiler: Options
  var components: js.Any
  var transform: js.Array[_]
}

object Anon_Compiler {
  @scala.inline
  def apply(compiler: Options, components: js.Any, transform: js.Array[_]): Anon_Compiler = {
    val __obj = js.Dynamic.literal(compiler = compiler, components = components, transform = transform)
  
    __obj.asInstanceOf[Anon_Compiler]
  }
}

