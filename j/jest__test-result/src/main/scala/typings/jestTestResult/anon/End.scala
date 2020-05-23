package typings.jestTestResult.anon

import typings.jestTestResult.typesMod.Milliseconds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait End extends js.Object {
  var end: Milliseconds
  var start: Milliseconds
}

object End {
  @scala.inline
  def apply(end: Milliseconds, start: Milliseconds): End = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[End]
  }
}

