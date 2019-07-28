package typings.jpm.sdkUrlMod

import typings.jpm.FFAddonSDKNs.SDKURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sdk/url", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def DataURL(uri: String): typings.jpm.sdkUrlMod.DataURL = js.native
  def URL(source: String): SDKURL = js.native
  def URL(source: String, base: String): SDKURL = js.native
  def getTLD(url: String): String = js.native
  def isValidURI(uri: String): Boolean = js.native
  def toFileName(url: String): String = js.native
  def toFilename(url: SDKURL): String = js.native
}

