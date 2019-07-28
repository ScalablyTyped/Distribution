package typings.marko.srcCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("marko/src/compiler", "modules")
@js.native
object modulesNs extends js.Object {
  def deresolve(targetFilename: String, from: String): String = js.native
  def require(path: String): js.Any = js.native
  def resolve(path: String): String = js.native
  def resolveFrom(from: String, target: String): String | Null = js.native
}

