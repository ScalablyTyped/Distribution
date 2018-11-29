package typings
package ionicLib.libErrorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/errors", "FatalException")
@js.native
class FatalException () extends BaseException {
  def this(message: java.lang.String) = this()
  def this(message: java.lang.String, exitCode: scala.Double) = this()
  @JSName("exitCode")
  var exitCode_FatalException: scala.Double = js.native
  var fatal: scala.Boolean = js.native
}

