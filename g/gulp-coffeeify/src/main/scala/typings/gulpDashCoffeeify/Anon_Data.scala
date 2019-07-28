package typings.gulpDashCoffeeify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var ext: js.UndefOr[String] = js.undefined
  var transform: js.UndefOr[js.Function1[/* data */ String, String]] = js.undefined
}

object Anon_Data {
  @scala.inline
  def apply(ext: String = null, transform: /* data */ String => String = null): Anon_Data = {
    val __obj = js.Dynamic.literal()
    if (ext != null) __obj.updateDynamic("ext")(ext)
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction1(transform))
    __obj.asInstanceOf[Anon_Data]
  }
}

