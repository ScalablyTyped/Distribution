package typings.ibmMobilefirst.global.WL

import typings.ibmMobilefirst.WL.App.ActionReceiverCallback
import typings.ibmMobilefirst.WL.App.BackgroundHandler.Handler
import typings.ibmMobilefirst.WL.App.Callback
import typings.ibmMobilefirst.WL.App.Data
import typings.ibmMobilefirst.WL.App.KeepAliveInBackgroundOptions
import typings.ibmMobilefirst.WL.App.OpenURLOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WL.App")
@js.native
object App extends js.Object {
  def addActionReceiver(id: String, callback: ActionReceiverCallback): Unit = js.native
  /**
    * @deprecate Deprecated.
    */
  def close(): Unit = js.native
  def copyToClipboard(stringToCopy: String): Unit = js.native
  def copyToClipboard(stringToCopy: String, callback: Callback): Unit = js.native
  def getDeviceLanguage(): String = js.native
  def getDeviceLocale(): String = js.native
  /**
    * TODO: declare exception type. (Exceptions that are thrown by the IBM® Worklight® client runtime framework)
    */
  def getErrorMessage(exception: js.Any): String = js.native
  def hideSplashScreen(): Unit = js.native
  def openURL(url: String): Unit = js.native
  def openURL(url: String, target: js.UndefOr[scala.Nothing], options: OpenURLOptions): Unit = js.native
  def openURL(url: String, target: String): Unit = js.native
  def openURL(url: String, target: String, options: OpenURLOptions): Unit = js.native
  def overrideBackButton(callback: Callback): Unit = js.native
  def removeActionReceiver(id: String): Unit = js.native
  /**
    * @deprecated since version 6.0.0
    */
  def resetBackButton(): Unit = js.native
  def sendActionToNative(action: String): Unit = js.native
  def sendActionToNative(action: String, data: Data): Unit = js.native
  def setKeepAliveInBackground(enabled: Boolean): Unit = js.native
  def setKeepAliveInBackground(enabled: Boolean, options: KeepAliveInBackgroundOptions): Unit = js.native
  def showSplashScreen(): Unit = js.native
  @js.native
  object BackgroundHandler extends js.Object {
    var defaultIOSBehavior: Handler = js.native
    /**
      * @deprecated since version 6.0.0
      */
    var hideElements: Handler = js.native
    var hideView: Handler = js.native
    def setOnAppEnteringBackground(handler: Handler): Unit = js.native
  }
  
}

