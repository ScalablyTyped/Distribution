package typings.inversifyRestifyUtils.anon

import typings.inversifyRestifyUtils.interfacesMod.interfaces.StrOrRegex
import typings.inversifyRestifyUtils.interfacesMod.interfaces._RouteOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Path extends _RouteOptions {
  var path: StrOrRegex = js.native
}

object Path {
  @scala.inline
  def apply(path: StrOrRegex): Path = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path]
  }
  @scala.inline
  implicit class PathOps[Self <: Path] (val x: Self) extends AnyVal {
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
    def setPath(value: StrOrRegex): Self = this.set("path", value.asInstanceOf[js.Any])
  }
  
}

