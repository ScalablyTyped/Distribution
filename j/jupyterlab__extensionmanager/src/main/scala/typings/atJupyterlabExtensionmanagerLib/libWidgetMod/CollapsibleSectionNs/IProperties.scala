package typings
package atJupyterlabExtensionmanagerLib.libWidgetMod.CollapsibleSectionNs

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
  var errorMessage: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * The header string for section list.
    */
  var header: java.lang.String
  /**
    * Any additional elements to add to the header.
    */
  var headerElements: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  /**
    * Callback for collapse action.
    */
  var onCollapse: js.UndefOr[js.Function1[/* collapsed */ scala.Boolean, scala.Unit]] = js.undefined
  /**
    * Whether the view will be collapsed initially or not.
    */
  var startCollapsed: scala.Boolean
}

object IProperties {
  @scala.inline
  def apply(
    header: java.lang.String,
    startCollapsed: scala.Boolean,
    errorMessage: java.lang.String = null,
    headerElements: reactLib.reactMod.ReactNode = null,
    onCollapse: /* collapsed */ scala.Boolean => scala.Unit = null
  ): IProperties = {
    val __obj = js.Dynamic.literal(header = header, startCollapsed = startCollapsed)
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage)
    if (headerElements != null) __obj.updateDynamic("headerElements")(headerElements.asInstanceOf[js.Any])
    if (onCollapse != null) __obj.updateDynamic("onCollapse")(js.Any.fromFunction1(onCollapse))
    __obj.asInstanceOf[IProperties]
  }
}

