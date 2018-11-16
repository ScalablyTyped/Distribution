package typings
package jqueryDotPnotifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PNotifyButtons extends js.Object {
  /**
       * The classes to use for button icons. Leave them null to use the classes from the styling you're using.
       */
  var classes: js.UndefOr[Anon_Closer] = js.undefined
  /**
       * Provide a button for the user to manually close the notice.
       */
  var closer: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Only show the closer button on hover.
       */
  var closer_hover: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The various displayed text, helps facilitating internationalization.
       */
  var labels: js.UndefOr[Anon_Unstick] = js.undefined
  /**
       * Show the buttons even when the nonblock module is in use.
       */
  var show_on_nonblock: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Provide a button for the user to manually stick the notice.
       */
  var sticker: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Only show the sticker button on hover.
       */
  var sticker_hover: js.UndefOr[scala.Boolean] = js.undefined
}

