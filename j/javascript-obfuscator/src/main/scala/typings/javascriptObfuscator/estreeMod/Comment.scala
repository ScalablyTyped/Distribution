package typings.javascriptObfuscator.estreeMod

import typings.acorn.mod.SourceLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment extends js.Object {
  var end: Double
  var loc: js.UndefOr[SourceLocation] = js.undefined
  var start: Double
}

object Comment {
  @scala.inline
  def apply(end: Double, start: Double, loc: SourceLocation = null): Comment = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
}

