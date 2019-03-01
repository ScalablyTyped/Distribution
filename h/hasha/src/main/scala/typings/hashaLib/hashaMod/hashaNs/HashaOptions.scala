package typings
package hashaLib.hashaMod.hashaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HashaOptions[E /* <: HashaEncoding */] extends js.Object {
  var algorithm: js.UndefOr[java.lang.String] = js.undefined
  var encoding: js.UndefOr[E] = js.undefined
}

object HashaOptions {
  @scala.inline
  def apply[E /* <: HashaEncoding */](algorithm: java.lang.String = null, encoding: E = null): HashaOptions[E] = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[HashaOptions[E]]
  }
}

