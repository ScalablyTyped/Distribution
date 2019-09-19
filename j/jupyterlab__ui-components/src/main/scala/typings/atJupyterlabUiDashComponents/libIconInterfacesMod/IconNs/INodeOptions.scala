package typings.atJupyterlabUiDashComponents.libIconInterfacesMod.IconNs

import typings.atJupyterlabUiDashComponents.libStyleIconMod.IIconStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used when creating an icon node
  */
trait INodeOptions extends IIconStyle {
  /**
    * Extra classNames, used in addition to the typestyle className
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * If true, if icon name resolution fails, fallback to old
    * icon handling behavior.
    *
    * TODO: remove in Jlab 2.0
    */
  var fallback: js.UndefOr[Boolean] = js.undefined
  /**
    * The icon name. For a 'foo-bar.svg' file, the icon name is 'foo-bar'.
    * For backwards compatibility, 'jp-FooBarIcon' is also a valid icon name.
    *
    * TODO: until Jlab 2.0
    * If fallback is set, the name is added to the className
    * of the resulting icon node
    */
  var name: String
  /**
    * Icon title
    */
  var title: js.UndefOr[String] = js.undefined
}

object INodeOptions {
  @scala.inline
  def apply(
    name: String,
    IIconStyle: IIconStyle = null,
    className: String = null,
    fallback: js.UndefOr[Boolean] = js.undefined,
    title: String = null
  ): INodeOptions = {
    val __obj = js.Dynamic.literal(name = name)
    js.Dynamic.global.Object.assign(__obj, IIconStyle)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(fallback)) __obj.updateDynamic("fallback")(fallback)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[INodeOptions]
  }
}

