package typings.jsonstream.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var recurse: Boolean
}

object Options {
  @scala.inline
  def apply(recurse: Boolean): Options = {
    val __obj = js.Dynamic.literal(recurse = recurse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Options]
  }
}

