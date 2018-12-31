package typings
package jqueryDashToastmessageDashPluginLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("toastmessage")
  var toastmessage_Original: jqueryDashToastmessageDashPluginLib.JQueryToastmessageNs.ToastmessageStatic = js.native
  /* shows a toast message of the specified type */
  def toastmessage(
    command: jqueryDashToastmessageDashPluginLib.JQueryToastmessageNs.ShowToastCommand,
    message: java.lang.String
  ): JQuery = js.native
  /** configures the default toast options */
  def toastmessage(toastOpts: jqueryDashToastmessageDashPluginLib.JQueryToastmessageNs.ToastOptions): scala.Unit = js.native
  /** removes the specified toast and returns it */
  @JSName("toastmessage")
  def toastmessage_removeToast(
    command: jqueryDashToastmessageDashPluginLib.jqueryDashToastmessageDashPluginLibStrings.removeToast,
    toast: JQuery
  ): scala.Unit = js.native
  @JSName("toastmessage")
  def toastmessage_removeToast(
    command: jqueryDashToastmessageDashPluginLib.jqueryDashToastmessageDashPluginLibStrings.removeToast,
    toast: JQuery,
    closeOpts: jqueryDashToastmessageDashPluginLib.JQueryToastmessageNs.ToastOptions
  ): scala.Unit = js.native
  /** shows a custom toast */
  @JSName("toastmessage")
  def toastmessage_showToast(
    command: jqueryDashToastmessageDashPluginLib.jqueryDashToastmessageDashPluginLibStrings.showToast,
    toastOpts: jqueryDashToastmessageDashPluginLib.JQueryToastmessageNs.ToastOptions
  ): JQuery = js.native
}

