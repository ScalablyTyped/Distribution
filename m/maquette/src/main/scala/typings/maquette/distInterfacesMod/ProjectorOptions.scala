package typings.maquette.distInterfacesMod

import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectorOptions extends js.Object {
  /**
    * Can be used to log performance metrics
    */
  var performanceLogger: js.UndefOr[ProjectorPerformanceLogger] = js.undefined
  /**
    * May be used to add vendor prefixes when applying inline styles when needed.
    * This function is called when [[styles]] is used.
    * This function should execute `domNode.style[styleName] = value` or do something smarter.
    *
    * @param domNode   The DOM Node that needs to receive the style
    * @param styleName The name of the style that should be applied, for example `transform`.
    * @param value     The value of this style, for example `rotate(45deg)`.
    */
  var styleApplyer: js.UndefOr[
    js.Function3[/* domNode */ HTMLElement, /* styleName */ String, /* value */ String, Unit]
  ] = js.undefined
}

object ProjectorOptions {
  @scala.inline
  def apply(
    performanceLogger: (/* eventType */ PerformanceLoggerEvent, /* trigger */ js.UndefOr[Event]) => Unit = null,
    styleApplyer: (/* domNode */ HTMLElement, /* styleName */ String, /* value */ String) => Unit = null
  ): ProjectorOptions = {
    val __obj = js.Dynamic.literal()
    if (performanceLogger != null) __obj.updateDynamic("performanceLogger")(js.Any.fromFunction2(performanceLogger))
    if (styleApplyer != null) __obj.updateDynamic("styleApplyer")(js.Any.fromFunction3(styleApplyer))
    __obj.asInstanceOf[ProjectorOptions]
  }
}

