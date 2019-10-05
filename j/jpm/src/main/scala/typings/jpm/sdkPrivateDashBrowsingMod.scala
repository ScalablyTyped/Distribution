package typings.jpm

import typings.jpm.FFAddonSDK.BrowserWindow
import typings.jpm.FFAddonSDK.ContentWorker
import typings.jpm.FFAddonSDK.Tab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Check whether a given object is private, so an add-on can respect private browsing
  */
@JSImport("sdk/private-browsing", JSImport.Namespace)
@js.native
object sdkPrivateDashBrowsingMod extends js.Object {
  def isPrivate(`object`: BrowserWindow): Boolean = js.native
  def isPrivate(`object`: ContentWorker): Boolean = js.native
  def isPrivate(`object`: Tab): Boolean = js.native
}

