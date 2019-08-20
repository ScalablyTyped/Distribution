package typings.jsmediatags.jsmediatagsMod

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

object Config {
  @scala.inline
  def apply(
    EXPERIMENTAL_avoidHeadRequests: () => Unit,
    addFileReader: TypeofClassMediaFileReader => Config,
    addTagReader: TypeofClassMediaTagReader => Config,
    removeTagReader: TypeofClassMediaTagReader => Config,
    setDisallowedXhrHeaders: js.Array[String] => Unit,
    setXhrTimeoutInSec: Double => Unit
  ): Config = {
    val __obj = js.Dynamic.literal(EXPERIMENTAL_avoidHeadRequests = js.Any.fromFunction0(EXPERIMENTAL_avoidHeadRequests), addFileReader = js.Any.fromFunction1(addFileReader), addTagReader = js.Any.fromFunction1(addTagReader), removeTagReader = js.Any.fromFunction1(removeTagReader), setDisallowedXhrHeaders = js.Any.fromFunction1(setDisallowedXhrHeaders), setXhrTimeoutInSec = js.Any.fromFunction1(setXhrTimeoutInSec))
  
    __obj.asInstanceOf[Config]
  }
}

