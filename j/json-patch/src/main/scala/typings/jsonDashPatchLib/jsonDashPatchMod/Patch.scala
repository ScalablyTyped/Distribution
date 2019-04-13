package typings
package jsonDashPatchLib.jsonDashPatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Patch extends js.Object {
  var path: java.lang.String
}

object Patch {
  @scala.inline
  def apply(path: java.lang.String): Patch = {
    val __obj = js.Dynamic.literal(path = path)
  
    __obj.asInstanceOf[Patch]
  }
}

