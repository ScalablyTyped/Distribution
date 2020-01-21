package typings.matcherCollection

import typings.minimatch.mod.IMinimatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMatch extends js.Object {
  var matchers: js.Array[IMinimatch]
  def `match`(value: String): Boolean
  def mayContain(value: String): Boolean
}

object AnonMatch {
  @scala.inline
  def apply(`match`: String => Boolean, matchers: js.Array[IMinimatch], mayContain: String => Boolean): AnonMatch = {
    val __obj = js.Dynamic.literal(matchers = matchers.asInstanceOf[js.Any], mayContain = js.Any.fromFunction1(mayContain))
    __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
    __obj.asInstanceOf[AnonMatch]
  }
}

