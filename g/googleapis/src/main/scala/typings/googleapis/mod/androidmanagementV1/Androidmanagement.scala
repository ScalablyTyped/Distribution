package typings.googleapis.mod.androidmanagementV1

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Android Management API
  *
  * The Android Management API provides remote enterprise management of Android
  * devices and apps.
  *
  * @example
  * const {google} = require('googleapis');
  * const androidmanagement = google.androidmanagement('v1');
  *
  * @namespace androidmanagement
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Androidmanagement
  */
@JSImport("googleapis", "androidmanagement_v1.Androidmanagement")
@js.native
class Androidmanagement protected ()
  extends typings.googleapis.androidmanagementV1Mod.androidmanagementV1.Androidmanagement {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
