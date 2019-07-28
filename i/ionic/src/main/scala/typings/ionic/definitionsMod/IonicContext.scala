package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonicContext extends js.Object {
  val binPath: String
  val execPath: String
  val libPath: String
  val version: String
}

object IonicContext {
  @scala.inline
  def apply(binPath: String, execPath: String, libPath: String, version: String): IonicContext = {
    val __obj = js.Dynamic.literal(binPath = binPath, execPath = execPath, libPath = libPath, version = version)
  
    __obj.asInstanceOf[IonicContext]
  }
}

