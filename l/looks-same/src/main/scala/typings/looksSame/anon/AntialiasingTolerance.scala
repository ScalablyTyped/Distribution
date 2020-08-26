package typings.looksSame.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AntialiasingTolerance extends js.Object {
  var antialiasingTolerance: js.UndefOr[Double] = js.native
}

object AntialiasingTolerance {
  @scala.inline
  def apply(): AntialiasingTolerance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AntialiasingTolerance]
  }
  @scala.inline
  implicit class AntialiasingToleranceOps[Self <: AntialiasingTolerance] (val x: Self) extends AnyVal {
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
    def setAntialiasingTolerance(value: Double): Self = this.set("antialiasingTolerance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAntialiasingTolerance: Self = this.set("antialiasingTolerance", js.undefined)
  }
  
}

