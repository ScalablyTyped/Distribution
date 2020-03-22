package typings.jupyterlabUiComponents.labiconMod.LabIcon

import typings.jupyterlabUiComponents.jupyterlabUiComponentsStrings.div
import typings.jupyterlabUiComponents.jupyterlabUiComponentsStrings.span
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The input props for creating a new LabIcon
  */
@js.native
trait IProps
  extends typings.jupyterlabUiComponents.styleIconMod.LabIconStyle.IProps {
  /**
    * Extra classNames. Used in addition to the typestyle className to
    * set the className of the icon's outermost container node
    */
  var className: js.UndefOr[String] = js.native
  /**
    * The icon's outermost node, which acts as a container for the actual
    * svg node. If container is not supplied, it will be created
    */
  var container: js.UndefOr[HTMLElement] = js.native
  /**
    * Optional text label that will be added as a sibling to the icon's
    * svg node
    */
  var label: js.UndefOr[String] = js.native
  /**
    * HTML element tag used to create the icon's outermost container node,
    * if no container is passed in
    */
  var tag: js.UndefOr[div | span] = js.native
  /**
    * Optional title that will be set on the icon's outermost container node
    */
  var title: js.UndefOr[String] = js.native
}

