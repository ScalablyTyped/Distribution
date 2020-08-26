package typings.makerJs.MakerJs.models

import typings.makerJs.MakerJs.IModel
import typings.makerJs.MakerJs.IPathMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ring extends IModel {
  @JSName("paths")
  var paths_Ring: IPathMap = js.native
}

object Ring {
  @scala.inline
  def apply(paths: IPathMap): Ring = {
    val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ring]
  }
  @scala.inline
  implicit class RingOps[Self <: Ring] (val x: Self) extends AnyVal {
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
    def setPaths(value: IPathMap): Self = this.set("paths", value.asInstanceOf[js.Any])
  }
  
}

