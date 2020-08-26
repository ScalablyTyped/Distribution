package typings.makerJs.MakerJs.models

import typings.makerJs.MakerJs.IModel
import typings.makerJs.MakerJs.IPathMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Oval extends IModel {
  @JSName("paths")
  var paths_Oval: IPathMap = js.native
}

object Oval {
  @scala.inline
  def apply(paths: IPathMap): Oval = {
    val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[Oval]
  }
  @scala.inline
  implicit class OvalOps[Self <: Oval] (val x: Self) extends AnyVal {
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

