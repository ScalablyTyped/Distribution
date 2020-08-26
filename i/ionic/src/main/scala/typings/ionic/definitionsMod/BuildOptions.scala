package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildOptions[T /* <: ProjectType */] extends BaseBuildOptions {
  var `type`: T = js.native
}

object BuildOptions {
  @scala.inline
  def apply[/* <: typings.ionic.definitionsMod.ProjectType */ T](`--`: js.Array[String], engine: String, `type`: T): BuildOptions[T] = {
    val __obj = js.Dynamic.literal(engine = engine.asInstanceOf[js.Any])
    __obj.updateDynamic("--")(`--`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildOptions[T]]
  }
  @scala.inline
  implicit class BuildOptionsOps[Self <: BuildOptions[_], /* <: typings.ionic.definitionsMod.ProjectType */ T] (val x: Self with BuildOptions[T]) extends AnyVal {
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
    def setType(value: T): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

