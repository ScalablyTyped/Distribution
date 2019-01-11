package typings
package jpmLib.sdkUrlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sdk/url", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def DataURL(uri: java.lang.String): jpmLib.sdkUrlMod.DataURL = js.native
  def URL(source: java.lang.String): jpmLib.FFAddonSDKNs.SDKURL = js.native
  def URL(source: java.lang.String, base: java.lang.String): jpmLib.FFAddonSDKNs.SDKURL = js.native
  def getTLD(url: java.lang.String): java.lang.String = js.native
  def isValidURI(uri: java.lang.String): scala.Boolean = js.native
  def toFileName(url: java.lang.String): java.lang.String = js.native
  def toFilename(url: jpmLib.FFAddonSDKNs.SDKURL): java.lang.String = js.native
}

