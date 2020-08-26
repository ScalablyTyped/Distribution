package typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.LabIcon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The simplest possible interface for defining a generic icon.
  */
@js.native
trait IIcon extends js.Object {
  /**
    * The name of the icon. By convention, the icon name will be namespaced
    * as so:
    *
    *     "pkg-name:icon-name"
    */
  val name: String = js.native
  /**
    * A string containing the raw contents of an svg file.
    */
  var svgstr: String = js.native
}

object IIcon {
  @scala.inline
  def apply(name: String, svgstr: String): IIcon = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], svgstr = svgstr.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIcon]
  }
  @scala.inline
  implicit class IIconOps[Self <: IIcon] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSvgstr(value: String): Self = this.set("svgstr", value.asInstanceOf[js.Any])
  }
  
}

