package typings.atIonicCliDashFramework.libHelpMod

import typings.atIonicCliDashFramework.Anon_Colors
import typings.atIonicCliDashFramework.libColorsMod.Colors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/help", "HelpFormatter")
@js.native
abstract class HelpFormatter protected () extends js.Object {
  def this(hasColors: Anon_Colors) = this()
  val colors: Colors = js.native
  def format(): js.Promise[String] = js.native
}

