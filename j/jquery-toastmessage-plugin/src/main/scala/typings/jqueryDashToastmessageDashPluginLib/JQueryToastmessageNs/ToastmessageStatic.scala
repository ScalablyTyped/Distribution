package typings
package jqueryDashToastmessageDashPluginLib.JQueryToastmessageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToastmessageStatic extends js.Object {
  /* shows a toast message of the specified type */
  def apply(command: ShowToastCommand, message: java.lang.String): jqueryDashToastmessageDashPluginLib.JQuery = js.native
  /** removes the specified toast and returns it */
  def apply(
    command: jqueryDashToastmessageDashPluginLib.jqueryDashToastmessageDashPluginLibStrings.removeToast,
    toast: jqueryDashToastmessageDashPluginLib.JQuery
  ): scala.Unit = js.native
  def apply(
    command: jqueryDashToastmessageDashPluginLib.jqueryDashToastmessageDashPluginLibStrings.removeToast,
    toast: jqueryDashToastmessageDashPluginLib.JQuery,
    closeOpts: ToastOptions
  ): scala.Unit = js.native
  /** shows a custom toast */
  def apply(
    command: jqueryDashToastmessageDashPluginLib.jqueryDashToastmessageDashPluginLibStrings.showToast,
    toastOpts: ToastOptions
  ): jqueryDashToastmessageDashPluginLib.JQuery = js.native
  /** configures the default toast options */
  def apply(toastOpts: ToastOptions): scala.Unit = js.native
}

