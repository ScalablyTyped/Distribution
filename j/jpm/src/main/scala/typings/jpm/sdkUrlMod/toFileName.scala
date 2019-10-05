package typings.jpm.sdkUrlMod

import typings.jpm.FFAddonSDK.SDKURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sdk/url", "toFileName")
@js.native
object toFileName extends js.Object {
  def apply(url: String): String = js.native
}

@JSImport("sdk/url", "toFilename")
@js.native
object toFilename extends js.Object {
  def apply(url: SDKURL): String = js.native
}

