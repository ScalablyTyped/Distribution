package typings.jsmediatags.mod

import org.scalablytyped.runtime.TopLevel
import typings.jsmediatags.anon.TypeofMediaFileReader
import typings.jsmediatags.anon.TypeofMediaTagReader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config extends js.Object {
  
  def EXPERIMENTAL_avoidHeadRequests(): Unit = js.native
  
  def addFileReader(fileReader: TypeofMediaFileReader): Config = js.native
  
  def addTagReader(tagReader: TypeofMediaTagReader): Config = js.native
  
  def removeTagReader(tagReader: TypeofMediaTagReader): Config = js.native
  
  def setDisallowedXhrHeaders(disallowedXhrHeaders: js.Array[String]): Unit = js.native
  
  def setXhrTimeoutInSec(timeoutInSec: Double): Unit = js.native
}
@JSImport("jsmediatags", "Config")
@js.native
object Config extends TopLevel[Config]
