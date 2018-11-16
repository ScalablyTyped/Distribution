package typings
package jqueryDashToastmessageDashPluginLib.JQueryToastmessageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ToastOptions extends js.Object {
  /** callback function when the toastmessage is closed @default null */
  var close: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
           * text which will be shown as close button,
           * set to '' when you want to introduce an image via css
           * @default ''
           */
  var closeText: js.UndefOr[java.lang.String] = js.undefined
  /** in effect duration in miliseconds @default 600 */
  var inEffectDuration: js.UndefOr[scala.Double] = js.undefined
  /**
           * Position of the toast container holding different toast.
           * Position can be set only once at the very first call,
           * changing the position after the first call does nothing
           * @default 'top-right'
           */
  var position: js.UndefOr[ToastPosition] = js.undefined
  /**
           * time in miliseconds before the item has to disappear @default 3000
           */
  var stayTime: js.UndefOr[scala.Double] = js.undefined
  /** should the toast item sticky or not? @default false */
  var sticky: js.UndefOr[scala.Boolean] = js.undefined
  /** content of the item @default '' */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** the type of toast @default 'notice' */
  var `type`: js.UndefOr[ToastType] = js.undefined
}

