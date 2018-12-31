package typings
package jpmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Check whether a given object is private, so an add-on can respect private browsing
  */
@JSImport("sdk/private-browsing", JSImport.Namespace)
@js.native
object privateDashBrowsingMod extends js.Object {
  def isPrivate(`object`: jpmLib.FFAddonSDKNs.BrowserWindow): scala.Boolean = js.native
  def isPrivate(`object`: jpmLib.FFAddonSDKNs.ContentWorker): scala.Boolean = js.native
  def isPrivate(`object`: jpmLib.FFAddonSDKNs.Tab): scala.Boolean = js.native
}

