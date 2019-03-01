package typings
package gulpDashCoffeeifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var ext: js.UndefOr[java.lang.String] = js.undefined
  var transform: js.UndefOr[js.Function1[/* data */ java.lang.String, java.lang.String]] = js.undefined
}

object Anon_Data {
  @scala.inline
  def apply(
    ext: java.lang.String = null,
    transform: js.Function1[/* data */ java.lang.String, java.lang.String] = null
  ): Anon_Data = {
    val __obj = js.Dynamic.literal()
    if (ext != null) __obj.updateDynamic("ext")(ext)
    if (transform != null) __obj.updateDynamic("transform")(transform)
    __obj.asInstanceOf[Anon_Data]
  }
}

