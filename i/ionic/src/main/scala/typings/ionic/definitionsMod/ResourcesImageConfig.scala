package typings.ionic.definitionsMod

import typings.ionic.ionicStrings.landscape
import typings.ionic.ionicStrings.portrait
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourcesImageConfig extends js.Object {
  var density: js.UndefOr[String] = js.native
  var height: Double = js.native
  var name: String = js.native
  var orientation: js.UndefOr[landscape | portrait] = js.native
  var width: Double = js.native
}

object ResourcesImageConfig {
  @scala.inline
  def apply(height: Double, name: String, width: Double): ResourcesImageConfig = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourcesImageConfig]
  }
  @scala.inline
  implicit class ResourcesImageConfigOps[Self <: ResourcesImageConfig] (val x: Self) extends AnyVal {
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setDensity(value: String): Self = this.set("density", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDensity: Self = this.set("density", js.undefined)
    @scala.inline
    def setOrientation(value: landscape | portrait): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
  }
  
}

