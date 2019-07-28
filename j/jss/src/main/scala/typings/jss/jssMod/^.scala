package typings.jss.jssMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jss", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val default: JSS = js.native
  def create(): JSS = js.native
  def create(options: Partial[JSSOptions]): JSS = js.native
  def createGenerateClassName(): GenerateClassName[_] = js.native
}

