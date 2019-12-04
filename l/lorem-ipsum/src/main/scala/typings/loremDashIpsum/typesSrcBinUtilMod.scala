package typings.loremDashIpsum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lorem-ipsum/types/src/bin/util", JSImport.Namespace)
@js.native
object typesSrcBinUtilMod extends js.Object {
  def copyToClipboard(text: String): js.Promise[String] = js.native
  def getCopyCommand(): String = js.native
  def getCopyCommand(platform: String): String = js.native
  def getPlatform(): String = js.native
  def getVersion(): String = js.native
  def isSupportedPlatform(platform: String): Boolean = js.native
}

