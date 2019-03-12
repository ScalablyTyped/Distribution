package typings
package jqueryDotStickemLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StickemSettings extends js.Object {
  /**
    * selector for content container, sizes matched with `item`
    */
  var container: js.UndefOr[java.lang.String] = js.undefined
  /**
    * css class used to apply when ending sticky
    */
  var endStickClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * selector for element to make sticky
    */
  var item: js.UndefOr[java.lang.String] = js.undefined
  /**
    * offset to use for the sticky element in the parent element
    */
  var offset: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * Callback to execute when in stick state
    */
  var onStick: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Callback to execute when getting out of stick state
    */
  var onUnstick: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * where to place sticky element
    */
  var start: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * css class used to apply
    */
  var stickClass: js.UndefOr[java.lang.String] = js.undefined
}

object StickemSettings {
  @scala.inline
  def apply(
    container: java.lang.String = null,
    endStickClass: java.lang.String = null,
    item: java.lang.String = null,
    offset: scala.Double | java.lang.String = null,
    onStick: () => scala.Unit = null,
    onUnstick: () => scala.Unit = null,
    start: scala.Double | java.lang.String = null,
    stickClass: java.lang.String = null
  ): StickemSettings = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container)
    if (endStickClass != null) __obj.updateDynamic("endStickClass")(endStickClass)
    if (item != null) __obj.updateDynamic("item")(item)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onStick != null) __obj.updateDynamic("onStick")(js.Any.fromFunction0(onStick))
    if (onUnstick != null) __obj.updateDynamic("onUnstick")(js.Any.fromFunction0(onUnstick))
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (stickClass != null) __obj.updateDynamic("stickClass")(stickClass)
    __obj.asInstanceOf[StickemSettings]
  }
}

