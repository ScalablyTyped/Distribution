package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonicContext extends js.Object {
  val binPath: java.lang.String
  val execPath: java.lang.String
  val libPath: java.lang.String
  val version: java.lang.String
}

object IonicContext {
  @scala.inline
  def apply(
    binPath: java.lang.String,
    execPath: java.lang.String,
    libPath: java.lang.String,
    version: java.lang.String
  ): IonicContext = {
    val __obj = js.Dynamic.literal(binPath = binPath, execPath = execPath, libPath = libPath, version = version)
  
    __obj.asInstanceOf[IonicContext]
  }
}

