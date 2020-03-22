package typings.jsmediatags.mod

import org.scalablytyped.runtime.TopLevel
import typings.jsmediatags.TypeofMediaFileReader
import typings.jsmediatags.TypeofMediaTagReader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  def EXPERIMENTAL_avoidHeadRequests(): Unit
  def addFileReader(fileReader: TypeofMediaFileReader): Config
  def addTagReader(tagReader: TypeofMediaTagReader): Config
  def removeTagReader(tagReader: TypeofMediaTagReader): Config
  def setDisallowedXhrHeaders(disallowedXhrHeaders: js.Array[String]): Unit
  def setXhrTimeoutInSec(timeoutInSec: Double): Unit
}

@JSImport("jsmediatags", "Config")
@js.native
object Config extends TopLevel[Config]

