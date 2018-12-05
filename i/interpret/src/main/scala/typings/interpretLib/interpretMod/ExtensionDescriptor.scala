package typings
package interpretLib.interpretMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionDescriptor extends js.Object {
  var module: java.lang.String = js.native
  @JSName("register")
  var register_Original: RegisterFn = js.native
  def register(hook: Hook): scala.Unit = js.native
}

