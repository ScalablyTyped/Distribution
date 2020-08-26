package typings.graphqlToolsCodeFileLoader.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filepath extends js.Object {
  var filepath: String = js.native
  var module: js.Any = js.native
}

object Filepath {
  @scala.inline
  def apply(filepath: String, module: js.Any): Filepath = {
    val __obj = js.Dynamic.literal(filepath = filepath.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filepath]
  }
  @scala.inline
  implicit class FilepathOps[Self <: Filepath] (val x: Self) extends AnyVal {
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
    def setFilepath(value: String): Self = this.set("filepath", value.asInstanceOf[js.Any])
    @scala.inline
    def setModule(value: js.Any): Self = this.set("module", value.asInstanceOf[js.Any])
  }
  
}

