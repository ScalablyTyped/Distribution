package typings.idyll.anon

import typings.idyllCompiler.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Compiler extends js.Object {
  var compiler: Options
  var components: js.Any
  var transform: js.Array[_]
}

object Compiler {
  @scala.inline
  def apply(compiler: Options, components: js.Any, transform: js.Array[_]): Compiler = {
    val __obj = js.Dynamic.literal(compiler = compiler.asInstanceOf[js.Any], components = components.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compiler]
  }
}

