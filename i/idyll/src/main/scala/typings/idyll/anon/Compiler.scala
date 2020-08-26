package typings.idyll.anon

import typings.idyllCompiler.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Compiler extends js.Object {
  var compiler: Options = js.native
  var components: js.Any = js.native
  var transform: js.Array[_] = js.native
}

object Compiler {
  @scala.inline
  def apply(compiler: Options, components: js.Any, transform: js.Array[_]): Compiler = {
    val __obj = js.Dynamic.literal(compiler = compiler.asInstanceOf[js.Any], components = components.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compiler]
  }
  @scala.inline
  implicit class CompilerOps[Self <: Compiler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCompiler(value: Options): Self = this.set("compiler", value.asInstanceOf[js.Any])
    @scala.inline
    def setComponents(value: js.Any): Self = this.set("components", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransformVarargs(value: js.Any*): Self = this.set("transform", js.Array(value :_*))
    @scala.inline
    def setTransform(value: js.Array[_]): Self = this.set("transform", value.asInstanceOf[js.Any])
  }
  
}

