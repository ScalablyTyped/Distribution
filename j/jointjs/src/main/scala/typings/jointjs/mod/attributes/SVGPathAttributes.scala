package typings.jointjs.mod.attributes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGPathAttributes extends SVGAttributes {
  var d: js.UndefOr[String] = js.native
  var `path-length`: js.UndefOr[Double] = js.native
  var pathLength: js.UndefOr[Double] = js.native
}

object SVGPathAttributes {
  @scala.inline
  def apply(): SVGPathAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGPathAttributes]
  }
  @scala.inline
  implicit class SVGPathAttributesOps[Self <: SVGPathAttributes] (val x: Self) extends AnyVal {
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
    def setD(value: String): Self = this.set("d", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteD: Self = this.set("d", js.undefined)
    @scala.inline
    def `setPath-length`(value: Double): Self = this.set("path-length", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePath-length`: Self = this.set("path-length", js.undefined)
    @scala.inline
    def setPathLength(value: Double): Self = this.set("pathLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePathLength: Self = this.set("pathLength", js.undefined)
  }
  
}

