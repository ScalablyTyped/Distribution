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

