package typings.atJupyterlabUiDashComponents.libIconInterfacesMod.IconNs

import typings.atJupyterlabUiDashComponents.libStyleIconMod.IIconStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used when creating an icon node
  */
trait INodeOptions extends IIconStyle {
  var className: js.UndefOr[String] = js.undefined
  var name: String
  var title: js.UndefOr[String] = js.undefined
}

object INodeOptions {
  @scala.inline
  def apply(name: String, IIconStyle: IIconStyle = null, className: String = null, title: String = null): INodeOptions = {
    val __obj = js.Dynamic.literal(name = name)
    js.Dynamic.global.Object.assign(__obj, IIconStyle)
    if (className != null) __obj.updateDynamic("className")(className)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[INodeOptions]
  }
}

