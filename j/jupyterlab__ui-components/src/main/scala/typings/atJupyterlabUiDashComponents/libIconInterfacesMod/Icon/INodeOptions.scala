package typings.atJupyterlabUiDashComponents.libIconInterfacesMod.Icon

import typings.atJupyterlabUiDashComponents.libStyleIconMod.IIconStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used when creating an icon node
  */
@js.native
trait INodeOptions extends IIconStyle {
  /**
    * Extra classNames, used in addition to the typestyle className
    */
  var className: js.UndefOr[String] = js.native
  /**
    * If true, if icon name resolution fails, fallback to old
    * icon handling behavior.
    *
    * TODO: remove in Jlab 2.0
    */
  var fallback: js.UndefOr[Boolean] = js.native
  /**
    * The icon name. For a 'foo-bar.svg' file, the icon name is 'foo-bar'.
    * For backwards compatibility, 'jp-FooBarIcon' is also a valid icon name.
    *
    * TODO: until Jlab 2.0
    * If fallback is set, the name is added to the className
    * of the resulting icon node
    */
  var name: String = js.native
  /**
    * Icon title
    */
  var title: js.UndefOr[String] = js.native
}

