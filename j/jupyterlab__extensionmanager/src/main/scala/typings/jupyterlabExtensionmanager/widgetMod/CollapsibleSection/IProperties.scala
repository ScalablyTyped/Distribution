package typings.jupyterlabExtensionmanager.widgetMod.CollapsibleSection

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * React properties for collapsible section component.
  */
trait IProperties extends js.Object {
  /**
    * If given, this will be diplayed instead of the children.
    */
  var errorMessage: js.UndefOr[String | Null] = js.undefined
  /**
    * The header string for section list.
    */
  var header: String
  /**
    * Any additional elements to add to the header.
    */
  var headerElements: js.UndefOr[ReactNode] = js.undefined
  /**
    * Whether the view will be expanded or collapsed initially, defaults to open.
    */
  var isOpen: js.UndefOr[Boolean] = js.undefined
  /**
    * Handle collapse event.
    */
  var onCollapse: js.UndefOr[js.Function1[/* isOpen */ Boolean, Unit]] = js.undefined
}

object IProperties {
  @scala.inline
  def apply(
    header: String,
    errorMessage: String = null,
    headerElements: ReactNode = null,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    onCollapse: /* isOpen */ Boolean => Unit = null
  ): IProperties = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (headerElements != null) __obj.updateDynamic("headerElements")(headerElements.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.asInstanceOf[js.Any])
    if (onCollapse != null) __obj.updateDynamic("onCollapse")(js.Any.fromFunction1(onCollapse))
    __obj.asInstanceOf[IProperties]
  }
}

