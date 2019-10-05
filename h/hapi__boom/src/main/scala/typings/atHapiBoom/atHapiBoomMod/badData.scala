package typings.atHapiBoom.atHapiBoomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hapi/boom", "badData")
@js.native
object badData extends js.Object {
  /**
    * Returns a 422 Unprocessable Entity error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boombaddatamessage-data}
    */
  def apply[Data](): Boom[Data] = js.native
  def apply[Data](message: String): Boom[Data] = js.native
  def apply[Data](message: String, data: Data): Boom[Data] = js.native
}

