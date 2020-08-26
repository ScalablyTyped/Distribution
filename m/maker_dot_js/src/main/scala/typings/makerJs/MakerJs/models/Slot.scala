package typings.makerJs.MakerJs.models

import typings.makerJs.MakerJs.IModel
import typings.makerJs.MakerJs.IModelMap
import typings.makerJs.MakerJs.IPathMap
import typings.makerJs.MakerJs.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Slot extends IModel {
  @JSName("models")
  var models_Slot: IModelMap = js.native
  @JSName("origin")
  var origin_Slot: IPoint = js.native
  @JSName("paths")
  var paths_Slot: IPathMap = js.native
}

object Slot {
  @scala.inline
  def apply(models: IModelMap, origin: IPoint, paths: IPathMap): Slot = {
    val __obj = js.Dynamic.literal(models = models.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[Slot]
  }
  @scala.inline
  implicit class SlotOps[Self <: Slot] (val x: Self) extends AnyVal {
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
    def setModels(value: IModelMap): Self = this.set("models", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrigin(value: IPoint): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaths(value: IPathMap): Self = this.set("paths", value.asInstanceOf[js.Any])
  }
  
}

