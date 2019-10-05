package typings.jest

import typings.jest.jestMod.jest.Milliseconds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_End extends js.Object {
  var end: Milliseconds
  var start: Milliseconds
}

object Anon_End {
  @scala.inline
  def apply(end: Milliseconds, start: Milliseconds): Anon_End = {
    val __obj = js.Dynamic.literal(end = end, start = start)
  
    __obj.asInstanceOf[Anon_End]
  }
}

