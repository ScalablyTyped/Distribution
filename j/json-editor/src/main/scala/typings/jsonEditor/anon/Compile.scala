package typings.jsonEditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Compile extends js.Object {
  def compile(template: String): js.Function1[/* vars */ js.Any, String] = js.native
}

object Compile {
  @scala.inline
  def apply(compile: String => js.Function1[/* vars */ js.Any, String]): Compile = {
    val __obj = js.Dynamic.literal(compile = js.Any.fromFunction1(compile))
    __obj.asInstanceOf[Compile]
  }
  @scala.inline
  implicit class CompileOps[Self <: Compile] (val x: Self) extends AnyVal {
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
    def setCompile(value: String => js.Function1[/* vars */ js.Any, String]): Self = this.set("compile", js.Any.fromFunction1(value))
  }
  
}

