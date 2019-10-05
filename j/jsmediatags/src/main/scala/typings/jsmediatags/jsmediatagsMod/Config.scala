package typings.jsmediatags.jsmediatagsMod

import org.scalablytyped.runtime.TopLevel
import typings.jsmediatags.TypeofClassMediaFileReader
import typings.jsmediatags.TypeofClassMediaTagReader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  def EXPERIMENTAL_avoidHeadRequests(): Unit
  def addFileReader(fileReader: TypeofClassMediaFileReader): Config
  def addTagReader(tagReader: TypeofClassMediaTagReader): Config
  def removeTagReader(tagReader: TypeofClassMediaTagReader): Config
  def setDisallowedXhrHeaders(disallowedXhrHeaders: js.Array[String]): Unit
  def setXhrTimeoutInSec(timeoutInSec: Double): Unit
}

@JSImport("jsmediatags", "Config")
@js.native
object Config extends TopLevel[Config]

