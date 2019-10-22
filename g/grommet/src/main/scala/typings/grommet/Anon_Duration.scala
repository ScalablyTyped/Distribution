package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Duration extends js.Object {
  var duration: js.UndefOr[String] = js.undefined
}

object Anon_Duration {
  @scala.inline
  def apply(duration: String = null): Anon_Duration = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration)
    __obj.asInstanceOf[Anon_Duration]
  }
}

