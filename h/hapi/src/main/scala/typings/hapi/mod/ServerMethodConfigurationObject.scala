package typings.hapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerMethodConfigurationObject extends js.Object {
  /**
    * the method function.
    */
  @JSName("method")
  var method_Original: ServerMethod = js.native
  /**
    * the method name.
    */
  var name: String = js.native
  /**
    * (optional) settings.
    */
  var options: js.UndefOr[ServerMethodOptions] = js.native
  /**
    * the method function.
    */
  def method(args: js.Any*): js.Any = js.native
}

