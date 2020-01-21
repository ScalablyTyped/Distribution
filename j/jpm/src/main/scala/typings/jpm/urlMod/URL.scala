package typings.jpm.urlMod

import typings.jpm.FFAddonSDK.SDKURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sdk/url", "URL")
@js.native
object URL extends js.Object {
  def apply(source: String): SDKURL = js.native
  def apply(source: String, base: String): SDKURL = js.native
}

