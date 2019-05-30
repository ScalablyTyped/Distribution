package typings
package kyLib.kyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ky", "HTTPError")
@js.native
class HTTPError protected ()
  extends stdLib.Error {
  def this(response: stdLib.Response) = this()
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  var response: stdLib.Response = js.native
}

