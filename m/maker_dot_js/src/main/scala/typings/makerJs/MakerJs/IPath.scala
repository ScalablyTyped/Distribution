package typings.makerJs.MakerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A line, curved line or other simple two dimensional shape.
  */
@js.native
trait IPath extends js.Object {
  /**
    * Optional layer of this path.
    */
  var layer: js.UndefOr[String] = js.native
  /**
    * The main point of reference for this path.
    */
  var origin: IPoint = js.native
  /**
    * The type of the path, e.g. "line", "circle", or "arc". These strings are enumerated in pathType.
    */
  var `type`: String = js.native
}

object IPath {
  @scala.inline
  def apply(origin: IPoint, `type`: String): IPath = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPath]
  }
  @scala.inline
  implicit class IPathOps[Self <: IPath] (val x: Self) extends AnyVal {
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
    def setOrigin(value: IPoint): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setLayer(value: String): Self = this.set("layer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayer: Self = this.set("layer", js.undefined)
  }
  
}

