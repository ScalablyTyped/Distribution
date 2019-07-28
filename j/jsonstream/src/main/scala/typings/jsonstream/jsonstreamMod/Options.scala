package typings.jsonstream.jsonstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var recurse: Boolean
}

object Options {
  @scala.inline
  def apply(recurse: Boolean): Options = {
    val __obj = js.Dynamic.literal(recurse = recurse)
  
    __obj.asInstanceOf[Options]
  }
}

