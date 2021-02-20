package typings.jqueryToastmessagePlugin

import typings.jqueryToastmessagePlugin.JQueryToastmessage.ShowToastCommand
import typings.jqueryToastmessagePlugin.JQueryToastmessage.ToastOptions
import typings.jqueryToastmessagePlugin.JQueryToastmessage.ToastmessageStatic
import typings.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.removeToast
import typings.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.showToast
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  /* shows a toast message of the specified type */
  def toastmessage(command: ShowToastCommand, message: String): JQuery = js.native
  /** configures the default toast options */
  def toastmessage(toastOpts: ToastOptions): Unit = js.native
  @JSName("toastmessage")
  var toastmessage_Original: ToastmessageStatic = js.native
  /** removes the specified toast and returns it */
  @JSName("toastmessage")
  def toastmessage_removeToast(command: removeToast, toast: JQuery): Unit = js.native
  @JSName("toastmessage")
  def toastmessage_removeToast(command: removeToast, toast: JQuery, closeOpts: ToastOptions): Unit = js.native
  /** shows a custom toast */
  @JSName("toastmessage")
  def toastmessage_showToast(command: showToast, toastOpts: ToastOptions): JQuery = js.native
}
