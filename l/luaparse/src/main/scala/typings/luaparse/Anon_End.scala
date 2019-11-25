package typings.luaparse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_End extends js.Object {
  var end: Anon_Column
  var start: Anon_Column
}

object Anon_End {
  @scala.inline
  def apply(end: Anon_Column, start: Anon_Column): Anon_End = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_End]
  }
}

