package typings
package ibmDashMobilefirstLib.WLNs.AppNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WL.App")
@js.native
object AppNsMembers extends js.Object {
  def addActionReceiver(id: java.lang.String, callback: ActionReceiverCallback): scala.Unit = js.native
  /**
       * @deprecate Deprecated.
       */
  def close(): scala.Unit = js.native
  def copyToClipboard(stringToCopy: java.lang.String): scala.Unit = js.native
  def copyToClipboard(stringToCopy: java.lang.String, callback: Callback): scala.Unit = js.native
  def getDeviceLanguage(): java.lang.String = js.native
  def getDeviceLocale(): java.lang.String = js.native
  /**
       * TODO: declare exception type. (Exceptions that are thrown by the IBM® Worklight® client runtime framework)
       */
  def getErrorMessage(exception: js.Any): java.lang.String = js.native
  def hideSplashScreen(): scala.Unit = js.native
  def openURL(url: java.lang.String): scala.Unit = js.native
  def openURL(url: java.lang.String, target: java.lang.String): scala.Unit = js.native
  def openURL(url: java.lang.String, target: java.lang.String, options: OpenURLOptions): scala.Unit = js.native
  def overrideBackButton(callback: Callback): scala.Unit = js.native
  def removeActionReceiver(id: java.lang.String): scala.Unit = js.native
  /**
       * @deprecated since version 6.0.0
       */
  def resetBackButton(): scala.Unit = js.native
  def sendActionToNative(action: java.lang.String): scala.Unit = js.native
  def sendActionToNative(action: java.lang.String, data: Data): scala.Unit = js.native
  def setKeepAliveInBackground(enabled: scala.Boolean): scala.Unit = js.native
  def setKeepAliveInBackground(enabled: scala.Boolean, options: KeepAliveInBackgroundOptions): scala.Unit = js.native
  def showSplashScreen(): scala.Unit = js.native
}

