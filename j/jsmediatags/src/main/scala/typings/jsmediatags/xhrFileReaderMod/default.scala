package typings.jsmediatags.xhrFileReaderMod

import typings.jsmediatags.AnonAvoidHeadRequests
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsmediatags/build2/XhrFileReader", JSImport.Default)
@js.native
class default protected () extends XhrFileReader {
  def this(url: String) = this()
}

/* static members */
@JSImport("jsmediatags/build2/XhrFileReader", JSImport.Default)
@js.native
object default extends js.Object {
  var _config: AnonAvoidHeadRequests = js.native
  def canReadFile(file: js.Any): Boolean = js.native
  def setConfig(config: js.Any): Unit = js.native
}

