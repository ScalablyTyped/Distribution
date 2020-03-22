package typings.jupyterlabUiComponents.labiconMod.LabIcon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*************
  * interfaces *
  *************/
/**
  * The simplest possible interface for defining a generic icon.
  */
trait IIcon extends js.Object {
  /**
    * The name of the icon. By convention, the icon name will be namespaced
    * as so:
    *
    *     "pkg-name:icon-name"
    */
  val name: String
  /**
    * A string containing the raw contents of an svg file.
    */
  var svgstr: String
}

object IIcon {
  @scala.inline
  def apply(name: String, svgstr: String): IIcon = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], svgstr = svgstr.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IIcon]
  }
}

