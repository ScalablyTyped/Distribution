package typings.makerJs.MakerJs.models

import typings.makerJs.MakerJs.IModel
import typings.makerJs.MakerJs.IModelMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Text extends IModel {
  @JSName("models")
  var models_Text: IModelMap = js.native
}

object Text {
  @scala.inline
  def apply(models: IModelMap): Text = {
    val __obj = js.Dynamic.literal(models = models.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text]
  }
  @scala.inline
  implicit class TextOps[Self <: Text] (val x: Self) extends AnyVal {
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
  }
  
}

