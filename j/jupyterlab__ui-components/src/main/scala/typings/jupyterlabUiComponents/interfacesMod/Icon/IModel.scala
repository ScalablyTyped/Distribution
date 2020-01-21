package typings.jupyterlabUiComponents.interfacesMod.Icon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation of the resources underlying an inline svg icon
  */
trait IModel extends js.Object {
  /**
    * Manually set the className corresponding to the icon name. By default,
    * the className is generated from the name: 'foo-bar' -> 'jp-FooBarIcon'
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * The icon name. For a 'foo-bar.svg' file, the icon name is 'foo-bar'.
    */
  var name: String
  /**
    * A string containing the html corresponding to an SVG element
    */
  var svg: String
}

object IModel {
  @scala.inline
  def apply(name: String, svg: String, className: String = null): IModel = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], svg = svg.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModel]
  }
}

