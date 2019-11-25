package typings.matcherDashCollection

import typings.minimatch.minimatchMod.IMinimatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Match extends js.Object {
  var matchers: js.Array[IMinimatch]
  def `match`(value: String): Boolean
  def mayContain(value: String): Boolean
}

object Anon_Match {
  @scala.inline
  def apply(`match`: String => Boolean, matchers: js.Array[IMinimatch], mayContain: String => Boolean): Anon_Match = {
    val __obj = js.Dynamic.literal(matchers = matchers.asInstanceOf[js.Any], mayContain = js.Any.fromFunction1(mayContain))
    __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
    __obj.asInstanceOf[Anon_Match]
  }
}

