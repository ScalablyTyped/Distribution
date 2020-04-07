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
trait IProps
  extends typings.jupyterlabUiComponents.styleIconMod.LabIconStyle.IProps {
  /**
    * Extra classNames. Used in addition to the typestyle className to
    * set the className of the icon's outermost container node
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * The icon's outermost node, which acts as a container for the actual
    * svg node. If container is not supplied, it will be created
    */
  var container: js.UndefOr[HTMLElement] = js.undefined
  /**
    * Optional text label that will be added as a sibling to the icon's
    * svg node
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    * HTML element tag used to create the icon's outermost container node,
    * if no container is passed in
    */
  var tag: js.UndefOr[div | span] = js.undefined
  /**
    * Optional title that will be set on the icon's outermost container node
    */
  var title: js.UndefOr[String] = js.undefined
}

object IProps {
  @scala.inline
  def apply(
    IProps: typings.jupyterlabUiComponents.styleIconMod.LabIconStyle.IProps = null,
    className: String = null,
    container: HTMLElement = null,
    label: String = null,
    tag: div | span = null,
    title: String = null
  ): IProps = {
    val __obj = js.Dynamic.literal()
    if (IProps != null) js.Dynamic.global.Object.assign(__obj, IProps)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProps]
  }
}

