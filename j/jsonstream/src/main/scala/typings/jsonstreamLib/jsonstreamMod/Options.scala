package typings
package jsonstreamLib.jsonstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var recurse: scala.Boolean
}

object Options {
  @scala.inline
  def apply(recurse: scala.Boolean): Options = {
    val __obj = js.Dynamic.literal(recurse = recurse)
  
    __obj.asInstanceOf[Options]
  }
}

