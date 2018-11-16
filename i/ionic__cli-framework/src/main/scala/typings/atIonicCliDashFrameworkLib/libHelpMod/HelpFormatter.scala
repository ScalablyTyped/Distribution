package typings
package atIonicCliDashFrameworkLib.libHelpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/help", "HelpFormatter")
@js.native
abstract class HelpFormatter protected () extends js.Object {
  def this(hasColors: atIonicCliDashFrameworkLib.Anon_Colors) = this()
  val colors: atIonicCliDashFrameworkLib.libColorsMod.Colors = js.native
  def format(): stdLib.Promise[java.lang.String] = js.native
}

