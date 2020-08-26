package typings.licenseCheckerWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputWriterArgs extends js.Object {
  var dependencies: js.Array[Dependency] = js.native
}

object OutputWriterArgs {
  @scala.inline
  def apply(dependencies: js.Array[Dependency]): OutputWriterArgs = {
    val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputWriterArgs]
  }
  @scala.inline
  implicit class OutputWriterArgsOps[Self <: OutputWriterArgs] (val x: Self) extends AnyVal {
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
    def setDependenciesVarargs(value: Dependency*): Self = this.set("dependencies", js.Array(value :_*))
    @scala.inline
    def setDependencies(value: js.Array[Dependency]): Self = this.set("dependencies", value.asInstanceOf[js.Any])
  }
  
}

