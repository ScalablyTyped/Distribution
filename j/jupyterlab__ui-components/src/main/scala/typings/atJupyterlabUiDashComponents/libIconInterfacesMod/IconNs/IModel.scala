package typings.atJupyterlabUiDashComponents.libIconInterfacesMod.IconNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation of the resources underlying an inline svg icon
  */
trait IModel extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var name: String
  var svg: String
}

object IModel {
  @scala.inline
  def apply(name: String, svg: String, className: String = null): IModel = {
    val __obj = js.Dynamic.literal(name = name, svg = svg)
    if (className != null) __obj.updateDynamic("className")(className)
    __obj.asInstanceOf[IModel]
  }
}

