package typings.jestResolveDependencies.mod

import typings.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolvedModule extends js.Object {
  var dependencies: js.Array[Path] = js.native
  var file: Path = js.native
}

object ResolvedModule {
  @scala.inline
  def apply(dependencies: js.Array[Path], file: Path): ResolvedModule = {
    val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedModule]
  }
  @scala.inline
  implicit class ResolvedModuleOps[Self <: ResolvedModule] (val x: Self) extends AnyVal {
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
    def setDependenciesVarargs(value: Path*): Self = this.set("dependencies", js.Array(value :_*))
    @scala.inline
    def setDependencies(value: js.Array[Path]): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def setFile(value: Path): Self = this.set("file", value.asInstanceOf[js.Any])
  }
  
}

