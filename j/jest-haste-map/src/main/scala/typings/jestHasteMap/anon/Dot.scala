package typings.jestHasteMap.anon

import typings.anymatch.mod.Matcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dot extends js.Object {
  var dot: Boolean
  var glob: String | js.Array[String]
  var ignored: js.UndefOr[Matcher] = js.undefined
  var root: String
}

object Dot {
  @scala.inline
  def apply(dot: Boolean, glob: String | js.Array[String], root: String, ignored: Matcher = null): Dot = {
    val __obj = js.Dynamic.literal(dot = dot.asInstanceOf[js.Any], glob = glob.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    if (ignored != null) __obj.updateDynamic("ignored")(ignored.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dot]
  }
}

